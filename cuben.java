package javaclass;

public class cuben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,cube,sum;
		n=5;
		sum=0;
		for(i=1;i<=n;i++)
		{
			cube=i*i*i;
			sum=sum+cube;
		}
		System.out.println("The sum of cubes "+sum);
	}

}
