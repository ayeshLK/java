package vendingmachine.java.sampleExtended;

public class Main {
    public static void main(String args[]){
        VendingMachineSmplExt machine = new VendingMachineSmplExt();

        int[] inputs = {2, 5,5,10,5,5,5,5,10,10};
        for(int i : inputs){
//            System.out.println("State : "+machine.getCurrentState().hashCode());
            if(machine.getMoneyAmount() >= 10){
                machine.goNext(0);
            }
            machine.goNext(i);
        }

        if(machine.getMoneyAmount() >= 10)
            machine.goNext(0);

        if (machine.getMoneyAmount() != 0){
            System.out.println("Machine has Rs "+machine.getMoneyAmount()+" more.");
        }
        System.out.println("Vending Stopped!");
    }
}
