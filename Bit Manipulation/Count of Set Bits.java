/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    //Brute Force Apporach
	static int countOfSetBits(int n){
	    String b="";
	    while(n>=1){
	        int x=n%2;
	        n=n/2;
	        b=x+b;
	    }
	    int count=0;
	    for(int i=0;i<b.length();i++){
	        if(b.charAt(i)=='1'){
	            count++;
	        }
	    }
	    return count;
	}
	//Efficient Apporach
	static int countOfSetBit(int n){
	    int count=0;
	    while(n>0){
	        n=(n&(n-1));
	        count++;
	    }
	    return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countOfSetBit(n));
	}
}
