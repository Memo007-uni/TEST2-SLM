import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class UnitTest {
    @Test
    public void test_Given_ApplicationStarted_When_CallingMain_Then_NoExceptionShouldBeThrown() {
        // arrange
        boolean exceptionOccured = false;

        // act
        try {
            Main.main(null);
        } catch(Exception exc){
            exceptionOccured = true;
        }

        // assert
        Assertions.assertFalse(exceptionOccured, "no exception expected");
    }
}