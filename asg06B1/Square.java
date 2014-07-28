package asg06B1;

public class Square extends Experssion{
	
	private Experssion experssion;
	
	public Square(Experssion experssion){
		this.experssion=experssion;
	}
	
	public String toString(){
		return ""+experssion.toString()+"^2";
	}
	
	public int evaluate(){
		return experssion.evaluate()*experssion.evaluate();
	}

}
