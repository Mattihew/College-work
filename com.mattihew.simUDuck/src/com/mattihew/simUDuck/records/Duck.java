/**
 * 
 */
package com.mattihew.simUDuck.records;

import com.mattihew.simUDuck.records.behaviours.FlyingBehaviour;
import com.mattihew.simUDuck.records.behaviours.QuackBehaviour;

/**
 * @author Matt
 *
 */
public abstract class Duck
{
	
	private int distance;
	private FlyingBehaviour flyType;
	private QuackBehaviour quackType;
	
	public Duck(FlyingBehaviour flyType, QuackBehaviour quackType)
	{
		this.flyType = flyType;
		this.quackType = quackType;
	}
	
	public void swim(final int dist){
		this.distance += dist;
	}
	
	public void fly(final int dist){
		this.flyType.fly();
	}
	
	public void quack(){
		this.quackType.quack();
	}
	public void display(){
		System.out.println(this);
	}
	
	public String toString(){
		return "Distance swam:" + distance;
	}
}
