/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void printFactorsAscending(int n){
        int i=0;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(int j=i;j>=1;j++){
            if(n%j==0 && j!=n/j){
                System.out.println(j);
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		printFactorsAscending(n);
	}
}
