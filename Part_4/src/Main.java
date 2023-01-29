import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);
        artosAccount.withdraw(10);
        artosAccount.deposit(20);
        artosAccount.balance();
        ArrayList<Items> arr=new ArrayList<>();
        arr.add(new Items("Zero"));
        System.out.println(arr);
        Scanner scanner=new Scanner(System.in);
        ArrayList<Person> persons=new ArrayList<>();
        while (true) {
            System.out.print("Enter the details, empty will stop: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");
            String first = parts[0];
            String second=parts[1];
            int age=Integer.parseInt(parts[2]);
            persons.add(new Person(first,second, age));
        }
        System.out.println(persons);
    }
}