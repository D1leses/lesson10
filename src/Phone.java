abstract class Phone<T> implements Callable<T>, informable<T>{
    private String model;
    private long number;
    private int weight;

    public Phone(String model, long number, int weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public String getModel() {
        return model;
    }
    public long getNumber() {
        return number;
    }
    public int getWeight() {
        return weight;
    }

    public void receiveCall(String name) throws NameException {
        System.out.printf("Вам звонит: %s\n", name);
    }
    public abstract void info();
}