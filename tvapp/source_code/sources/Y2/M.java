package Y2;

import java.io.IOException;
/* loaded from: classes.dex */
public final class M extends IOException {
    public M(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
