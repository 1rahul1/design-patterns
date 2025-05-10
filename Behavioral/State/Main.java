package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setMachineState(new IdleState());

        vendingMachine.getMachineState().insertCoin(vendingMachine);
        vendingMachine.getMachineState().dispenseItem(vendingMachine);
    }
}
