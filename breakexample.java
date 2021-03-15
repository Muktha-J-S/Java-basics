package javaclass;

public class breakexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Working with continue statement");
		for(i=1;i<=10;i++)
		{
			if(i==4)
			{
				break; ///continue;
			}
			else
				System.out.println("i value is "+i);
		}
	}

}
