package asg06A;

public class Square extends Experssion {
	
	private Experssion experssion;
	
	public Square(Experssion experssion){
		
		this.experssion=experssion;
	}
	
	public String tostring(){
		return experssion.toString()+"^2";
	}
	
	public int evaluate(){
		return experssion.evaluate()*experssion.evaluate();
	}

}
