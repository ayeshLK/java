package vendingmachine.java.sampleExtended;

public enum State {
    DEFAULT{
        public void goNext(VendingMachineSmplExt machine){
            if (machine.getMoneyAmount() < 10){
                System.out.println("You need another Rs "+(10 - machine.getMoneyAmount())+" more.");
                machine.setCurrentState(State.INTERMEDIATE);
            }else {
                System.out.println("You gonna get a Pepsi Now.");
                machine.setCurrentState(State.VENDING);
            }
        }
    },INTERMEDIATE{
        public void goNext(VendingMachineSmplExt machine){
            if(machine.getMoneyAmount() < 10){
                System.out.println("You need another Rs "+(10 - machine.getMoneyAmount())+" more.");
            }else {
                System.out.println("You gonna get a pepsi now.");
                machine.setCurrentState(State.VENDING);
            }
        }
    },VENDING{
        public void goNext(VendingMachineSmplExt machine){
            if(machine.getMoneyAmount() == 10)
                System.out.println("Here is your Pepsi.");
            else if (machine.getMoneyAmount() > 10)
                System.out.println("Here is your Pepsi. Your change is Rs "+(machine.getMoneyAmount() - 10)+".");
            machine.setMoneyAmount(0);
            machine.setCurrentState(State.DEFAULT);
        }
    };

    abstract void goNext(VendingMachineSmplExt machine);
}
