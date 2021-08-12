package aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(* *(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.add*())")
    private void allAddMethodsFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.returnBook())")
    private void returnBookMethodsFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() ")
    private void allGetAndReturnBookAndAddMethodsFromUniLibrary(){}

    @Before("allGetAndReturnBookAndAddMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    public void beforeGetAndReturnMethodsFromUniLibrary(){
        System.out.println("beforeGetAndReturnMethodsFromUniLibrary: writing log #1");
    }
}
