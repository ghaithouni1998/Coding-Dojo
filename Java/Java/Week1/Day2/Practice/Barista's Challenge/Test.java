public class Test{

    public static void main(String[] args){

        Item item1=new Item("Coffee",10);
        Item item2=new Item("soda",15);
        Item item3=new Item("Water",20);
       



        Order order1 = new Order();
        Order order2 = new Order();
        
        Order order3= new Order("nawfel");
        Order order4= new Order("ahmed");
        Order order5= new Order("ghaith");

        System.out.printf(order5.getName()+" your order is "+order5.getStatusMessage());
        System.out.printf(order4.getName()+" your order is "+order4.getStatusMessage());
        System.out.printf(order2.getName()+" your order is "+order2.getStatusMessage());
        System.out.printf(order3.getName()+" your order is "+order3.getStatusMessage());
        System.out.printf(order1.getName()+" your order is "+order1.getStatusMessage());
        System.out.printf(order.getName()+" the total is "+order.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();









    }
}