package Creational.Singleton.Lazy;

public class DBConnection {
    private static DBConnection conObject;

    private DBConnection() {
        // private constructor to restrict instantiation
    }

    public static DBConnection getInstance() {
        if (conObject == null) {
            conObject = new DBConnection();
        }
        return conObject;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}
