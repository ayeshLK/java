package vendingmachine.java.sample;

public class Main {
    public static void main(String args[]){
        VendingMachineSmpl machine = new VendingMachineSmpl();

        int[] inputs = {5,5,10,5,5,5};
        for(int i : inputs){
            if(machine.getMoneyAmount() >= 10){
                machine.goNext(0);
            }
            machine.goNext(i);
        }

        if (machine.getMoneyAmount() != 0){
            System.out.println("Machine has Rs "+machine.getMoneyAmount()+" more.");
        }
        System.out.println("Vending Stopped!");
    }
}
