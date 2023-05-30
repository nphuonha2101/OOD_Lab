package state;

public class GumbalMachine {
    private State soldOutState;
    private State noQuaterState;
    private State hasQuaterState;
    private State soldState;

    private State currentState = soldOutState;
    private int count = 0;

    public GumbalMachine(int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuaterState = new NoQuaterState(this);
        this.hasQuaterState = new HasQuaterState(this);
        this.soldState = new SoldState(this);
        this.count =numberGumballs;
        if (numberGumballs > 0)
            currentState = noQuaterState;
    }


    public void setCurrentState(State currentState) {
        this.currentState = currentState;


    }

    public void insertQuater() {
        currentState.insertQuater();
    }

    public void ejectQuater() {
        currentState.ejectQuater();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0)
            count--;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public void setNoQuaterState(State noQuaterState) {
        this.noQuaterState = noQuaterState;
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public void setHasQuaterState(State hasQuaterState) {
        this.hasQuaterState = hasQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + currentState + "\n");
        return result.toString();
    }
}
