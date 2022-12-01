package StarbuzzPizza;


public class Peperoni extends CondimentDecorator {
    Pizza pizza;
    
    
    public Peperoni( Pizza pizza){
        this.pizza = pizza;
    } 
    public String   getDescription(){
        return pizza.getDescription() + ", Pepperoni";
    }    
    public double cost(){
        return 0.20 + pizza.cost();
    }
}
