package lesson4;

import java.util.Random;
import java.util.Scanner;

public class game {
    private  static final int SIZE = 3;
    private static char[][] map;
    private static  final char DOT_EMPTY ='.';
    private static final char DOT_X ='X';
    private static final char DOT_O = 'O';

    static  final Random random = new Random();
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMap();
        printMap();
    }

    public static void initMap(){
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {

    }
}
