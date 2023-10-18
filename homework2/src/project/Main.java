package project;

import project.client.ClientGUI;
import project.server.Server;
import project.server.ServerGUI;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        new ClientGUI(server);
        new ClientGUI(server);
    }
}
