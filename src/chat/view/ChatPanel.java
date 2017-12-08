package chat.view;

import chat.controller.ChatbotController;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

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
	private JButton numberButton;

	/**
	 * Initializes data members and calls method
	 * 
	 * @param appController
	 */
	public ChatPanel(ChatbotController appController)
	{
		super();
		this.appController = appController;

		// Initialize GUI data members
		chatButton = new JButton("Chat");
		chatArea = new JTextArea(10, 25);
		inputField = new JTextField(20);
		infoLabel = new JLabel("Type to chat with the chatbot");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 25, SpringLayout.WEST, this);
		chatScrollPane = new JScrollPane();
		checkerButton = new JButton("Check me");
		numberButton = new JButton("Random Number");
		

		// Call setup methods
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Sets up the scroll pane
	 */
	private void setupScrollPane()
	{
		// Scroll Pane setup
		chatScrollPane.setViewportView(chatArea);
		chatScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		// Chat Area setup
		chatArea.setText("Hello, I am Billbot! What would you like to talk about? \n");
		chatArea.setToolTipText("Billbot's responses show up here");
		chatArea.setWrapStyleWord(true);
		chatArea.setLineWrap(true);
		chatArea.setFont(new Font("Times", Font.BOLD | Font.PLAIN, 12));
		chatArea.setDisabledTextColor(Color.BLACK);
		chatArea.setBackground(Color.WHITE);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);
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
		this.add(numberButton);
	}

	/**
	 * Uses SpringLayout to set up the layout of the GUI
	 */
	private void setupLayout()
	{
		// Input Field
		inputField.setToolTipText("Chat here");
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 25, SpringLayout.WEST, this);

		// Chat Button
		chatButton.setToolTipText("Send chat");
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -33, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -25, SpringLayout.EAST, this);

		// Chat Scroll Pane (Chat Area)
		appLayout.putConstraint(SpringLayout.NORTH, chatScrollPane, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatScrollPane, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatScrollPane, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatScrollPane, -6, SpringLayout.NORTH, infoLabel);

		// Checker Button
		checkerButton.setToolTipText("Check content");
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 6, SpringLayout.SOUTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 10, SpringLayout.WEST, inputField);

		// Info Label
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -6, SpringLayout.NORTH, inputField);
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -2, SpringLayout.NORTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, checkerButton);

		// Random Number Button
		numberButton.setToolTipText("Generate a random number");
		appLayout.putConstraint(SpringLayout.NORTH, numberButton, 0, SpringLayout.NORTH, checkerButton);
		appLayout.putConstraint(SpringLayout.WEST, numberButton, 6, SpringLayout.EAST, checkerButton);
	}

	/**
	 * Links the buttons and stuff to their appropriate listeners
	 */
	private void setupListeners()
	{
		// Sends the chat
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

		// Checks to see if the input is special content
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.useCheckers(userText);
				chatArea.append(displayText);
				;
				inputField.setText("");
			}
		});

		// Generates a random number
		numberButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				Random rand = new Random();
				int i = rand.nextInt(100-0) + 0;
				String num = i + " \n";
				chatArea.append(num);
			}
		});
	}
}
