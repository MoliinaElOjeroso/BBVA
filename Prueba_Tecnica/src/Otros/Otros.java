package Otros;
import java.util.*;

//
// Aqui estaran los otros metodos solicitados
//



//Aqui implementaremos los demas metodos solicitados
public class Otros 
{

    //Variables
    public static int Ejemplo = 10;

    //Cree un método estático que calcule el máximo de tres números enteros dados. 
    public static Integer MaxEnteros(Integer a, Integer b, Integer c)
    { 
        Integer max = Math.max( Math.max(a, b), c ); 
        return max; 
    }


    //Cree un método estático que calcule el máximo de tres números enteros dados.
    //Agregue una captura de excepcion cuando un entero sea mayor a 10
    public static Integer MaxEnterosCorreccion(Integer a, Integer b, Integer c)
    { 
            if ( (a>= 0 && a<=9) && (b>= 0 && b<=9) && (c>= 0 && c<=9)) 
            {
                Integer max = Math.max( Math.max(a, b), c ); 
                return max; 
            } 
            else 
            {
                throw new IllegalArgumentException("Los parametros ingresados deben ser numero enteros positivos menores que 10");
            }
    }


    //Escriba el método public static SortedMap cuentaPalabras(String frase) que recibe una cadena de caracteres que representa una frase y devuelve una función ordenada 
    //que hace corresponder a cada palabra de la frase (una vez convertida a minúsculas) la frecuencia de aparición de esa palabra en la frase. Las claves (las palabras del texto) 
    //siguen el orden natural de las palabras. Utilícese la cadena " " como delimitador en el método split de String. Por ejemplo:
    //si la cadena de entrada es "El estribillo de una chirigota de Cádiz es Como como como como estoy como estoy" la función devuelta debe ser: {chirigota=1, como=5, cádiz=1, de=2, el=1, es=1, estoy=2, estribillo=1, una=1} 
    //Obsérvese que las palabras están en orden alfabético (las vocales con tilde van detrás de las vocales sin tilde en el orden alfabético de las cadenas en Java).
    
    public static SortedMap<String, Integer> CuentaPalabras(String Frase)
    {
        //Creamos un Map implementado como Arbol rojo negro para mantener el orden en los elementos ingresados y poder castear a SortedMap sin problemas
        Map<String, Integer> Mapeo = new TreeMap<String, Integer>();

        //Concertimos nuestra frase a minuscula y le hacemos Split
        String [] Frase_Separada = Frase.toLowerCase().split(" ");

        // Iteramos sobre las palabras de la frase separada y contamos su frecuencia 
        for (String palabra : Frase_Separada) 
        {
            Integer cont = Mapeo.get(palabra);
            Mapeo.put(palabra , (cont == null) ? 1 : cont + 1);
        }
        
        //Retornamos nuestro  resultado
        return (SortedMap<String, Integer>) Mapeo;

    }
    
}


