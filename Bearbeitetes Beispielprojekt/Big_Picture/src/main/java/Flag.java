import shapes.Square;
import shapes.Triangle;

public class Flag
{
    private Square square = new Square();
    private Triangle triangle = new Triangle();

    public void DrawFlag()
    {
        this.square.changeColor("brown");
        this.square.changeSize(50);
        this.square.moveHorizontal(-60);
        this.square.moveVertical(180);
        this.square.makeVisible();

        this.triangle.changeColor("red");
        this.triangle.changeSize(20, 40);
        this.triangle.moveHorizontal(-50);
        this.triangle.moveVertical(170);
        this.triangle.makeVisible();
    }

}
