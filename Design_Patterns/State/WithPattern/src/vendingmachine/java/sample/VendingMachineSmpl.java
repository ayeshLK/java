package vendingmachine.java.sample;

public class VendingMachineSmpl {
    private State currentState;
    private int moneyAmount;

    public VendingMachineSmpl() {
        setCurrentState(new DefaultState());
        setMoneyAmount(0);
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void goNext(int collection){
        moneyAmount += collection;
        currentState.goNext(this);
    }
}
