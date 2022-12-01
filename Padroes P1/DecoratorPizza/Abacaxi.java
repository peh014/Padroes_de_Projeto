package Pizzaria;



public class Abacaxi extends Decorator{
    Pizza pizza;




	public Abacaxi(Pizza pizza) {
            this.pizza = pizza;
	}
	public String getDescription() {
            return this.pizza.getDescricao() + "Abacaxi";
	}
	public double cost() {
            return 4.5 + this.pizza.cost();
	}





    @Override
    public String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
