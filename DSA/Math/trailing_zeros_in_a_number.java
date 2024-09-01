/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.*;
public class Main
{
	public static void main(String[] args) {
    	int n =200;
    	int sum = 0;
        while(n>=5){
           n=n/5;
           sum+=n;
        }
		System.out.println(sum);
		/*int n = 100;
		BigInteger res = BigInteger.ONE;
		for(int i =1;i<=n;i++){
		    res=res.multiply(BigInteger.valueOf(i));
		}
		System.out.println(res);*/
	}
}