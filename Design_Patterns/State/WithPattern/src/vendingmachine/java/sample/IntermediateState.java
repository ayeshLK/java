package vendingmachine.java.sample;

public class IntermediateState implements State {
    @Override
    public void goNext(VendingMachineSmpl machine) {
        if(machine.getMoneyAmount() < 10){
            System.out.println("You need another Rs "+(10 - machine.getMoneyAmount())+" more.");
        }else {
            System.out.println("You gonna get a pepsi now.");
            machine.setCurrentState(new VendingState());
        }
    }
}
