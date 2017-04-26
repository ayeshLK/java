package vendingmachine.java.sample;

public class DefaultState implements State {
    @Override
    public void goNext(VendingMachineSmpl machine) {
        if (machine.getMoneyAmount() < 5){
            System.out.println("Still Collecting.");
        }else if (machine.getMoneyAmount() >= 5 && machine.getMoneyAmount() < 10){
            System.out.println("You need another Rs "+(10 - machine.getMoneyAmount())+" more.");
            machine.setCurrentState(new IntermediateState());
        }else {
            System.out.println("You gonna get a Pepsi Now.");
            machine.setCurrentState(new VendingState());
        }
    }
}
