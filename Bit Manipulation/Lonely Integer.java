/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    //Brute Force Apporach tc->O(n log n)
    static int unquieElement(int[] ar){
        Arrays.sort(ar);
        for(int i=0;i<ar.length-2;i=i+2){
            if(ar[i]!=ar[i+1]){
                return ar[i];
            }
        }
        return ar[ar.length-1];
    }
    //tc->o(n) ->sc->need extra space
    static int singleElement(int[] ar){
        Set<Integer> s= new HashSet();
        for(int i=0;i<ar.length;i++){
            if(s.contains(ar[i])){
                s.remove(ar[i]);
            }else{
                s.add(ar[i]);
            }
        }
        for(int i : s){
            return i;
        }
        return -1;
    }
    //effiecient Apporach bit Manipulation O(n) but no need space
    static int lonelyInteger(int[] ar){
        int result=0;
        for(int i=0;i<ar.length;i++){
            result=result^ar[i];
        }
       
        return result;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
		    ar[i]=sc.nextInt();
		}
		System.out.println(lonelyInteger(ar));
	}
}
