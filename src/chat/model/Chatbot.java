package chat.model;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;
import chat.model.Movie;
import java.lang.String;

public class Chatbot
{
	private List<Movie> movieList;
	private List<String> shoppingList;
	private List<String> cuteAnimalMemes;
	private String [] verbs;
	private String [] topics;
	private String [] followUps;
	private String [] questions;
	private String username;
	private String content;
	private String intro;
	private LocalTime currentTime;
	
	public Chatbot(String username)
	{
		this.movieList = new ArrayList<Movie>();
		this.shoppingList = new ArrayList<String>();
		this.cuteAnimalMemes = new ArrayList<String>();
		this.questions = new String [10];
		this.username = username;
		this.content = null;
		this.intro = null;
		this.currentTime = null;
		this.topics = new String [7];
		this.verbs = new String [4];
		this.followUps = new String [5];
		
		buildVerbs();
		buildMovieList();
		buildShoppingList();
		buildQuestions();
		buildCuteAnimals();
	}

	private void buildVerbs()
	{
		verbs [0] = "like";
		verbs [1] = "dislike";
		verbs [2] = "ambivalent about";
		verbs [3] = "am thinking";
	}
	
	private void buildMovieList()
	{
		Movie spiderman = new Movie ("Spiderman");
		Movie hiddenFigures = new Movie ("Hidden Figures");
		Movie happyGilmore = new Movie ("Happy Gilmore");
		Movie nachoLibre = new Movie ("Nacho Libre");
		Movie youAgain = new Movie ("You Again");
		Movie coolRunnings = new Movie ("Cool Runnings");
		Movie sevenBridesForSevenBrothers = new Movie ("Seven Brides for Seven Brothers");
		Movie starWars = new Movie ("Star Wars");
		Movie foreverStrong = new Movie ("Forever Strong);");
		
		movieList.add(spiderman);
		movieList.add(hiddenFigures);
		movieList.add(happyGilmore);
		movieList.add(nachoLibre);
		movieList.add(youAgain);
		movieList.add(coolRunnings);
		movieList.add(sevenBridesForSevenBrothers);
		movieList.add(starWars);
		movieList.add(foreverStrong);
	}
	
	private void buildShoppingList()
	{
		shoppingList.add("snacks");
		shoppingList.add("veggies");
		shoppingList.add("protein");
		shoppingList.add("fruits");
		shoppingList.add("donuts");
	}
	
	private void buildCuteAnimals()
	{
		cuteAnimalMemes.add("pupper");
		cuteAnimalMemes.add("otter");
		cuteAnimalMemes.add("kittie");
		cuteAnimalMemes.add("floofer");
	}
	
	private void buildQuestions()
	{
		questions [0] = "What is your  name?";
		questions [1] = "What do you like to do?";
		questions [2] = "What kind of movies do you like?";
		questions [3] = "Do you like to shop?";
		questions [4] = "What do you like to shop for?";
		questions [5] = "What is your favorite color?";
		questions [6] = "What is your favorite movie?";
		questions [7] = "How old are you?";
		questions [8] = "What are the color of your eyes?";
		questions [9] = "How big are your feet?";
	}
	
	public String processConversation(String input)
	{
		return null;
	}
	
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		
			if (input != null && input.length() > 2)
			{
				validLength = true;
			}
		
		return validLength;
	}
	
	public boolean htmlTagChecker(String input)
	{
		return false;
	}
	
	public boolean userNameChecker(String input)
	{
		return false;
	}
	
	public boolean contentChecker(String contentCheck)
	{
		return false;
	}
	
	public boolean cuteAnimalMemeChecker(String input)
	{
		boolean validInput = false;
		
		if(input.contains("floofer") || 
				input.contains("pupper") || 
				input.contains("kittie") || 
				input.contains("otter"))
		{
			validInput = true;
		}
		return validInput;
	}
	
	public boolean shoppingListChecker(String shoppingItem)
	{
		boolean validShoppingItem = false;
			
		if (shoppingItem.contains("snacks") || 
				shoppingItem.contains("protein") || 
				shoppingItem.contains("fruits") ||
				shoppingItem.contains("veggies") ||
				shoppingItem.contains("donuts"))
		{
			validShoppingItem = true;
		}
		
		return validShoppingItem;
	}
	
	public boolean movieTitleChecker(String title)
	{
		
		boolean validTitle = false;
			
//		if()
//		{
//			validTitle = true;
//		}
		
		return validTitle;
	}
	
	public boolean movieGenreChecker(String genre)
	{
		return false;
	}

	public boolean quitChecker(String exitString)
	{
		return false;
	}

	public boolean keyboardMashChecker(String sample)
	{
		return false;
	}
	
	public List<Movie> getMovieList()
	{
		return movieList;
	}
	
	public List<String> getShoppingList()
	{
		return shoppingList;
	}
	
	public List<String> getCuteAnimalMemes()
	{
		return cuteAnimalMemes;
	}

	public String [] getQuestions()
	{
		return questions;
	}
	
	public String[] getVerbs()
	{
		return verbs;
	}

	public String[] getTopics()
	{
		return topics;
	}

	public String[] getFollowUps()
	{
		return followUps;
	}

	public String getUsername()
	{
		return username;
	}
	
	public String getContent()
	{
		return content;
	}

	public String getIntro()
	{
		return null;
	}
	
	public LocalTime getCurrentTime()
	{
		return null;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
