package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private ChatbotController chatController;
	
	public ChatFrame(ChatbotController chatController)
	{
		super();
		this.chatController = chatController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Chatbot");
		this.setSize(500,500);
		this.setVisible(true);
	}
}
