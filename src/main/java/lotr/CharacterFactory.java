package lotr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;


public class CharacterFactory {
    private List<Class<? extends Character>> nonAbstractSubTypes = new ArrayList<>();

    public CharacterFactory() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        for (Class<? extends Character> el: subTypes) {
            if (!Modifier.isAbstract(el.getModifiers())) {
                nonAbstractSubTypes.add(el);
            }
        }
    }

    public Character createCharacter() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        Random random = new Random();
        Class<? extends Character> randomClass = nonAbstractSubTypes.get(random.nextInt(nonAbstractSubTypes.size()));
        Character randomInstance = randomClass.getDeclaredConstructor().newInstance();
        return randomInstance;
    }
}