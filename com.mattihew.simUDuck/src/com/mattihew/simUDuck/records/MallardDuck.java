package com.mattihew.simUDuck.records;

import com.mattihew.simUDuck.records.behaviours.FlyingBehaviour;
import com.mattihew.simUDuck.records.behaviours.QuackBehaviour;

public class MallardDuck extends Duck {
	
	public MallardDuck(FlyingBehaviour flyType, QuackBehaviour quackType) {
		super(flyType, quackType);
	}

	public void display(){
		System.out.println("I am a mallard");
		super.display();
	}
}
