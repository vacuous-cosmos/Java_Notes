import java.util.Scanner;

public class scanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        int number=Integer.valueOf(text);
        double dubl=Double.valueOf(text);
        System.out.println(number*number);
        System.out.println(dubl*dubl);
        sc.close();
    }
}
