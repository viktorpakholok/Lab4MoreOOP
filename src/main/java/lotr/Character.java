package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.kickstategy.KickStrategy;

@Getter @AllArgsConstructor
public abstract class Character {
    private int hp;
    @Setter
    private int power;
    private KickStrategy kickStrategy;

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

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
