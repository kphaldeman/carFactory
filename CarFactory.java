package carFactory;
 
public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case COMPACT:
            car = new compactCar();
            break;
 
        case SEDAN:
            car = new sedanCar();
            break;
 
        case SUV:
            car = new suvCar();
            break;
 
        default:
            System.out.println("Something went wrong.  Write some code here to handle it!");
            break;
        }
        return car;
    }
}
