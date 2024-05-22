public class Test{

    public static void main(String[] args){

        Item item1=new Item("Coffee",10.5);
        Item item2=new Item("Latte",8.5);
        Item item3=new Item("Water",6.5);
        Item item4=new Item("Soda",10.5);
        Item item5=new Item("Juice",6.5);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3= new Order("ahmed");
        Order order4= new Order("ghaith");
        Order order5= new Order("isra");


        order1.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);
      
        order2.setReady(true);
        order4.setReady(false);

        System.out.printf(order2.getName()+" your order is "+order2.getStatusMessage());
        System.out.printf(order4.getName()+" your order is "+order4.getStatusMessage());
          System.out.printf(order1.getName()+" the total is "+order1.getOrderTotal());

        order1.display();
        order2.display();
       









    }
}