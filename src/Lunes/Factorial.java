
package Lunes;


public class Factorial {
    public int factorial(int n)
    {
        /*
        int result = 1;
        
        while(n>1){
            result = result * n;
            n--;
        }
*/
        if ( n == 1 || n == 0)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}
