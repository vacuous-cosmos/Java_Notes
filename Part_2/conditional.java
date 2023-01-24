import java.util.Scanner;
public class conditional {
    public static void main(String args[]){
        int no;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        if(no<-1){
            System.out.println(no*-1);
        }else{
            System.out.println(no);
        }
        sc.close();
    }
}
