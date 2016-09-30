package com.mattihew.simUDuck.records;

import com.mattihew.simUDuck.records.behaviours.FlyingBehaviour;
import com.mattihew.simUDuck.records.behaviours.QuackBehaviour;

public class RubberDuck extends Duck {

	public RubberDuck(FlyingBehaviour flyType, QuackBehaviour quackType) {
		super(flyType, quackType);
	}

}
