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
		buildCuteAnimals();
		buildQuestions();
		buildTopics();
	}

	private void buildVerbs()
	{
		verbs [0] = "like";
		verbs [1] = "dislike";
		verbs [2] = "ambivalent about";
		verbs [3] = "am thinking about";
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
		Movie foreverStrong = new Movie ("Forever Strong");
		Movie newsies = new Movie ("Newsies");
		Movie tangeled = new Movie ("Tangeled");
		Movie whileYouWereSleeping = new Movie ("While you were Sleeping");
		Movie becomingJane = new Movie ("Becoming Jane");
		Movie findingNeverland = new Movie ("Finding Neverland");
		Movie aladdin = new Movie ("Aladdin");
		Movie waitress = new Movie ("Waitress");
		Movie beautyAndTheBeast = new Movie ("Beauty and the Beast");
		Movie barbieAndTheDiamondCastle = new Movie ("Barbie and the Diamond Castle");
		Movie mrsDoubtFire = new Movie ("Mrs. Doubtfire");
		Movie flubber = new Movie ("Flubber");
		Movie patchAdams = new Movie ("Patch Adams");
		Movie whiteChristmas = new Movie ("White Christmas");
		Movie aChristmasStory	= new Movie ("A Christmas Story");
		Movie cheaperByTheDozen = new Movie ("Cheaper by the Dozen");
		Movie sharkBoyAndLavaGirl = new Movie ("Shark Boy and Lava Girl");
		Movie bringItOn = new Movie ("Bring it on");
		Movie whiteChicks = new Movie ("White Chicks");
		Movie legallyBlonde = new Movie ("Legally Blonde");
		 
		
		movieList.add(spiderman);
		movieList.add(hiddenFigures);
		movieList.add(happyGilmore);
		movieList.add(nachoLibre);
		movieList.add(youAgain);
		movieList.add(coolRunnings);
		movieList.add(sevenBridesForSevenBrothers);
		movieList.add(foreverStrong);
		movieList.add(newsies);
		movieList.add(tangeled);
		movieList.add(whileYouWereSleeping);
		movieList.add(becomingJane);
		movieList.add(findingNeverland);
		movieList.add(aladdin);
		movieList.add(waitress);
		movieList.add(beautyAndTheBeast);
		movieList.add(barbieAndTheDiamondCastle);
		movieList.add(mrsDoubtFire);
		movieList.add(flubber);
		movieList.add(patchAdams);
		movieList.add(whiteChristmas);
		movieList.add(aChristmasStory);
		movieList.add(cheaperByTheDozen);
		movieList.add(sharkBoyAndLavaGirl);
		movieList.add(bringItOn);
		movieList.add(whiteChicks);
		movieList.add(legallyBlonde);
	}
	
	private void buildShoppingList()
	{
		shoppingList.add("snacks");
		shoppingList.add("veggies");
		shoppingList.add("protein");
		shoppingList.add("fruits");
		shoppingList.add("donuts");
		shoppingList.add("eggs");
		shoppingList.add("hot peppers");
		shoppingList.add("onions");
		shoppingList.add("bagel");
		shoppingList.add("crunchy peanut butter");
		shoppingList.add("hot sauce");
		shoppingList.add("juice");
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
		questions [2] = "Do you have any sisters?";
		questions [3] = "Why is the sky blue?";
		questions [4] = "If you had 3 words left to say, what would they be?";
		questions [5] = "What is your favorite color?";
		questions [6] = "Let's settle this. Crunchy or creamy peanut butter?";
		questions [7] = "How old are you?";
		questions [8] = "What are the color of your eyes?";
		questions [9] = "How big are your feet?";
	}
	
	private void buildTopics()
	{
		topics [0] = " people";
		topics [1] = " breakfast foods";
		topics [2] = " smell of grass being cut";
		topics [3] = " pinapple juice";
		topics [4] = " different types of bread";
		topics [5] = " waffles";
		topics [6] = " grilled cheese sandwiches";
	}
	
	public String processConversation(String input)
	{
		String chatbotResponse = "";
		chatbotResponse += "You said: " + "\n" + input + "\n";
		
		chatbotResponse += buildChatbotResponse();
		
		return chatbotResponse;
	}
		
	private String buildChatbotResponse()
	{
		String response = "I ";
		int random = (int) (Math.random() * verbs.length);
		
		response += verbs[random];
		
		random = (int) (Math.random() * topics.length);
		response += "" + topics[random] + ".\n";
		
		random = (int) (Math.random() * questions.length);
		response += questions[random] + "\n";
				
		random = (int) (Math.random() * 2);
		if (random % 2 == 0)
		{
			random = (int) (Math.random() * movieList.size());
			response += movieList.get(random).getTitle() + "is a great movie!";
		}
		
		return response;
	}
	
	public boolean lengthChecker(String input)
	{
			if (input != null && input.length() >= 2)
			{
				return true;
			}	
		return false;
	}
		
	public boolean htmlTagChecker(String input)
	{
		return false;
	}
	
	public boolean userNameChecker(String input)
	{
		if(input != null && input.contains("@") && !input.contains(".com") && !input.contains("@@")) 
		{
			return true;
		}
		
		return false;
	}
	
	public boolean contentChecker(String contentCheck)
	{
		
		return false;
	}
	
	public boolean cuteAnimalMemeChecker(String input)
	{
		for(int index = 0; index < cuteAnimalMemes.size(); index+= 1)
		{
			if(input != null && input.contains(cuteAnimalMemes.get(index)))
				{
					return true;
				}
		}

		return false;
	}
	
	public boolean shoppingListChecker(String shoppingItem)
	{	
		for(int index = 0; index < shoppingList.size(); index +=1)
		{
			if(shoppingItem != null && shoppingItem.contains(shoppingList.get(index)))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean movieTitleChecker(String title)
	{
//		for(int index = 0; index < movieList.size(); index +=1)
//		{
//			if(title != null && title.contains(movieList.getTitle()))
//				{
//					return true;
//				}
//		}
		return false;
	}
	
	public boolean movieGenreChecker(String genre)
	{		
		return false;
	}

	public boolean quitChecker(String exitString)
	{
		if(exitString != null && exitString.equalsIgnoreCase("quit"))
		{
			return true;
		}
		
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
	
	public String toString()
	{
		String description = "";
		
		return description;
	}
}
