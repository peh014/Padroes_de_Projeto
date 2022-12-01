package CarrosSingleton;

public class Factory {
    public static void main(String [] args){
        Singleton CarrosSingletoningleton = Singleton.getInstance();        
        Car car = CarrosSingletoningleton.makeRandomCar();        
        System.out.println(car.name);
    }


}
