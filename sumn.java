package javaclass;

public class sumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum,intrm;
		n=11;
		sum=0;
		for(i=1;i<=n;i++)
		{
			intrm=i*i;
			sum = intrm+sum;
		}
		System.out.println("The sum of first n number "+sum);
	}

}
