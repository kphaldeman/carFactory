package carFactory;
 
public class compactCar extends Car {
 
    compactCar() {
        super(CarType.COMPACT);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building compact car");
        // add accessories
    }
}
