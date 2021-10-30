import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.util.Random;
import java.net.URISyntaxException;

public class Music {
	

	Scanner input = new Scanner(System.in);
	static Random random = new Random();
	
	public String style() {
		
		System.out.println("What is your listening mood? Rock ->R/ Pop->P / Classic->Cl / Blue->B / Country ->Co ");
		String style = input.nextLine();
		return style;
	}
//*********************************Pop Music**********************************************		
public static URI Pop() throws URISyntaxException {		
		String[] popPlayList = 	{"https://www.youtube.com/watch?v=SlPhMPnQ58k",
								 "https://www.youtube.com/watch?v=JGwWNGJdvx8",
								 "https://www.youtube.com/watch?v=pRpeEdMmmQ0&list=RDGMEMQ1dJ7wXfLlqCjwV0xfSNbA&start_radio=1&rv=JGwWNGJdvx8"};						
		
		int index = random.nextInt(popPlayList.length);
		return new URI(popPlayList[index]);
	}
	
//***********************************Rock Music*******************************************	
	
public static URI Rock() throws URISyntaxException {	
	String[] rockPlayList = 	{"https://www.youtube.com/watch?v=hTWKbfoikeg"};				
				
	int index = random.nextInt(rockPlayList.length);
	return new URI (rockPlayList[index]);
}

//*******************************Blue Music************************************************	

public static URI Blue() throws URISyntaxException {	
	String[] bluePlayList = {"https://www.youtube.com/watch?v=hTWKbfoikeg",
							 "https://www.youtube.com/watch?v=fJ9rUzIMcZQ" };				
				
	int index = random.nextInt(bluePlayList.length);
	return new URI (bluePlayList[index]);
}

//*********************************Country Music*******************************************	
public static URI Country() throws URISyntaxException {	
	String[] countryPlayList = {"https://www.youtube.com/watch?v=jZhQOvvV45w",
							    "https://www.youtube.com/watch?v=ZEWGyyLiqY4" };				
				
	int index = random.nextInt(countryPlayList.length);
	return new URI (countryPlayList[index]);
}
//*******************************Classical Music *******************************************	
public static URI Classic() throws URISyntaxException {	
	String[] countryPlayList = {"https://www.youtube.com/watch?v=EJC-_j3SnXk",
							    "https://www.youtube.com/watch?v=wfF0zHeU3Zs",
							    "https://www.youtube.com/watch?v=aeEmGvm7kDk&list=RDwfF0zHeU3Zs&index=2",
							    "https://www.youtube.com/watch?v=PaXKf0JEzEA&list=RDwfF0zHeU3Zs&index=3",
							    "https://www.youtube.com/watch?v=qsoBpBuhb5o&list=RDwfF0zHeU3Zs&index=6",
							    "https://www.youtube.com/watch?v=vAeRzW98IFw&list=RDwfF0zHeU3Zs&index=8",
							    "https://www.youtube.com/watch?v=sdduPpnqre4&list=RDwfF0zHeU3Zs&index=9",
							    "https://www.youtube.com/watch?v=j5LzEASx4YM&list=RDwfF0zHeU3Zs&index=15",
							    "https://www.youtube.com/watch?v=p29JUpsOSTE&list=RDwfF0zHeU3Zs&index=17"};				
				
	int index = random.nextInt(countryPlayList.length);
	return new URI(countryPlayList[index]);
}




	}
	














//	throws Exception
//    {
//        Desktop desk = Desktop.getDesktop();
//        
//        // now we enter our URL that we want to open in our
//        // default browser
//        desk.browse(new URI("http://xyz.com"));
//    }
//}
	
	
		
//	Runtime rt = Runtime.getRuntime();
//	String url = "http://www.youtube.com";
//	  try {	   
//		  rt.exec("rundll32 url.dll,FileProtocolHandler" + url);  
//	 }catch (IOException e) {
//		  e.printStackTrace();
//	  }
//	}

