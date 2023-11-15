package com.softarch.phase1;


public class PayBills implements ServiceController {
    @Override
    public String Execute(int WoP, String Amount, int sp, String CreditCardNo) // this part executes the way fo payment of bills
    {
        Startup k = new Startup();
        IPaying P;
        String NoS;
        NoS = ChooseBill(sp);
        switch (WoP) {
            case 1: { //pays though app wallet
                P = new WalletPayment();
                if (P.payment(k.currentUser, null, Amount)) {
                    k.currentUser.l.logger(NoS + " " + "Wallet Payment" + " Amount: " + Amount + " " + "L.E", Float.parseFloat(Amount));
                    return "Transaction Completed Successfully";
                } else {
                    return "insufficient funds";
                }
            }
            case 2: { // pays through credit card
                P = new CreditCard();

                P.payment(k.currentUser, CreditCardNo, Amount);
                k.currentUser.l.logger(NoS + " " + "Credit Card: " + k.currentUser.CardNumber + " Amount: " + Amount + " " + "L.E", Integer.parseInt(Amount));
                return "Transaction Completed Successfully";
            }
        }
        return "Transaction failed";
    }


    @Override
    public String ChooseBill(int NosChoice) {
        if (NosChoice == 1) {
            return "Gas";
        } else if (NosChoice == 2) {
            return "Electricity";
        } else if (NosChoice == 3) {
            return "Water";
        }
        return null;
    }

    public String PrintBillOptions() {
        return (
                """
                        Choose Bills :\s
                        1-Gas\s
                        2-Electricity
                        3-Water
                        """

        );
    }
}
