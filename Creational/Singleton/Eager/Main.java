package Creational.Singleton.Eager;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
        connObject.connect();
    }
}
