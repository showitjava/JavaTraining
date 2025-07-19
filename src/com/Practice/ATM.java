package com.Practice;

public abstract  class ATM{

    public abstract  void pay();
    public void defaultPay()
    {
        System.out.println("Paying using default method");
    }
}

// credit card
//debit card
// internet ATMing

class CrediCard extends  ATM{

    @Override
    public void pay() {
        System.out.println("Money paid successfully by Credit card!1");
    }
}
class DebitCard extends  ATM{

    @Override
    public void pay() {

        System.out.println("Money paid using Debitcard!!");

    }

}
class InternetATMing extends  ATM{

    @Override
    public void pay() {
        System.out.println("Paying using Internet ATMing!!");
    }
}

class Main{
    public  static void main(String agrs[])
    {
        ATM A = null;
        A = new DebitCard();
        A.pay();
    }
}


