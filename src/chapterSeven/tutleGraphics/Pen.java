package chapterSeven.tutleGraphics;

import static chapterSeven.tutleGraphics.PenPosition.UP;

public class Pen {
    private PenPosition penPosition = UP;

    public PenPosition getPosition() {

        //return PenPosition.UP;
        return penPosition;
    }

    public void setPosition(PenPosition currentPosition) {
        penPosition = currentPosition;
    }
}
