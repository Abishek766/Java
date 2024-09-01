/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int reverseBits(int n){
        int f=31;
        int l=0;
        int rev=0;
        while(f>l){
            if((n&(1<<f))!=0){
               rev=rev|(1<<l); 
            }
            if((n&(1<<l))!=0){
                rev=rev|(1<<f);
            }
            f--;
            l++;
        }
        return rev;
    }
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println(reverseBits(sc.nextInt()));
	}
}
