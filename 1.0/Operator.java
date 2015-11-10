package edu.iastate.cs228.hw4;

/**
 *  
 * @author
 *
 */

/**
 * 
 * This class represents operators '+', '-', '*', '/', '%', '^', '(', and ')'.  
 * Every operator has an input precedence, a stack precedence, and a rank, as specified 
 * in the table below. 
 * 
 *   operator       input precedence        stack precedence       rank
 *   ___________________________________________________________________ 
 *   +  -                   1                        1              -1
 *   *  /  %                2                        2              -1
 *   ^                      4                        3              -1
 *   (                      5                       -1               0
 *   )                      0                        0               0 
 *
 */

import java.lang.Comparable;

public class Operator implements Comparable<Operator> {
	public char operator; // operator

	private int inputPrecedence; // input precedence of operator in the range
									// [0, 5]
	private int stackPrecedence; // stack precedence of operator in the range
									// [-1, 3]

	/**
	 * Constructor
	 * 
	 * @param ch
	 */
	public Operator(char ch) {
		// TODO
	}

	/**
	 * Returns 1, 0, -1 if the stackPrecedence of this operator is greater than,
	 * equal to, or less than the inputPrecedence of the parameter operator op.
	 * It's for determining whether this operator on the stack should be output
	 * before pushing op onto the stack.
	 */
	@Override
	public int compareTo(Operator op) {
		// TODO
		return -1; // TO MODIFY
	}

	/**
	 * 
	 * @return char Returns the operator character.
	 */
	public char getOp() {
		return operator;
	}
}
