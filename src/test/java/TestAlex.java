import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestAlex {

    @Mock
    Feline feline;

    @Test
    public void getFriends() throws Exception {
        Alex alex = new Alex(feline);
        List<String> friends = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        List<String> actualFriends = alex.getFriends();
        assertEquals(friends,actualFriends);
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        Alex alex = new Alex(feline);
        String city = "Нью-Йоркский зоопарк";
        String actualCity = alex.getPlaceOfLiving();
        assertEquals(city, actualCity);
    }

    @Test
    public void getKittens() throws Exception {
        Alex alex = new Alex(feline);
        int countKittens = 0;
        int actualCountKittens = alex.getKittens();
        assertEquals(countKittens, actualCountKittens);
    }
}
