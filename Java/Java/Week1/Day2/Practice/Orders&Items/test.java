import java.util.ArrayList;
public class Test {
    public static void main (String[] args){
        Item item1 =new Item();
        Item item2 =new Item();
        Item item3 =new Item();
        Item item4 =new Item();
        item1.name="mocha";
        item1.price=2.5;
        item2.name="latte";
        item2.price=3.5;
        item3.name= "drip coffee";
        item3.price=4.5;
        item4.name= "cappuccino";
        item4.price=5.5;
        Order order1 =new Order();
        Order order2 =new Order();
        Order order3 =new Order();
        Order order4 =new Order();
        order1.name="Cindhuri";
        order2.name="Jimmy";
        order3.name="Noah";
        order4.name="Sam";
        System.out.println(order1.name+ " "+order1.total+ " "+order1.ready+" "+order1.items); // total will be show 0.0
        order2.items.add(item1);
        order2.total+=item1.price;
        System.out.println(order2.name+ " "+order2.total+ " "+order2.ready+" "+order2.items);
        order3.items.add(item4);
        order3.total+=item4.price;
        System.out.println(order3.name+ " "+order3.total+ " "+order3.ready+" "+order3.items);
        order4.items.add(item2);
        order4.total+=item2.price;
        System.out.println(order4.name+ " "+order4.total+ " "+order4.ready+" "+order4.items);
        order1.ready=true ;
        System.out.println(order1.name+ " "+order1.total+ " "+order1.ready+" "+order1.items);
        order4.items.add(item2);
        order4.total+=item2.price;
        System.out.println(order4.name+ " "+order4.total+ " "+order4.ready+" "+order4.items);
        order4.items.add(item2);
        order4.total+=item2.price;
        System.out.println(order4.name+ " "+order4.total+ " "+order4.ready+" "+order4.items);
        order2.ready=true ;
        System.out.println(order2.name+ " "+order2.total+ " "+order2.ready+" "+order2.items);


    }
}