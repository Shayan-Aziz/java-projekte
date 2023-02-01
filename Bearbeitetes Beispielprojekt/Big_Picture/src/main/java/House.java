import shapes.Square;
import shapes.Triangle;

public class House {
    private Square walls = new Square();
    private Square window1 = new Square();
    private Square window2 = new Square();
    private Triangle roof = new Triangle();

    public void DrawHouse()
    {
        this.walls.changeSize(100);
        this.walls.moveVertical(80);
        this.walls.makeVisible();
        this.window1.changeColor("black");
        this.window2.changeColor("white");
        this.window1.moveHorizontal(20);
        this.window1.moveVertical(100);
        this.window2.moveVertical(100);
        this.window2.moveHorizontal(60);
        this.window1.makeVisible();
        this.window2.makeVisible();
        this.roof.changeSize(50, 135);
        this.roof.changeColor("green");
        this.roof.moveVertical(70);
        this.roof.moveHorizontal(60);
        this.roof.makeVisible();
    }
}
