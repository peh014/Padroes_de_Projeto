package StarbuzzPizza;


public class Vegie  extends CondimentDecorator {

     Pizza pizza;
    
    public Vegie ( Pizza pizza){
        this.pizza = pizza;
    }
        public String getDescription(){
        return pizza.getDescription() + ", Vegie";
    }
    
    public double cost(){
        return 0.20 + pizza.cost();
    }
    
    
}
