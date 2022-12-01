package Pizzaria;


 /* @author pedro  */
 
import Pizzaria.CheesePizza;

public class PizzaFactory {
    public static void main(String[] args) {
    Decorator decorator1 = new Abacaxi (new CheesePizza());		
	System.out.println(decorator1.getDescricao() + " " + decorator1.cost());
	
			
    }
}
