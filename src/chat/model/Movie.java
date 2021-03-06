package chat.model;

import java.time.LocalDate;

/**
 * 
 * @author Brandon Reich
 *
 */
public class Movie
{
	private String title;
	private String genre;
	private String ratingMPAA;
	private String review;
	private int length;
	private LocalDate releaseDate;
	private double starScore;

	/**
	 * Initializes the data members
	 * 
	 * @param title
	 */
	public Movie(String title)
	{
		if (title.length() > 3)
		{
			this.title = title;
		}
		else
		{
			this.title = "The movie " + title;
		}

		this.genre = "Comedy";
		this.ratingMPAA = "PG";
		this.review = "This was a good movie!!";
		this.length = 120;
		this.releaseDate = releaseDate.now();
		this.starScore = 9.99;
	}

	/**
	 * Getters and Setters
	 */

	public String getTitle()
	{
		return title;
	}

	public String getGenre()
	{
		return genre;
	}

	public String getRatingMPAA()
	{
		return ratingMPAA;
	}

	public String getReview()
	{
		return review;
	}

	public int getLength()
	{
		return length;
	}

	public LocalDate getReleaseDate()
	{
		return releaseDate;
	}

	public double getStarScore()
	{
		return starScore;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setRatingMPAA(String ratingMPAA)
	{
		this.ratingMPAA = ratingMPAA;
	}

	public void setReview(String review)
	{
		this.review = review;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public void setReleaseDate(LocalDate releaseDate)
	{
		this.releaseDate = releaseDate;
	}

	public void setStarScore(double starScore)
	{
		this.starScore = starScore;
	}

	public String toString()
	{
		String description = "";

		return description;
	}
}
