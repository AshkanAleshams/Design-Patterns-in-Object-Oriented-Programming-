package compositeExample;

public class demoSongComposite {

	public static void main(String[] args) {
		
		SongLeaf gooseBumps = new SongLeaf();
		SongLeaf loveStory = new SongLeaf();
		SoundTrack stay = new SoundTrack();
		
		gooseBumps.setName("Goose Bumps by Travis Scott");
		loveStory.setName("Love Story");
		stay.setName("S.T.A.Y ");
		
		SongPlaylistComposite playlist = new SongPlaylistComposite();
		
		playlist.addSong(gooseBumps);
		playlist.addSong(loveStory);
		playlist.addSong(stay);
		
		gooseBumps.playSong();
		
		playlist.playSong();
	}
}
