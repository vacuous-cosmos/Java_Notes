public class timer {
    private ClockHand hundred_second;
    private ClockHand second;
    public timer(){
        this.hundred_second=new ClockHand(100);
        this.second=new ClockHand(60);
    }
    public void advance(){
        this.hundred_second.advance();
        if(this.hundred_second.value()==0){
            this.second.advance();
        }
    }
    public String toString(){
        return this.second+":"+this.hundred_second;
    }
}
