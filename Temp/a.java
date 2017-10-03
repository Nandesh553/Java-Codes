import java.io.*;
import  java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int abc= in.nextInt();
		int[] frequencyArr = new int[200];
		char[] charArray = Integer.toString(abc).toCharArray();
		for (char ch : charArray)
			frequencyArr[ch]++;

		int oddCharCount=0;
		for (int ch : frequencyArr)
		{	if (ch == 1)
			oddCharCount++;}
		System.out.println(oddCharCount);
	}
}
