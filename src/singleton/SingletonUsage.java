package singleton;

import singleton.DBConnection;

public class SingletonUsage {
    public static void main(String[] args) {
        DBConnection singleton;
        singleton = DBConnection.getInstance();
        DBConnection singleton2 = DBConnection.getInstance();


    }
}
