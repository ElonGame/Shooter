package com.haniel.Shooter.level;

import com.badlogic.gdx.Gdx;
import com.haniel.Shooter.GameScreen;
import com.haniel.Shooter.entities.enemies.BasicBlueEnemy;
import com.haniel.Shooter.entities.enemies.BlueSaucer;
import com.haniel.Shooter.entities.enemies.ImprovedBlueEnemy;
import com.haniel.Shooter.entities.enemies.ImprovedBlueSaucer;
import com.haniel.Shooter.entities.enemies.QuickBlue;
import com.haniel.Shooter.graphics.BackgroundImage;
import com.haniel.Shooter.graphics.BackgroundPlanet;
import com.haniel.Shooter.graphics.CheckpointReached;
import com.haniel.Shooter.util.Coord;

public class LevelFirst extends Level{
	//checkpoints:
	//4290 for ufo's 
	// 9190 for quickenemywaves 
	//13490 for boss
	
		
	public LevelFirst(GameScreen gameScreen) {
		super(gameScreen);
		backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("music/black_vortex.mp3"));
	}
	
	public void runLevel(GameScreen g) {
		
		
		levelTime += 10;
		switch (levelTime) {
		
			case 10: {
				add(new BackgroundImage("levels/space_background2.png", 0, 0, .02f));
		        add(new BackgroundImage("levels/space_background2.png", 0, 960, .02f));
				add(new BackgroundPlanet("textures/black_planet.png", 0, -200, .4f, 400));
		        backgroundMusic.play();
				break;
			}
		
			case 200: { 
				break;
			}		
			case 800: {
				addStars(20);
				break;
			}
			case 900: {
				addStars(20);
				break;
			}	
			case 1000: {
				addStars(20);
				break;
			}	
			case 1100: {
				addStars(20);
				break;
			}	
		
			case 1300: {
				addStars(20);
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			
			case 1370: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				addStars(20);
				break;
			}
			case 1440: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));			
				break;
			} 
			case 1510: {
				addStars(20);
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 1580: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				addStars(20);
				break;
			} 
			case 1660: {
				addStars(20);
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 1730: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 1800: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 1870: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 1940: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 2010: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 
			case 2080: {
				add(new BasicBlueEnemy(800, 480, Coord.topRightMiddleLeaveTop, this));
				add(new BasicBlueEnemy(-60, 480, Coord.topLeftMiddleLeaveTop, this));
				break;
			} 			
			case 2450: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2520: {
				add(new BasicBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new BasicBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2590: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2660: {
				add(new BasicBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new BasicBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2740: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2810: {
				add(new BasicBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new BasicBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2880: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 2950: {
				add(new BasicBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new BasicBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 3020: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 3090: {
				add(new BasicBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new BasicBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 3160: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 3230: {
				add(new BasicBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new BasicBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}			
			case 3300: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
			case 3370: {
				add(new ImprovedBlueEnemy(800, 420, Coord.straightleftaroundtop, this));
				add(new ImprovedBlueEnemy(-60, 360, Coord.straightrightaroundtop, this));
				break;
			}
	
			case 4300: {
				if (gameScreen.getCheckPoint() + 10 == levelTime) {
					add(new BackgroundImage("levels/space_background2.png", 0, 0, .02f));
					add(new BackgroundImage("levels/space_background2.png", 0, 960, .02f));
					backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("music/black_vortex_firstContinue.mp3"));
					backgroundMusic.play();
					addStarsCheckpoint(100);
				} else {
					add(new CheckpointReached(300, 350, 2));
					gameScreen.setCheckPoint(levelTime - 10);
				}
				add(new BlueSaucer(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new BlueSaucer(-150, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 7400: {
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				addStars(20);
				break;
			}
			case 7800: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				addStars(20);
				break;
			}
			case 8200: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 8600: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 9200: {
				//checkpoint
				if (gameScreen.getCheckPoint() + 10 == levelTime) {
					add(new BackgroundImage("levels/space_background2.png", 0, 0, .02f));
					add(new BackgroundImage("levels/space_background2.png", 0, 960, .02f));
					backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("music/black_vortex_secondContinue.mp3"));
					backgroundMusic.play();
					addStarsCheckpoint(100);
				} else {
					add(new CheckpointReached(300, 350, 2));
					gameScreen.setCheckPoint(levelTime - 10);
				}
				break;
			}			
			case 9600: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				addStars(20);
				break;
			}
			case 9640: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				addStars(20);
				break;
			}
			case 9680: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 9720: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 9760: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 9800: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 10500: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				addStars(20);
				break;
			}
			case 10540: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				addStars(20);
				break;
			}
			case 10580: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 10620: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 10640: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 10680: {
				add(new QuickBlue(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new QuickBlue(-30, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			case 10700: {
				add(new ImprovedBlueSaucer(800, 175, Coord.circlenearrighttopslowlyforawhilethenleave, this));
				add(new ImprovedBlueSaucer(-150, 175, Coord.circlenearlefttopslowlyforawhilethenleave, this));
				break;
			}
			
			case 13800: {
				if (gameScreen.getCheckPoint() + 10 == levelTime) {
					add(new BackgroundImage("levels/space_background2.png", 0, 0, .02f));
					add(new BackgroundImage("levels/space_background2.png", 0, 960, .02f));
				} else {
					add(new CheckpointReached(300, 350, 2));
					addStarsCheckpoint(100);
				}
				gameScreen.setCheckPoint(levelTime - 10);
				break;
				
			}
			case 15500: {
				//backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("music/black_vortex_boss_intro.mp3"));
				//backgroundMusic.play();
				break;
			}
			


		}
	}

}