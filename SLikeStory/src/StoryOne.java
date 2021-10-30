import java.util.Scanner;
import java.awt.Desktop;
import java.net.URISyntaxException;
import java.io.*;

public class StoryOne {
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		String feeling, season, name, color, sport, gender, moodChanger;
		Book book = new Book();
		TongueTwisters verbal = new TongueTwisters();
		Music music = new Music ();
		Desktop desktop = Desktop.getDesktop();
		
		System.out.printf("%40s %n %38s %n %42s %n" ,"(: Hey you :) ","How are you?", "  (.::good/soso/bad::.)" );
		Scanner input = new Scanner(System.in);		
		feeling = input.nextLine();
		System.out.printf("%n %s %n","Ok!, May I ask your name please?");		
		name = input.nextLine();
		
		
		if (feeling.equalsIgnoreCase("soso") ) {
			System.out.println("Let's to change your Mood!" + name.toUpperCase());
		} else if (feeling.equalsIgnoreCase("bad")) {
			System.out.println("Let's do something funny to feel better soso mood " + name.toUpperCase());
		}else {
				System.out.println("Happy "+ name.toUpperCase() + " let's do something funny");
			}
		
//Question Time! ask different question to make story		
		System.out.printf("%n %40s %n %45s" , "let me ask some questions","What is your favourite Color ?");		
		color = input.nextLine();
		System.out.printf("%n %40s %n ", "how about favorite season ? ");
		season = input.nextLine();
		System.out.printf("%n %40s %n ", "and what kind of sport do you prefer ? ");
		sport = input.nextLine(); 
		
		System.out.printf("%n %s %n %s %n %s","wait wait . . ." , "Sorry! I become a bit confuse :|" ,"Are you boy or girl?");
		gender = input.next();
		//input.nextLine();		
		System.out.printf("%n %s %n %s %n %s %n %s %n ",
						  "I guessed correct ;)", "you know : ",
						  "your way of thinking is really speciall! ", 
						  " I've never met a person who like " + color + " and do " + sport );
		
		System.out.printf("%s %n",">>**********>>***>>****>>*******>LET'S START****<<*********<<********<<**********<<");
		
		System.out.printf("%s %n %s %n",
					   	 "which one do you prefer to change your mood?", 
						 "read a book/Verbal challenge/listening to music");
		
		System.out.println("please select B , V or M");
		moodChanger = input.next();
		
		if (moodChanger.equalsIgnoreCase("B")){
				String gener = book.genreOfBook();
					if(gener.equalsIgnoreCase("S")){
						book.sBookName();
						concon();
						
					}else if(gener.equalsIgnoreCase("SF")){
						book.sFBookName();
						concon();
					}else {book.NBookName();
						  concon();}	
					
		}else if (moodChanger.equalsIgnoreCase("V")) {
				String type = verbal.levelOfHardness();
				if(type.equalsIgnoreCase("H")) {
					verbal.hardLevel();
				}else if (type.equalsIgnoreCase("M")){
					verbal.middleLevel();
				}else verbal.easyLevel();	
				
		}else if(moodChanger.equalsIgnoreCase("M")) {
				String style = music.style();
				if(style.equalsIgnoreCase("R")) {						
					desktop.browse(music.Rock());
					
					
				}else if(style.equalsIgnoreCase("P")) {
					desktop.browse(music.Pop());
					
				}else if (style.equalsIgnoreCase("Cl")) {
					desktop.browse(music.Classic());
				}else if(style.equalsIgnoreCase("B")) {
					desktop.browse(music.Blue());
					
				}else {System.out.println("invalid input");
					
				}					
						
		}
				
		
		}
		
		
	 public static void concon() {
		 System.out.println("Lets to continue");
	 }
	

	 }


