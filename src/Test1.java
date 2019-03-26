import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try {
			              InetAddress address = InetAddress.getLocalHost();
			             System.out.println("Host Name: " + address.getHostName());
			           System.out.println("Host Address: " + address.getHostAddress());
			 
			         } catch (UnknownHostException e) {
			             e.printStackTrace();
			        }
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		System.out.println("请先后输入行数m和列数n：");
		int m=input1.nextInt();
		int n=input2.nextInt();
		System.out.println("生成的m行n列的矩阵为：");
		int[][] arr=new int[m][n];
		Random rd = new Random(); 
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=rd.nextInt(10);
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
			
		}
		System.out.println("最大子矩阵为：");
		
		getMax(arr,m,n);
		
		
		
		
		

	}

	public static void getMax(int[][] arr, int m, int n) {
		int x=0;
		int y=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i<=m-2&&j<=n-2) {
				x=arr[i][j]*arr[i+1][j+1]+arr[i][j+1]*arr[i+1][j];
				if(y<x) {
					y=x;
					a=arr[i][j];
					b=arr[i][j+1];
					c = arr[i+1][j];
					d=arr[i+1][j+1];
					
				}
				if(i==(m-2)&&i==(n-2)) {
					System.out.println(arr[i][j]+","+arr[i][j+1]);
					System.out.println(arr[i+1][j]+","+arr[i+1][j+1]);
					
				}
				}
			}
			
			
		}
		
				System.out.println(a+","+b);
				System.out.println(c+","+d);
			
			
			
		
		System.out.println("该子矩阵和为：");
		System.out.println(y);
		
		
	}

}
