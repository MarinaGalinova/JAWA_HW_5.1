import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.limits.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/limits")
//    @CsvSource({
//            "5,100,200",
//            "5,36, 200",
//            "0,36,90",
//            "0,9802,10000",
//            "1,100,101",
//            "1,9801,9805"})
    public void insideLimits(int expected, int leftlimit, int rightlimit) {

        SQRService sqr = new SQRService();

        int actual = sqr.calcSQR(leftlimit, rightlimit);

        Assertions.assertEquals(expected, actual);


    }


}


