package test;

public class TV{
    Marca marca;
    private int canal;
    int precio;
    private boolean estado;
    private int volumen;
    Control control;
    private static int numTV;

    //constructor 
    public TV (Marca marca,boolean estado) {
        this.marca=marca;
        this.estado=estado;
        this.canal=1;
        this.volumen=1;
        this.precio=500;
        numTV++;
    }

    //setters y getters 
    public Marca setMarca(Marca marca){
        this.marca=marca;
        return marca;
    }
    public Marca getMarca(){
        return marca; 
    }
    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return this.control;
    }
    public void setVolumen(int volumen){
        this.volumen=volumen;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setCanal(int canal){
        this.canal=canal;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getnumTV(){
        return numTV;
    }
    public boolean getEstado(){
        return estado;
    }
    //prender y apagar el Tv
    public void turnOff(){
        if(estado == true){
            estado=false;
        }
    }
    public void turnOn(){
        if(estado == false){
            estado=true;
        }
    }

    //pasar de canal 
    public void canalUp(){
        if (estado==true){
            if((canal>=1)||(canal<120)){
               canal++;
            }
        }
             
    }
    public void canalDown(){
        if (estado==true){
            if((canal>1)||(canal<=120)){
                canal--;
            }
        }
    }

    //subir y bajar volumen :)
    public void volumenUp(){
        if (estado==true){
            if((volumen>=0)||(volumen<7)){
                volumen++;
            }
        }
    }
    public void volumenDown(){
        if (estado==true){
            if((volumen>0)||(volumen<=7)){
                volumen--;
            }
        }
    }
    


}