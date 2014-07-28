package asg06B2;

public class Numeral implements Experssion {
	
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
