package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JTextArea chatArea;
	private JTextField inputField;
	private SpringLayout appLayout;
	private JButton checkerButton;

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
		chatArea = new JTextArea(10, 25);
		inputField = new JTextField(20);
		appLayout = new SpringLayout();
<<<<<<< HEAD
//		checkerButton = new JButton("Check me");
=======
		checkerButton = new JButton("Check me");
		
>>>>>>> master

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
<<<<<<< HEAD
//		this.add(checkerButton);
=======
		this.add(checkerButton);
>>>>>>> master
		this.add(chatArea);
		this.add(inputField);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);
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
<<<<<<< HEAD
=======
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 0, SpringLayout.WEST, inputField);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 30, SpringLayout.SOUTH, inputField);
>>>>>>> master

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
<<<<<<< HEAD
=======
		
		checkerButton.addActionListener(new ActionListener()
				{
				public void ationPerformed(ActionEvent click)
				{
					String userText = inputField.getText();
					String displayText = appController.useCheckers(userText);
					chatArea.append(displayText);;
					inputField.setText("");
				}
				});
>>>>>>> master
	}

}
