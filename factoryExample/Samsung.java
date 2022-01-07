package factoryExample;

public class Samsung implements Mobile {

	private int ramSize;
	private String processor;
	private String GPU;
	
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	public String toString() {
		return "ramSize =" + this.ramSize + " processor= " + this.processor + " GPU= " + this.GPU;
	}
	
}
