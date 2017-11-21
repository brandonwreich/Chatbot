package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.view.ChatFrame;

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

	public void start()
	{
		display.displayText("Welcome to Chatbot");
	}

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

	public String useCheckers(String text)
	{
		String response = "";

		if (chatbot.contentChecker(text))
		{
			response += "This text matches the special content";
		}

		if (chatbot.cuteAnimalMemeChecker(text))
		{
			response += "This text matches the cute Animal Memes";
		}

		if (chatbot.htmlTagChecker(text))
		{
			response += "This text matches the html content";
		}

		if (chatbot.keyboardMashChecker(text))
		{
			response += "This text matches the keyboard mash";
		}

		if (chatbot.movieGenreChecker(text))
		{
			response += "This text matches the movie genres";
		}

		if (chatbot.shoppingListChecker(text))
		{
			response += "This text matches the shopping list";
		}

		if (chatbot.userNameChecker(text))
		{
			response += "This text matches the user name content";
		}

		return response;
	}

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
}
