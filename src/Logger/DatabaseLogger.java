package Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Database logged :"+ data);
    }
}
