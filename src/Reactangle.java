public class Reactangle {
    public static void print(int width, int height) {


        //kody si dam do premennych
        final char TOP_LEFT = '\u250c'; //final ako konstanta, premenna len raz nastavitelna // iba raz ju mozem nastaviť // ako const pri C
        final char TOP_RIGHT = '\u2510';
        final char HORIZONTAL = '\u2500';
        final char VERTICAL = '\u2502';
        final char BOTTOM_LEFT = '\u2514'; //final ako konstanta, premenna len raz nastavitelna // iba raz ju mozem nastaviť // ako const pri C
        final char BOTTOM_RIGHT = '\u2518';
        final char SQUARE = '\u25A1';

        //ošetrenie
       if(width == 1 || height == 1) {
           System.out.println(SQUARE);
           return;
       }

       if(height == 1) {
           for(int i = 1; i <= width; i++) {
               System.out.print(HORIZONTAL);
           }
           System.out.println();
       }
        if(width == 1) {
            for(int i = 1; i <= height; i++) {
                System.out.print(VERTICAL);
            }
            System.out.println();
        }

        System.out.print(TOP_LEFT);
        for (int i = 0; i < width-2; i++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println(TOP_RIGHT);

        for (int i = 0; i < height - 2; i++) {
            System.out.print(VERTICAL);
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(VERTICAL);
        }
        System.out.print(BOTTOM_LEFT);
        for (int i = 0; i < width-2; i++) {
            System.out.print(HORIZONTAL);
        }
        System.out.println(BOTTOM_RIGHT);

    }
}
