package Samplepackage;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a=20, b=30;
		boolean x=true;
		System.out.println("a ="+ a + ",b="+ b);
		a+=b;
		System.out.println("a="+ a);
		a-=b;
		System.out.println("a="+ a);
		a*=b;
		System.out.println("a ="+ a);
		a/=b;
		System.out.println("a ="+ a);
		a%=b;
		System.out.println("a ="+ a);
		x |=(a>b);
		System.out.println("a ="+ x);
		x &=(a>b);
		System.out.println("a ="+ x);
		
	}

}
