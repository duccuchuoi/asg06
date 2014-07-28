package asg06A;

public class Subtraction extends BinaryExperssion {
	
	private Experssion left;
	private Experssion right;
	
	public Subtraction(Experssion left,Experssion right){
		this.left=left;
		this.right=right;
	}
	
	public String toString(){
		return "("+left+"-"+right+")";
	}
	
	public int evaluate(){
		return left.evaluate()-right.evaluate();
	}

}
