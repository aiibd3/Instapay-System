package com.softarch.phase1;


import static com.softarch.phase1.Startup.u;

public class WalletManagement {
    Startup k = new Startup();

    //this function will manage the wallet from the users perspective
    public float walletPrint() {
        return k.currentUser.account.PrintMoney();
    }

    public String addCash(String cnum, int cash) {
        k.currentUser.account.add(cash);
        return cash + " added successfully";
    }

    public String transferCash(String mNumber, int cash) {

        for (int i = 1; i < 100; i++) {
            if (u[i].mobileNumber.equals(mNumber)) {
                u[i].account.add(cash);
            }
        }

        return cash + "Cash Transferred successfully";
    }
    public String transferCashCredit(String mNumber, int cash) {

        for (int i = 1; i < 100; i++) {
            if (u[i].CardNumber.equals(mNumber)) {
                u[i].account.add(cash);
            }
        }

        return cash + "Cash Transferred successfully";
    }
    public String transferCashemail(String mNumber, int cash) {

        for (int i = 1; i < 100; i++) {
            if (u[i].Email.equals(mNumber)) {
                u[i].account.add(cash);
            }
        }

        return cash + "Cash Transferred successfully";
    }
}
