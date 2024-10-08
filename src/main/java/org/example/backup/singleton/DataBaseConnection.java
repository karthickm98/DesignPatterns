package org.example.backup.singleton;

public class DataBaseConnection {


    private static DataBaseConnection INSTANCE = null;

    private DataBaseConnection() {}

    public static DataBaseConnection getInstance() {
        if(INSTANCE == null) {
            synchronized (new Object()) {
                if(INSTANCE == null) {
                    INSTANCE = new DataBaseConnection();
                }
            }
        }
        return INSTANCE;
    }
}
