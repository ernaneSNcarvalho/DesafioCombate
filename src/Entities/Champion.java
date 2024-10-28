package Entities;

import javax.print.attribute.standard.MediaSize.Other;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return this.armor;
	}
	
	public void takeDamage(Champion other) {
		if(other.attack <= this.armor) {
			life -= 1;
		}else {
			life -= other.attack - armor;
		}
		
	}
	
	public String status() {
		if(life <= 0) {
			return name + ": " + 0 + " de vida (morreu).";
		}else {
			return name + ": " + life + " de vida";
		}
		
	}
	
}
