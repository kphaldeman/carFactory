package carFactory;
 
public class suvCar extends Car {
 
    suvCar() {
        super(CarType.SUV);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building SUV car");
        // add accessories
    }
}
