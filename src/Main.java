import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir Sayı Giriniz!(Çıkmak İçin 'x' e basınız!)");
            String str = scanner.nextLine();
            if(str.equals("x")){
                System.exit(0);
            }else if(isInteger(str)){
                int index = Integer.parseInt(str);
                drawTriangle(index);
                System.out.println("\n");
                drawSquare(index);
                System.out.println("\n");
                drawReverseTriangle(index);
                System.out.println("\n");
                drawPyramid(index);
                System.out.println("\n");
                drawDiamond(index);
                System.out.println("\n");
            }else{
                System.out.println("Yanlış Format! Lütfen Sadece Sayı ve Doğru Formatta Giriniz!");
            }
        }

    }

    public static void drawDiamond(int index){
        for(int i = 1; i<=index;i++){
            for(int j = index-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = index-1; i>=1;i--){
            for(int j = 1; j<=index-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void drawReverseTriangle(int index) {
        for(int i=1;i<=index;i++)
        {
           for(int j = index-1; j>=i; j--){
               System.out.print(" ");
           }
           for(int k=1; k<=i;k++){
               System.out.print("*");
           }
           System.out.println();
        }
    }

    public static void drawTriangle(int index){
        for(int i=1;i<=index;i++)
        {
            for(int j = 1; j<=i; j++) // Yanyana Koyulacak Yıldız Sayısı "i" Boyutunda
            {
                System.out.print("*");
            }
            System.out.println(); // Alt Satıra Geç Döngü Bitene Kadar Devam et
        }
    }

    public static void drawSquare(int index){
        for (int i = 1; i <= index; i++) {
            for (int j = 1; j <= index; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isInteger(String str) {
        if(str == null || str.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void drawPyramid(int index){
        for(int i = 1; i<=index;i++){
            for(int j = index-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



}
