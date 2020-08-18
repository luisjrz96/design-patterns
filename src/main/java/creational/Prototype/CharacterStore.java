package creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class CharacterStore {

	private  Map<String, Character> cachedCharacters;
	
	public CharacterStore() {
		loadCommonCharacters();
	}
	
	public  Character getCharacter(String type) {
		Character cachedCharacter = (Character) cachedCharacters.get(type);
		if(cachedCharacter != null) {
			return (Character) cachedCharacter.clone();
		}
		throw new RuntimeException("Character not found in the store");
	}
	
	private void loadCommonCharacters() {
		cachedCharacters = new HashMap<String, Character>();
		Character soldier = new SoldierCharacter("blue", "soldier1");
		Character zombie = new ZombieCharacter("red", "zombie1");
	
		cachedCharacters.put(soldier.getType(), soldier);
		cachedCharacters.put(zombie.getType(), zombie);
	}
	
	
	
	
	
}
