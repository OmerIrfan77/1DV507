package oi222ay_assign3.ex7;

public class NorseGod {
	private String name;
	private String race;
	private String desc;
	
	public NorseGod(){
		
	}
	
	public NorseGod(String name, String race, String desc) {
		this.name = name;
		this.race = race;
		this.desc = desc;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getRace(){
		return this.race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return this.getName();
	}
	
	public String raceToString() {
		return "\n" + this.getRace();
	}
	
	public String descToString() {
		return "\n" + "\n" + this.getDesc();
	}

}
