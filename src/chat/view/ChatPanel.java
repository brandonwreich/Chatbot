package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The JPanel subclass for the chatbot project
 * 
 * @author Brandon Reich
 * @version 21/11/2017
 *
 */
public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JTextArea chatArea;
	private JTextField inputField;
	private SpringLayout appLayout;
	private JButton checkerButton;
	private JScrollPane chatScrollPane;
	private JLabel infoLabel;

	/**
	 * Initializes data members and calls methods
	 * 
	 * @param appController
	 */
	public ChatPanel(ChatbotController appController)
	{
		super();
		this.appController = appController;

		// Initialize GUI data members
		chatButton = new JButton("chat");
		inputField = new JTextField(20);
		infoLabel = new JLabel("Type to chat with the chatbot");
		appLayout = new SpringLayout();
		chatScrollPane = new JScrollPane();
		checkerButton = new JButton("Check contents");

		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/*
	 * Sets up the scroll pane
	 */
	private void setupScrollPane()
	{
		chatScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	/**
	 * Sets up the panel
	 */
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(checkerButton);
		this.add(chatScrollPane);
		this.add(inputField);
		this.add(infoLabel);
		chatArea = new JTextArea(10, 25);
		add(chatArea);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);
	}

	/**
	 * Uses SpringLayout to set up the layout of the GUI
	 */

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -33, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatScrollPane, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatScrollPane, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatScrollPane, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 0, SpringLayout.WEST, inputField);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 30, SpringLayout.SOUTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -6, SpringLayout.NORTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, checkerButton);
	}

	/**
	 * Links the buttons and stuff to their appropriate listeners
	 */

	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.interactWithChatbot(userText);
				chatArea.append(displayText);
				inputField.setText("");

			}
		});
		
//		checkerButton.addActionListener(new ActionListener()
//				{
//				public void ationPerformed(ActionEvent click)
//				{
//					String userText = inputField.getText();
//					String displayText = appController.useCheckers(userText);
//					chatArea.append(displayText);;
//					inputField.setText("");
//				}
//				});
	}
}
