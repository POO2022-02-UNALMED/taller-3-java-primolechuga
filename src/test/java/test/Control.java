package test;
public class Control{
    TV tv;

    public void enlazar(TV TV){
        this.tv=TV;
        TV.control=this;
    }
    public TV getTv(){
        return tv;
    }
    public void setTv(TV tv){
        this.tv=tv;
    }

}