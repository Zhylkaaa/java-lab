package agh.cs.lab1;

import agh.cs.lab1.Direction;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class World {
    public static void main(String[] args) {
        //ArrayList<Direction> dirs = new ArrayList<>();
        Direction[] dirs = new Direction[args.length];
        int size = 0;
        for (int i = 0;i<args.length;i++) {
            switch (args[i]) {
                case "f":
                    dirs[i] = Direction.FORWARD;
                    size++;
                    break;
                case "b":
                    dirs[i] = Direction.BACKWARD;
                    size++;
                    break;
                case "r":
                    dirs[i] = Direction.RIGHT;
                    size++;
                    break;
                case "l":
                    dirs[i] = Direction.LEFT;
                    size++;
                    break;
                default:
                    System.out.println("Niewiadomy typ");
            }
        }
        //Direction[] direction = dirs.toArray(new Direction[0]);
        //run(Arrays.copyOf(dirs, size));
        Stream<Direction> stream = Arrays.stream(dirs).filter(Objects::nonNull);

        stream.forEach(World::run_one);
    }

    private static void run_one(Direction arg) {
        switch (arg){
            case FORWARD:
                System.out.println("Zwierzak idzie do przodu");
                break;
            case BACKWARD:
                System.out.println("Zwierzak idzie do tylu");
                break;
            case RIGHT:
                System.out.println("Zwierzak skręca w prawo");
                break;
            case LEFT:
                System.out.println("Zwierzak skręca w lewo");
                break;
        }
    }

    public static void run(Direction[] args){
        for(Direction arg : args){
            switch (arg){
                case FORWARD:
                    System.out.println("Zwierzak idzie do przodu");
                    break;
                case BACKWARD:
                    System.out.println("Zwierzak idzie do tylu");
                    break;
                case RIGHT:
                    System.out.println("Zwierzak skręca w prawo");
                    break;
                case LEFT:
                    System.out.println("Zwierzak skręca w lewo");
                    break;
            }
        }
    }
}