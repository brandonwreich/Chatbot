package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SpringLayout;

public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JTextArea chatArea;
	private JTextField inputField;
	private SpringLayout baseLayout;
	
	public ChatPanel (ChatbotController appController)
	{
		super();
		this.appController = appController;
		chatButton = new JButton("Enter");
		chatArea = new JTextArea();
		inputField = new JTextField();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatButton);
		this.add(chatArea);
		this.add(inputField);
		

	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
