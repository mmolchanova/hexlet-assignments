package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection disconnection;

    public Disconnected(TcpConnection disconnection) {
        this.disconnection = disconnection;
    }

    public void connect() {
        System.out.println("disconnected");
    }

    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    public String getCurrentState() {
        return "disconnected";
    }

    public void write(String str) {
        System.out.println("Error! Connection already disconnected");
    }
}
// END
