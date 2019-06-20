package ch05.ex02;

public interface Test {
	// insert code here

//	public abstract String typeA; //interface 的 field 只能是 public static final ，不可以是 abstract (與 static 矛盾)
//	public abstract String getTypeA();

//	public static String typeB;  //interface field 需要宣告並給值
//	public abstract String getTypeB(); 

//	public String typeC = "ocpjp";
//	public static String getTypeC(); //沒有實作必須要 abstract，但是 abstract 又不可以 static

	public String typeD = "ocpjp";

	public abstract String getTypeD();
}
