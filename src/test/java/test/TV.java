package test;

public class TV{
    Marca marca;
    int canal=1;
    int precio=500;
    boolean estado;
    int volumen=1;
    Control control;
    private static int numTV;

    //constructor 
    public TV (Marca marca,boolean estado) {
        this.marca=marca;
        this.estado=estado;
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
        if (this.estado==true){
            if (canal<=120){
                this.canal=canal;
            }
        }
    }
    public int getCanal(){
        return this.canal;
    }
    public static int setNumTV(int numtv){
        numTV=numtv;
        return numTV;
    }
    public static int getNumTV(){
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
    public int getPrecio(){
        return precio;
    }

    //pasar de canal 
    public void canalUp(){
        if (estado==true){
            if((canal>=1)&&(canal<120)){
               canal++;
            }
        }
             
    }
    public void canalDown(){
        if (estado==true){
            if((canal>1)&&(canal<=120)){
                canal--;
            }
        }
    }

    //subir y bajar volumen :)
    public void volumenUp(){
        if (estado==true){
            if((volumen>=0)&&(volumen<7)){
                volumen++;
            }
        }
    }
    public void volumenDown(){
        if (estado==true){
            if((volumen>0)&&(volumen<=7)){
                volumen--;
            }
        }
    }    
}