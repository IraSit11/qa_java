import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    private Lion lion;

    @Before
    public void setUp () throws Exception {
    lion = new Lion("Самец", feline);
    }

    @Mock
    Feline feline;

    @Mock
    Feline fakeFeline;

    @Test
    public void testGetKittens()throws Exception{

        int countKittens = 1;
        Mockito.when(feline.getKittens()).thenReturn(countKittens);
        int actualKittens = lion.getKittens();
        assertEquals("Ожидаемое количество котят: 1",countKittens, actualKittens);
    }


    @Test
    public void testGetFood() throws Exception {

        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        List<String> actualFood = lion.getFood();
        assertEquals("Ожидаемая еда: Животные, Птицы, Рыба",food, actualFood);
    }

    @Test
    public void testException () {
        try {
            new Lion("Оно", feline);
        } catch (Exception exception){
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }

}
