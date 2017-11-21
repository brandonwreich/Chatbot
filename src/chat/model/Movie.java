package chat.model;

import java.time.LocalDate;

public class Movie
{
	private String title;
	private String genre;
	private String ratingMPAA;
	private String review;
	private int length;
	private LocalDate releaseDate;
	private double starScore;
<<<<<<< HEAD

=======
	
	/**
	 * Initializes the data members
	 * @param title
	 */
>>>>>>> master
	public Movie(String title)
	{
		this.title = "Title: " + title;
		this.genre = "Comedy";
		this.ratingMPAA = "PG";
		this.review = "This was a good movie!!";
		this.length = 120;
		this.releaseDate = null;
		this.starScore = 9.99;
	}

	/**
	 * Gets the title
	 * @return title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Gets the genre
	 * @return genre
	 */
	public String getGenre()
	{
		return genre;
	}

	/**
	 * Gets the MPAA rating
	 * @return ratingMPAA
	 */
	public String getRatingMPAA()
	{
		return ratingMPAA;
	}

	/**
	 * Gets the review
	 * @return review
	 */
	public String getReview()
	{
		return review;
	}

	/**
	 * Gets the movie length
	 * @return length
	 */
	public int getLength()
	{
		return length;
	}

	/**
	 * Gets the movie release date
	 * @return releaseDate
	 */
	public LocalDate getReleaseDate()
	{
		return releaseDate;
	}

	/**
	 * Gets the movie star score
	 * @return starScore
	 */
	public double getStarScore()
	{
		return starScore;
	}

	/**
	 * Sets the movie's title
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Sets the movie's genre
	 * @param genre
	 */
	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	/**
	 * Sets the movie's MPAA rating
	 * @param ratingMPAA
	 */
	public void setRatingMPAA(String ratingMPAA)
	{
		this.ratingMPAA = ratingMPAA;
	}

	/**
	 * Sets the movie's review
	 * @param review
	 */
	public void setReview(String review)
	{
		this.review = review;
	}

	/**
	 * Sets the movie's length
	 * @param length
	 */
	public void setLength(int length)
	{
		this.length = length;
	}

	/**
	 * Sets the movie's release date
	 * @param releaseDate
	 */
	public void setReleaseDate(LocalDate releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	/**
	 * Sets the movie's star score
	 * @param starScore
	 */
	public void setStarScore(double starScore)
	{
		this.starScore = starScore;
	}
<<<<<<< HEAD

=======
	
	/**
	 * Describes the movies using title, genre, etc.
	 */
>>>>>>> master
	public String toString()
	{
		String description = "";

		return description;
	}
}
