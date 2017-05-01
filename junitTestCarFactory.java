package carFactory;

import static junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
 
public class junitTestCarFactory extends TestCase {
        Car compactCar;
        Car sedanCar;
        Car suvCar;
	 
	public void testCars() {
		assertNotNull(compactCar = CarFactory.buildCar(CarType.COMPACT));
       		assertNotNull(sedanCar   = CarFactory.buildCar(CarType.SEDAN));
        	assertNotNull(suvCar     = CarFactory.buildCar(CarType.SUV));
	        System.out.println("@Test cars(): compact car = " + compactCar.getModel().toString() );
	        System.out.println("@Test cars(): sedan car = " + sedanCar.getModel().toString() );
	        System.out.println("@Test cars(): suv car = " + suvCar.getModel().toString() );
	        assertEquals(compactCar.getModel(), CarType.COMPACT);
	        assertEquals(sedanCar.getModel(), CarType.SEDAN);
	        assertEquals(suvCar.getModel(), CarType.SUV);
        }
 
}
