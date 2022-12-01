package StarbuzzPizza;




public abstract class Pizza {
    String description = "Unknown Beverage";  
    public String getDescription(){
        return description;
    }
    
    double pepperoniCost;
    double chesseCost;
    double veggiecost;



    public double cost(){
        double condimentCost = (double) 0.0;
        
        if(hasPepperoni()){
            condimentCost += pepperoniCost;
        }
        
        if(haschesse()){
            condimentCost += chesseCost;
        }
        
        if(hasVeggie()){
            condimentCost += veggiecost;
        }    
        return condimentCost;
    }




    private boolean hasPepperoni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean haschesse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean hasVeggie() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
