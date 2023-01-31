public class Product {
    String name;
    String location;
    int weight;
    public Product(String name,String location,int weight){
        this.name=name;
        this.location=location;
        this.weight=weight;
    }
    public Product(String name){
        this(name,"unknown",0);
    }
    public Product(String name,String location){
        this(name,location,0);
    }
    public Product(String name,int weight){
        this(name,"unknown",weight);
    }
}
