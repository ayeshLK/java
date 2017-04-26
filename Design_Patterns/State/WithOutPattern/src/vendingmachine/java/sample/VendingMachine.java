package vendingmachine.java.sample;

public class VendingMachine {
    private int moneyAmount = 0;

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void doVending(int collection){
        moneyAmount += collection;
        if(moneyAmount <= 0){
            System.out.println("Still Waiting for Money.");
            return;
        }else if (moneyAmount > 0 && moneyAmount < 10){
            System.out.println("Currently having Rs "+moneyAmount+".");
            return;
        }else{
            System.out.println("Vended a Pepsi.");
            moneyAmount = 0;
            return;
        }
    }
}
