public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        System.out.println(guitar.play());
        System.out.println(guitar.tune());

        Instrument piano = new Piano();
        System.out.println(piano.play());
        System.out.println(piano.tune());

        Bird eagle = new Eagle();
        System.out.println(eagle.fly());
        System.out.println(eagle.makeSound());

        Bird hawk = new Hawk();
        System.out.println(hawk.fly());
        System.out.println(hawk.makeSound());
    }
}
