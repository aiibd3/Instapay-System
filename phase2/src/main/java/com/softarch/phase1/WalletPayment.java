package com.softarch.phase1;

//this class manages the wallet payment in the Payment of services
public class WalletPayment implements IPaying
{
    @Override
    public boolean payment(Users l, String CardNo, String AmountToPay)
    {
        return l.account.deduct(Float.parseFloat(AmountToPay));
    }
}
