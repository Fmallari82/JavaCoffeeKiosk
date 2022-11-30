import java.util.ArrayList;
public class Order {
    //attributes
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item>items = new ArrayList<Item>();
    //constructor
    public Order() {
        this.name = "guest";
        this.ready = false;
    }
    public Order (String name) {
        this.name = name;
        this.ready = false;
    }
    //getters and setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTotal() {
        return this.total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public boolean getReady() {
        return this.ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    public void setItems(ArrayList<Item>items) {
        this.items = items;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }
    //methods
    public String getStatusMessage(){
        if(this.ready == true) {
            return "Your order is ready.";
        } else {
            return "Thanks, your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }
    public void display() {
        System.out.println("customer Name: " + this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + i.getPrice());
        }
        System.out.println("Total: " + this.getOrderTotal());
    }
}