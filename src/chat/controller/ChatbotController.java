package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.view.ChatFrame;

/**
 * 
 * @author Brandon Reich
 *
 */
public class ChatbotController
{
	private PopupDisplay display;
	private Chatbot chatbot;
	private ChatFrame appFrame;

	public ChatbotController()
	{
		chatbot = new Chatbot("Brandon Reich");

		// View initialized after Model
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}

	/**
	 * Start method
	 */
	public void start()
	{
		display.displayText("Welcome to Chatbot");
	}

	/**
	 * Interacts with Billbot. Calls the processConversation method from Chatbot and also the
	 * quitChecker.
	 * 
	 * @param input
	 * @return
	 */
	public String interactWithChatbot(String input)
	{
		String chatbotSays = "";

		if (chatbot.quitChecker(input))

		{
			close();
		}

		chatbotSays += chatbot.processConversation(input);

		return chatbotSays;
	}

	/**
	 * Checks to see if the user has inputed content that will check with one of the checkers.
	 * 
	 * @param text
	 * @return A response based upon if a checker is set true
	 */
	public String useCheckers(String text)
	{
		String response = "";

		if (chatbot.contentChecker(text))
		{
			response += "This text matches the special content. \n";
		}

		if (chatbot.cuteAnimalMemeChecker(text))
		{
			response += "This text matches the cute Animal Memes. \n";
		}

		if (chatbot.htmlTagChecker(text))
		{
			response += "This text matches the html content. \n";
		}

		if (chatbot.keyboardMashChecker(text))
		{
			response += "This text matches the keyboard mash. \n";
		}

		if (chatbot.movieGenreChecker(text))
		{
			response += "This text matches the movie genres. \n";
		}

		if (chatbot.shoppingListChecker(text))
		{
			response += "This text matches the shopping list. \n";
		}

		if (chatbot.userNameChecker(text))
		{
			response += "This text matches the user name content. \n";
		}

		return response;
	}

	/**
	 * Close method. Calls a pop up window that says Goodbye.
	 */
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}

	private String popupChat(String chat)
	{
		// Assigns a valid value to a variable that will be returned for the method
		String chatbotSays = "";

		chatbotSays += chatbot.processConversation(chat);

		return chatbotSays;
	}

	/**
	 * Getters and Setters
	 */

	public Chatbot getChatbot()
	{
		return chatbot;
	}

	public PopupDisplay getDisplay()
	{
		return display;
	}

	public ChatFrame getChatFrame()
	{
		return appFrame;
	}
}
