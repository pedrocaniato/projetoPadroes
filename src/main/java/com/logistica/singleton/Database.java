package main.java.com.logistica.singleton;

public class Database {
    private static Database instance;
    
    private Database() {} 

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executando no Singleton DB: " + sql);
    }
}