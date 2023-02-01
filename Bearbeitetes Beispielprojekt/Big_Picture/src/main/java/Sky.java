import shapes.Square;

public class Sky
{
    private Square square = new Square();

    public void DrawSky()
    {
        this.square.changeSize(300);
        this.square.moveHorizontal(-60);
        this.square.moveVertical(-50);
        this.square.changeColor("blue");
        this.square.makeVisible();
    }
}
