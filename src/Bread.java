public class Bread implements Baked {
    private String taste;

    public Bread() {
    }

    public Bread(String taste) {
        this.taste = taste;
    }


    @Override
    public void baked() {
        System.out.println("Oven baked"+"\n");
    }

    @Override
    public String toString() {
        return "Bread: " +"\n"+
                "taste: " + taste ;
    }
}
