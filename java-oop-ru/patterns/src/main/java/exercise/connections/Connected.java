package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private TcpConnection connection;

    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    public void connect() {
        System.out.println("Error! Connection already established");
    }

    public void disconnect() {
        System.out.println("disconnected");
    }

    public String getCurrentState() {
        return "connected";
    }

    public void write(String str) {
        System.out.println("done");
    }
}
// END
