package com.softarch.phase2;


public class WalletManagement
{
    Startup k = new Startup();
    //this function will manage the wallet from the users perspective
    public float walletPrint()
    {
        return k.currentUser.account.PrintMoney();
    }
    public String addCash(String cnum,int cash)
    {
        k.currentUser.account.add(cash);
        return cash + " added successfully";
    }
}
