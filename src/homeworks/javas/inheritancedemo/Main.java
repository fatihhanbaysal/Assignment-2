package javas.inheritancedemo;

public class Main {

    public static void main(String[] args) {
        CreditIU creditUI = new CreditIU();
        creditUI.CalculateCredit(new SoldierCreditManager());

    }

}