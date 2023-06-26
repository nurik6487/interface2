public class Main {
    public static void main(String[] args) {
        Pirog pirog = new Pirog("Apple");
        System.out.println(pirog);
        pirog.baked();

        Bread bread = new Bread("Strawberry");
        System.out.println(bread);
        bread.baked();

        Bun bun =new Bun("Orange");
        System.out.println(bun);
        bun.baked();
    }
}