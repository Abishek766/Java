/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        // 1.Brute force Apporach time complexity O(min(a,b))
        int min=0;
		if(a<b){
		    min=a;
		}else{ min =b;}
		
		for(int i = min;i>0;i--){
		    if(a%i==0 && b%i==0){
		        System.out.println("Highest common Divisor is: "+i);
		        break;
		    }
		}
		
		
		//2.euclidean Apporach Time complexity O(max(a,b))
		while(a!=b){
		  if(a>b){
		    a=a-b;
		  }else{
		    b=b-a;
		  }
		}
		System.out.println(a);
		
		//Optimised Euclidean Apporach Time complexity 0(log n) -- This is effecient Apporach
		while(a!=0 && b!=0){
		  if(a>b){
		    a=a%b;
		  }else{
		    b=b%a;
		  }
		}
		if(a>0){
		   System.out.println(a);
		}else{
		    System.out.println(b);
		}
	}
}