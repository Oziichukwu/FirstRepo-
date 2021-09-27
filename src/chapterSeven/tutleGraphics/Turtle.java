package chapterSeven.tutleGraphics;

public class Turtle {
    private Pen pen = new Pen();

    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0, 0);

    public Pen getPen() {

        return pen;
    }

    public void penDown() {
        pen.setPosition(PenPosition.DOWN);

        //pen.getPosition().setPosition(PenPosition.DOWN);
    }

    public void penUP() {
        pen.setPosition(PenPosition.UP);
    }

    public Direction getCurrentDirection() {

        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == Direction.NORTH) changeCurrentDirectionTo(Direction.EAST);
        else if (currentDirection == Direction.WEST) changeCurrentDirectionTo(Direction.NORTH);
        else if (currentDirection == Direction.SOUTH) changeCurrentDirectionTo(Direction.WEST);
        else if (currentDirection == Direction.EAST) changeCurrentDirectionTo(Direction.SOUTH);
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if (currentDirection == Direction.SOUTH) changeCurrentDirectionTo(Direction.EAST);
        else if (currentDirection == Direction.WEST) changeCurrentDirectionTo(Direction.SOUTH);
        else if (currentDirection == Direction.NORTH) changeCurrentDirectionTo(Direction.WEST);
        else if (currentDirection == Direction.EAST) changeCurrentDirectionTo(Direction.NORTH);
    }

    public Position getCurrentPosition() {

        return currentPosition;
    }

    public void moveForward(int numberOfSteps) {
        if (currentDirection == Direction.EAST)
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps - 1);

        if (currentDirection == Direction.SOUTH)
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps - 1);

        if (currentDirection == Direction.WEST)
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps - 1);

        if (currentDirection == Direction.NORTH)
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps - 1);
    }


    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if (this.pen.getPosition() == PenPosition.DOWN) {
            if (this.currentDirection == Direction.EAST) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition + i] = 1;
                }

            } else if (this.currentDirection == Direction.SOUTH) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition + i][columnPosition] = 1;

                }
            }
            else if (this.currentDirection == Direction.WEST) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition][columnPosition + i] = 1;
                }
            }
            else if (this.currentDirection == Direction.NORTH) {
                int[][] floor = sketchPad.getFloor();
                int rowPosition = currentPosition.getRowPosition();
                int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
                    floor[rowPosition + i][columnPosition ] = 1;

                }
            }
            moveForward(numberOfSteps);
        }
    }
}