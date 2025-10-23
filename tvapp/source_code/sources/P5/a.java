package P5;

import java.util.Random;
/* loaded from: classes.dex */
public abstract class a extends e {
    @Override // P5.e
    public final int a(int i7) {
        return ((-i7) >> 31) & (e().nextInt() >>> (32 - i7));
    }

    @Override // P5.e
    public final int b() {
        return e().nextInt();
    }

    @Override // P5.e
    public final long c() {
        return e().nextLong();
    }

    public abstract Random e();
}
