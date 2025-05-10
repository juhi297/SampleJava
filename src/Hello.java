
public class Hello {

	public static void main(String[] args) {
		int i= 10;
		int j=7;
		System.out.println(i);
		System.out.println(j);
		int k=j;
		j=i;
		i=k;
		System.out.println("Numbers after swap");
		System.out.println(i);
		System.out.println(j);
	
	}

}
