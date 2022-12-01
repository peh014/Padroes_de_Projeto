import IteratorComposite.DinerMenuIterator;
import IteratorComposite.Iterator;
import java.util.ArrayList;
public class DinerMenu {
static final int MAX_ITEMS =6;
int number0fItems = 0; 
MenuItem[]  menuItems;

public DinerMenu(){
menuItems= new MenuItem[MAX_ITEMS];        
    addItem ("","",true,2.99);
    addItem ("","",false,2.99);
    addItem ("","",true,2.99);
    addItem ("","",true,2.99);
}

public void addItem (String name, String description, boolean vegetarian,double price){
    MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
   
    if(number0fItems >=MAX_ITEMS){
        System.err.println("");        
    }

    else{
        menuItems[number0fItems]=menuItem;
        number0fItems=number0fItems+1;
    }
}

public Iterator createIterator()
{
    return new DinerMenuIterator (menuItems);
}

for (int i=0; i < breakfastItems.size(); i++) 
{
MenuItem menuItem= {Menultem}breakfastItems.get(i); 
System.out.println(menuItem.getName() + " p"); 
System.out.println(menuItem.getPrice()+ " p"); 
System.out.println(menuItem.getDescription()); 
} 
for (int i = 0; i<lunchItems.length;  i++)
{
MenuItem menuItem = lunchItems(i); 
System.out.println((menuItem.getName) +"");
System.out.println(menuItem.getPrice()+ " "); 
System.out.println(menuItem.getDescription()); 
}
    public int getNumber0fItems() {
        return number0fItems;
    }
     public String getName() {
    return null;
     }
   public int getPrice() {
    return 0;
     }
    public String getDescription() {
    return null;
     }
    public void setNumber0fItems(int number0fItems) {
        this.number0fItems = number0fItems;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }




    
}


