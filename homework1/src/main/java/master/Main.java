package master;

public class Main {
    public static void main(String[] args) {

        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow, "0");
        new ClientGUI(serverWindow, "1");
    }
}
