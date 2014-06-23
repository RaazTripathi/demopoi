package demopoi.demopoi;

import java.awt.Color;
import java.util.Scanner;

public class RGB 
{
	public static void main (String s[]) {
		int r = 0, g = 0, b = 0;
		  Scanner sc = new Scanner(System.in);
		    r = sc.nextInt();
		    g = sc.nextInt();
		    b = sc.nextInt();

		Color c=new Color(r, g, b);
		
		
		int rgb =c.getRGB();
		
		String hex = Integer.toHexString(rgb & 0xffffff);
		if (hex.length() < 6) {
		    hex = "0" + hex;
		}
		hex = "#" + hex;

		System.out.println(hex);
		
		
		
	}

}
