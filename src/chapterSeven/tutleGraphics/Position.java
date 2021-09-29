package chapterSeven.tutleGraphics;

import java.util.Objects;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
                this.columnPosition = columnPosition;
                this.rowPosition = rowPosition;
    }

    @Override
    public String toString() {
        return "Position{" +
                "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                '}';
    }
//
//    @Override
//    public boolean equals(Object o){
//
//        Position comparedPosition = (Position) o;
//        //if (this == comparedPosition)
//
//        if(columnPosition==comparedPosition.columnPosition && rowPosition == comparedPosition.rowPosition)
//
//        return false;
//
//    }

    @Override
    public boolean equals(Object o){

        if (this == o){
            return true;
        }
        if (!(o instanceof Position positionToBeCompared)){
            return false;
        }
        boolean rowsAreEqual = rowPosition == positionToBeCompared.rowPosition;
        boolean columnsAreEqual = columnPosition == positionToBeCompared.columnPosition;
        return rowsAreEqual & columnsAreEqual;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition){
        this.rowPosition = rowPosition;
    }
}
