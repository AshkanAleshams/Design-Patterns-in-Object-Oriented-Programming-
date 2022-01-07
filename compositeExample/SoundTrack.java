package compositeExample;

public class SoundTrack implements SongComponent {

	private String name;
	
	
	@Override
	public void playSong() {
		System.out.println("SoundTrack playing" + this.name);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
