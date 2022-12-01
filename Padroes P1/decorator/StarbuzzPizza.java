package StarbuzzPizza;


public class StarbuzzPizza {
    
    public static void main(String args[]){
        
        Pizza beverage = new Chesse();

        System.out.println(beverage.getDescription() + "$" + beverage.cost());
        
        Pizza beverage2 = new Pepperoni();

        beverage2 = new Vegie(beverage2);

        beverage2 = new Chese(beverage2);

        beverage2 = new Peperoni(beverage2);

        System.out.println(beverage2.getDescription() +  "$" + beverage2.cost());
        

        Pizza beverage3 = new Veggie();

        beverage3 = new Vegie(beverage3);

        beverage3 = new Chese(beverage3);

        beverage3 = new Peperoni(beverage3);


        System.out.println(beverage3.getDescription() + "$" + beverage.cost());
    }
    
}
