
public class Layout
	{
	static String [][] layout;
	
	public static void createLayout()
		{
		layout = new String [4][4];
		for (int i=0; i<4; i++)
			{
			for (int j=0; j<4; j++)
				{
				layout [i][j]= " ";
				}
			}
		}
	
	public static void display()
		{
		System.out.println("            Room 1     Room 2     Room 3     Room 4       ");
		System.out.println("         --------------------------------------------");
		System.out.println("Level 1  |    " + layout [0][0] +"    ||    "+ layout [0][1] +"    ||    " + layout [0][2] +"    ||    " + layout [0][3] + "    |");
		System.out.println("         ============================================");
		System.out.println("Level 2  |    " + layout [1][0] +"    ||    "+ layout [1][1] +"    ||    " + layout [1][2] + "    ||    " + layout [1][3] +"    |");
		System.out.println("         ============================================");
		System.out.println("Level 3  |    " + layout [2][0] +"    ||    " + layout [2][1] + "    ||    " + layout [2][2] + "    ||    " + layout [2][3] +"    |");
		System.out.println("         ============================================");
		System.out.println("Level 4  |    " + layout [3][0] +"    ||    " + layout [3][1] + "    ||    " + layout [3][2] + "    ||    " + layout [3][3] +"    |");
		System.out.println("         --------------------------------------------");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("    -------------------------");
		System.out.println("    | X = where you are     |");
		System.out.println("    |                       |");
		System.out.println("    | O = rooms you have    |");
		System.out.println("    |     completed         |");
		System.out.println("    -------------------------");
		}
	}
