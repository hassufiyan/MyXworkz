package FinalKeyword;

public class FinalKey {
	final int TEST=10;
	final static  int TEST1=20;
	
	public static void main(String[] args) {
		FinalKey f1=new FinalKey();
		
		System.out.println("value of Test: "+f1.TEST);
		System.out.println("value of Test1: "+FinalKey.TEST1);
	}

}
