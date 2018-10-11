
public class Layout
	{
	static String [][] Layout;
	
	public static void createLayout()
		{
		Layout = new String [4][3];
		for (int i=0; i<4; i++)
			{
			for (int j=0; j<3; j++)
				{
				Layout [i][j]= " ";
				}
			}
		}
	
	public static void display()
		{
		System.out.println("              Room 1       Room 2       Room 3       Room 4       ");
		System.out.println("         ------------------------------------------------------------");
		System.out.println("Level 1  |       " + Layout [0][0] + "|       " + Layout [0][1] + "|       " + Layout [0][2] + " |      " + Layout [0][3] + "|       |");
		}
	}