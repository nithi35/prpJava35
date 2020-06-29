
public class Calculator {
static void PowerInt(int num1,int num2) {
	System.out.println(Math.pow(num1, num2));
	
}
static void PowerDouble(double num1,double num2) {
	System.out.println(Math.pow(num1, num2));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator cal=new Calculator();
cal.PowerDouble(2,3 );
cal.PowerInt(2, 3);
	}

}
