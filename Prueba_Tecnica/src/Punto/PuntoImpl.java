package Punto;
//
//Pregunta_3:   Implementacion de un punto cartesiano en Java.
//

//Clase que modela un punto en coordenadas cartesianas bidimensionales
public class PuntoImpl 
{  

    //Atributos
    protected Double x;
    protected Double y;    

    //Metodos
     
    //Constructor, inicializaremos siempre en el origen.
    public PuntoImpl()
    {
        this.x = 0.0;
        this.y = 0.0;
    }

    //Cambiamos las coordenadas de nuestro objeto
    public void CambiaCoordenadas(Double x , Double y)
    {
        this.setX(x);
        this.setY(y);
    }

    //Mostramos las coordenadas
    public void MuestraCoordenadas()
    {
        System.out.println("[ " + String.valueOf(this.x) + " , " + String.valueOf(this.y) + " ] \n");  
    }

    //Lleva el punto al origen
    public void ReiniciaCoordenadas()
    {
        this.setX(0.0);
        this.setY(0.0);      
    }

    //Getter´s y Setter´s

    public Double getX() 
    {
        return x;
    }

    public void setX(Double x) 
    {
        this.x = x;
    }

    public Double getY() 
    {
        return y;
    }

    public void setY(Double y) 
    {
        this.y = y;
    }

    //Overrides a metodos de Object

    @Override
    public boolean equals(Object o)
    {

        boolean respuesta = false;

        if(o instanceof PuntoImpl)
        {
            PuntoImpl p = (PuntoImpl) o;
            //Confirmamos si los valores de los atributos son los mismos en todos los casos
            respuesta = ((this.getX().equals(p.getX())) && (this.getY().equals(p.getY())));
        }
        return respuesta;

    }

    @Override
    public String toString()
    {
        return "[x: "+this.x+" , y: "+this.getY()+"]";

    }

    @Override
    public int hashCode()
    {
        //Dos numeros primos, elegimos 31 y 17.
        final int PRIMO = 31;   
        int resultado = 17;

        //Como utilizamos el tipo Wrapper y no el primitivo, comprobamos que no sea null y obtenemos su HashCode
        resultado = PRIMO * resultado + ((this.x == null)?0:this.x.hashCode());
        resultado = PRIMO * resultado + ((this.y == null)?0:this.y.hashCode());

        return resultado;
    }
    
}
