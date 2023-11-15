package com.softarch.phase1;

public interface ServiceController
{ // this interface manages applying different actions to the services provided by the system
  public String Execute(int WoP ,String Amount ,int sp ,String CreditCardNo);
  public String PrintBillOptions();
  public String ChooseBill(int sp);

}

