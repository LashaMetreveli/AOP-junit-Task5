package lasha.metreveli.davaleba4;

import lasha.metreveli.davaleba4.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

  @Autowired
  CalculatorService calculatorService;

  @Test
  void multiplicationTest() {
    int expected = 88;
    int actual = calculatorService.multiplication(11,8);
    assertEquals(expected,actual);
  }

}
