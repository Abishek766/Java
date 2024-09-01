/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static boolean isPrime(int n){
      if(n==1){
       return false;   
      }
      if(n==2||n==3){         // This is normal apporch tc:O(n*square root(n))
        return true;
      }
      if(n%2==0||n%3==0){
        return false;
      }
      for(int i =5;i*i<=n;i=i+6){
        if(n%i==0||n%(i+2)==0){
                return false;
        }
      }
      return true;
    }
	static void printPrime(int n){
	    for(int i =2;i<=n;i++){
	        if(isPrime(i)){
	            System.out.println(i);
	        }
	    }
	}
	static void printPrimeNumbers(int n){
	    //sieve of Eratosthanes algorithm
	    //tc:O(n log(log(n)))
	    boolean[] prime = new boolean[n+1];
	    for(int i=2;i<=n;i++){
	        if(prime[i]==false){
	            for(int j=i*2;j<=n;j=j+i){
	                prime[j]=true;
	            }
	        }
	    }
	    for(int i =2;i<=n;i++){
	       if(prime[i]==false){
	           System.out.println(i);
	       } 
	    }
	}
	static void optimisedPrintPrimeNumbers(int n)
	{
	    //effictive sieve algorithm tc::O(n log(log(n)))
	    //but it more efficent then above code
	    boolean[] prime = new boolean[n+1];
	    for(int i=2;i<=n;i++){
	        if(prime[i]==false){
	            for(int j=i*i;j<=n;j=j+i){ //j=i*i
	                prime[j]=true;
	            }
	        }
	    }
	    for(int i =2;i<=n;i++){
	       if(prime[i]==false){
	           System.out.println(i);
	       } 
	    }
	}
	static void optimisedSeiveNumbers(int n)
	{
	    //Efficient sieve algorithm tc:O(square root(n)*log(log(n)))
	    // in this code the first for loop goes until square root of n
	    //This is the more efficient apporach to print prime numbers
	    boolean[] prime = new boolean[n+1];
	    for(int i=2;i*i<=n;i++){      //i*i<=n
	        if(prime[i]==false){
	            for(int j=i*i;j<=n;j=j+i){ //j=i*i
	                prime[j]=true;
	            }
	        }
	    }
	    for(int i =2;i<=n;i++){
	       if(prime[i]==false){
	           System.out.println(i);
	       } 
	    }
	}
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  //optimisedPrintPrimeNumbers(n);
	  optimisedSeiveNumbers(n);
	}
}
