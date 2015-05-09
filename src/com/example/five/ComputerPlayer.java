package com.example.five;

import java.util.Random;

import android.graphics.Point;
/**
 * @author Administrator
 */
public class ComputerPlayer {
	private ChessType[][] chessMap;
	private int[][] computerMap = new int[GameView.ROWS][GameView.COLS];
	private int[][] playerMap = new int[GameView.ROWS][GameView.COLS];
	// 电脑的棋子颜色
	private ChessType computerType = ChessType.BLACK;
	// 玩家的棋子颜色
	private ChessType playerType = ChessType.WHITE;
	private ChessStatus[] chessStatus = new ChessStatus[4];

	public ComputerPlayer(ChessType[][] chessMap, ChessType computerType,
			ChessType playerType) {
		this.chessMap = chessMap;
		this.playerType = playerType;
		this.computerType = computerType;
	}

	/**
	 * 初始化
	 */
	private void initValue() {
		for (int r = 0; r < GameView.ROWS; r++) {
			for (int c = 0; c < GameView.COLS; c++) {
				computerMap[r][c] = 0;
				playerMap[r][c] = 0;
			}
		}
		for (int i = 0; i < chessStatus.length; i++) {
			chessStatus[i] = ChessStatus.DIED;
		}
	}
}