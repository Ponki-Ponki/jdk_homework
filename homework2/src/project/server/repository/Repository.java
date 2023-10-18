package project.server.repository;

public interface Repository {
    String readLog();
    void saveLog(String text);
}
