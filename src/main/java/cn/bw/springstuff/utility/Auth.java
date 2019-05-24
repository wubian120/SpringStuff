package cn.bw.springstuff.utility;

import java.lang.annotation.*;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/24 11:31
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Auth {

    String[] roleName() default "";

}
