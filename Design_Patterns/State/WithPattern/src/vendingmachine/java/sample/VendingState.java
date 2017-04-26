package vendingmachine.java.sample;

public class VendingState implements State {
    @Override
    public void goNext(VendingMachineSmpl machine) {
        System.out.println("Here is your Pepsi.");
        machine.setMoneyAmount(0);
        machine.setCurrentState(new DefaultState());
    }
}
