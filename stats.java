
public class stats {
	int lvl;
	int damage;
	int defense;
	int health;
	double exp;
	
	
	public stats() {
		this.lvl=5;
		this.damage=0;
		this.defense=0;
		this.health=500;
		this.exp=0.0;
	}
	public void lvlUp(double exp) {
		if(exp==100)
			lvl++;
	}
	
	public void expUp() {
		exp++;
	}
	
	public void healthChange(int damageReceived) {
		this.health=this.health-(damageReceived-this.defense);
		if(this.health<=0)
			System.out.println("You are dead, Please start over");
	}
	
	public void displaySkills(String nameOfPokemon) throws Exception{
		if(nameOfPokemon=="Charmander")
			System.out.println("Choose from one of the following: \nScratch\nEmber\nSlash\nFlamethrower");
		
		else if(nameOfPokemon=="Squirtle")
			System.out.println("Choose from one of the following: \nTackle\nWater gun\nRapid spin\nWater pulse");
		
		else if(nameOfPokemon=="Bulbasaur")
			System.out.println("Choose from one of the following: \nVine whip\nTackle\nRazor leaf\nTake down");
		else
			throw new Exception("The Pokemon does not exist, please enter the correct name of the Pokemon");
	}
	
	public void setDamage(String skillsName) throws Exception{
		
		if(skillsName=="Scratch")
			this.damage=40;
		else if(skillsName=="Ember")
			this.damage=40;
		else if(skillsName=="Slash")
			this.damage=70;
		else if(skillsName=="Flamethrower")
			this.damage=90;
		else if(skillsName=="tackle")
			this.damage=40;
		else if(skillsName=="Water gun")
			this.damage=40;
		else if(skillsName=="Rapid spin")
			this.damage=20;
		else if(skillsName=="Water pulse")
			this.damage=60;
		else if(skillsName=="Vine whip")
			this.damage=45;
		else if(skillsName=="Razor leaf")
			this.damage=55;
		else if(skillsName=="Take down")
			this.damage=90;
		else
			throw new Exception("Skills does not exist, please select again!");
			
	}
	
	public void damageBonus() {
		this.damage=this.damage+10;
	}
	
	public void damageMinus() {
		this.damage=this.damage-10;
	}
	
	public int getLevel() {
		return this.lvl;
	}
	
	public double getExp() {
		return this.exp;
	}
	
	public int getHealth() {
		return this.health;
	}
}
