/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FX.Animate;
import Control.Control;
import java.util.Random;
/**
 *
 * @author tadah
 */
public class Creature extends Control{
   
    Random rand = new Random();
    protected String name; 
    protected int health;
    protected int mana; 
    protected int damage;
    protected int str; 
    protected String creatureImg;
    
    public float damageVar(){
	float b= (float)(0.5+(3.0-0.5)*rand.nextFloat());
	float c = b*str;
	return c;
    }
public void dealDamage(Creature enemy){
	int dmg = (int) Math.floor(damageVar());
	enemy.setHealth(health-dmg);
        setOut(getName()+" hit "+enemy.getName()+" for "+dmg+" damage! "+ 
                enemy.getName()+ " now has "+enemy.getHealth()+" HP.");
    }
        /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the mana
     */
    public int getMana() {
        return mana;
    }

    /**
     * @param mana the mana to set
     */
    public void setMana(int mana) {
        this.mana = mana;
    }

    /**
     * @return the creatureImg
     */
    public String getCreatureImg() {
        return creatureImg;
    }

    /**
     * @param creatureImg the creatureImg to set
     */
    public void setCreatureImg(String creatureImg) {
        this.creatureImg = creatureImg;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
