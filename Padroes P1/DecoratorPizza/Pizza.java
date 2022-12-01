package Pizzaria;



public abstract class Pizza {

    public abstract double cost();
    public abstract String getDescricao();
    public String getTipo() {
	        return this.getClass().getName();
        }



}
