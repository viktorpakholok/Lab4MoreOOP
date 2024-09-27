package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Class<? extends Character> characters[] = {Hobbit.class};
        return characters[new Random().nextInt(characters.length)].;
    }
}
