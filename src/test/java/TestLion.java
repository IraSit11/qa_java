import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    Feline feline;

    @Mock
    Feline fakeFeline;

    @Test
    public void getKittens()throws Exception{
        Lion lion = new Lion("Самец", feline);
        int countKittens = 2;
        Mockito.when(feline.getKittens()).thenReturn(countKittens);
        int actualKittens = lion.getKittens();
        assertEquals(countKittens, actualKittens);
    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        List<String> actualFood = lion.getFood();
        assertEquals(food, actualFood);
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
