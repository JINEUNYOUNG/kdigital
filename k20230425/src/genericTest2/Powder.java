package genericTest2;

public class Powder extends Material{

	public String toString() {
		return "Powder";
	
}

	@Override
	void doPrinting() {
System.out.println("Powder 재료로 출력");		
	}
}
