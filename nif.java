package javaclass;

public class nif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='M';
		System.out.println("program of nested if");
		if(ch=='J')
		{
			System.out.println("Jan");
	}
		else
		{
			if(ch == 'F')
			{
				System.out.println("FEb");
			}
			else
			{
				if(ch == 'M')
				{
					System.out.println("March");
				}
				else
				{
					System.out.println("Invalid character");
				}
			}
		}

}
}