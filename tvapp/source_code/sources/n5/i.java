package n5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface i {
    boolean ignore() default false;

    String name() default "\u0000";
}
