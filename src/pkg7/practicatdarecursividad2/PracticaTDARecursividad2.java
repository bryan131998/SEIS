package pkg7.practicatdarecursividad2;

/**
 *
 * @author Diaz
 */
public class PracticaTDARecursividad2 {

   
    public static void main(String[] args) {
        PracticaTDARecursividad2 objFactorial = new PracticaTDARecursividad2 ();
        System.out.println("el factorial mediante bucles es:" + objFactorial.factorialBucles(7));
        System.out.println("el factorial mediante recursividad es:" + objFactorial.factorialRecursivo(7));
    }
    
    //creando un metodo factorial mediante ciclos
    public int factorialBucles(int n){
        // 7 = 7x6x5x4x3x2x1 = 5,040
        int factor = 1;
        if( n < 0){
            return 0;
        }else{
            while(n!=0){
                factor= n * factor;
                n--;
            }
            return factor;
        }
    }
    
    //creando metodo factorial mediante recrusividad
    public int factorialRecursivo(int n){
    if ( n < 0){
        return 0;
    } else {
       if (n == 0){
       return 1;
       }else{
           return n * factorialRecursivo(n-1);
       }
    
    }
    }
}



