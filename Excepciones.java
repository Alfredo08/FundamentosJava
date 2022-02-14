
public class Excepciones{
    public static void main( String args[] ){
        int nums[] = {10, 20, 30, 40, 50};

        try{
            System.out.println( nums[0] );
        }
        catch ( ArrayIndexOutOfBoundsException e ){
            System.out.println( e );
        }
        catch ( Exception e ){
            System.out.println( e );
        }
        finally{
            System.out.println( "Esto se imprime en ambos casos." );
        }

        for( int i = 0; i < nums.length; i ++ ){
            System.out.println( nums[i] );
        }
    }
}
