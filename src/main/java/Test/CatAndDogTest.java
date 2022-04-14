package Test;

import entityy.Cat;
import entityy.Color;
import entityy.Config;
import entityy.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatAndDogTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        /* CAT AND IT'S COLOR OBJECTS */
        Cat c1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("Blue");
        color.setTexture_color("Blue");
        c1.setCat_name("Bunny");
        c1.setBreed_name("SyberianHusky");
        c1.setOwner_name("Ankit");
        c1.setColor(color);
        c1.catDisplay();

        /* DOG AND IT'S COLOR OBJECTS */
        Dog d1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("Green");
        color1.setTexture_color("Green");
        d1.setDog_name("Buggie");
        d1.setBreed_name("AlaskanMalamute");
        d1.setOwner_name("Ankit");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}
