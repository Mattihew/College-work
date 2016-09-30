package com.mattihew.simUDuck.controller;

import com.mattihew.simUDuck.records.Duck;
import com.mattihew.simUDuck.records.MallardDuck;
import com.mattihew.simUDuck.records.behaviours.FlyingBehaviour;
import com.mattihew.simUDuck.records.behaviours.QuackBehaviour;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck(FlyingBehaviour.FLY, QuackBehaviour.QUACK);
		mallard.quack();
		mallard.fly(0);
	}

}
