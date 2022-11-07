package FinalKeyword;

public class FinalKey_UsingBlocks {
	final int TEST;
	final static int TEST1;
	
	{
		TEST=20;
		
		
	}
	static {
	TEST1=30;	
	}
	
	//FinalKey_UsingBlocks(int test){
		//TEST=100;
	//}
	

	public static void main(String[] args) {
		FinalKey_UsingBlocks fb=new FinalKey_UsingBlocks();
		System.out.println(fb.TEST);
		System.out.println(FinalKey_UsingBlocks.TEST1);
	}
	
	
}
