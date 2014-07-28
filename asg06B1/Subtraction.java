package asg06B1;

public class Subtraction extends BinaryExperssion{
	
	private Experssion left;
	private Experssion right;
	
	public Subtraction(Experssion left, Experssion right){
		this.left=left;
		this.right=right;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+left.toString()+" - "+right.toString()+")";
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()-right.evaluate();
	}

	@Override
	public Experssion left() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Experssion right() {
		// TODO Auto-generated method stub
		return null;
	}

}
