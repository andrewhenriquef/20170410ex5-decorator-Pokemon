package habilities;
import levels.*;

public class Wind extends LevelDecorator{
	
	public Wind(Level level){
		this.level = level;
	}
	
	public String getDescription() {
		return level.getDescription() + "Rajada de vento! ";
	}

}