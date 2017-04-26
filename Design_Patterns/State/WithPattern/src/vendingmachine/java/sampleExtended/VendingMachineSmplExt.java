package vendingmachine.java.sampleExtended;

public class VendingMachineSmplExt {
    private State currentState;
    private int moneyAmount;

    public VendingMachineSmplExt() {
        setCurrentState(State.DEFAULT);
        setMoneyAmount(0);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void goNext(int collection){
        moneyAmount += collection;
        currentState.goNext(this);
    }
}
