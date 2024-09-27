package lotr;

import java.util.Random;

public class King extends Noble{
    public King(){
        super();
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }
}
