package application;

import habilities.Fire;
import habilities.Punch;
import habilities.Wind;
import levels.Level;
import levels.Level1;
import levels.Level2;
import levels.Level3;

public class Pokemon {

	public static void main(String[] args) {

		Level fase1 = new Level1();
		fase1 = new Punch(fase1);
		showData(fase1);
		
		
		Level fase2 = new Level2();
		fase2 = new Punch(fase2);
		fase2 = new Fire(fase2);
		showData(fase2);
	
		Level fase3 = new Level3();
		fase3 = new Punch(fase3);
		fase3 = new Fire(fase3);
		fase3 = new Wind(fase3);
		showData(fase3);
	}
	
	

	public static void showData(Level level){
		System.out.println("----------------->");
		System.out.println(level.getDescription());
	}
}
