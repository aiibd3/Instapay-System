package com.softarch.phase1;

public class Pay {
    ServiceController q;

    public String payBill(int choice, String amount, int sp, String ccn) {
        q = new PayBills();
        return q.Execute(choice, amount, sp, ccn);
    }

    public String TransferToWallet(int choice, String amount, int sp, String ccn) {
        q = new TransferToWallet();
        return q.Execute(choice, amount, sp, ccn);
    }

}
