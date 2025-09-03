import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
    public static void main(String[] args) {
        // Step 1: Create and populate the playlist
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Bohemian Rhapsody");
        playlist.add("Stairway to Heaven");
        playlist.add("Hotel California");
        System.out.println("Initial playlist: " + playlist);

        // --- Your Code ---

        // 1. Check the Playlist Size
        if (!playlist.isEmpty()) {
            System.out.println("Songs available: " + playlist.size());
        } else {
            System.out.println("Playlist is empty.");
        }

        // 2. Add More Songs
        playlist.add(0, "Blinding Lights"); // Add to the beginning
        ArrayList<String> newSongs = new ArrayList<>();
        newSongs.add("Levitating");
        newSongs.add("Watermelon Sugar");
        playlist.addAll(newSongs); // Add newSongs to the main playlist
        System.out.println("After adding songs: " + playlist);

        // 3. Find and Replace a Song
        int songIndex = playlist.indexOf("Stairway to Heaven");
        if (songIndex != -1) { // Check if the song was found
            playlist.set(songIndex, "Africa");
        }
        System.out.println("After replacing a song: " + playlist);

        // 4. Verify a Song's Existence
        if (playlist.contains("Hotel California")) {
            System.out.println("Yes, 'Hotel California' is in the playlist.");
        }

        // 5. Remove Songs
        playlist.remove("Hotel California"); // Remove by name
        playlist.remove(2); // Remove the song at index 2
        System.out.println("After removing songs: " + playlist);

        // 6. Create a Party Sub-Playlist
        // .subList returns a new List, so we capture it in a variable
        List<String> partyPlaylist = playlist.subList(0, 3);
        System.out.println("Party playlist: " + partyPlaylist);

        // 7. Final Cleanup
        partyPlaylist.clear(); // Empty the party playlist
        if (partyPlaylist.isEmpty()) {
            System.out.println("The party playlist is now empty.");
        }

        System.out.println("Final main playlist: " + playlist);
    }
}