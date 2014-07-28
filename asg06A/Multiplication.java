package asg06A;

public class Multiplication extends Experssion{
	
	private Experssion left;
	private Experssion right;
	
	public Multiplication(Experssion left,Experssion right){
		this.left=left;
		this.right=right;
	}
	
	public String toString(){
		return "("+left+"."+right+")";
	}
	
	public int evaluate(){
		return left.evaluate()*right.evaluate();
	}

}
