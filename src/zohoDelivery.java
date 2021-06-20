import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class zohoDelivery {
    String path;
    static zohoDelivery instance = new zohoDelivery();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Path: ");
        instance.path = input.nextLine();

        DataStore.instance.init(instance.path);

        instance.listOptions();
    }

    public void listOptions () {
        Scanner sc = new Scanner(System.in); // creating object of Scanner class

        System.out.println("1: book order");
        System.out.println("2: display executive activities");

        System.out.print("Make your choice: 1 or 2");
        int ch = sc.nextInt();

        switch (ch){
            case 1: // for booking order
                CustomerModel customer = new CustomerModel();

                System.out.print("Customer ID:");
                customer.customerId = sc.next();

                System.out.print("Restaurant:");
                customer.restaurant = sc.next();

                System.out.print("Designation point:");
                customer.destinationPoint = sc.next();

                System.out.print("Time:");
                String time = sc.next();
                DateTimeFormatter format = DateTimeFormatter.ofPattern("h:m a");
                customer.orderTime = LocalTime.parse(time, format);

                break;

            case 2: // for display delivery executive details


                break;
            default:
                System.out.println("Invalid choice! Please make a valid choice. ");
        }
    }
}
