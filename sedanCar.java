package carFactory;
 
public class sedanCar extends Car {
 
    sedanCar() {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building my fancy shmancy sedan car!");
        // add accessories
    }
}
