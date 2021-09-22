package chapterSeven.tutleGraphics;

public class Turtle {
    private Pen pen = new Pen();

    public Pen getPen() {

        return pen;
    }

    public void penDown() {
        pen.setPosition(PenPosition.DOWN);

        //pen.getPosition().setPosition(PenPosition.DOWN);
    }
    public void penUP(){
        pen.setPosition(PenPosition.UP);
    }

}
