class ApplePhone extends Phone<String> {
    public ApplePhone(String model, long number, int weight) {
        super(model, number, weight);
    }

    public void info() {
        System.out.println("Модель телефона: " + getModel() + "\tНомер: " + getNumber() + "\tВес: " + getWeight());
    }

    public void receiveCall(String call) throws NameException {
        if (call.length() < 4) {
            throw new NameException("Имя должно осдержать более 4 букв.");
        }
        System.out.println("Вам звонит: " + call);
    }
}