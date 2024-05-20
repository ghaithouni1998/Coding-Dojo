import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    public static void main(String[] args) {
        

    CafeUtil appTest=new CafeUtil();
        
        
        System.out.println(" Display Menu Test");
         

         
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latt");
        appTest.displayMenu(menu);
    
        System.out.println("\n-----Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }
    }
}