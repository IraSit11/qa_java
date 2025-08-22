import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFeline {

    private Feline feline;

    @Before
    public void setUp () throws Exception {
        feline = new Feline();
    }


    @Test
    public void testGetFamily () {

        String family = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Ожидаемое семейство: Кошачьи",family, actualFamily);
    }

    @Test
    public void testGetKittensDefault () {

        int countKittens = 1;
        int actualCountKittens = feline.getKittens();
        assertEquals("Ожидаемое количество котят по умолчанию: 1",countKittens, actualCountKittens);
    }

    @Test
    public void testGetKittensParameter () {

        int countKittens = 4;
        int actualCountKittens = feline.getKittens(countKittens);
        assertEquals("Ожидаемый параметр количества котят: 4",countKittens, actualCountKittens);
    }

    @Test
    public void testEatMeat() throws Exception {

        List<String> food = List.of ("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("Ожидаемая еда: Животные, Птицы, Рыба",food, actualFood);
    }

}
