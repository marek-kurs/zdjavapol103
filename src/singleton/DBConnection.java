package singleton;

public class DBConnection {

    private static DBConnection instance;
    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
//            Collections.unmodifiableList(list)
        }
        return instance;
    }
}