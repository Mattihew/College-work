package com.mattihew.simUDuck.records.behaviours;

public enum QuackBehaviour {
	
	QUACK{
		public void quack(){
			System.out.println("QUACK");
		}
	},
	SQUARK{
		public void quack(){
			System.out.println("SQUARK");
		}
	},
	NO_QUACK{
		public void quack(){
			System.out.println("shh...");
		}
	};
	
	public abstract void quack();
}
