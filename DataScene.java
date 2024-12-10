import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {

private Movie[] film;  // 1D array of Movie objects
  
 /** Constructor */
public DataScene() {
  film = createFilms(); 
}

 /** Returns a 1D array of Movie objects using the txt files in this project */
public Movie[] createFilms() {
String[] titlesArray = FileReader.toStringArray("Titles.txt");
int[] yearsArray = FileReader.toIntArray("Year.txt");
double[] ratingsArray = FileReader.toDoubleArray("Rating.txt");

Movie[] filmArray = new Movie [titlesArray.length];
for (int i = 0; i < filmArray.length; i++) {
filmArray[i] = new Movie(titlesArray[i], yearsArray[i], ratingsArray[i]);
}
  return filmArray;
  
}
  

  
  /**
   * method to draw the scene
   */
  public void drawScene() {
    int randomIndex = (int) (Math.random() * film.length); // Get a random index
    Movie f = film[randomIndex]; // Select the random movie
    
  

    clear("yellow"); // makes yellow background
setTextHeight(17);
if(f.getRating() >= 8.6){
  drawText(f.toStringMaster(), 20, 100);
} else if(f.getRating() < 8.6 && f.getRating() >= 8.0){
  drawText(f.toStringGreat(), 20, 130);
} else if(f.getRating() < 8.0){
  drawText(f.toStringGood(), 20, 160);
}

drawText(f.toString(), 20, 190);

  }
  

 


}
  
