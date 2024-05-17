import java.util.ArrayList;
public class Test {
    public static void main (String[] args){
       Item latte = new Item("latte",);5
        Item water = new Item("water",4);
        Item cappuccino = new Item("cappuccino",1.5);
        Item mocha =new Item("mocha",2.5);
        CoffeeKiosk LinBarhoum=new CoffeeKiosk();
        LinBarhoum.addMenuItem(latte);
        LinBarhoum.addMenuItem(water);
        LinBarhoum.addMenuItem(cappuccino);
        LinBarhoum.addMenuItem(mocha);
        LinBarhoum.addMenuItemByInput();
        LinBarhoum.newOrder();




    }
}