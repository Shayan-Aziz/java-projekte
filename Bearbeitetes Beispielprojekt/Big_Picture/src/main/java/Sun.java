import shapes.Circle;

public class Sun
{
    private Circle circle = new Circle();

    public void DrawSun()
    {
        this.circle.changeColor("yellow");
        this.circle.changeSize(60);
        this.circle.moveHorizontal(165);
        this.circle.makeVisible();
    }
}
