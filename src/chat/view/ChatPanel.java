package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JPanel;

import java.awt.Color;

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
	private SpringLayout appLayout;
	
	public ChatPanel (ChatbotController appController)
	{
		super();
		this.appController = appController;
		
		//Initialize GUI data members
		chatButton = new JButton("chat");
		chatArea = new JTextArea(10, 25);
		inputField = new JTextField(20);
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.cyan);
		this.setLayout(appLayout);
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
