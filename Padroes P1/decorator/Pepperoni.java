package StarbuzzPizza;


public class Pepperoni extends Pizza{
    
    public Pepperoni(){
        description = "pepperoni";
    }    
    @Override
    public double cost(){
        return 1.99;
    }
}
