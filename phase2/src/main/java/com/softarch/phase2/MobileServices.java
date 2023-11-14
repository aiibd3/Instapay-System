package com.softarch.phase2;


public class MobileServices implements ServiceController {
    @Override
    public String Execute(int WoP, String Amount, int sp, String CreditCardNo) // this part executes the way fo payment of mobile recharge service
    {
        Startup k = new Startup();
        IPaying P;
        String NoS;
        NoS = ChooseServiceProvider(sp);
        switch (WoP) {
            case 1: {
                P = new WalletPayment();
                if (P.payment(k.currentUser, null, Amount)) {
                    k.currentUser.l.logger(NoS + " " + "Wallet Payment" + " Amount: " + Amount + " " + "L.E", Float.parseFloat(Amount));
                    return "Transaction Completed Successfully";
                } else {
                    return "insufficient funds";
                }
            }
            case 2: {
                P = new CreditCard();

                P.payment(k.currentUser, CreditCardNo, Amount);
                k.currentUser.l.logger(NoS + " " + "Credit Card: " + k.currentUser.CardNumber + " Amount: " + Amount + " " + "L.E", Integer.parseInt(Amount));
                return "Transaction Completed Successfully";
            }
        }
        return "Transaction failed";
    }


    @Override
    public String ChooseServiceProvider(int NosChoice) // this part manages mobile recharge service providers
    {
        if (NosChoice == 1) {
            return "Vodafone";
        } else if (NosChoice == 2) {
            return "Etisalat";
        } else if (NosChoice == 3) {
            return "Orange";
        } else if (NosChoice == 4) {
            return "WE";
        }
        return null;
    }

    public String PrintServiceProvider() // prints service providers for the user
    {
        return (
                "Mobile recharge services: \n" +
                        "1-Vodafone \n" +
                        "2-Etisalat\n" +
                        "3-Orange\n" +
                        "4-We"
        );
    }
}
