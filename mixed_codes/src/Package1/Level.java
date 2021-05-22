package Package1;

public enum Level {
HIGH(3),MEDIUM(2) ,LOW(1);
private int lvlNum;

private Level(int lvlNum) {
	this.lvlNum = lvlNum;
}

public int getLvlNum() {
	return lvlNum;
}

public void setLvlNum(int lvlNum) {
	this.lvlNum = lvlNum;
}	
	
	

}
