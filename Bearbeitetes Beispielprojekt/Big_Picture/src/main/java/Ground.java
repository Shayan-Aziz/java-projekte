import shapes.Square;

public class Ground
{
    private Square square2 = new Square();

    public void DrawGround()
    {
        this.square2.changeColor("green");
        this.square2.changeSize(300);
        this.square2.moveHorizontal(-60);
        this.square2.moveVertical(180);
        this.square2.makeVisible();
    }

    public void MoveGround(int a){
        this.square2.moveVertical(a);
    }
}
