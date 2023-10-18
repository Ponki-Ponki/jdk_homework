package project.server;

import project.client.Client;

public interface ServerView {
    boolean connectUser(Client client);

    void sendMessage(String text);

    void disconnectUser(Client client);

}
