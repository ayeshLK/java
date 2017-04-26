package vendingmachine.java.sampleExtended;

public enum DefaultState implements State {
    INSTANCE;

    @Override
    public void goNext(VendingMachineSmplExt machine) {
        if (machine.getMoneyAmount() < 5){
            System.out.println("Still Collecting.");
        }else if (machine.getMoneyAmount() >= 5 && machine.getMoneyAmount() < 10){
            System.out.println("You need another Rs "+(10 - machine.getMoneyAmount())+" more.");
            machine.setCurrentState(IntermediateState.INSTANCE);
        }else {
            System.out.println("You gonna get a Pepsi Now.");
            machine.setCurrentState(VendingState.INSTANCE);
        }
    }
}
