import java.util.ArrayList;

public class TriviaDatabase
	{
	public static ArrayList<Trivia> questions = new ArrayList<Trivia>();
	public static void fillArray()
		{
		questions.add(new Trivia("Easy", 1, 1, "How many legs does a spider have? \na Four \nb Seven \nc Twenty-five \nd Eight", "d"));
		questions.add(new Trivia("Easy", 1, 1, "Which planet is closest to our sun? \na Saturn \nb Mercury \nc Pluto \nd Earth", "b"));
		
		
		}
	}
