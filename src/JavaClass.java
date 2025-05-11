public class JavaClass{
	public static void main(String[] args) {
		//String name;
		//String branchLocation;
		Bank b1=new Bank("HDFC","pune");
		System.out.println(b1);
		b1=null;
		System.gc();
	}
}



class Bank{
	String name;
	String branchLocation;
	Bank(String name, String branchLocation){
		this.name=name;
		this.branchLocation=branchLocation;
	}
	public String toString() {
		String bankInfo= name + "->"+branchLocation;
		return bankInfo;
		
		
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stu
		System.out.println(this.name +"is garbage collected");
		
		super.finalize();
	}
}