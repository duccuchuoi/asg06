package asg06B1;

public  class Numeral extends Experssion{
	
	private int value;
	
	public Numeral(int value){
		this.value=value;
	}

	public String toString() {
		return ""+value;
	}


	public int evaluate() {
		return value;
	}

}
