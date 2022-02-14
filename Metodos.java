
public class Metodos{
    
    public static int suma( int num1, int num2 ){
        int total = num1 + num2;
        return total;
    }

    public static int suma( int num1, int num2, int num3 ){
        return num1 + num2 + num3;
    }

    public static void imprimeHola(){
        System.out.println( "Hola, bienvenidos al stack de Java." );
    }
    public static void main( String args[] ){
        int num1 = 10;
        int num2 = 20;
        int num3 = 70;

        int total = suma( num1, num2 );
        System.out.println( total );
        total = suma( num1, num2, num3 );
        System.out.println( total );

        imprimeHola();
    }
}