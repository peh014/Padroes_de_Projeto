package StarbuzzPizza;


public class Veggie extends Pizza {
  
  public Veggie(){

      description = "Most Excellent Veggie";
  }  
  @Override
  public double cost(){
      return  (double) (1.99 + super.cost());
  }
}
