
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Sky sky = new Sky();
        Sun sun = new Sun();
        Ground ground = new Ground();
        House house = new House();
        Clouds cloud1 = new Clouds();
        Clouds cloud2 = new Clouds();
        Clouds cloud3 = new Clouds();
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();

        sky.DrawSky();
        sun.DrawSun();
        cloud1.DrawCloud();
        cloud2.DrawCloud();
        cloud3.DrawCloud();
        ground.DrawGround();
        house.DrawHouse();
        flower1.DrawFlower();
        flower2.DrawFlower();
        flower3.DrawFlower();
        Flag.DrawFlag();
    }
}
