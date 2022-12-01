package IteratorComposite;
public class Waitress {
    MenuComponent allMenus;
        public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
        }
    public void printMenu() {
    allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n MENU VEGETARIAN\n-----");
            while (iterator.hasNext()) {
                MenuComponent menuComponent = (MenuComponent) iterator.next();
            }
                try {
                    if (allMenus.isVegetarian()) {
                        allMenus.print();
                    }
                } 
                catch (UnsupportedOperationException e){}
    }
}

