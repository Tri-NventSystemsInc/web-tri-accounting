package com.tri.erp.spring.service.implementations;

import java.util.ArrayList;
import java.util.List;

import com.tri.erp.spring.model.Account;
import com.tri.erp.spring.repo.AccountRepo;
import com.tri.erp.spring.reponse.CoaPrintDto;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JasperDatasourceService {

	@Autowired
	private AccountRepo accountRepo;

    private List<CoaPrintDto> dtos = new ArrayList<>();
    private final String INDENTION = "&nbsp;&nbsp;&nbsp;";
    private final String CODE_ACCOUNT_SPACE = "&nbsp;&nbsp;&nbsp;&nbsp;";

    /**
	 * Returns a data source that's wrapped within {@link JRDataSource}
	 * @return
	 */
	public JRDataSource getDataSource() {

        List<Account> topLevelAccounts = accountRepo.findByParentAccountIdOrderByCodeAsc(0);// top level accounts
        for(Account account : topLevelAccounts) {

            CoaPrintDto c1 = new CoaPrintDto();
            c1.setTitle(account.getCode() + CODE_ACCOUNT_SPACE + account.getTitle());
            if (account.getAccountType() != null) {
                c1.setType(account.getAccountType().getDescription());
            } else  {
                c1.setType("Not set");
            }
            this.dtos.add(c1);
            findDescendants(account, INDENTION);
        }

        CoaPrintDto c1 = new CoaPrintDto();
        c1.setTitle("Test");

        dtos.add(c1);

		// Return wrapped collection
		return new JRBeanCollectionDataSource(dtos);
	}

    private void findDescendants(Account currentAccount, String indention) {
        List<Account> children = accountRepo.findByParentAccountIdOrderByCodeAsc(currentAccount.getId());

        for (Account childAccount : children) {
            CoaPrintDto c1 = new CoaPrintDto();
            c1.setTitle(indention + childAccount.getCode() + CODE_ACCOUNT_SPACE + childAccount.getTitle());
            if (childAccount.getAccountType() != null) {
                c1.setType(childAccount.getAccountType().getDescription());
            } else  {
                c1.setType("Not set");
            }

            this.dtos.add(c1);
            findDescendants(childAccount, indention + INDENTION);
        }
    }


}