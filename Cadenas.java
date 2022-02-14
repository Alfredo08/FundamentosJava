public class Cadenas{
    public static void main( String args[] ){
        String texto = "  Me gusta programar.  ";
        String textoMayuscula = texto.toUpperCase();
        
        System.out.println( textoMayuscula );
        System.out.println( texto.toLowerCase() );
        System.out.println( texto.trim() );
        System.out.println( texto.length() );
        System.out.println( texto.indexOf("gusta") );

        String nombre1 = "Alex";
        String nombre2 = "Alex";

        if( nombre1.equals(nombre2) ){
            System.out.println( "Tienen el mismo valor" );
        }
    } 
}