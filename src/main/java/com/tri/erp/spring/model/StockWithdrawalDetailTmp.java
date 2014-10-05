package com.tri.erp.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

/**
 * Created by Ryan D. Repe on 10/5/2014.
 */
@Entity
@Table(name = "stock_withdrawal_detail_tmp")
public class StockWithdrawalDetailTmp {

    @Id
    @GeneratedValue
    @Column(name = "stock_withdrawal_detail_id")
    private int stockWithdrawalDetailId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="stock_withdrawal_id")
    private StockWithdrawalTmp stockWithdrawal;
}
