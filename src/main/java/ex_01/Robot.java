package ex_01;

/**
 * На игровом поле находится робот.
 * Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?
 */
public class Robot {
    private Direction currentDirection;
    private int x;
    private int y;

    public Robot(Direction currentDirection, int x, int y) {
        this.currentDirection = currentDirection;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (currentDirection) {
            case UP:
                currentDirection = Direction.LEFT;
                break;
            case LEFT:
                currentDirection = Direction.DOWN;
                break;
            case DOWN:
                currentDirection = Direction.RIGHT;
                break;
            default:
                currentDirection = Direction.UP;
        }
    }

    public void turnRight() {
        switch (currentDirection) {
            case UP:
                currentDirection = Direction.RIGHT;
                break;
            case RIGHT:
                currentDirection = Direction.DOWN;
                break;
            case DOWN:
                currentDirection = Direction.LEFT;
                break;
            default:
                currentDirection = Direction.UP;
        }
    }

    public void stepForward() {
        switch (currentDirection) {
            case UP:
                y++;
                break;
            case RIGHT:
                x++;
                break;
            case DOWN:
                y--;
                break;
            default:
                x--;
        }
    }
}
