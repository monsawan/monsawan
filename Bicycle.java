class Bicycle{
	int cadence =0;
	int speed =0;
	int gear =1;

	void changeCadance(int newValue){
		cadence = newValue;
	}

	void changeGear(int newValue){
		gear = newValue;
	}

	void changeSpeedUp(int increment){
		speed = speed + increment;
	}

	void applyBeark(int decrment){
		speed = speed - decrment;
	}

	void printStatas(){
		System.out.println("cadence:"+cadence+"speed:"+speed+"gear:"+gear);
	}
}
