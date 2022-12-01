package Pizzaria;

public abstract class Molho extends Decorator{
    Pizza pizza;	
	public Molho(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	public String getDescricao() {
            return this.pizza.getDescricao() + "Molho";
	}

	@Override
	public double cost() {
            return 10.50 + this.pizza.cost();
	}





}
