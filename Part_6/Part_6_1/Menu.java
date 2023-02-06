import java.util.*;
public class Menu{
    private ArrayList<String> meals;
    public Menu(){
        this.meals=new ArrayList<>();
    }
    public void addMeal(String meal){
        this.meals.add( meal);
    }
    public void printMeals(){
        System.out.println(this.meals);
    }
    public void clearMenu(){
        this.meals.clear();
    }
}