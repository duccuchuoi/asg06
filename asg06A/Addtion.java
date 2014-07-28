package asg06A;

public class Addtion extends BinaryExperssion{
	
	private Experssion left;
	private Experssion right;
	
	public Addtion(Experssion left,Experssion right){
		this.left = left;
		this.right = right;
	}
	
	public String toString(){
		return "("+left.toString()+" + "+right.toString()+")";
	}
	
	public int evaluate(){
		return left.evaluate()+right.evaluate();
	}

}
