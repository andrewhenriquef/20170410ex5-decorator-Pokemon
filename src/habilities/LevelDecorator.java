package habilities;

import levels.Level;

public abstract class LevelDecorator extends Level {
	
	public Level level;
	
	public abstract String getDescription();
	
}
