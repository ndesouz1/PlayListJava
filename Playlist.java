import java.util.ArrayList;

class Playlist {
  public static void main(String[] args) {
    // Criando uma playlist
    ArrayList<String> nayaraPlaylist = new ArrayList<String>();
    
    // adcionando músicas na playlist
    nayaraPlaylistt.add("Beales - Let it Be");
    nayaraPlaylist.add("Queens - Somebody to Love");
    nayaraPlaylist.add("Whitesnake - Here I go again");
    nayaraPlaylist.add("Radiohead - Idioteque");
    
    // imprimindo a playlist
    // System.out.println(nayaraPlaylist);
    
    // vendo o tamanho da playlist
    // System.out.println(nayaraPlaylist());
    
    // removendo músicas
    nayaraPlaylist.remove("Radiohead - Idioteque");
   
    // System.out.println(nayaraPlaylist);
    
    // trocando a ordem das mísicas da lista
    int indexA = nayaraPlaylist.indexOf("Beales - Let it Be");
    int indexB = nayaraPlaylist.indexOf("Queens - Somebody to Love");
    
    String tempA = "Beales - Let it Be";
    
    desertIslandPlaylist.set(indexA, "Queens - Somebody to Love");
    // System.out.println(nayaraPlaylist);
    nayaraPlaylist.set(indexB, tempA);
    System.out.println(dnayaraPlaylist);
    
  }
  
}
