package z6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface q {
    String encoding() default "binary";

    String value() default "";
}
