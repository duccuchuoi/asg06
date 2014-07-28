package asg06B2;


public class Square implements Experssion {
	
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
