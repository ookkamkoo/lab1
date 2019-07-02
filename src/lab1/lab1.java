package lab1;

public class lab1 {
	public static void main(String[] args)
	{
		int a=10 , b=20;
		double price = 2.22;
		String name1 = "khem";
		System.out.println("price : " + price);
		System.out.println("Name is : " + name1);
		System.out.println(name1.length());
		
		int num[] = {1,2,3,4};
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]);
		int[] num2 = new int [100];
		
		String  fruits[] = {"banana","apple"};
		for(String f : fruits)
			System.out.println(f);
		
		String name = "John Smith";
		char lastInitial = name.charAt(0);
		System.out.println(lastInitial);
		
		String tel= "062-337368";
		String[] ts = tel.split("-");
		System.out.println(ts[0]);
		for(String t : ts)
		System.out.print(t);
		

		
	}

}
