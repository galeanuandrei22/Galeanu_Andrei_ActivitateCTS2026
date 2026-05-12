public class SSHFactory extends ConnectionFactory {
    @Override
    public Connection createConnection() {
        return new SSHConnection();
    }
}
