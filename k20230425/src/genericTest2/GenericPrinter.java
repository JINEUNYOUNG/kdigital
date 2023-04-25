package genericTest2;

public class GenericPrinter<M extends Material> {
	
	private M material;
	
	public M getMaterial() {
		return material;
	}
	public void setMaterial(M material) {
		this.material = material;
	}

}
