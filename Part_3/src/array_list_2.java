import java.util.ArrayList;
import java.util.Scanner;

public class array_list_2 {
    public static void ex(){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        do {
            int num= sc.nextInt();
            arr.add(num);
        }while(sc.nextInt()!=-1);
        for (var integer : arr) {
            System.out.println(integer);
        }
    }
    public static void main(){
    ex();
    }
}
