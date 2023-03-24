package practice;

import org.openqa.selenium.WebDriver;

public class StringSplit {
	public static void main(String[] args) {
		
		String s="Vishal was an Engineer";
		String[]sp=s.split(" ");
		System.out.println(sp.length);
		String temp="";
		
//		for(int i=0;i<=sp.length-1;i++)
//		{
//			temp=sp[i]+" "+temp;
//		}
//		System.out.println(temp);
//		
//		for(int j=sp.length-1;j>=0;j--)
//		{
//			System.out.print(sp[j]+" ");
//		}
		
		
		
		
		String a= "I am Legend";
		String p[]=a.split(" ");
		int b=p.length;
		for(int i=b-1;i>=0;i--)
		{
		    System.out.println(sp[i]+" ");
		}
	}

}
