package habilities;

import levels.Level;

public class Fire extends LevelDecorator{
	
	public Fire(Level level){
		this.level = level;
	}
	
	public String getDescription() {
		return level.getDescription() + "Soltar Fogo! ";
	}

}