public class Redmi implements Mobile{
    private String model;
    private int battery;
    public Redmi(){
        this.model="Redmi Note 9 Pro";
        this.battery=5000;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getBatteryCapacity() {
        return battery;
    }
}
