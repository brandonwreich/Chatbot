package chat.view;

import chat.controller.ChatbotController;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

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
	private JButton searchButton;
	private JButton saveButton;
	private JButton loadButton;
	private JButton tweetButton;
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
		chatButton = new JButton("chat", new ImageIcon(getClass().getResource("/chat/view/chat.view.images/chat.png")));
		searchButton = new JButton("seach", new ImageIcon(getClass().getResource("/chat/view/chat.view.images/seach.png")));
		saveButton = new JButton("save", new ImageIcon(getClass().getResource("/chat/view/chat.view.images/search.png")));
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			}
		});
		loadButton = new JButton("load", new ImageIcon(getClass().getResource("/chat/view/chat.view.images/load.png")));
		tweetButton = new JButton("tweet", new ImageIcon(getClass().getResource("/chat/view/chat.view.images/tweet.png")));
		chatArea = new JTextArea(10, 25);
		inputField = new JTextField(20);
		infoLabel = new JLabel("Type to chat with the chatbot");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, tweetButton, 6, SpringLayout.SOUTH, loadButton);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 6, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, -60, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, 56, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, 0, SpringLayout.EAST, chatButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 6, SpringLayout.SOUTH, chatButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, -60, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -128, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, chatButton);
		appLayout.putConstraint(SpringLayout.NORTH, searchButton, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, searchButton, -240, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 6, SpringLayout.SOUTH, searchButton);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, -60, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -184, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, searchButton);

		// Info Label
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -64, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 2, SpringLayout.SOUTH, infoLabel);
		appLayout.putConstraint(SpringLayout.EAST, searchButton, -10, SpringLayout.EAST, this);
		chatScrollPane = new JScrollPane();
		appLayout.putConstraint(SpringLayout.WEST, tweetButton, -78, SpringLayout.EAST, chatScrollPane);
		appLayout.putConstraint(SpringLayout.EAST, tweetButton, 0, SpringLayout.EAST, chatScrollPane);
		appLayout.putConstraint(SpringLayout.NORTH, chatScrollPane, -2147483628, SpringLayout.SOUTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, searchButton, 80, SpringLayout.EAST, chatScrollPane);
		appLayout.putConstraint(SpringLayout.WEST, chatScrollPane, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatScrollPane, -140, SpringLayout.EAST, this);
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
		this.add(searchButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(tweetButton);
		// this.add(checkerButton);
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
		appLayout.putConstraint(SpringLayout.WEST, inputField, 25, SpringLayout.WEST, this);

		// Chat Button
		chatButton.setToolTipText("Send chat");

		// Checker Button
		checkerButton.setToolTipText("Check content");
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 6, SpringLayout.SOUTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 10, SpringLayout.WEST, inputField);
		appLayout.putConstraint(SpringLayout.SOUTH, infoLabel, -2, SpringLayout.NORTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 0, SpringLayout.WEST, checkerButton);
		appLayout.putConstraint(SpringLayout.WEST, infoLabel, 25, SpringLayout.WEST, this);

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

		searchButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});

		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});

		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

			}
		});

		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{

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
				int i = rand.nextInt(100 - 0) + 0;
				String num = i + " \n";
				chatArea.append(num);
			}
		});
	}
}
