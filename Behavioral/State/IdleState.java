package Behavioral.State;

public class IdleState implements VendingState {
    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("Coin inserted.");
        product.setMachineState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Please insert a coin first.");
        // not doing anything here
    }
}
