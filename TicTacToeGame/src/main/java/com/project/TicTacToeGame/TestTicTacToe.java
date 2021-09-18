package com.project.TicTacToeGame;

import org.junit.Assert;
import org.junit.Test;

public class TestTicTacToe {

	@Test
	public void shouldReturnGameBoard(){
		
		Assert.assertEquals( "'1','2','3'",  TicTacToe.createGameBoard()); 
	}
	
}
