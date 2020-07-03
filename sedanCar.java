package carFactory;
 
public class sedanCar extends Car {
 
    sedanCar() {
        super(CarType.SEDAN);
        construct();
    }
 
    @Override
    protected void construct() {
        System.out.println("Building my fancy shmancy sedan car with an AM/FM radio and windshield wipers!");
        // add accessories
    }
}
