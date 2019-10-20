package lab3;

import lab2.MapDirection;
import lab2.MoveDirection;
import lab2.Vector2d;

public class Animal {
    private Vector2d position = new Vector2d(2, 2);
    private MapDirection direction = MapDirection.NORTH;

    private void validate_position(){
        if(this.position.x > 4){
            this.position = new Vector2d(4, this.position.y);
        }

        if(this.position.x < 0){
            this.position = new Vector2d(0, this.position.y);
        }

        if(this.position.y < 0){
            this.position = new Vector2d(this.position.x, 0);
        }

        if(this.position.y > 4){
            this.position = new Vector2d(this.position.x, 4);
        }
    }

    @Override
    public String toString() {
        return "Animal position: " + position + ", direction: " + direction;
    }

    public void move(MoveDirection direction){
        switch(direction){
            case LEFT:
                this.direction = this.direction.previous();
                break;
            case RIGHT:
                this.direction = this.direction.next();
                break;
            case FORWARD:
                this.position = position.add(this.direction.toUnitVector());
                break;
            case BACKWARD:
                this.position = position.subtract(this.direction.toUnitVector());
                break;
        }

        validate_position();
    }
}
