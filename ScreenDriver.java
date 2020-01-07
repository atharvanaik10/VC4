/**
 *	Author: 
 *	Date:	
 *	Description: 
 *
 */
 
public class ScreenDriver
{
  
	public static void main(String[]	args)	throws Exception
	{
		Screen myMac =	new Screen();
				
		//	test that a	default Window	can be built 
		myMac.openWindow();
		
		//	test that a	new window can	be	built	in	various sizes and	locations
		myMac.openWindow("AHH",	"This is text.", 5, 25,	10, 20);	
		
		myMac.printScreen();	  // check the	Screen is built correctly
	}
}
