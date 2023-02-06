import java.util.ArrayList;

public class Package {
    ArrayList<Gift> gifts;
    public Package(){ 
        this.gifts = new ArrayList<>();
    }
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    public int totalWeight(){
        int weight=0;
        for(Gift g:gifts){
            weight+=g.getWeight();
        }
        return weight;
    }

}
