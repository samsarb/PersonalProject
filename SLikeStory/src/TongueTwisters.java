import java.util.Scanner;

public class TongueTwisters {
	
	Scanner inputV = new Scanner(System.in);

	
	public String levelOfHardness() {
		System.out.printf("%s %n %s %n %s","How you are fast and your mind freinds with your tongue! ", 
				"tell me which level you selct?" , " Hard :O/ Middle :~ / Easy :D     Select H/M/E");
		String level = inputV.nextLine();
		return level;
	}
	
	public void hardLevel() {
			System.out.printf("%s%n%s","you are so brave that you select this level !", "tell 5 times : "
					+ "If two witches would watch two watches, which witch would watch which watch");
			}

	public void middleLevel() {
		System.out.println("Tell 4 times : /n Can you can a can as a canner can can a can?");
		}

	public void easyLevel() {
		System.out.println("Tell 3 Times : /n I scream, you scream, we all scream for ice cream!");
		}
}
