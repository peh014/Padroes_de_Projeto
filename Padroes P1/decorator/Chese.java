
package StarbuzzPizza;


public class Chese extends CondimentDecorator {

    
      Pizza pizza;
    
    public Chese (Pizza pizza){
        this.pizza = pizza;
    }
    
    public String getDescription(){
        return pizza.getDescription() + ", Chessee";
    }
    
    public double cost(){
        return 0.20 + pizza.cost();
    }
}
