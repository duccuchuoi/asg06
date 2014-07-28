package asg06B2;

public class Multiplication implements Experssion{
	
	private Experssion left;
	private Experssion right;
	
	public Multiplication(Experssion left, Experssion right){
		this.left=left;
		this.right=right;
	}

	public asg06B2.Experssion left() {
		return null;
	}

	public asg06B2.Experssion right() {
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+left.toString()+" . "+right.toString()+")";
	}
	
	public int evaluate() {
		// TODO Auto-generated method stub
		return left.evaluate()*right.evaluate();
	}

}
