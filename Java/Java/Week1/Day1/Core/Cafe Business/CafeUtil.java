import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;

        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        return sum;
        }
    public double getOrderTotal(double[] prices){
        double sum=0;
        for (int i = 0; i <= prices.length-2; i++) {
            sum += prices[i];   
        }
        return sum;
        }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i<menuItems.size();i++){
            System.out.println(menuItems.get(i));
        }
        }

    public void addCustomer(ArrayList<String> customers){
        System.out.println(" enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello"+username);
        System.out.println("There "+customers.size()+" people front of you");
        customers.add(username);
        System.out.println(customers);
    }

}