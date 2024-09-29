package lotr.kickstategy;

import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character whoIsKicked){
        whoIsKicked.setHp(whoIsKicked.getHp() - new Random().nextInt(whoKick.getPower()));
    }
}
