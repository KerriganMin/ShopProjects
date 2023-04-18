package shop;

import shop.clothes.Cloth;
import shop.clothes.Shorts;
import shop.clothes.Cap;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    public ArrayList<Cloth> clothes = new ArrayList<>();
    public int count_clothes = 0;

    public Shop() {
        clothes.add(new Cap("Adidas", Arrays.asList("White", "Black", "Green","Yellow"), 1000));
        clothes.add(new Shorts("Nike", Arrays.asList("White", "Blue"), 4000));
        clothes.add(new Shorts("aboba", Arrays.asList("White", "Blue"), 4000));

    }


    public Cloth getCloth(int selectedCloth) {
        return this.clothes.get(selectedCloth-1);

    }
    public boolean sell(Cash cash, Cloth cloth) {
        if (cash.balanse < cloth.prise) {
            System.out.println("У вас недостаточно средств");
            return false;
        }
        cash.balanse -= cloth.prise-(cloth.prise/100*(5*count_clothes));
        this.clothes.remove(cloth);

        count_clothes++;
        if(count_clothes == 5){
            count_clothes = 0;
        }
        return true;
    }

    public void showColorCloth(Cloth cloth) {
        for (int i = 0; i < cloth.color.size(); i++) {
            System.out.println("Номер цвета " + i + " - " + cloth.color.get(i));
        }
    }
}
