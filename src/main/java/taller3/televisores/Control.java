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
    public void turnOff(){
        if(tv.estado == true){
            tv.estado=false;
        }
    }
    public void turnOn(){
        if(tv.estado == false){
            tv.estado=true;
        }
    }
    public void canalUp(){
        if (tv.estado==true){
            if((tv.canal>=1)&&(tv.canal<120)){
               tv.canal++;
            }
        }
             
    }
    public void canalDown(){
        if (tv.estado==true){
            if((tv.canal>1)&&(tv.canal<=120)){
                tv.canal++;
            }
        }
    }

    //subir y bajar volumen :)
    public void volumenUp(){
        if (tv.estado==true){
            if((tv.volumen>=0)&&(tv.volumen<7)){
                tv.volumen=tv.volumen+1;
            }
        }
    }
    public void volumenDown(){
        if (tv.estado==true){
            if((tv.volumen>0)&&(tv.volumen<=7)){
                tv.volumen=tv.volumen+1;
            }
        }
    }
    public void setCanal(int canal){
         if (tv.estado==true){
         if (canal<=120){
             tv.canal=canal;
         }
        }
        }
    public int getCanal(){
        return tv.canal;
    }
}