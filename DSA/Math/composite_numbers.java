/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void compositeNumber(int n){
        //Efficient sieve algorithm tc:O(square root(n)*log(log(n)))
	    // in this code the first for loop goes until square root of n
	    //This is the more efficient apporach to print composite numbers
	    boolean[] prime = new boolean[n+1];
	    for(int i=2;i*i<=n;i++){      //i*i<=n
	        if(prime[i]==false){
	            for(int j=i*i;j<=n;j=j+i){ //j=i*i
	                prime[j]=true;
	            }
	        }
	    }
	    for(int i =2;i<=n;i++){
	       if(prime[i]==true){
	           System.out.println(i);
	       } 
	    }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		compositeNumber(n);
	}
}
