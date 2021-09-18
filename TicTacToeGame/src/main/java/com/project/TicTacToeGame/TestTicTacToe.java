package com.project.TicTacToeGame;

import org.junit.Assert;
import org.junit.Test;

public class TestTicTacToe {

	@Test
	public void shouldReturnGameBoard(){
		
		Assert.assertEquals( "'1','2','3'",  TicTacToe.createGameBoard()); 
	}
	
	@Test
	public void shouldReturnIfPlayerEnteredNumberIsValid(){
		
		Integer enteredNum = Integer.valueOf(TicTacToe.askUserToEnterNumber()); 
		
		Assert.assertTrue(9 <= enteredNum && 1 <= enteredNum);
	}
	
	
}
