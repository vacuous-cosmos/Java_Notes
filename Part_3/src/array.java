import java.util.Scanner;

public class array {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int []num=new int[5];
    for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
    }
    System.out.println("Enter two indices to swap");
    int first=sc.nextInt();
    int second= sc.nextInt();
    int helper=num[first];
    num[first]=num[second];
    num[second]=helper;

    }
    }
