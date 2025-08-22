import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionMane {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

 private final  String sex;
 private final boolean hasMane;

 public TestLionMane(String sex, boolean hasMane) {
     this.sex = sex;
     this.hasMane = hasMane;
 }

 @Parameterized.Parameters (name = "Пол льва {0}, Наличие гривы {1}")
 public static Object[][] sexLion () {
     return new Object[][]{
             {"Самец", true},
             {"Самка", false},
     };
 }

@Test
public void testHasMane () throws Exception  {
    Lion lion = new Lion(sex,feline);
    assertEquals("Ожидаемая результат: У льва есть грива",hasMane, lion.doesHaveMane());
}
}
