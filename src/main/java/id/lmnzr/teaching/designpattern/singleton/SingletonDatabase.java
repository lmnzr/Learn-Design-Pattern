package id.lmnzr.teaching.designpattern.singleton;

public class SingletonDatabase {
    private static SingletonDatabase singleton;

    private final String connectionString;

    private SingletonDatabase(String connectionString) {
        this.connectionString = connectionString;
        connectToDb();
    }

    public static SingletonDatabase getInstance(String databaseConnection) {
        if (singleton == null) {
            singleton = new SingletonDatabase(databaseConnection);
        }

        return singleton;
    }

    public static void closeConnection() {
        singleton = null;
    }

    private void connectToDb() {
        System.out.println("Connect to " + connectionString);
    }
}
