/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static int swapBits(int n){
        return ((n&0xAAAAAAAA)>>>1)|((n&0x55555555)<<1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(swapBits(sc.nextInt()));
	}
}
