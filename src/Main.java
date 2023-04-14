import shop.Cash;
import shop.Shop;
import shop.clothes.Cloth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Cash cash = new Cash();
        while (true) {

            System.out.println("Введите номер одежды, которую хотите купить");
            Scanner scanner = new Scanner(System.in);
            Scanner scannerColor = new Scanner(System.in);
            int selectedCloth = scanner.nextInt();
            Cloth cloth = shop.getCloth(selectedCloth);

            System.out.println("Вы выбрали одежду" + cloth.name);
            System.out.println("Выберите цвет одежды");
            shop.showColorCloth(cloth);
            int selectedColorCloth = scanner.nextInt();
            System.out.println("Вы выбрали цвет " + cloth.color.get(selectedColorCloth));
            if(shop.sell(cash,cloth)) {
                System.out.println("Ваш баланс: " + cash.balanse);
            }
        }
    }
}