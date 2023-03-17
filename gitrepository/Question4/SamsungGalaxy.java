public class SamsungGalaxy implements Mobile {
    private String model;
    private int battery;
    public SamsungGalaxy(){
        this.model="Samsung Galaxy S21";
        this.battery=4000;
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
