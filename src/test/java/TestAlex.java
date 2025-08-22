import com.example.Alex;
import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestAlex {
    private Alex alex;

    @Before
    public void setUp () throws Exception {
        alex = new Alex(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception {

        List<String> friends = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals("Ожидаемые друзья: зебра Марти, бегемотиха Глория, жираф Мелман",friends,actualFriends);
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {

        String city = "Нью-Йоркский зоопарк";
        String actualCity = alex.getPlaceOfLiving();
        assertEquals("Ожидаемый город проживания: Нью-Йоркский зоопарк",city, actualCity);
    }

    @Test
    public void tetsGetKittens() throws Exception {

        int countKittens = 0;
        int actualCountKittens = alex.getKittens();
        assertEquals("Ожидаемое количество котят: 0",countKittens, actualCountKittens);
    }
}
