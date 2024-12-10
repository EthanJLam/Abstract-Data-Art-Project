public class Movie {

    private String title;         // title of the movie
    private int year;             // year released
    private double rating;        // IMDB rating of the movie

    /** Constructor */
    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    /** Accessor method for title */
    public String getTitle() {
        return title;
    }

    /** Accessor method for year */
    public int getYear() {
        return year;
    }

    /** Accessor method for rating */
    public double getRating() {
        return rating;
    }

    /** toString method override */
    public String toString() {
        return " (" + year + ") - IMDB Rating: " + rating;
    }
  public String toStringMaster(){
    return title + " \n is a Masterpiece.";
  }
   public String toStringGreat(){
    return title + "\n is a great movie.";
  }
   public String toStringGood(){
    return title + "\n is a good/decent movie.";
  }
}
