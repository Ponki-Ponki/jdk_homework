package project.server;



import javax.swing.*;
import java.awt.*;

public class ServerGUI extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    JButton btnStart, btnStop;
    JTextArea log;

    Server server;

    public ServerGUI(Server server){
        this.server = server;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);

        createPanel();

        setVisible(true);
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }
    public void appendLog(String text){
        log.append(text + "\n");
    }
    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(e -> {
            if (server.work){
                appendLog("Сервер уже был запущен");
            } else {
                server.work = true;
                appendLog("Сервер запущен!");

            }
        });

        btnStop.addActionListener(e -> {
            if (!server.work){
                appendLog("Сервер уже был остановлен");
            } else {
                server.stoppingServer();
                appendLog("Сервер остановлен!");
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }

}
