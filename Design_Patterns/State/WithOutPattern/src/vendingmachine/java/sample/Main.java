package vendingmachine.java.sample;

public class Main {
    public static void main(String args[]){
        VendingMachine machine = new VendingMachine();

        int[] inputs = {5,5,10,5,5,5};
        for(int i : inputs){
            machine.doVending(i);
        }

        if (machine.getMoneyAmount() != 0){
            System.out.println("Machine has Rs "+machine.getMoneyAmount()+" more.");
        }
        System.out.println("Vending Stopped!");
    }
}
