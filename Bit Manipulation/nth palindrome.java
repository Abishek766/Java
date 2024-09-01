/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int reverseBits(int n,int len){
        int f=len-1;
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
    static int palindromeBits(int n){
        int l=0;
        int count=0;
        int ans=0;
        while(count<n){
            l++;
            count=count+(int)(Math.pow(2,((l-1)/2)));
        }
        count=count-(int)(Math.pow(2,((l-1)/2)));
        int ele=n-count-1;
        ans=(1<<l-1)|(ele<<(l/2));
        ans=ans|reverseBits(ans,l);
        return ans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Integer.toBinaryString(n));
		int result=palindromeBits(n);
		System.out.println(Integer.toBinaryString(result));
		
	}
}
