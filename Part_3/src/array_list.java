import java.util.ArrayList;
import java.util.Scanner;

public class array_list {
    public static void ex(){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        String a;
        do {
            a = sc.nextLine();
            arr.add(a);
        } while (!a.equals(""));
        System.out.println(arr.get(arr.size()-1));
        System.out.print(arr.size());
        arr.remove(arr.size()-1);
    }
    public static void main(String args[]){
        //int value type
        //Integer reference type
        ArrayList<String> list=new ArrayList<>();
        list.add("Value_1");
        System.out.println(list.get(0));
        System.out.println(list);
        ex();
    }
}
