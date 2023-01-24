import java.util.Scanner;

public class loop_2 {
    public static void main(String args[]){
        int j=0;
        while (j < 2) {
            System.out.println(j);
            j++;
        }
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println(sum);
        sc.close();
    }
}
