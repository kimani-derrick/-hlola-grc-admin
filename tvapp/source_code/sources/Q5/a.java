package Q5;

import M5.g;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes.dex */
public final class a extends P5.a {
    @Override // P5.e
    public final long d(long j7) {
        return ThreadLocalRandom.current().nextLong(0L, j7);
    }

    @Override // P5.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.e(current, "current(...)");
        return current;
    }
}
