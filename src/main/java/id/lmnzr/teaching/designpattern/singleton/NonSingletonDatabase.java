package id.lmnzr.teaching.designpattern.singleton;

public class NonSingletonDatabase {
    private final String connectionString;

    public NonSingletonDatabase(String connectionString) {
        this.connectionString = connectionString;
        connectToDb();
    }

    private void connectToDb() {
        System.out.println("Connect to " + connectionString);
    }
}
