package project.server.repository;

public interface Repository<T> {
    T readLog();
    void saveLog(T text);
}
