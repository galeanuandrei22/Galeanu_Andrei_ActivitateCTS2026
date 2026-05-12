public abstract class ConnectionFactory {
    public abstract Connection createConnection();

    public void startService() {
        Connection conn = createConnection();
        conn.connect();
    }
}
