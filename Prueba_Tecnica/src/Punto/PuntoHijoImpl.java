package Punto;
//
//
//Pregunta_4:   Implementacion de un punto cartesiano en Java. Que herede de la implementacion general.
//              Y siempre sea un punto con coorenadas [1.0,1.0]
//

//Clase que modela un punto en coordenadas cartesianas bidimensionales, y siempre tiene valor [1.0,1.0]
public class PuntoHijoImpl extends PuntoImpl
{    
  
    //Constructor 
    public PuntoHijoImpl()
    {
        this.x = 1.0;
        this.y = 1.0;
    }


    //Hacemos override a los setters de la clase hijo para evitar modificaciones sus valores
    @Override
    public void setY(Double y) 
    {
        if (y != 1.0d)
        {
            System.out.println("Los valores de Y son inmutables");
        }
    }

    @Override
    public void setX(Double x) 
    {
        if (x != 1.0d)
        {
            System.out.println("Los valores de X son inmutables");
        }
    }

}
