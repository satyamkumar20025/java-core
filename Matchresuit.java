package Constructor_Question;

public class Matchresuit {

	String team1;
	String team2;
	int score1;
	int score2;
	public Matchresuit(String team1, String team2, int score1, int score2) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.score1 = score1;
		this.score2 = score2;
	}
	String gitwinner()
	{
		if(score1>score2)
		{
			return team1;
		}
		else if(score2>score1)
		{
			return team2;
		}
		else {
			return "draw";
		}
	}


//	public class Sportstournamet{
		  public static void main(String[] args) {
				Matchresuit p1 = new Matchresuit("kalu","pilu",50,55);
				Matchresuit p2 = new Matchresuit("kalu","pilu",56,55);
				Matchresuit p3 = new Matchresuit("kalu","pilu",50,50);
				 
				System.out.println("winner:"+p1.gitwinner());
				System.out.println("winner:"+p2.gitwinner());
				System.out.println("winner:"+p3.gitwinner());

				
			}
			
		}

//}
	
	

