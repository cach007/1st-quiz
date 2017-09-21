import java.util.Scanner;



public class MyCalc {
	private static int x,y;
	public static int getNumber(){
		Scanner sc=new Scanner(System.in);
		return x;
	}
	public static int getFirstNumber(){
		x=getNumber();
		return x;
	}
	public static int getSecondNumber(){
		y=getNumber();
		return y;
	}
	public static int addNumbers(int x,int y){

		return x+y;
	}
	public static int subNumbers(int x,int y){
		return x-y;
		
	}
	public static int multNumbers(int x,int y){
		return x*y;
	}
	public static int divNumbers(int x,int y){
		return x/y;
		
	}
	static void showMenu() {
	System.out.println(1+".add two integers" );
	System.out.println("2.substract an integer from an integer");
	System.out.println("3.multiply two integers");
	System.out.println("4.divide an integer into an integer");
	System.out.println("5.system exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		System.out.println("실행할 연산 선택");
		int temp=getNumber();
		System.out.println("첫번째 숫자입력");
		int num1=MyCalc.getFirstNumber();
		System.out.println("두번째 숫자입력");
		int num2=MyCalc.getSecondNumber();
		
		switch(temp){
		case 1: MyCalc.addNumbers(num1,num2); break;
		case 2: MyCalc.subNumbers(num1,num2); break;
		case 3: MyCalc.multNumbers(num1,num2); break;
		case 4: MyCalc.divNumbers(num1,num2); break;
		}

	}
}
	
