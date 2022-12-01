import IteratorComposite.Menu;
import IteratorComposite.Iterator;
import java.util.Hashtable;
public class CafeMenu implements Menu { 
Hashtable menuItems = new Hashtable(); 
public CafeMenu() {
} 


public void addItem(String name, String description, boolean Vegetarian, double price){
    MenuItem menuItem = new MenuItem(name, description, Vegetarian, price);
    Object menultem = null;
    menuItems.put(menuItem.getName(), menultem); 
} 

public Iterator createIterator(){
    return (Iterator) menuItems.values().iterator();
}



}