class Hawk extends Bird {
    public Hawk() {
        super("Ястреб");
    }

    @Override
    public String fly() {
        return "Ястреб быстро летит";
    }

    @Override
    public String makeSound() {
        return "Ястреб издает крик";
    }
}
