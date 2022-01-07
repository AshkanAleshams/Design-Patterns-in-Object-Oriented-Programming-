package factoryExample;

public class IPhone implements Mobile{

	private int ramSize;
	private String processor;
	private String GPU;
	private String faceScanner;
	
	public IPhone(int ramSize, String processor, String GPU, String faceScanner) {
		this.faceScanner = faceScanner;
		this.GPU = GPU;
		this.processor = processor;
		this.ramSize = ramSize;
	}
	
	
	public String toString() {
		return "ramSize =" + this.ramSize + " processor= " + this.processor + " GPU= " + this.GPU
				+ " faceScanner= " + this.faceScanner;
	}
}
