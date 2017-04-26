package vendingmachine.java.sampleExtended;

public enum VendingState implements State {
    INSTANCE;

    @Override
    public void goNext(VendingMachineSmplExt machine) {
        System.out.println("Here is your Pepsi.");
        machine.setMoneyAmount(0);
        machine.setCurrentState(DefaultState.INSTANCE);
    }
}
