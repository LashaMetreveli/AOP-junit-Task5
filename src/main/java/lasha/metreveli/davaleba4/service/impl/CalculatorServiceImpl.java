package lasha.metreveli.davaleba4.service.impl;

import lasha.metreveli.davaleba4.aspect.Println;
import lasha.metreveli.davaleba4.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Println
  @Override
  public int multiplication(int x, int y) {
    return x*y;
  }
}
