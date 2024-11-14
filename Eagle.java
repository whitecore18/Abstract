class Eagle extends Bird {
    public Eagle() {
        super("Орёл");
    }

    @Override
    public String fly() {
        return "Орёл летит высоко";
    }

    @Override
    public String makeSound() {
        return "Орёл издает крик";
    }
}
