package com.softarch.phase1;

public class TransferToWallet implements ServiceController {
    @Override // this function will transfer money and display in the logger
    // mobileNumber here represents as mobile number or credit card number or Email as user choice in WoP (way of payment)
    // NoS ( number of service)
    public String Execute(int WoP, String Amount, int sp, String mobileNumber) {
        Startup k = new Startup();
        IPaying P;
        WalletManagement F;
        String NoS;
        NoS = ChooseBill(sp);
        switch (WoP) {
            case 1: { // transfer to another bank account
                P = new CreditCard();
                F = new WalletManagement();
                P.payment(k.currentUser, mobileNumber, Amount);
                k.currentUser.l.logger(NoS + " " + "Credit Card: " + k.currentUser.CardNumber + " Amount: " + Amount + " " + "L.E", Integer.parseInt(Amount));
                F.transferCashCredit(mobileNumber, Integer.parseInt(Amount));
                return "Transaction Completed Successfully";
            }
            case 2: { // Transfer To a Mobile Wallet through a wallet providers
                P = new WalletPayment();
                F = new WalletManagement();
                P.payment(k.currentUser, mobileNumber, Amount);
                k.currentUser.l.logger(NoS + " " + "Wallet Payment" + " Amount: " + Amount + " " + "L.E", Float.parseFloat(Amount));
                F.transferCash(mobileNumber, Integer.parseInt(Amount));
                return "Transaction Completed Successfully";
            }
            case 3: { // Transfer to another Instapay account
                P = new WalletPayment();
                F = new WalletManagement();
                P.payment(k.currentUser, mobileNumber, Amount);
                k.currentUser.l.logger(NoS + " " + "Wallet Payment" + " Amount: " + Amount + " " + "L.E", Float.parseFloat(Amount));
                F.transferCashemail(mobileNumber, Integer.parseInt(Amount));
                return "Transaction Completed Successfully";
            }
        }
        return "Transaction Failed";
    }

    @Override  // this part will display the service providers for payment
    public String ChooseBill(int NosChoice) {
        if (NosChoice == 1) {
            return "Vodafone Cash";
        } else if (NosChoice == 2) {
            return "Fawry";
        } else if (NosChoice == 3) {
            return "CIB";
        }
        return null;
    }

    public String PrintBillOptions() // prints way of payment
    {
        return
                (
                        """
                                Choose way of payment :\s
                                1-Vodafone Cash\s
                                2-Fawry
                                3-CIB
                                """
                );
    }
}
