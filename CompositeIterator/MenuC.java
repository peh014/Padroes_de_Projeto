
import IteratorComposite.CompositeIterator;
import IteratorComposite.Iterator;
import IteratorComposite.MenuComponent;
import java.util.ArrayList;

public class MenuC extends MenuComponent { 
 ArrayList menuComponents = new ArrayList();
 String name; 
 String description; 

 public Iterator createIterator(){
     return new CompositeIterator((Iterator) menuComponents.iterator());
 }
public MenuC(String name, String description) {
    this.name = name;
    this.description=description;
} 
public void add(MenuComponent menuComponent) { 
    menuComponents.add(menuComponent); 
} 
public void remove(MenuComponent menuComponent) { 
    menuComponents.remove(menuComponent); 
} 
public MenuComponent getChild (int i) {
    return (MenuComponent)menuComponents.get(i); 
} 
public String getName() { 
return name; 
} 
public String getDescription() { 
return description; 
} 
public void print() { 
    System.out.print("\n" + getName()); 
    System.out.println(", %%" + getDescription()); 
    System.out.println(" "); 
    Iterator iterator = (Iterator) menuComponents.iterator(); 
        while (iterator.hasNext()) {
            MenuComponent menuComponent= 
        (MenuComponent)iterator.next(); 
            menuComponent.print(); 
        }
    }    
} 


