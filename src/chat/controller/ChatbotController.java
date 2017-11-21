package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;

public class ChatbotController
{
	private PopupDisplay display;
	private Chatbot chatbot;
	
	public ChatbotController()
	{
		chatbot = new Chatbot("Brandon Reich");
		display = new PopupDisplay();
	}
	public void start()
	{
		String response = display.collectResponse("What do you want to talk about?");
		
		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))
		{
			response = popupChat(response);
			response = display.collectResponse(response);
		}
	}
	
	private String popupChat(String chat)
	{
		//Assigns a valid value to a variable that will be returned for the method
		String chatbotSays = "";
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
	}
	
	public String useCheckers(String text)
	{
		String response = "";
		
		if(chatbot.contentChecker(text))
		{
			response += "This text matches the special content\n";
		}
		if(chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
		}
		if(chatbot.keyboardMashChecker(sample))
		{
			response += "";
		}
		
		return response;
	}
}
