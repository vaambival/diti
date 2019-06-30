package ex_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void moveRobotZeroToUpperRight() {
        Robot robo = new Robot( Direction.UP, 0, 0);
        RobotOperator.moveRobot(robo, 3, 3);
        assertEquals(robo.getX(), 3);
        assertEquals(robo.getY(), 3);
    }

    @Test
    public void moveRobotZeroToUp() {
        Robot robo = new Robot( Direction.UP, 0, 0);
        RobotOperator.moveRobot(robo, 3, 0);
        assertEquals(robo.getX(), 3);
        assertEquals(robo.getY(), 0);
        assertEquals(Direction.RIGHT, robo.getDirection());
    }

    @Test
    public void moveRobotZeroToLowerLeft() {
        Robot robo = new Robot( Direction.UP, 0, 0);
        RobotOperator.moveRobot(robo, -3, -3);
        assertEquals(robo.getX(), -3);
        assertEquals(robo.getY(), -3);
    }

    @Test
    public void moveRobotSamePosition() {
        Robot android = new Robot(Direction.DOWN, -5, -10);
        RobotOperator.moveRobot(android, -10, -5);
        assertEquals(android.getX(), -10);
        assertEquals(android.getY(), -5);
    }

    @Test
    public void moveRobotZeroToLowerRight() {
        Robot robo = new Robot( Direction.UP, 0, 0);
        RobotOperator.moveRobot(robo, 1, -3);
        assertEquals(robo.getX(), 1);
        assertEquals(robo.getY(), -3);

    }

    @Test
    public void moveRobotLeftStrictly() {
        Robot robo = new Robot( Direction.RIGHT, 10, 5);
        RobotOperator.moveRobot(robo, 0, 5);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 5);
        assertEquals(Direction.LEFT, robo.getDirection());
    }

    @Test
    public void moveRobotRightStrictly() {
        Robot robo = new Robot( Direction.DOWN, 0, 5);
        RobotOperator.moveRobot(robo, 10, 5);
        assertEquals(robo.getX(), 10);
        assertEquals(robo.getY(), 5);
        assertEquals(Direction.RIGHT, robo.getDirection());
    }

    @Test
    public void moveRobotUpStrictly() {
        Robot robo = new Robot( Direction.DOWN, 0, 5);
        RobotOperator.moveRobot(robo, 0, 15);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 15);
        assertEquals(Direction.UP, robo.getDirection());
    }

    @Test
    public void moveRobotDownStrictly() {
        Robot robo = new Robot(Direction.LEFT, 0, 1);
        RobotOperator.moveRobot(robo, 0, 5);
        assertEquals(robo.getX(), 0);
        assertEquals(robo.getY(), 5);
    }
}
