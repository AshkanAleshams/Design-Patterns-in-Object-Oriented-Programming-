package compositeExample;

import java.util.ArrayList;
import java.util.List;

public class SongPlaylistComposite implements SongComponent {

	List<SongComponent> playlist;
	
	public SongPlaylistComposite() {
		this.playlist = new ArrayList<>();
	}
	
	@Override
	public void playSong() {
		
		for (SongComponent song: playlist) {
			song.playSong();
		}
	}

	public void addSong(SongComponent song) {
		playlist.add(song);
	}
	
	public void removeSong(SongComponent s) {
		for (int i = 0; i<playlist.size()-1; i++) {
			if (playlist.get(i).equals(s)) playlist.remove(i);
		}	
	}
	
	
	
}
