package LogicalPrograms;
class Mobile{
	Mobile(){
		System.out.println("mobile....");
	}
}
class Apple extends Mobile{
	Apple(){
		super();
		System.out.println("apple..");
	}
}
public class SuperUse {
	public static void main(String[] args) {
		Apple ap=new Apple();
		
	}

}
