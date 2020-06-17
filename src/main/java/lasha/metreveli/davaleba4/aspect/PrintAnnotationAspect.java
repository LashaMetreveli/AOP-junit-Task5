package lasha.metreveli.davaleba4.aspect;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintAnnotationAspect {

  @Before("@annotation(lasha.metreveli.davaleba4.aspect.Println)")
  public void PrintAdvice(JoinPoint joinPoint) {

    String method = joinPoint.toString();
    int index = method.indexOf('4');
    method = method.substring(index+2);

    System.out.println(
        "გადაცემული არგუმენტები: " + Arrays.toString(joinPoint.getArgs()) + "\nმეთოდის ლოკაცია: " + method);
  }

}
