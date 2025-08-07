import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {


    @Test
    public void getFamily () {
        Feline feline = new Feline();
        String family = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(family, actualFamily);
    }

    @Test
    public void getKittensDefault () {
        Feline feline = new Feline();
        int countKittens = 1;
        int actualCountKittens = feline.getKittens();
        assertEquals(countKittens, actualCountKittens);
    }

    @Test
    public void getKittensParameter () {
        Feline feline = new Feline();
        int countKittens = 4;
        int actualCountKittens = feline.getKittens(countKittens);
        assertEquals(countKittens, actualCountKittens);
    }

    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of ("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(food, actualFood);
    }

}
