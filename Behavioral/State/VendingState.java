package Behavioral.State;

public interface VendingState {
    void insertCoin(VendingMachine product);

    void dispenseItem(VendingMachine product);
}
