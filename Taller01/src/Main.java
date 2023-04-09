import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;



public class Main {
    public static void main(String[] args) {
        lienzo();
        colorLineas();
        lineas();


    }

    /**
     * subprograma que crea el lienzo con los tamaños de los ejes X e Y
     */
    public static void lienzo(){
        ///Rango de dibujo en el lienzo
        double max =  1.0;
        double min = -1.0;

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        /// evita el parpadeo del lienzo
        StdDraw.enableDoubleBuffering();
    }


    /**
     * subprograma que le otorga un color random a cada linea
     */
    public static void colorLineas(){
        Color[] colors = {Color.black,Color.blue,Color.cyan,Color.magenta,Color.pink,Color.pink,Color.orange,Color.red,Color.green,Color.yellow,Color.gray,Color.lightGray,Color.darkGray};
        int colorAlAzar = (int) (colors.length * Math.random());
        Color color = colors[colorAlAzar];
        StdDraw.setPenColor(color);
    }


    /**
     * subprograma que dibuja las líneas con la velocidad que se mueve cada una, asi mismo generando que rebote contra las paredes de el lienzo
     */
    public static void lineas(){
        /// rango del lienzo
        double max = 1.0;
        double min = -1.0;

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        /// evita el parpadeo del lienzo
        StdDraw.enableDoubleBuffering();

        /// velocidad de las líneas
        double velocidadX0 = 0.05;
        double velocidadY0 = 0.05;
        double velocidadX1 = 0.05;
        double velocidadY1 = 0.05;

        ///generación de una posición random según el rango del lienzo
        double posInicialX = min + (max - min) * Math.random();
        double posInicialY = min + (max - min) * Math.random();

        double posFinalX = min + (max - min) * Math.random();
        double posFinalY = min + (max - min) * Math.random();


        /// while que actualiza las velocidades de la colisión
        while (true) {
            if (Math.abs(posInicialX+ velocidadX0) > 1.0) {
                velocidadX0 = -velocidadX0;
            }
            if (Math.abs(posInicialY + velocidadY0) > 1.0) {
                velocidadY0 = -velocidadY0;
            }
            if (Math.abs(posFinalX + velocidadX1) > 1.0){
                velocidadX1 = -velocidadX1;
            }
            if ( Math.abs(posFinalY + velocidadY1) > 1.0){
                velocidadY1 = -velocidadY1;
            }

            /// contador que genera 6 lineas
            int contador = 0;
            for(int i = 0; i < 6; i++){
                contador++;
                ///actualiza la posición
                posInicialX += velocidadX0;
                posInicialY += velocidadY0;
                posFinalX += velocidadX1;
                posFinalY += velocidadY1;
                /// se llama al subprograma colorLineas para generar el color de las líneas de manera random
                colorLineas();


                StdDraw.line(posInicialX,posInicialY,posFinalX,posFinalY);
                StdDraw.show();
                StdDraw.pause(50);
            }
            /// limpia el lienzo
            StdDraw.clear();


        }




    }
}