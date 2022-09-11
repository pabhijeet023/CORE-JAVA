package abstraction;

public class Runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstraction
		
		Chrome ch = new Chrome();
		ch.OpenBrowser();
		ch.Display();     
		
		Browser Br = new Chrome();
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.Display();
	}

}
