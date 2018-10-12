import java.util.Scanner;

public class GameRunner
	{
	
	static Scanner userInput;

	public static void main(String[] args)
		{
		Layout.createLayout();
		Layout.display();
		introduction();
		howToPlay();
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
				+ "\nEach room contains a riddle or trivia question that you must solve in order to move on."
				+ "\nIf you do not answer correctly, you will not move on to the next room, and "
				+ "\nyou will not be able to move to the next level."
				+ "\n\nNow that you know how the game works, you can get started!"
				+ "\nThe Trivia Maze can be played on two different diffculty levels");
		}

	}
