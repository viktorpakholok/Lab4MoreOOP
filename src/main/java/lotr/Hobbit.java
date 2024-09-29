package lotr;

import lotr.kickstategy.HobbitKick;

public class Hobbit extends Character {
    public Hobbit(){
        super(3, 0, new HobbitKick());
    }

    public void toCry(){
        System.out.println("😢😢😢");
    }
    
}
