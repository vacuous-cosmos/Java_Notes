import java.util.ArrayList;

public class Suitcase {
    ArrayList<Item> items;
    private int weight;
    public Suitcase(int weight){
        this.weight=weight;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void printItems(){
        for(Item i:items){
            System.out.println(i);
        }
    }
    public int totalWeight(){
        int total=0;
        for(Item i:items){
            total=total+i.getWeight();
        }
        return total;
    }
    public String heaviestItem(){
        int max=-1;
        String ans="";
        for(Item i:items){
            if(max<i.getWeight()){
                max=i.getWeight();
                ans=i.getName();
            }
        }
        return ans;
    }
    public String toString(){
        return items.size()+" items ("+weight+" kg)";
    }
}
