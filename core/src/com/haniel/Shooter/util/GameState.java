package com.haniel.Shooter.util;

public class GameState {
	public int numContinues, checkPoint, numLevel, score, numSkips;
	//public int [] scores = {0, 0, 0, 0, 0};
	//public int [] levelMaxes ={1060,1100,750,1300,980};
	public int [] level1checkPoints = {0, 4290, 9190, 13990};
	public int [] level2checkPoints = {0, 6890, 10790, 18390};
	public int [] level3checkPoints = {0, 5940, 11490};
	public int [] level4checkPoints = {0, 4990, 13590};
	public int [] level5checkPoints = {0, 5090, 13890, 20990};
	
	public GameState(int numLevel, int checkPoint, int numContinues) {
		this.numContinues = numContinues;
		this.checkPoint = checkPoint;
		this.numLevel = numLevel;
	}
	public int getCheckpoint() {
		switch (numLevel) {
			case 2: {
				return level2checkPoints[checkPoint];
			}
			case 3: {
				return level3checkPoints[checkPoint];
			}
			case 4: {
				return level4checkPoints[checkPoint];
			}
			case 5: {
				return level5checkPoints[checkPoint];
			}
			default: {
				return level1checkPoints[checkPoint];
			}
			
		}

	}
	public int[] getCheckpoints(int numLevel) {
		switch (numLevel) {
			case 2: {
				return level2checkPoints;
			}
			case 3: {
				return level3checkPoints;
			}
			case 4: {
				return level4checkPoints;
			}
			case 5: {
				return level5checkPoints;
			}
			default: {
				return level1checkPoints;
			}
		}		
	}
}
