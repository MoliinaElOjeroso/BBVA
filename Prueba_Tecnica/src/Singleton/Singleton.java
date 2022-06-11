package Singleton;
//
// Explicación patron de diseño: Singleton 
//


//Singleton es un patron de diseño que evita la existencia de mas de 1 instancia de la clase modelada. Y que proporciona acceso global a la instancia de esta clase.
public class Singleton
{

    //Atributos
    private static Singleton instancia;
    private int parametro;
    private String otro_parametro;

    //Una parte escencial del patron singleton en java es volver privado el constructor, asi solo se puede acceder desde dentro de la clase
    private Singleton()
    {
        this.parametro      = 1;
        this.otro_parametro = "Parametro";
    }

    //La segunda parte escencia del patron singleton es tener un metodo estatico desde el cual poder obtener la instancia de la clase.
    public static Singleton obtener_instancia()
    {
        //Si no existe una instancia de esta clase, la creamos y asignamos al atributo correspondiente
        if (Singleton.instancia == null)
        {
            Singleton.instancia = new Singleton();
        }
        //Si ya existe, la retornamos
        return Singleton.instancia;
    }


    //Getters y Setters

    public int getParametro() 
    {
        return parametro;
    }

    public void setParametro(int parametro) 
    {
        this.parametro = parametro;
    }

    public String getOtro_parametro() 
    {
        return otro_parametro;
    }

    public void setOtro_parametro(String otro_parametro) 
    {
        this.otro_parametro = otro_parametro;
    }

}
