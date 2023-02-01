import shapes.Circle;

public class Clouds
{
    private Circle circle1 = new Circle();
    private Circle circle2 = new Circle();
    private Circle circle3 = new Circle();
    private Circle circle4 = new Circle();

    public void DrawCloud()
    {
        int vertical = VertPosRandomizer(), horizontal = HoriPosRandomizer();
        this.circle1.changeColor("white");
        this.circle2.changeColor("white");
        this.circle3.changeColor("white");
        this.circle4.changeColor("white");

        //gives clouds unique shape
        this.circle1.moveVertical(-10 + ShapeNo());
        this.circle2.moveVertical(10 + ShapeNo());
        this.circle3.moveHorizontal(10 + ShapeNo());
        this.circle4.moveHorizontal(-10 + ShapeNo());

        //moves cloud to a random position on canvas
        this.circle1.moveVertical(vertical);
        this.circle2.moveVertical(vertical);
        this.circle3.moveVertical(vertical);
        this.circle4.moveVertical(vertical);
        this.circle1.moveHorizontal(horizontal);
        this.circle2.moveHorizontal(horizontal);
        this.circle3.moveHorizontal(horizontal);
        this.circle4.moveHorizontal(horizontal);

        this.circle1.makeVisible();
        this.circle2.makeVisible();
        this.circle3.makeVisible();
        this.circle4.makeVisible();
    }

    //random number for cloud shape
    public int ShapeNo(){
        return (int)((Math.random() * (10 - -10)) + -10);
    }

    public int VertPosRandomizer(){
        return (int)((Math.random() * (60 - -60)) + -60);
    }

    public int HoriPosRandomizer(){
        return (int)((Math.random() * (260 - -20)) + -20);
    }

    public void MoveCloudHori(int a){
        this.circle1.moveHorizontal(a);
        this.circle2.moveHorizontal(a);
        this.circle3.moveHorizontal(a);
        this.circle4.moveHorizontal(a);
    }
}
