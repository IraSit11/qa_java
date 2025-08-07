import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline feline;

    @Test
    public void getFood () throws Exception {
        Cat cat = new Cat(feline);

        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(food);
        List<String> actualFood = cat.getFood();
        assertEquals(food, actualFood);
    }

    @Test
    public void soundCorrect () {
        Cat cat = new Cat(feline);
        String sound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(sound, actualSound);
    }


}
