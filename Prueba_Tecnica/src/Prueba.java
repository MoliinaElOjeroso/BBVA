//
// Autor:           Molina Lòpez Carlos Fernando
// Prueba tecnica:  BBVA
//


//Librerias

import java.util.*;

import Punto.PuntoHijoImpl;
import Punto.PuntoImpl;
import Singleton.Singleton;
import Otros.Otros;


//Codigo

public class Prueba 
{

    //Explicacion de la interfaz Map
    public void Pregunta_1()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_1:" + "\n");
        
        //¿Que es la interfaz map?
        //
        //La interfaz Map es una abstraccion que sirve para crear objetos que mapean un conjunto de claves a un conjunto de valores.
        //
        //Existen 3 implementaciones concretas de la interfaz Map. Cada una tiene una estructura de datos diferente en el fondo.
        
        //La primera que se explicara es una Tabla de Hash.
        //Tiene la ventaja de ejecutarse en O(1) en promedio. Pero no tiene un orden constante en el tiempo.
        //Esta se instancia de la siguiente manera.

        System.out.println( "\n" + "TablaHash:" + "\n");
        Map<String, Integer> TablaHash = new HashMap<String, Integer>();

        //Agregaremos algunos valores

        TablaHash.put("Prueba_3", 3);
        TablaHash.put("Prueba_1", 1);
        TablaHash.put("Prueba_2", 2);

        //Imprimimos la tabla

        System.out.println( "\n" + TablaHash + "\n");

        //Obtenemos e imprimimos el valor de la clave "Prueba_1"

        System.out.println(TablaHash.get("Prueba_1") + "\n");



        //La segunda que se explicara es un Arbol Rojo Negro.
        //Tiene la ventaja de tener un orden predictible y constante en el tiempo. Pero es mas lento O(log(n)).
        //Esta se instancia de la siguiente manera.

        System.out.println( "\n" + "ArbolRojoNegro:" + "\n");
        Map<String, Integer> ArbolRojoNegro = new TreeMap<String, Integer>();

        //Agregaremos algunos valores

        ArbolRojoNegro.put("Prueba_3", 3);
        ArbolRojoNegro.put("Prueba_1", 1);
        ArbolRojoNegro.put("Prueba_2", 2);

        //Imprimimos la tabla

        System.out.println( "\n" + ArbolRojoNegro + "\n");

        //Obtenemos e imprimimos el valor de la clave "Prueba_2"

        System.out.println(ArbolRojoNegro.get("Prueba_2") + "\n");

        //La ultima que se explicara es una Tabla Hash con implementacion de lista ligada.
        //Tiene la ventaja de tener un orden predictible y ser constante en el tiempo. Y solo es un poco mas lenta O(n) donde n es la longitud de la lista consultada.
        //Esta se instancia de la siguiente manera.

        System.out.println( "\n" + "TablaHashList:" + "\n");
        Map<String, Integer> TablaHashList = new LinkedHashMap<String, Integer>();

        //Agregaremos algunos valores

        TablaHashList.put("Prueba_3", 3);
        TablaHashList.put("Prueba_1", 1);
        TablaHashList.put("Prueba_2", 2);

        //Imprimimos la tabla

        System.out.println( "\n" + TablaHashList + "\n");

        //Obtenemos e imprimimos el valor de la clave "Prueba_3"

        System.out.println(TablaHashList.get("Prueba_3") + "\n");


        //Por ultimo, como ejemplo, podemos utilizar Map para hacer un catalogo de areas y sus respectivos telefonos o cualquier relacion por el estilo.

        System.out.println( "\n" + "Ejemplo, Catalogo Telefonico:" + "\n");
        Map<String, Long> Telefonos = new HashMap<String, Long>();
        Telefonos.put("TI", 5503498574L);
        Telefonos.put("QA", 5593748596L);
        Telefonos.put("RH", 5503664537L);
        System.out.println( "\n" + Telefonos + "\n");
        System.out.println("Telefono RH: " + Telefonos.get("RH") + "\n");

    }

    //Explicacion del patron singleton
    public void pregunta_2()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_2:" + "\n");

        //Obtenemos la instancia de nuestro Singleton
        Singleton P_2 = Singleton.obtener_instancia();
        
        //Imprimimos los parametros de nuestra instancia
        System.out.println( "\n" + "Parametros primera llamada:" + "\n");
        System.out.println("--" + P_2.getParametro() + "\n");
        System.out.println("--" + P_2.getOtro_parametro() + "\n");

        //Modificamos nuestra instancia
        P_2.setParametro(2);
        P_2.setOtro_parametro("Segundo_Parametro");

        //Obtenemos nuevamente la instancia
        Singleton P_2_1 = Singleton.obtener_instancia();

        //Imprimimos los parametros de nuestra instancia
        System.out.println( "\n" + "Parametros segunda llamada 1:" + "\n");
        System.out.println("--" + P_2.getParametro() + "\n");
        System.out.println("--" + P_2.getOtro_parametro() + "\n") ;
        System.out.println( "\n" + "Parametros segunda llamada 2:" + "\n");
        System.out.println("--" + P_2_1.getParametro() + "\n");
        System.out.println("--" + P_2_1.getOtro_parametro() + "\n") ;

        //Con esto comprobamos que al crear una instancia, siempre recibimos el mismo objeto.
        //Y al tener definido Singleton.obtener_instancia() como metodo estatico 
        //Este puede ser accedido globalmente desde el identificador de la clase

    }

    //Implemente la clase PuntoImpl de tal manera que sea reutilizable.
    //Tenga en cuenta la implementacion de los metodos genericos que necesite el objeto.
    public void pregunta_3()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_3:" + "\n");

        //Creamos un objeto de la clase PuntoImpl
        PuntoImpl punto = new PuntoImpl();

        //Imprimimos sus valores iniciales
        System.out.println("Punto Objeto:" + "\n\n" + punto.toString() + "\n\nPunto Coordenadas:\n");

        //Imprimimos las coordenadas iniciales
        punto.MuestraCoordenadas();

        //Creamos otro objeto
        PuntoImpl punto_2 = new PuntoImpl();

        //Imprimimos sus valores iniciales
        System.out.println("Punto_2 Objeto:" + "\n\n" + punto_2.toString() + "\n\nPunto_2 Coordenadas:\n");

        //Imprimimos las coordenadas iniciales
        punto_2.MuestraCoordenadas();

        //Creamos una referencia al primer objeto creado
        PuntoImpl punto_1 = punto;


        //Imprimimos sus valores iniciales
        System.out.println("Punto_1 Objeto:" + "\n\n" + punto_1.toString() + "\n\nPunto_1 Coordenadas:\n");

        //Imprimimos las coordenadas iniciales
        punto_1.MuestraCoordenadas();

        //Comparamos identidad
        System.out.println( "\n" + "Identidad:" + "\n");
        System.out.println("Punto == Punto_1:   " + String.valueOf(punto_1 == punto) + "\n");
        System.out.println("Punto_1 == Punto_2: " + String.valueOf(punto_1 == punto_2) + "\n");

        //Comparamos igualdad
        System.out.println( "\n" + "Igualdad:" + "\n");
        System.out.println("Punto == Punto_1:   " + String.valueOf(punto_1.equals(punto)) + "\n");
        System.out.println("Punto_1 == Punto_2: " + String.valueOf(punto_1.equals(punto_2)) + "\n");     
        
        //Obtenemos codigos hash y mostramos.
        System.out.println( "\n" + "Codigos Hash:" + "\n");
        System.out.println("\nHashCode punto:   " + String.valueOf(punto.hashCode()) + "\n");
        System.out.println("\nHashCode punto_1: " + String.valueOf(punto_1.hashCode()) + "\n");
        System.out.println("\nHashCode punto_2: " + String.valueOf(punto_2.hashCode()) + "\n");

        //Modificamos coordenadas de punto y repetimos comparaciones
        punto.CambiaCoordenadas(50.0, 15.5);

        //Imprimimos sus valores iniciales
        System.out.println("\nPunto Objeto_Modificación:" + "\n\n" + punto.toString() + "\n\nPunto Coordenadas:\n");

        //Imprimimos las coordenadas iniciales
        punto.MuestraCoordenadas();

        //Comparamos identidad
        System.out.println( "\n" + "Identidad:" + "\n");
        System.out.println("Punto == Punto_1:   " + String.valueOf(punto_1 == punto) + "\n");
        System.out.println("Punto_1 == Punto_2: " + String.valueOf(punto_1 == punto_2) + "\n");

        //Comparamos igualdad
        System.out.println( "\n" + "Igualdad:" + "\n");
        System.out.println("Punto == Punto_1:   " + String.valueOf(punto_1.equals(punto)) + "\n");
        System.out.println("Punto_1 == Punto_2: " + String.valueOf(punto_1.equals(punto_2)) + "\n");     
        
        //Obtenemos codigos hash y mostramos.
        System.out.println( "\n" + "Codigos Hash:" + "\n");
        System.out.println("\nHashCode punto:   " + String.valueOf(punto.hashCode()) + "\n");
        System.out.println("\nHashCode punto_1: " + String.valueOf(punto_1.hashCode()) + "\n");
        System.out.println("\nHashCode punto_2: " + String.valueOf(punto_2.hashCode()) + "\n");


    }

    //Implemente la clase PuntoHijoImpl, que herede de puntoImpl, siendo siempre puntoHijo un punto con los atributos "x=1.0" e "y =1.0"
    public void pregunta_4()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_4:" + "\n");

        //Creamos un objeto de la clase PuntoImpl
        PuntoHijoImpl punto_hijo = new PuntoHijoImpl();

        //Mostramos coordenadas e intentamos modificar
        punto_hijo.MuestraCoordenadas();
        punto_hijo.CambiaCoordenadas(2.0, 3.0);
        punto_hijo.ReiniciaCoordenadas();
        punto_hijo.setX(2.0);
        punto_hijo.setY(3.0);
        System.out.println( "\n" + "Con esto confirmamos que no es mutable el valor de las coordenadas:" + "\n");
        punto_hijo.MuestraCoordenadas();


    }

    //Buscar fallos en el siguiente codigo:
    /* 
        String cadena = "Abc"; 
        Integer entero = 50; 
        String nulo = null; 
        Boolean verdadero = true; 
        Character caracter = 'x'; 
        Double real = 50.5; 
        Long real2 = 1; 
        Float real3 = 0.1;
    */ 
    //Y explica que harias para volver las variables constantes.
    public void pregunta_5()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_5:" + "\n");

        //Variables

        String      cadena      = "Abc"; 
        Integer     entero      = 50; 
        String      nulo        = null; 
        Boolean     verdadero   = true; 
        Character   caracter    = 'x'; 
        Double      real        = 50.5; 
        Long        real2       = 1000000l;         //Se agrego la l para delimitar el tipo y se modifico el valor para las pruebas
        Float       real3       = 10.0001f;         //Se agrego la f para delimitar el tipo y se modifico el valor para las pruebas
    
        //Contantes
        //Por convension se escriben en fomato snake case con mayusculas

        final String      CADENA      = "Letras: "; 
        final Integer     ENTERO      = 100; 
        final String      NULO        = null; 
        final Boolean     VERDADERO   = true; 
        final Character   CARACTER    = 'X'; 
        final Double      N_REAL      = 100.40; 
        final Long        N_REAL_2    = 100000l;   
        final Float       N_REAL_3    = 10.9000f; 

        //Operamos con las variables para descartar fallos e imprimirmos
        System.out.println( "\n" + "Inicia comprobacion" + "\n");
        System.out.println("String:       " + CADENA+cadena + "\n");
        System.out.println("Integer:      " +ENTERO+entero + "\n");
        System.out.println("Null String:  " + NULO + " " + nulo + "\n");
        System.out.println("Boolean:      " +String.valueOf(VERDADERO && verdadero) + "\n");
        System.out.println("Char:         " +CARACTER + "-" + caracter + "\n");
        System.out.println("Double:       " +String.valueOf(N_REAL + real) + "\n");
        System.out.println("Long:         " +String.valueOf(N_REAL_2 + real2)  + "\n");
        System.out.println("Float:        " +String.valueOf(N_REAL_3 + real3)  + "\n");
        System.out.println( "\n" + "Termina comprobacion" + "\n");
    }


    //Escriba una expresión lógica que sea cierta si:
    //Un número entero ‘num’ está comprendido entre 1 y 5 (ambos inclusive) o bien es igual a 9.
    public void pregunta_6(int num)
    {
        if (num == 0)
        {
            System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
            System.out.println( "\n" + "Pregunta_6:" + "\n");
        }
        Boolean valor = (( num >= 1 && num <= 5 ) || num == 9 ) ? true:false;  
        System.out.println("\n" + String.valueOf(num) + " = " + String.valueOf(valor) + "\n"); 
    }

    //Explique la diferencia entre igualdad e identidad
    public void pregunta_7()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_7:" + "\n");

        //La diferencia conceptual entre Igualdad e Identidad se puede entender mejor si tomamos como referencia la logica, en especifico su ley de identidad.
        //La ley de identidad postula que: Todo ente es si mismo y no otro.
        //La igualdad se refiere a que dos entes compartan los suficientes atributos para ser percibidos como "identicos" en un contexto parcial.


        //Matematicamente hablando, la identidad se puede entender si nos referimos al axioma de reflexividad
        //El axioma de reflexivilidad portula que: Toda cantidad o expresion es igual a si misma en todos los casos.
        //Cuando tenemos dos expreiones que son equivalentes en la totalidad de los casos evalables, decimos que son identidad entre ellas.
        //Por otro lado, decimos que existe igualdad entre expresiones cuando estas se refieren al mismo objeto matematico, pero con diferente notacion y solo en una parcialidad de los casos evaluables.


        //Ahora hablando de programacion en Java, podemos entenderlo de la misma manera, solo que aqui la identidad de un objeto se relaciona a un solo atributo.
        //La direccion de memoria de un objeto se entendera como su atributo de identidad.
        //El valor que se obtenga al evaluar el objeto en alguna o la totalidad de sus magnitudes, sera el atributo de igualdad que se usara al compararlo con otro objeto.
        //Esto solo aplica para los objetos, los tipos primitivos y sus Wrapper´s tienen como atributo de identidad su valor.

        //En JAVA se utiliza el operador "==" para igualdad y "Objeto.equals()" para igualdad.

        //Ejemplos con explicacion:

        //Variables del metodo
        Boolean bool_1 ,bool_2 ,bool_3 ,bool_4;

        //Variables de ejemplos primitivos y wrappers
        Integer x = 1;
        Integer y = 1;
        int x_1 = 1;
        int y_1 = 1;
    
        System.out.println( "\n" + "Primitivos y Wrappers:" + "\n");
        
        System.out.println( "\n" + "Igualdad:" + "\n");

        bool_1 = (x == y)       ? true:false;  
        bool_2 = (x_1 == y_1)   ? true:false;  
        bool_3 = (x == x_1)     ? true:false;  
        bool_4 = (y == y_1)     ? true:false;  

        System.out.println("x == y:     " + bool_1);
        System.out.println("x_1 == y_1: " +bool_2);
        System.out.println("x == x_1:   " +bool_3);
        System.out.println("y == y_1:   " +bool_4);

        System.out.println( "\n" + "Identidad:" + "\n");

        bool_1 = (x.equals(y))       ? true:false;    
        bool_2 = (x.equals(x_1))     ? true:false;  
        bool_3 = (y.equals(y_1))     ? true:false;  

        System.out.println("x.equals(y):   " + bool_1);
        System.out.println("x.equals(x_1): " + bool_2);
        System.out.println("y.equals(y_1): " + bool_3);

        System.out.println( "\n" + "Objetos: " + "\n");

        //Variables de ejemplos Objetos
        PuntoImpl punto_1 = new PuntoImpl();
        PuntoImpl punto_2 = punto_1;
        PuntoImpl punto_3 = new PuntoImpl();
        PuntoImpl punto_4 = punto_2;

        System.out.println( "\n" + "Igualdad:" + "\n");

        bool_1 = (punto_1 == punto_2)     ? true:false;  
        bool_2 = (punto_1 == punto_3)     ? true:false;  
        bool_3 = (punto_1 == punto_4)     ? true:false;  
        bool_4 = (punto_4 == punto_3)     ? true:false;  


        System.out.println("punto_1 == punto_2: " + bool_1);
        System.out.println("punto_1 == punto_3: " +bool_2);
        System.out.println("punto_1 == punto_4: " +bool_3);
        System.out.println("punto_4 == punto_3: " +bool_4);


        System.out.println( "\n" + "Identidad:" + "\n");

        bool_1 = (punto_1.equals(punto_2))     ? true:false;  
        bool_2 = (punto_1.equals(punto_3))     ? true:false;  
        bool_3 = (punto_1.equals(punto_4))     ? true:false;  
        bool_4 = (punto_4.equals(punto_3))     ? true:false;  


        System.out.println("punto_1.equals(punto_2): " + bool_1);
        System.out.println("punto_1.equals(punto_3): " +bool_2);
        System.out.println("punto_1.equals(punto_4): " +bool_3);
        System.out.println("punto_4.equals(punto_3): " +bool_4);

    }

    //Cree un método estático que calcule el máximo de tres números enteros dados. 
    public void pregunta_8()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_8:" + "\n");

        //ejecutamos el metodo
        System.out.println("Max(10,15,1) : " +String.valueOf(Otros.MaxEnteros(10, 15, 1)) + "\n"); 
        System.out.println("Max(16,33,13) : " +String.valueOf(Otros.MaxEnteros(16, 33, 13)) + "\n"); 
        System.out.println("Max(67,23,122) : " +String.valueOf(Otros.MaxEnteros(67, 23, 122)) + "\n"); 

    }

    //Añada al método anterior una captura de excepción con IllegalArgumentException en el caso de que uno de los enteros sean mayores que 10.
    public void pregunta_9()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_9:" + "\n");
        
        try 
        {
            //ejecutamos el metodo
            System.out.println("Max(10,15,1) : " +String.valueOf(Otros.MaxEnterosCorreccion(1, 5, 6)) + "\n"); 
            System.out.println("Max(16,33,13) : " +String.valueOf(Otros.MaxEnterosCorreccion(6, 9, 3)) + "\n"); 
            System.out.println("Max(67,23,122) : " +String.valueOf(Otros.MaxEnterosCorreccion(7, 3, 10)) + "\n"); 
        } 
        catch (IllegalArgumentException ex) 
        {
            System.out.println(ex.getMessage());
        }

        System.out.println( "\n" + "Excepción Tratada:" + "\n");
    }

    //Explíque que es una variable estática y pónga el ejemplo de una
    public void pregunta_10()
    {
        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_10:" + "\n");
        
        //Una variable estatica es una variable que pertenece a la clase donde fue declarada, no a los objetos instancia de la clase.
        //A estas variables "Y metodos" se puede acceder sin la necesidad de crear un objeto, solo utilizando el nombre de identificador de la clase.
        //Este tipo de variables se inicializan en la ejecucion.

        //Ejemplo:

        //Variable normal
        Double Var = 1.0;

        //Varible estatica declarada en el paquete Otros.   Ejemplo
        //Variable estatica de JAVA en el paquete MATH.     PI
        Var = Var + Otros.Ejemplo + Math.PI; 
        System.out.println("Resulado de la suma de Var con PI y Ejemplo: " + Var + "\n");

    }

    //Implementacion de un contador de frecuencia de palabras
    public void Pregunta_11()
    {

        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_11:" + "\n");

        //Invocamos el metodo sobre la frase de ejemplo
        String Frase_Ejemplo = "El estribillo de una chirigota de Cádiz es Como como como como estoy como estoy";

        //Creamos el contenedor de nuestro SortedMap resultante
        SortedMap<String,Integer> p_11 = Otros.CuentaPalabras(Frase_Ejemplo);
        
        //Imprimimos el resultado para corroborar
        System.out.println("\n" + "Numero de palabras:" + p_11.size() + "\n");
        System.out.println("\n" + p_11 + "\n");
    }

    //Usando el codigo de ejemplo, explicar el tipo: ParameterTable
    public void Pregunta_12()
    {

        System.out.println( "\n" + "----------------------------------------------------------------------------------------------------------" + "\n");
        System.out.println( "\n" + "Pregunta_12:" + "\n");

        //Pedir codigo en ejemplo en BLock de notas o Imagen nueva.
    }

    //Main del codigo
    public static void main(String[] args) throws Exception 
    {
        Prueba P = new Prueba();

        //Respuesta a pregunta 1
        P.Pregunta_1();

        //Respuesta a pregunta 2
        P.pregunta_2();

        //Respuesta a pregunta 3
        P.pregunta_3();

        //Respuesta a pregunta 4
        P.pregunta_4();

        //Respuesta a pregunta 5
        P.pregunta_5();

        //Respuesta a pregunta 6
        for(int i = 0; i<=10 ; i++)
        {
            P.pregunta_6(i);
        }

        //Respuesta a pregunta 7
        P.pregunta_7();

        //Respuesta a pregunta 8
        P.pregunta_8();

        //Respuesta a pregunta 9
        P.pregunta_9();

        //Respuesta a pregunta 10
        P.pregunta_10();

        //Respuesta a pregunta 11
        P.Pregunta_11();

        //Respuesta a pregunta 12
        P.Pregunta_12();

    }
}