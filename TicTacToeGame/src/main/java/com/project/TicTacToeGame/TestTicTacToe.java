package com.project.TicTacToeGame;

import org.junit.Assert;
import org.junit.Test;

public class TestTicTacToe {

	@Test
	public void shouldReturnGameBoard(){
		
		Assert.assertEquals( "'1','2','3'",  TicTacToe.createGameBoard()); 
	}
	
	@Test
	public void shouldReturnTrueIfPlayerEnteredNumberisNotBetweenOneAndNine(){
		
		
		Assert.assertTrue(TicTacToe.checkIfEnteredNumberisValid(9));
	}
	
	@Test
	public void shouldReturnFalseIfPlayerEnteredNumberisNotBetweenOneAndNine(){
		
		
		Assert.assertFalse(TicTacToe.checkIfEnteredNumberisValid(10));
	}
	
	@Test
	public void shouldReturnOIfPlayerXPlayed(){
		
		
		Assert.assertEquals("O",TicTacToe.alternatePlay("X"));
	}
	
}
