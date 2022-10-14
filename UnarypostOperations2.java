class UnarypostOperations2{
public static void main(String[] args){
int q=12;
int p=q++;
int r=p++;
System.out.println("q: "+q);//13
System.out.println("p: "+(p++));//13
System.out.println("r: "+(r++));//12
System.out.println("s: "+(p+r));//25
//q=13;
//p=14;
//r=13;
//s=27;

}
}