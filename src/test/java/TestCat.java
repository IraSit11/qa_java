import com.example.Alex;
import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    private Cat cat;

    @Before
    public void setUp () throws Exception {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void testGetFood () throws Exception {


        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(food);
        List<String> actualFood = cat.getFood();
        assertEquals("Ожидаемая еда: Животные, Птицы, Рыба",food, actualFood);
    }

    @Test
    public void testSoundCorrect () {

        String sound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals("Ожидаемый звук: Мяу",sound, actualSound);
    }


}
