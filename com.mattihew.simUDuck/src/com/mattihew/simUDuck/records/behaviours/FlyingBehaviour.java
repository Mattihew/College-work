package com.mattihew.simUDuck.records.behaviours;

public enum FlyingBehaviour {

	FLY{
		public void fly(){
			System.out.println("Flying");
		}
	},
	DONT_FLY{
		public void fly(){
			System.out.println("Don't Fly");
		}
	};
	
	public abstract void fly();
}
