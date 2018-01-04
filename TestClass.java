package testPackage;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;

public class TestClass {
	//New File 
	public static void main(String[] args) {
/*		Scanner number = new Scanner(System.in);
		String str = new String ();
		System.out.println("Enter a number :");
		int num=number.nextInt();
		int bin[] = new int[5];
		
		System.out.println(num);
/*		int rem = 0;
//		for (int i=0; i < num ; i++)
//		{
//			System.out.println(i);
//		}
		
		while (num >= 1){
			rem = num % 2;
			num = num / 2;
			//System.out.print(rem);
			str = Integer.toString(rem);
		}
		
		Random rand = new Random();
		//System.out.println(100000000 + rand.nextInt(900000000));
		System.out.println(rand.nextInt());
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int character=(int)(Math.random()*26);
		
		String s=alphabet.substring(character, character+1);
		System.out.println(s);
		
		String uuid = UUID.randomUUID().toString();
		
		
		System.out.println(RandomStringUtils.randomAlphanumeric(6).toLowerCase());
		long number = RandomUtils.nextLong();
		String a = Long.toString(number).substring(0, 10);
		System.out.println(a);*/
		
		String str = "https://blk.phix-dev01-team2.demo.hcinternal.net/broker";
		String str1 = "https://fidelity.phix-qa05.demo.hcinternal.net/broker";
		System.out.println(str1.replace(".", "#").split("#")[0].split("//")[1]);
		
		
	}

}
