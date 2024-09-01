/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    //Apporach 1
    static int rightMostPosSet(int n){
        //Brute Force Apporach
        //tc->O(n)
        String s="";
        while(n>=1){
            int x=n%2;
            n=n/2;
            s=x+s;
        }
        for(int i=s.length()-1;i>=0;i--){
		    if(s.charAt(i)=='1'){
		        return s.length()-i;
		        
		    }
		}
		return 0;
    }
    //Apporach 2
    static int effRightMostPosSet(int n){
        //tc->O(logN)
        int m=1;
        int pos=0;
        while((n&m)==0){
            m=m<<1;
            pos++;
        }
        return pos+1;
    }
    //Apporach 3
    static int posOfRMSB(int n){
        //tc->O(1)--Efficient Apporach
        return (int)(Math.log10((n^(n&n-1)))/Math.log10(2))+1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(posOfRMSB(n));
	}
}