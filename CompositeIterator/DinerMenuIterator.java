package IteratorComposite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
public class DinerMenuIterator implements Iterator{
    MenuItem[] list;
    int position=0;

    public DinerMenuIterator(MenuItem[] menuItems) {
    }
    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position=position=1;
        return menuItem;
    }   public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }
    @Override
    public void remove() {
        if (position <= 0) {
                throw new IllegalStateException ("You can't remove an item until you've dono at least one next");
        }
        if (list[position-1] != null) {
            int i;
                
            for (i=position-1; i< list.length-1;i++){
                    list[i] = list[i+1];
                 
            } 
                list[list.lenght-1]=null;
        }
    }    
    @Override
    public boolean hasNext() {
    if (position>=list.lenght||list[position]==null){
           return false;
       }
       else{
           return true;
       }    
    }  
  

    
}
