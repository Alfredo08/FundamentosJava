// Comentario en línea
/*
    Un 
    comentario
    en 
    bloque
*/
public class Introduccion{
    public static void main( String args[] ){
        int edad = 20;
        long numeroGrande = 1000;
        float califacion = 9.5f;
        double numeroDecimalGrande = 100000.0005;
        String nombre = "Alejandro";
        boolean bandera = true;
        char opcion = 'A';
        String apellido = null;

        System.out.println( "La edad es " + edad );
        System.out.println( "El numero es " + numeroGrande );
        System.out.println( "La calificacion es " + califacion );
        System.out.println( "El nombre es " + nombre );
        System.out.println( "El booleano es " + bandera );

        if( edad >= 21 ){
            System.out.println( "Ya puedes tomar legalmente cualquier bebida en USA!" );
        }
        else{
            System.out.println( "Aún no puedes tomar bebidas alcoholicas en USA!" );
        }
    }
}

/*
()
* / %
+ -
! != == > < >= <=
|| 
&&
=
*/
