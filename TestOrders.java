import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        // Menu items
        coffeeKiosk.addMenuItem("coffee", 2.99);
        coffeeKiosk.addMenuItem("Viet Coffee", 3.99);
        coffeeKiosk.addMenuItem("Thai Tea", 3.49);
        coffeeKiosk.addMenuItem("Milk Tea", 2.99);
        coffeeKiosk.addMenuItem("frap", 4.99);

        // Item item1 = new Item("coffee", 2.99);
        // Item item2 = new Item("Viet Coffee", 3.99);
        // Item item3 = new Item("Thai Tea", 3.49);
        // Item item4 = new Item("frap", 4.99);
        // Item item5 = new Item("Milk Tea", 2.99);
    
        // Order variables -- order1, order2 etc.
        coffeeKiosk.addMenuItemByInput();
        coffeeKiosk.newOrder();

        // Order order1 = new Order();
        // Order order2 = new Order();

        // Order order3 = new Order("Francisco");
        // Order order4 = new Order("Miranda");
        // Order order5 = new Order("Kristina");

        // order4.addItem(item3);
        // order3.addItem(item1);
        // System.out.println(order4.getStatusMessage());

        // order3.setReady(true);
        // System.out.println(order3.getStatusMessage());
        // System.out.println(order3.getOrderTotal());

        // order2.addItem(item4);
        // order3.addItem(item1);
        // order2.addItem(item2);
        // order2.addItem(item4);
        // order2.addItem(item1);

        // System.out.println(order2.getOrderTotal());
        // order2.items.add(item1);
        // order2.total += item1.price;
        
        // order1.items.add(item2);
        // order1.total += item2.price;
        
        // order3.items.add(item4);
        // order3.total += item4.price;

        // order1.ready = false;
        // order2.ready = true;
        // order3.ready = true;
        // order4.ready = false; 

        // order2.items.add(item3);
        // order2.items.add(item3);
        // order2.total += item3.price *2;

        // order3.items.add(item4);
        // order4.ready = true;
        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Hi %s, you ordered %s, and your Total will be %s\n", order4.name, item3.name, order2.total);
        // System.out.printf("Name: %s and your Total: %s\n", order3.name, order3.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
