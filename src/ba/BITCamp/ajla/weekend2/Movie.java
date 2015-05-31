package ba.BITCamp.ajla.weekend2;

public class Movie {
	
	private String movieName;
	private int year;
	private String genre;
	private String directorsName;
	private double imdbRating;
	private boolean wonOscar;
	
	/**
	 * @param movieName
	 * @param year
	 * @param genre
	 * @param directorsName
	 * @param imdbRating
	 * @param wonOscar
	 */
	public Movie(String movieName, int year, String genre,
			String directorsName, double imdbRating, boolean wonOscar) {
		super();
		this.movieName = movieName;
		this.year = year;
		this.genre = genre;
		this.directorsName = directorsName;
		this.imdbRating = imdbRating;
		this.wonOscar = wonOscar;
	}
	
	public String toString () {
		String s = "";
		s = s + "Movie name is: " + movieName + " ";
		s = s + "(" + year + ")\n";
		s = s + "Genre: " + genre + "\n";
		s = s + "Director: " + directorsName + "\n";
		s = s + "IMDB rating: " + imdbRating + "\n";
		String oscar = "";
		if (wonOscar) {
			oscar = "Yes";
		} else
			oscar = "No";
		s = s + "Did this movie win an Oscar? " + oscar + "\n";
		return s;
	}
	
		
		
}
