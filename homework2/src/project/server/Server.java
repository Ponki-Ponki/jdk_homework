package project.server;

import project.client.Client;
import project.server.repository.Repository;
import project.server.repository.Storage;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Server implements ServerView{

    List<Client> clientList;
    boolean work;
    Repository storage;
    ServerGUI window;

    public Server(){
        storage = new Storage();
        clientList = new ArrayList<>();
        window = new ServerGUI(this);
    }

    public ServerGUI getWindow(){return  window;}
    public boolean connectUser(Client client){
        if (!work){
            return false;
        }
        clientList.add(client);
        return true;
    }
    public void disconnectUser(Client client){
        clientList.remove(client);
        if (client != null){
            client.disconnect();
        }
    }


    public void sendMessage(String text){
        if (!work){
            return;
        }
        window.appendLog(text);
        answerAll(text);
        saveInLog(text);
    }

    private void answerAll(String text){
        for (Client client: clientList){
            client.serverAnswer(text);
        }
    }
    public void stoppingServer(){
        do {
            if (clientList.size() != 0){
                Client clientGUI = clientList.get(0);
                disconnectUser(clientGUI);
            }
        } while (clientList.size() != 0);
        work = false;
    }
    public String getHistory() {
        return readLog();
    }
    private void saveInLog(String text){
        storage.saveLog(text);
    }

    private String readLog(){
        return storage.readLog();
    }



}
