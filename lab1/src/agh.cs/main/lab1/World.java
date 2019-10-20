package lab1;

import lab2.MoveDirection;
import lab3.Animal;
import lab3.OptionsParser;

public class World {
    public static void main(String[] args) {
        Animal Zhylkaaa = new Animal();
        System.out.println(Zhylkaaa);

        MoveDirection[] dirs = OptionsParser.parse(new String[]{"r", "f", "f", "f", "[", "p", "l", "p", "f", "qwe", "p", "l"});

        for (MoveDirection dir : dirs) {
            Zhylkaaa.move(dir);
        }

        System.out.println(Zhylkaaa);
    }
}