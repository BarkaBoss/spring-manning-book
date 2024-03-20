package ng.com.nokt.services;

import ng.com.nokt.beans.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(1)
public class SecurityAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();

        logger.info("Security Method "+methodName+
                " with params "+ Arrays.asList(args)+" will execute");

        Comment comment = new Comment();
        comment.setComment("Not Bond");
        comment.setAuthor("Kyle");
        Object[] newArgs = {comment};

        Object returnedMethod = proceedingJoinPoint.proceed(newArgs);
        logger.info("Security Method Finished Executing and Returned "+returnedMethod);

        return "FAILED";
    }
}
