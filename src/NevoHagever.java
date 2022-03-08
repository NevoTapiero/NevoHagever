import java.util.Scanner;

public class NevoHagever {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] MagicSquare = new int[4][4];
        for (int i = 0;i < MagicSquare.length;i++) {
            for (int j = 0;j < MagicSquare[i].length; j++) {
                System.out.println("give me a number pls " + " i = " + i + " j = " +j);
                MagicSquare[i][j] = s.nextInt();
            }
        }
        for (int t = 0;t < MagicSquare.length;t++){
            System.out.println("");
            for (int e = 0;e < MagicSquare.length;e++){
                System.out.printf("[" + String.valueOf(MagicSquare[t][e]) + "]");
            }
        }
        System.out.println("");
        boolean finalnum = IsMagic(MagicSquare);
        System.out.println(finalnum);
        }
        public static boolean IsMagic(int[][] MagicSquare){
            int num1 = 0, num2 = 0, num3 = 0, num4 = 0,i = 0;
            for (int r = 0;r < MagicSquare.length;r++){
                num1 = num1 + MagicSquare[0][r];
            }
            System.out.println(num1);
            for (int e = 0;e < MagicSquare.length;e++){
                num2 = num2 + MagicSquare[i][e];
                i++;
            }
            System.out.println(num2);
            for (int t = 0;t < MagicSquare.length;t++){
                num3 = num3 + MagicSquare[t][t];
            }
            System.out.println(num3);
            for (int j = MagicSquare.length-1;j > -1;j--){
                num4 = num4 + MagicSquare[j][j];
            }
            System.out.println(num4);
            if (num1 == num2 && num1 == num3 && num1 == num4)
                return true;
            else
                return false;
        }
    }