class XiaomiPhone extends Phone<String> {
    public XiaomiPhone(String model, long number, int weight) {
        super(model, number, weight);
    }

    @Override
    public void info(){
        System.out.println("Модель телефона: " + getModel() + "\tНомер: " + getNumber() + "\tВес: " + getWeight());
    }

    public void receiveCall(String call) throws NameException {
        if (call.length() < 4) {
            throw new NameException("Имя должно осдержать более 4 букв.");
        }
        System.out.println("Вам звонит: " + call);

    }
}