public class Bun implements Baked {
    private String filling;


    public Bun(String filling) {
        this.filling = filling;
    }

    public Bun() {
    }


    @Override
    public void baked() {
        System.out.println("Baked in the oven");
    }

    @Override
    public String toString() {
        return "Bun: " +"\n"+
                "filling: " + filling ;
    }
}
