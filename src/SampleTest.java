import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.*;

public class SampleTest {
    String path;
    static SampleTest instance = new SampleTest();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Path: ");
        instance.path = input.nextLine();

        DataStore.instance.init(instance.path);

        instance.listOptions();
    }

    public void listOptions () {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your choice");
        System.out.println("1. Create Data \t 2.Read Data \t 3.Delete Data");
        choice = input.nextInt();

        switch (choice){
            case 1:
                //First Employee
                JSONObject employeeDetails = new JSONObject();
                employeeDetails.put("firstName", "Lokesh");
                employeeDetails.put("lastName", "Gupta");
                employeeDetails.put("website", "howtodoinjava.com");

                JSONObject employeeObject = new JSONObject();
                employeeObject.put("employee", employeeDetails);

                //Second Employee
                JSONObject employeeDetails2 = new JSONObject();
                employeeDetails2.put("firstName", "Brian");

                employeeDetails2.put("lastName", "Schultz");
                employeeDetails2.put("website", "example.com");

                JSONObject employeeObject2 = new JSONObject();
                employeeObject2.put("employee", employeeDetails2);

                //Add employees to list
                JSONArray employeeList = new JSONArray();
                employeeList.add(employeeObject);
                employeeList.add(employeeObject2);

                JSONArray result = DataStore.createData("Employee_Info1" ,employeeList);
                System.out.println(result);

                break;
            case 2:
                System.out.println("Read Data (Key): ");
                String key = input.next();

                JSONArray resultData = DataStore.readData(key);
                System.out.println(resultData);

                break;
            case 3:
                System.out.println("Delete Data (Key): ");

                JSONArray DeleteData = DataStore.deleteData(input.next());
                System.out.println(DeleteData);

                break;
            default:
                break;
        }
    }
}
