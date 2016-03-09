package bookDatabase;



public class Bookdatabase {
	
	
	public static Bookdata getBookDB (String sku)
	{
		Bookdata dbbook;
		
		switch(sku)
		{
		case ("java1001"):
		{
			dbbook = new Bookdata ("Java1001", 
					"Head First Java", 
					"Kathy Sierra and Bert Bates", 
					"Easy to read Java workbook", 
					47.50);
			
			//dbbook.setSKU("Java1001");
			//dbbook.settitle("Head First Java");
			//dbbook.setAuthor("Kathy Sierra and Bert Bates");
			//dbbook.setdescription("Easy to read Java workbook");
			//dbbook.setPrice(47.50);
			
			break;
		}
		case ("java1002"):
		{
			dbbook = new Bookdata ("Java1002", 
					"Thinking in Java", 
					"Bruce Eckel", 
					"Details about Java under the hood", 
					20.00);
//			dbbook.setSKU("Java1002");
//			dbbook.settitle("Thinking in Java");
//			dbbook.setAuthor("Bruce Eckel");
//			dbbook.setdescription("Details about Java under the hood");
//			dbbook.setPrice(20.00);
			break;
		}
		case ("orcl1003"):
		{
			dbbook = new Bookdata ("Orcl1003", 
					"OCP: Oracle Certified Professional Java SE", 
					"Jeanne Boyarsky", 
					"Everything you need to know in one place", 
					45.00);
//			dbbook.setSKU("Orcl1003");
//			dbbook.settitle("OCP: Oracle Certified Professional Java SE");
//			dbbook.setAuthor("Jeanne Boyarsky");
//			dbbook.setdescription("Everything you need to know in one place");
//			dbbook.setPrice(45.00);
			break;
			
		}
		case ("python1004"):
		{
			
			dbbook = new Bookdata ("Python1004", 
					"Automate the Boring Stuff with Python", 
					"Al Sweigart", 
					"Fun with Python", 
					10.00);
//			dbbook.setSKU("Python1004");
//			dbbook.settitle("Automate the Boring Stuff with Python");
//			dbbook.setAuthor("Al Sweigart");
//			dbbook.setdescription("Fun with Python");
//			dbbook.setPrice(10.00);
			break;
		}
		case ("zombie1005"):
		{
			dbbook = new Bookdata ("Zombie1005", 
					"The Maker's Guide to the Zombie Apocalypse", 
					"Simon Monk", 
					"Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",
					16.50);
//			dbbook.setSKU("Zombie1005");
//			dbbook.settitle("The Maker's Guide to the Zombie Apocalypse");
//			dbbook.setAuthor("Simon Monk");
//			dbbook.setdescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
//			dbbook.setPrice(16.50);
			break;
			
		}
		case ("rasp1006"):
		{
			dbbook = new Bookdata ("Rasp1006", 
					"Raspberry Pi Projects for the Evil Genius", 
					"Donald Norris", 
					"A dozen fiendishly fun projects for the Raspberry Pi!", 
					14.75);
//			dbbook.setSKU("Zombie1005");
//			dbbook.settitle("Raspberry Pi Projects for the Evil Genius");
//			dbbook.setAuthor("Donald Norris");
//			dbbook.setdescription("A dozen fiendishly fun projects for the Raspberry Pi!");
//			dbbook.setPrice(14.75);
			break;
		}
		default:
		{
			dbbook = new Bookdata ("", "", "", "", 0);
//			dbbook.setSKU("");
//			dbbook.settitle("");
//			dbbook.setAuthor("");
//			dbbook.setdescription("");
//			dbbook.setPrice(0.0);
			break;
			
		}
		}
		return dbbook;
		
	}


	
	

}

