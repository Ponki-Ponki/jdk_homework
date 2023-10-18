package project.server.repository;

public interface Repository {
    public String readLog();
    public void saveLog(String text);
}
