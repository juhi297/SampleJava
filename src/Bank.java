
 class Bank1 {
	String name;
	String branchLocation;
	Bank1(String name, String branchLocation){
		this.name=name;
		this.branchLocation=branchLocation;
	}
	public String toString() {
		String bankInfo= name + "->"+branchLocation;
		return bankInfo;
		
		
	}
}

