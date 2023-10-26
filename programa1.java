package programa1;

import java.util.Scanner;


public class Programa1 {

    public static void main(String[] args) {
        /*Metodo que carga los datos y se retorna en caso de que alguna de las condiciones no sea la correcta*/
        CargarDatos();

    }

    ;
    /*Metodo que se encarga de inicializar las variables en 0 y es el metodo para la entrara de datos*/
    public static void CargarDatos() {

        Scanner NumEntrada = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
        System.out.println("\n Programa para encontar el numero mayor de tres numeros");
        System.out.println("\n Inserte el primer valor de los tres: ");
        a = NumEntrada.nextInt();
        System.out.println("\n Inserte el segundo valor : ");
        b = NumEntrada.nextInt();
        System.out.println("\n Inserte el tercer valor: ");
        c = NumEntrada.nextInt();
        /*Revisar los datos*/
        Revision(a, b, c);

    }

    ;
    /*Primero verificar que los numeros no sean iguales*/
    public static void Revision(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.println("\n Los tres valores son iguales, no hay numero mayor");
            System.out.println("\n El programa iniciara de nuevo, por favor inserte numeros distintos");
            /*Lamar al metodo principal quien inicaliza las variables en 0 y limpia los datos*/
            CargarDatos();
        } else {
            if (a == 0 || b == 0 || c == 0) {
                System.out.println("\n Los tres numeros deben de ser distintos de 0");
                System.out.println("\n El programa iniciara de nuevo por favor coloque numeros distintos de 0");
                /*Lamar al metodo principal quien inicaliza las variables en 0 y limpia los datos*/
                CargarDatos();

            } else {
                /* Si los datos son correctos llamar a operacion */
                Operacion(a, b, c);
            };
        }

    }

    ;
    
    public static void Operacion(int a, int b, int c) {
        /*Variables auxiliares, el ,metodo math.max solo admite dos numeros */
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        int aux4 = 0; 
        /*Encontrando el mayor de los 3*/
        aux1 = Math.max(a, b);
        aux2 = Math.max(aux1, c);
        /*Encontrando el valor minimo de los 3*/
        aux3 = Math.min(a, b);
        aux4 = Math.min(aux3, c);
        
        
        System.out.println("\n El valor mayor entre a, b ,c es:" +aux2);
        System.out.println("\n El valor minimo entre a, b, c es:"+aux4);

    }
;

}
