package ng.com.nokt.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* ng.com.nokt.services.*.*(..))")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Method Will Execute");
        proceedingJoinPoint.proceed();
        logger.info("Method Finished Executing");
    }
}
