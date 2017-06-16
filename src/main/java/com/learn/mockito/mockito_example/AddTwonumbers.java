package com.learn.mockito.mockito_example;

public class AddTwonumbers {

	public AddTwonumbers(){
		
	}
	/*public  AddTwonumbers(int a, int b)
	{
		this.a = a;
		this.b = b;
		
	}*/
	/*public int ab(int a, int b){
		return a+b;
	}*/
	public int ab(int a, int b)
	{
		
		int c = a + b;
		System.out.println("result a + b ="+ c );
		return c;
	}
	
	
public static void main(String args[]) 
{
	AddTwonumbers add = new AddTwonumbers();
	add.ab(4,3);
	
}
}
