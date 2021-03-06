/* CRITTERS Critter4.java
 * EE422C Project 5 submission by
 * <Ashvin Roharia>
 * <ar34426>
 * <16475>
 * <Ram Muthukumar>
 * <rm48763>
 * <16470>
 * Slip days used: <0>
 * Fall 2016
 */

package assignment5;

import assignment5.Critter.CritterShape;

/*
 * Sedentary Critter that rarely moves, but it is more likely move the lower it's energy
 * Will attempt to look in a random direction, if it is empty, will run from a fight
 * if it cannot run, it will give up and choose not to fight
 */
public class Critter4 extends Critter{
	
	@Override
	public String toString(){return "4";}
	
	@Override
	public void doTimeStep() {
		int moveDec = 0;
		if(getEnergy() > 0){
			moveDec = Critter.getRandomInt(getEnergy());
		}
		if(moveDec < 50) walk(Critter.getRandomInt(8));
		
	}

	@Override
	public boolean fight(String oponent) {
		if(look(Critter.getRandomInt(8), true) == null){
			run(Critter.getRandomInt(8));
		}
		return false;
	}

	@Override
	public CritterShape viewShape() { return CritterShape.STAR; }

	@Override
	public javafx.scene.paint.Color viewOutlineColor() { return javafx.scene.paint.Color.CYAN; }
	
	@Override
	public javafx.scene.paint.Color viewFillColor() { return javafx.scene.paint.Color.HOTPINK;}
	

}
