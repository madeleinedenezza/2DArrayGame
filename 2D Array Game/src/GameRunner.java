import java.util.Scanner;

public class GameRunner
	{
	
	static Scanner userInput;
	static int difficultyChoice;

	public static void main(String[] args)
		{
		TriviaDatabase.fillArray();
		Layout.createLayout();
		introduction();
		howToPlay();
		Layout.display();
		chooseLevel();
		playTheGame();
		}

	private static void introduction()
		{
		userInput= new Scanner(System.in);
		System.out.println("Hello! Welcome to the Trivia Maze. "
				+ "\nWhat is your name?");
		String name= userInput.nextLine();
		System.out.println("Hello " + name + "! If you are ready to start playing the Trivia Maze press enter!");
		String pressEnter= userInput.nextLine();
		}

	private static void howToPlay()
		{
		System.out.println("Before we start, you must learn how to play the Trivia Game."
				+ "\n\nThe Trivia Maze is a game that will take you through four levels."
				+ "\nEach level contains four rooms. In order to beat each level, you must get through all the rooms."
				+ "\nEach room contains a trivia question that you must solve in order to move on."
				+ "\nIf you do not answer correctly, you will not move on to the next room, and "
				+ "\nyou will not be able to move to the next level."
				+ "\n");
		}
	
	private static void chooseLevel()
		{
		System.out.println(	"\n\nThis chart will tell you what level you are on, the room you are in, and the rooms/levels you have completed."
				+ "\n\nThe Trivia Maze can be played on two different diffculty levels:"
				+ "\n 1 Easy"
				+ "\n 2 Hard"
				+ "\nPlease choose the number that corresponds with the level you would like to play on...");
		int difficultyChoice= userInput.nextInt();
		if (difficultyChoice==1) 
			{
			System.out.println("\nYou chose the easy difficulty!"
					+ "\nSince you chose easy, you will be given trivia questions with multiple choice answers."
					+ "\nWhen you type in your answer, just simply type the letter that corresponds with the answer you are choosing."
					+ "\nTime to get started!!"
					+ "\n\n");
			}
		else if (difficultyChoice==2)
			{
			System.out.println("You chose the hard difficulty! Way to challenge yourself!"
					+ "\nSince you chose hard, you will NOT get multiple choice options, so you gotta know your stuff!"
					+ "\nWhen you type your answer, make sure you are using correct spelling AND you capitalize the first letter of each word you type!"
					+ "\n\nGood luck!! Time to get started!"
					+ "\n\n");
			}
		}
	
	private static void playTheGame()
		{
		int counter = 0;
			if (difficultyChoice==questions.getCounter().getDifficultyNumber())
				{
				
				}
			}
		}






