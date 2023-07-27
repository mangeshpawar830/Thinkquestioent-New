package LogicalPrograms;
class Practice {
	public void methodA() {
		System.out.println("Practice()");
	}

}
class B extends Practice{
	public void methodB() {
		System.out.println("B()");
	}
	public static void main(String[] args) {
		Practice a=new B();
		a.methodA();
	}

	
}
