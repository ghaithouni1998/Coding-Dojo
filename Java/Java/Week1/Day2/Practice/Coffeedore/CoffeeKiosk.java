import java.util.ArrayList;
public class CoffeeKiosk{
    
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu=new ArrayList<>();
        this.orders=new ArrayList<>();

    }
    public void addMenuItem(Item item){
        this.menu.add(item);
    }
    public void displayMenu(){
        for (int i=0; i<this.menu.size(); i++){
            System.out.println(i+" "+this.menu.get(i).getName()+" -- $"+this.menu.get(i).getPrice());
            }

    }
        public void newOrder() {
        
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
        this.orders.add(new Order(name));
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine()
        while(!itemNumber.equals("q")) { 
            this.orders.get(this.orders.size()-1).addItem(this.menu.get(Integer.parseInt(itemNumber)));
            System.out.println("enter a new item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        this.orders.get(this.orders.size()-1).display();
    }
    public void addMenuItemByInput(){

        System.out.println("Please enter item name :");
        String item = System.console().readLine();
        System.out.println("Please enter the price for item:");
        String price = System.console().readLine();

        addMenuItem(new Item(item,Double.parseDouble(price)));

    }

}