import IteratorComposite.DinerMenuIterator;
import java.util.ArrayList;
import java.util.Iterator;
public class PancakeHouseMenu {
    ArrayList menuItems;
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("", "", true, 2.99);
        addItem("", "", false, 2.99);
        addItem("", "", true, 2.99);
        addItem("", "", true, 2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}