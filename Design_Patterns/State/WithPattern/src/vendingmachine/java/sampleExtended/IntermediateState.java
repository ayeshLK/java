package vendingmachine.java.sampleExtended;

public enum IntermediateState implements State {
    INSTANCE;

    @Override
    public void goNext(VendingMachineSmplExt machine) {
        if(machine.getMoneyAmount() < 10){
            System.out.println("You need another Rs "+(10 - machine.getMoneyAmount())+" more.");
        }else {
            System.out.println("You gonna get a pepsi now.");
            machine.setCurrentState(VendingState.INSTANCE);
        }
    }
}
