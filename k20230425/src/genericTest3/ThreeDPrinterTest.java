package genericTest3;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		genericPrinter.setMaterial(new Powder());
		System.out.println(genericPrinter.getMaterial());
		Powder powder = genericPrinter.getMaterial();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter.setMaterial(new Plastic());
		System.out.println(genericPrinter2.getMaterial());
		Powder plastic = genericPrinter2.getMaterial();
				
	}
}