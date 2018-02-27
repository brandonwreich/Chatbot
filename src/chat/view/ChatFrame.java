package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JFrame;

/**
 * 
 * @author Brandon Reich
 *
 */
public class ChatFrame extends JFrame
{
	private ChatbotController appController;
	private ChatPanel appPanel;

	/**
	 * Initializes GUI members and calls helper methods
	 * 
	 * @param appController
	 */
	public ChatFrame(ChatbotController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ChatPanel(appController);

		// Calls setup methods
		setupFrame();
	}

	/**
	 * Sets up the framework
	 */
	private void setupFrame()
	{
		this.setSize(500, 325);
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