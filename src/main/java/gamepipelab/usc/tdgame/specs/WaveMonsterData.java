package gamepipelab.usc.tdgame.specs;

import gamepipelab.usc.tdgame.entities.Monster;
import gamepipelab.usc.tdgame.readers.LevelMapReader;
import gamepipelab.usc.tdgame.readers.ReadMonster;
import gamepipelab.usc.tdgame.readers.WaveReader;

import java.util.Map;
import java.util.List;

public class WaveMonsterData {

	public static float avgTime;
	public static float totalHP;

	
//	public static void main(String[] args) {
	public void getWaveRecord(Wave wave) {
		WaveMonsterData test = new WaveMonsterData();
		ReadMonster monsterReader =  new ReadMonster();
		Map<String, Monster> monsters = monsterReader.monsters;
		WaveReader waveReader = new WaveReader();
		List<Wave> waves = waveReader.readWaves();
		LevelMapReader mapReader = new LevelMapReader();
		int[][] map = mapReader.readMap().getEntireMap();
		float pathLength = 0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == MapElements.MONSTER_PATH) {
					pathLength += map[i][j];
				}
			}
		}
		totalHP = 0;
		float totalTime = 0;
		int totalMonster = 0;
			for (MiniWave mini: wave.getMiniWaves()) {
				Monster m = monsters.get(mini.getMonsterName());
				totalHP += (m.getHP() + m.getArmor()) * mini.getAmount() ;
				for (int i = 1; i <= mini.getAmount(); i++) {
					totalTime += mini.getStartTime() * i + pathLength / m.getSpeed();
				}
				totalMonster += mini.getAmount();
			}

		avgTime = totalTime / totalMonster;
//		System.out.println("number of waves:" + waves.size());
//		System.out.println("totalHP:" + totalHP);
//		System.out.println("totalMonster:" + totalMonster);
//		System.out.println("totalTime:" + totalTime);
//		System.out.println("avgTime:" + avgTime);
		
	}
}
