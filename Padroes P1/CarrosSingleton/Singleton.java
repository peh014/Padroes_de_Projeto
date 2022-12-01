package CarrosSingleton;

import java.util.Random;

public class Singleton {
      private static Singleton uniqueInstance;
    	private boolean canMake;
	private boolean hasMaterial;

	private Singleton() {
            canMake = true;
            hasMaterial = true;
	}
	public Car makeRandomCar() {
            if (!canMake || !hasMaterial) {
		return null;
            } else {
		canMake = false;
                return constructRandomCar();
            }
      }        
	private Car constructRandomCar() {
            Color color = new Color();
            Tire tire = new Tire();
            Motor motor = new Motor();
            String name = "Carro numero " + new Random().nextInt(new Random().nextInt(99999));
            Car carro = new Car(name, color, tire, motor);
            canMake = true;		
            return carro;
	}
	
	public void refill() {
            if(hasMaterial) {
            return;
            }else {}
		hasMaterial = true;
        }
	
	public static synchronized Singleton getInstance() {
            if (uniqueInstance == null) {
		uniqueInstance = new Singleton();
            }
                return uniqueInstance;
            }     
      }



}
