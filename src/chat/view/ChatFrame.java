package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private ChatbotController appController;
	private ChatPanel appPanel;

	public ChatFrame(ChatbotController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ChatPanel(appController);

		setupFrame();
	}

	/**
	 * Sets up the framework
	 */
	private void setupFrame()
	{
		this.setSize(500, 500);
		this.setTitle("Weclome to Billbot");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public ChatbotController getBaseController()
	{
		return appController;
	}
}