import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        while(true){
            System.out.println("Shall we carry on?");
            s=sc.nextLine();
            if(s.equals("no")){
                break;
            }
        }
        System.out.println("Ready");
        sc.close();
    }
}
