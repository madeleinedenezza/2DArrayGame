import java.util.ArrayList;

public class TriviaDatabase
	{
	public static ArrayList<Trivia> questions = new ArrayList<Trivia>();
	public static void fillArray()
		{
		questions.add(new Trivia("Easy", 1, 1, 1, "How many legs does a spider have? \na Four \nb Seven \nc Twenty-five \nd Eight", "d"));
		questions.add(new Trivia("Easy", 1, 1, 2, "Which planet is closest to our sun? \na Saturn \nb Mercury \nc Pluto \nd Earth", "b"));
		questions.add(new Trivia("Easy", 1, 1, 3, "What fictional city is the home of Batman? \na Gotham City \nb Metropolis \nc Emerald City \nd Hogsmeade", "a"));
		questions.add(new Trivia("Easy", 1, 1, 4, "What type of dog has breeds called Scottish, Irish, and Welsh? \na Labrador \nb Chihuahua \nc Terrier \nd Bulldog", "c"));
		questions.add(new Trivia("Easy", 1, 2, 1, "How many Wonders of the World are there? \na Four \nb Eighty-two \nc Seven \nd Six", "c"));
		questions.add(new Trivia("Easy", 1, 2, 2, "What is the tallest mammal? \na The human \nb The giraffe \nc The elephant \nd The Great White shark", "b"));
		questions.add(new Trivia("Easy", 1, 2, 3, "What is the name of the fairy in Peter Pan? \na The Fairy Godmother \nb Tinkerbell \nc Snow White \nd Puck", "b"));
		questions.add(new Trivia("Easy", 1, 2, 4, "What color is the circle on the Japanese national flag? \na Orange \nb Green \nc Brown \nd Red", "d"));
		questions.add(new Trivia("Easy", 1, 3, 1, "Which fruit is the most popular and most consumed fruit in the world? \na Oranges \nb Bananas \nc Apples \nd Kiwi", "b"));
		questions.add(new Trivia("Easy", 1, 3, 2, "What NFL team has the most Superbowl wins? \na The Pittsburgh Steelers \nb The New England Patriots \nc The Detroit Lions \nd The Denver Broncos", "a"));
		questions.add(new Trivia("Easy", 1, 3, 3, "What country is home to the Great Barrier Reef? \na Brazil \nb Italy \nc Australia \nd South Africa", "c"));
		questions.add(new Trivia("Easy", 1, 3, 4, "What movie features a cowboy named Woody? \na Star Wars \nb Fast and Furious \nc Wall-E \nd Toy Story", "d"));
		questions.add(new Trivia("Easy", 1, 4, 1, "Who invented the light bulb? \na Thomas Jefferson \nb Andrew Carnegie \nc Thomas Eddison \nd Cornelius Vanderbilt", "c"));
		questions.add(new Trivia("Easy", 1, 4, 2, "What is the capital city of Utah? \na St. George \nb Ogden \nc Salt Lake City \nd Park City", "c"));
		questions.add(new Trivia("Easy", 1, 4, 3, "What is the most populous city in the world? \na Tokyo \nb New York City \nc Amsterdam \nd Delhi", "a"));
		questions.add(new Trivia("Easy", 1, 4, 4, "What type of fish is Nemo from Finding Nemo \na Starfish \nb Squirrelfish \nc Striped Bass \nd Clownfish", "d"));
		questions.add(new Trivia("Hard", 2, 1, 1, "What was the first nation to give women the right to vote?", "New Zealand"));
		questions.add(new Trivia("Hard", 2, 1, 2, "What country has not fought in a war since 1814?", "Sweden"));
		questions.add(new Trivia("Hard", 2, 1, 3, "Which gas is formed when a hydrogen bomb is detonated?", "Helium"));
		questions.add(new Trivia("Hard", 2, 1, 4, "Who holds the record for the most homeruns in a single major league baseball season?", "Barry Bonds"));
		questions.add(new Trivia("Hard", 2, 2, 1, "The expression 'oy vey' comes from what language?", "Yiddish"));
		questions.add(new Trivia("Hard", 2, 2, 2, "What is the scientific name for the trunk of an elephant?", "Proboscis"));
		questions.add(new Trivia("Hard", 2, 2, 3, "What was the first year that the Rockefeller Center Christmas Tree was put up?", "1933"));
		questions.add(new Trivia("Hard", 2, 2, 4, "What is the name of Mulan's horse?", "Khan"));
		questions.add(new Trivia("Hard", 2, 3, 1, "What is the largest planet in the solar system?", "Jupiter"));
		questions.add(new Trivia("Hard", 2, 3, 2, "Which of Shakespeare's plays is the longest?", "Hamlet"));
		questions.add(new Trivia("Hard", 2, 3, 3, "Who said 'We are more popular than Jesus?'", "John Lennon"));
		questions.add(new Trivia("Hard", 2, 3, 4, "Oil wrestling is the national sport of which country?", "Turkey"));
		questions.add(new Trivia("Hard", 2, 4, 1, "What is the complementary color of red?", "Green"));
		questions.add(new Trivia("Hard", 2, 4, 2, "What is the fear of bees known as?", "Melissophobia"));
		questions.add(new Trivia("Hard", 2, 4, 3, "In which city is the TV show 'Full House' set?", "San Francisco"));
		questions.add(new Trivia("Hard", 2, 4, 4, "What is the study of soil called?", "Pedology"));
		}
	}