package asg06B1;

public class Addtion extends BinaryExperssion {
	
	private Experssion left;
	private Experssion right;
	
	public Addtion(Experssion left, Experssion right){
		this.left=left;
		this.right=right;
	}

	public asg06B1.Experssion left() {
		return null;
	}

	@Override
	public asg06B1.Experssion right() {
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+left.toString()+" + "+right.toString()+")";
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()+right.evaluate();
	}

}
