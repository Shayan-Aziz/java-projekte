import shapes.Triangle;
import shapes.Square;
import shapes.Circle;

public class Flower
{
    private Circle circle1 = new Circle();
    private Circle circle1_2 = new Circle();
    private Circle circle2 = new Circle();
    private Circle circle2_2 = new Circle();
    private Circle circle3 = new Circle();
    private Circle circle3_2 = new Circle();
    private Circle circle4 = new Circle();
    private Circle circle4_2 = new Circle();
    private Circle circle5 = new Circle();

    public void DrawFlower()
    {
        int vertical = VertPosRandomizer(), horizontal = HoriPosRandomizer();

        //Flower colors
        this.circle1.changeColor("white");
        this.circle2.changeColor("white");
        this.circle3.changeColor("white");
        this.circle4.changeColor("white");
        this.circle1_2.changeColor("black");
        this.circle2_2.changeColor("black");
        this.circle3_2.changeColor("black");
        this.circle4_2.changeColor("black");
        this.circle5.changeColor("yellow");

        //Flower sizing
        this.circle1_2.changeSize(15);
        this.circle2_2.changeSize(15);
        this.circle3_2.changeSize(15);
        this.circle4_2.changeSize(15);
        this.circle1.changeSize(13);
        this.circle2.changeSize(13);
        this.circle3.changeSize(13);
        this.circle4.changeSize(13);
        this.circle5.changeSize(13);

        //Flower positioning
        this.circle1.moveHorizontal(105 + horizontal);
        this.circle1_2.moveHorizontal(104 + horizontal);
        this.circle1.moveVertical(vertical);
        this.circle1_2.moveVertical(-1 + vertical);

        this.circle2.moveHorizontal(95 + horizontal);
        this.circle2_2.moveHorizontal(94 + horizontal);
        this.circle2.moveVertical(vertical);
        this.circle2_2.moveVertical(-1 + vertical);

        this.circle3.moveHorizontal(100 + horizontal);
        this.circle3_2.moveHorizontal(99 + horizontal);
        this.circle3.moveVertical(5 + vertical);
        this.circle3_2.moveVertical(4 + vertical);

        this.circle4.moveHorizontal(100 + horizontal);
        this.circle4_2.moveHorizontal(99 + horizontal);
        this.circle4.moveVertical(-5 + vertical);
        this.circle4_2.moveVertical(-6 +vertical);

        this.circle5.moveHorizontal(100 + horizontal);
        this.circle5.moveVertical(vertical);

        //Flower gets drawn
        this.circle1_2.makeVisible();
        this.circle1.makeVisible();
        this.circle3_2.makeVisible();
        this.circle3.makeVisible();
        this.circle2_2.makeVisible();
        this.circle2.makeVisible();
        this.circle4_2.makeVisible();
        this.circle4.makeVisible();
        this.circle5.makeVisible();
    }

    public int VertPosRandomizer(){
        return (int)((Math.random() * (220 - 160)) + 160);
    }

    public int HoriPosRandomizer(){
        return (int)((Math.random() * (160 - -80)) + -80);
    }
}
