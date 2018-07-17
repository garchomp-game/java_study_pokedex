import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("ポケモンの名前を入力してください");
        // String name = scanner.next();
        Pokemon character = new Pokemon("ピカチュウ");
        // System.out.println("何について調べますか？");
        character.investigate_list();
    }
}
