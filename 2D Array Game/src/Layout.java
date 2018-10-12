
public class Layout
	{
	static String [][] Layout;
	
	public static void createLayout()
		{
		Layout = new String [4][4];
		for (int i=0; i<4; i++)
			{
			for (int j=0; j<4; j++)
				{
				Layout [i][j]= " ";
				}
			}
		}
	
	public static void display()
		{
		System.out.println("            Room 1     Room 2     Room 3    Room 4       ");
		System.out.println("         --------------------------------------------");
		System.out.println("Level 1  |        " + Layout [0][0] + "||        " + Layout [0][1] + "||       " + Layout [0][2] + " ||        " + Layout [0][3] + "|");
		System.out.println("         ============================================");
		System.out.println("Level 2  |        " + Layout [1][0] + "||        " + Layout [1][1] + "||       " + Layout [1][2] + " ||        " + Layout [1][3] + "|");
		System.out.println("         ============================================");
		System.out.println("Level 3  |        " + Layout [2][0] + "||        " + Layout [2][1] + "||       " + Layout [2][2] + " ||        " + Layout [2][3] + "|");
		System.out.println("         ============================================");
		System.out.println("Level 4  |        " + Layout [3][0] + "||        " + Layout [3][1] + "||       " + Layout [3][2] + " ||        " + Layout [3][3] + "|");
		System.out.println("         --------------------------------------------");
		}
	}
	//hello!! I am typing this at home!!