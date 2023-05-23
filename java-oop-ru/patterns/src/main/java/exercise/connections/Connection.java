package exercise.connections;

public interface Connection {
    // BEGIN
    void connect();

    void disconnect();

    String getCurrentState();

    void write(String str);
    // END
}
