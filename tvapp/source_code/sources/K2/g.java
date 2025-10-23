package K2;

import android.os.SystemClock;
import java.util.List;
/* loaded from: classes.dex */
public final class g extends W2.c {

    /* renamed from: g  reason: collision with root package name */
    public int f1662g;

    @Override // W2.q
    public final int f() {
        return 0;
    }

    @Override // W2.q
    public final int g() {
        return this.f1662g;
    }

    @Override // W2.q
    public final Object l() {
        return null;
    }

    @Override // W2.q
    public final void s(long j7, long j8, long j9, List list, J2.c[] cVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!o(elapsedRealtime, this.f1662g)) {
            return;
        }
        for (int i7 = this.f3783b - 1; i7 >= 0; i7--) {
            if (!o(elapsedRealtime, i7)) {
                this.f1662g = i7;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
