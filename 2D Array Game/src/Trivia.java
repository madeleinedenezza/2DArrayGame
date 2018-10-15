
public class Trivia
	{
	String difficulty;
	int difficultyNumber;
	int level;
	int room;
	String question;
	String answer;
	public Trivia (String d, int di, int l, int r, String q, String a)
		{
		difficulty = d;
		difficultyNumber = di;
		level = l;
		room = r;
		question = q;
		answer = a;
		}
	public String getDifficulty()
		{
		return difficulty;
		}
	public void setDifficulty(String difficulty)
		{
		this.difficulty = difficulty;
		}
	public int getDifficultyNumber()
		{
		return difficultyNumber;
		}
	public void setDifficultyNumber(int difficultyNumber)
		{
		this.difficultyNumber = difficultyNumber;
		}
	public int getLevel()
		{
		return level;
		}
	public void setLevel(int level)
		{
		this.level = level;
		}
	public int getRoom()
		{
		return room;
		}
	public void setRoom(int room)
		{
		this.room = room;
		}
	public String getQuestion()
		{
		return question;
		}
	public void setQuestion(String question)
		{
		this.question = question;
		}
	public String getAnswer()
		{
		return answer;
		}
	public void setAnswer(String answer)
		{
		this.answer = answer;
		}

	}
