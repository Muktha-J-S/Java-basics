package javaclass;

public class biggestofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=1;
		b=11;
		c=33;
		if(a>b)
		{ 
			if(a>c) {
		
			System.out.println("a is biggest number");
		}
		else {
			System.out.println("c is biggest number");
		}
		}
			else
			{
				if(b>c)
				{
					System.out.println("b is the biggest number");
				}
				else
				{
					System.out.println("c is the biggest number");
				}
			}
	}

}
