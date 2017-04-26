package vendingmachine.java.sample;

public class VendingState implements State {
    @Override
    public void goNext(VendingMachineSmpl machine) {
        if(machine.getMoneyAmount() == 10)
            System.out.println("Here is your Pepsi.");
        else if (machine.getMoneyAmount() > 10)
            System.out.println("Here is your Pepsi. Your change is Rs "+(machine.getMoneyAmount() - 10)+".");
        machine.setMoneyAmount(0);
        machine.setCurrentState(new DefaultState());
    }
}
