package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstategy.KickStrategy;

@Setter @Getter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character c){
        kickStrategy.kick(this, c);
    }
    boolean isAlive(){
        return hp > 0;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{hp=" + hp + ", power=" + power + "}";
    }

    // tostring: this.getClass() i etc.
    
}
