package Creational.Singleton.Lazy;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
        connObject.connect();
    }
}
