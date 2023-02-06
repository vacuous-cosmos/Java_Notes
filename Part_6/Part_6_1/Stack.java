import java.util.*;
public class Stack {
    private ArrayList<String> stack;
    public Stack(){
        this.stack=new ArrayList<String>();
    }
    public void add(String value){
        this.stack.add( value);
    }
    public boolean isEmpty(){
        return this.stack.size()==0;
    }
    public ArrayList<String> values(){
        return this.stack;
    }
    public String take(){
        String res=stack.get(0);
        this.stack.remove(0);
        return res;
    }
}
