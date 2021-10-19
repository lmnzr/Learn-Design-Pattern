package id.lmnzr.teaching.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DatabaseTest {

    @Test
    void givenConnString_whenSingleConstruct_thenShouldConnectToDb() throws Exception {
//        String connection1 = tapSystemOut(() -> {
//            new NonSingletonDatabase("jdbc:mysql://localhost:3306/database");
//        });

        String connection1 = tapSystemOut(() -> {
            SingletonDatabase.getInstance("jdbc:mysql://localhost:3306/database");
            SingletonDatabase.closeConnection();
        });

        assertEquals("Connect to jdbc:mysql://localhost:3306/database", connection1.trim());
    }

    @Test
    void givenConnString_whenMultipleConstruct_thenShouldReuseConnection() throws Exception {
//        String connection1 = tapSystemOut(() -> {
//            new NonSingletonDatabase("jdbc:mysql://localhost:3306/database");
//        });
//
//        assertEquals("Connect to jdbc:mysql://localhost:3306/database", connection1.trim());
//
//        String connection2 = tapSystemOut(() -> {
//            new NonSingletonDatabase("jdbc:mysql://localhost:3306/database");
//        });

        String connection1 = tapSystemOut(() -> {
            SingletonDatabase.getInstance("jdbc:mysql://localhost:3306/database");
        });

        assertEquals("Connect to jdbc:mysql://localhost:3306/database", connection1.trim());

        String connection2 = tapSystemOut(() -> {
            SingletonDatabase.getInstance("jdbc:mysql://localhost:3306/database");
            SingletonDatabase.closeConnection();
        });

        assertEquals("", connection2.trim());
    }

    @Test
    void givenConnString_whenMultipleConstruct_thenShouldProduceSameObject() {
//        NonSingletonDatabase database1 = new NonSingletonDatabase("jdbc:mysql://localhost:3306/database");
//        NonSingletonDatabase database2 = new NonSingletonDatabase("jdbc:mysql://localhost:3306/database");

        SingletonDatabase database1 = SingletonDatabase.getInstance("jdbc:mysql://localhost:3306/database");
        SingletonDatabase database2 = SingletonDatabase.getInstance("jdbc:mysql://localhost:3306/database");
        SingletonDatabase.closeConnection();

        assertEquals(database1, database2);
    }
}