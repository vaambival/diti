package ex_01;

import lombok.experimental.UtilityClass;

/**
 * На игровом поле находится робот.
 * Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 *
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 *
 * Пример
 *
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 *
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 *
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 */
@UtilityClass
public class RobotOperator {

    public static void moveRobot(Robot robot, int toX, int toY) {

    }
}
