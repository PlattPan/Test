import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input1=new Scanner(System.in);
		
		System.out.println("ÇëÊäÈëÒ»¸öÊý×Ö×Ö·û´®");
		int m=input1.nextInt();
		String s=m+"";
		int[] c=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			
			c[i]=s.charAt(i);
			char cc=(char) (c[i]+48);
			System.out.print(cc);
			
			}
		System.out.println();
		int[] b1=new int[s.length()];
		for(int i=0;i<b1.length;i++) {
			b1[i]=1;
		}
		for(int i=0;i<s.length()-1;i++) {
			int a1=Integer.parseInt(c[i]+""+c[i+1]);
			if(b1[i]==1) {
			if(a1<=26) {
				System.out.println((char) (a1+48));
				b1[i]=0;
				b1[i+1]=0;
			}
			}
		}
		
		}
		System.out.println("123");
		
		

	}


