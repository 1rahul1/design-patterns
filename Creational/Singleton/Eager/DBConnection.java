package Creational.Singleton.Eager;

public class DBConnection {
    private static DBConnection conObject = new DBConnection();

    private DBConnection() {
        // private constructor to restrict instantiation
    }

    public static DBConnection getInstance() {
        return conObject;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}
