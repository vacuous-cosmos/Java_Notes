public class methods {
    public static void greet(){
        System.out.println("Greetings!");
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }
    public static void greet(int numOfTimes){
        int i=0;
        while(i<numOfTimes){
            System.out.println("Greetings!");
            i++;
        }
    }
    public static void division(float num,float den){
        System.out.println(num/den);
    }
    public static String vacuous(){
        return "Vacuous";
    }
    public static void main(String[] args){
        greet(3);
        printText();
        division(3,5);
        System.out.println(vacuous());
    }
}
