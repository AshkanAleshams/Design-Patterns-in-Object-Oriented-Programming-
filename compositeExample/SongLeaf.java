package compositeExample;

public class SongLeaf implements SongComponent {

	private String name;
	
	
	@Override
	public void playSong() {
		System.out.println("Playing " + this.name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
