public class Pirog implements Baked {
    private String filling;

    public Pirog() {
    }



    public Pirog(String filling) {
        this.filling = filling;
    }

    @Override
    public void baked() {
        System.out.println("Baked in the oven"+"\n");
    }

    @Override
    public String toString() {
        return "Pirog: " + "\n" +
                "filling: " + filling ;
    }
}
