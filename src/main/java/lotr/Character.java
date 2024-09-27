package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character c);
    boolean isAlive(){
        return hp > 0;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{hp=" + hp + ", power=" + power + "}";
    }

    // tostring: this.getClass() i etc.
    
}
