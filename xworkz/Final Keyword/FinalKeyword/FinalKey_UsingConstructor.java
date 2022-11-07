package FinalKeyword;

public class FinalKey_UsingConstructor {
	final int TEST;
	
	//FinalKey_UsingConstructor(int test1){
		//this.TEST=test1;
		
	FinalKey_UsingConstructor(){
		TEST=10;
	}

	public static void main(String[] args) {
		FinalKey_UsingConstructor fc=new FinalKey_UsingConstructor();
		System.out.println(fc.TEST);
	}
}
