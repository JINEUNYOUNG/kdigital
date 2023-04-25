package genericTest;

public class ThreeDPrinterTest {
	
	public static void main(String[] args) {
		
	ThreeDPrinterPowder printerPowder = new ThreeDPrinterPowder();
	Powder powder = new Powder();
	printerPowder.setMaterial(powder);
	System.out.println(printerPowder.getMaterial());
	powder = printerPowder.getMaterial();
	System.out.println("===============");
	
	
	ThreeDPrinterPlastic printerPlastic = new ThreeDPrinterPlastic();
	Plastic plastic = new Plastic();
	printerPlastic.setMaterial(plastic);
	System.out.println(printerPlastic.getMaterial());
	plastic = printerPlastic.getMaterial();
	
	System.out.println("===============");
	ThreeDPrinter threeDPrinter = new ThreeDPrinter();
	
	threeDPrinter.setMaterial(powder);  //upcasting
	System.out.println(threeDPrinter.getMaterial());

	powder = (Powder) threeDPrinter.getMaterial();  //downcastig
	
	threeDPrinter.setMaterial(plastic);
	System.out.println(threeDPrinter.getMaterial());
	plastic = (Plastic) threeDPrinter.getMaterial();			

	System.out.println("==============="); //▼generic사용
	
	GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
	genericPrinter.setMaterial(powder);
	System.out.println(genericPrinter.getMaterial());
	powder = genericPrinter.getMaterial();
			
	GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
	genericPrinter2.setMaterial(plastic);
	System.out.println(genericPrinter2.getMaterial());
	plastic = genericPrinter2.getMaterial();
	
	Water water = new Water();
	threeDPrinter.setMaterial(water);
	System.out.println(threeDPrinter.getMaterial());
	water = (Water) threeDPrinter.getMaterial();
	
	GenericPrinter<Water> genericPrinter3 = new GenericPrinter<>();
	genericPrinter3.setMaterial(water);
	System.out.println(genericPrinter3.getMaterial());
	water = genericPrinter3.getMaterial();
	
	
	}
	
	
}
