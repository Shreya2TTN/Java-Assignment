public class Main {
    public static void main(String[] args) {
        Mobile samsung=MobileFactory.createMobile("Samsung");
        Mobile redmi=MobileFactory.createMobile("Redmi");
        System.out.println("Model : "+samsung.getModel());
        System.out.println("Battery Capacity : "+samsung.getBatteryCapacity());
        System.out.println("Model : "+redmi.getModel());
        System.out.println("Battery Capacity : "+redmi.getBatteryCapacity());
    }
}