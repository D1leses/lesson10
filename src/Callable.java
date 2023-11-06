public interface Callable<T> {
    void receiveCall(T call) throws NameException;
}
