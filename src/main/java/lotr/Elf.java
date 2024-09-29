package lotr;

import lotr.kickstategy.ElfKick;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new ElfKick());
    }

    public void toCry(){
        System.out.println("😢😢😢");
    }
}
