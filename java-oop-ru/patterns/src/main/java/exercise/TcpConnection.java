package exercise;
import exercise.connections.Connected;
import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private Connection connection;

    public TcpConnection(String ip, int port) {
        this.connection = new Disconnected(this);
    }

    public String getCurrentState() {
        return this.connection.getCurrentState();
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void connect() {
        setConnection(new Connected(this));
        this.connection.connect();
    }

    public void disconnect() {
        setConnection(new Disconnected(this));
        this.connection.disconnect();
    }

    public void write(String str) {
        this.connection.write(str);
    }
}
// END
