package habilities;

import levels.Level;

public class Punch extends LevelDecorator{
	
	public Punch(Level level){
		this.level = level;
	}
	
	public String getDescription() {
		return level.getDescription() + "Soco forte! ";
	}

}
