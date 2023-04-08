import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        lienzo();
        colorLineas();


    }
    public static void lienzo(){
        double max =  1.0;
        double min = -1.0;

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
    }

    public static void colorLineas(){
        Color[] colors = {Color.black,Color.blue,Color.cyan,Color.magenta,Color.pink,Color.pink,Color.orange,Color.red,Color.green,Color.yellow,Color.gray,Color.lightGray,Color.darkGray};
        int colorAlAzar = (int) (colors.length * Math.random());
        Color color = colors[colorAlAzar];
        StdDraw.setPenColor(color);
    }


    public static void lineas(){
        double max = 1.0;
        double min = -1.0;

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        double velocidadX0 = 0.05;
        double velocidadY0 = 0.05;
        double velocidadX1 = 0.05;
        double velocidadY1 = 0.05;

        double posInicialX = min + (max - min) * Math.random();
        double posInicialY = min + (max - min) * Math.random();

        double posFinalX = min + (max - min) * Math.random();
        double posFinalY = min + (max - min) * Math.random();




    }
}