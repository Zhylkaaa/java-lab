package lab3;

import lab2.MoveDirection;

import java.util.Arrays;
import java.util.Objects;

public class OptionsParser {

    private static MoveDirection stringToDirection(String s) {
        switch (s) {
            case "f":
            case "forward":
                return MoveDirection.FORWARD;
            case "b":
            case "backward":
                return MoveDirection.BACKWARD;
            case "r":
            case "right":
                return MoveDirection.RIGHT;
            case "l":
            case "left":
                return MoveDirection.LEFT;
            default:
                return null;
        }
    }

    public static MoveDirection[] parse(String[] dirs) {
        return Arrays.stream(dirs).map(OptionsParser::stringToDirection).filter(Objects::nonNull).toArray(MoveDirection[]::new);
    }
}
