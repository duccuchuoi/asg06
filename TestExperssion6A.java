package asg06A;

import static org.junit.Assert.*;

import org.junit.Test;

import asg06A.Addtion;
import asg06A.Experssion;
import asg06A.Multiplication;
import asg06A.Numeral;
import asg06A.Square;
import asg06A.Subtraction;


public class TestExperssion6A {

	@Test
	public void testNumeralEvaluate() {
        Experssion two = new Numeral(2);
        assertEquals(2, two.evaluate());
		
	}
	
	@Test
	public void testNumeralToString() {
        Experssion two = new Numeral(2);
        assertEquals("2", two.toString());
       
    }
	
	@Test
    public void testSquareToString() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
        
    }
	
	
	@Test
    public void testSquareEvaluate() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        assertEquals(4, twoSquare.evaluate());
        
    }
	
	@Test
    public void testAdditionEvaluate() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        Experssion twoPlusTwoSquare = new Addtion(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }
	
    @Test
    public void testAdditionToString() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        Experssion twoPlusTwoSquare = new Addtion(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Experssion one = new Numeral(1);
        Experssion threeSquare = new Square(new Numeral(3));
        Experssion threeSquarePlusOne = new Addtion(threeSquare, one);
        Experssion theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }
    
    @Test
    public void testSubtractionEvaluate() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        Experssion twoPlusTwoSquare = new Subtraction(twoSquare, two);
        assertEquals(2, twoPlusTwoSquare.evaluate());
    }
    
    @Test
    public void SubtractionToString() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        Experssion twoPlusTwoSquare = new Subtraction(twoSquare, two);
        assertEquals("(2^2 - 2)", twoPlusTwoSquare.toString());
    }
    
    @Test
    public void SubtractionWithParenthesesToString() {
        Experssion one = new Numeral(1);
        Experssion threeSquare = new Square(new Numeral(3));
        Experssion threeSquarePlusOne = new Subtraction(threeSquare, one);
        Experssion theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 - 1)^2", theBigSquare.toString());
    }
    
    @Test
    public void testMultiplicationEvaluate() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        Experssion twoPlusTwoSquare = new Multiplication(two, twoSquare);
        assertEquals(8, twoPlusTwoSquare.evaluate());
    }
    
    @Test
    public void MultiplicationToString() {
        Experssion two = new Numeral(2);
        Experssion twoSquare = new Square(two);
        Experssion twoPlusTwoSquare = new Multiplication(twoSquare, two);
        assertEquals("(2^2 . 2)", twoPlusTwoSquare.toString());
    }
    
    public void MultiplicationWithParenthesesToString() {
        Experssion one = new Numeral(1);
        Experssion threeSquare = new Square(new Numeral(3));
        Experssion threeSquarePlusOne = new Multiplication(threeSquare, one);
        Experssion theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 - 1)^2", theBigSquare.toString());
    }

}

