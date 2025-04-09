package Week4.singleton;

public class DatabaseConnection extends Thread{

    /*
    * 1.Make the constructor private
    * 2.Make the method static*/
    private static final String NOT_ALLOWED = "NOT ALLOWED";

    private static DatabaseConnection dbConnection;

//    Eager Way of building objects
    private static final DatabaseConnection dbConn = new DatabaseConnection();


    private DatabaseConnection(){
       if(dbConnection!=null){
           throw new RuntimeException(NOT_ALLOWED);
       }
    }

//    Lazy Initialization
    public static DatabaseConnection getInstance(){

        if(dbConnection==null) {
            synchronized (DatabaseConnection.class) {
                if (dbConnection==null){
                    dbConnection = new DatabaseConnection();
                }
            }
        }
        return dbConnection;
    }

    private static DatabaseConnection getInstance2(){
        return dbConn;
    }
}
