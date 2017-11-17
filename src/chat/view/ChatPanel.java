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
	
	/**
	 * Sets up the panel
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(chatArea);
		this.add(inputField);
	}
	
	/**
	 * Uses SpringLayout to set up the layout of the GUI
	 */
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, chatArea);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -33, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -25, SpringLayout.EAST, this);
		
	}
	
	/**
	 * Links the buttons and stuff to their appropriate listeners
	 */
	
	private void setupListeners()
	{
		
	}
	
}
