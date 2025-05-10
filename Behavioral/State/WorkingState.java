package Behavioral.State;

public class WorkingState implements VendingState {
    @Override
    public void insertCoin(VendingMachine product) {
        // not doing anything here
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Dispensing item.");
        product.setMachineState(new IdleState());
    }

}
