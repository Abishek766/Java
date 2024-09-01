/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//Bructe Force Apporach -- Time Complexity O(a*b - max(a,b))
		int res = Math.max(a,b);
		while(true){
		    if(res%a==0 && res%b==0){
		        break;
		    }
		    res++;
		}
		System.out.println(res);
		//Euclid Apporach -Time Complexity O(log n) --Efficent Apporach
		int gcd=0;
		int product = a*b;
		while(a!=0 && b!=0){
		    if(a>b){
		        a=a%b;
		    }else{
		        b=b%a;
		    }
		}
		if(a>0){
		    gcd=a;
		}else{
		    gcd=b;
		}
		int lcm = product/gcd;
		System.out.println(lcm);

	}
}
