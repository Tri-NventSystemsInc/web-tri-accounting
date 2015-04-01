package com.tri.erp.spring.model.enums;

/**
 * Created by Ryan D. Repe on 10/13/2014.
 */
public enum DocumentStatus {

    Document_Created(1),
    For_Checking(2),
    For_Recommendation(3),
    For_Audit(4),
    For_Approval(5),
    For_Check_Writing(6),
    Approved(7),
    Denied(8),
    For_Canvassing(9),
    Closed(10),
    Returned_to_Creator(11),
    Returned_to_Canvassing(12),
    Returned_to_Audit(13),
    Deleted(14),
    Returned_to_Accountant(15),
    Returned_to_Cashier(16),
    Checked(17),
    For_Receiving(18),
    For_Special_Equipment(19),
    For_Repair(20),
    Repaired(21),
    Received(22),
    Returned_from_GM(23),
    For_Releasing(24),
    Released(25),
    Cancelled(26),
    Approved_for_installment(27),
    For_approval_of_GM(28);

    private int id;

    DocumentStatus(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
