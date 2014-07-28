package asg06A;

public class Numeral extends Experssion {
	
	private int value;
	
	public Numeral(int value){
		this.value=value;
	}
	
	public String toString(){
		return ""+value;
	}
	
	public int evaluate(){
		return value;
	}

}
