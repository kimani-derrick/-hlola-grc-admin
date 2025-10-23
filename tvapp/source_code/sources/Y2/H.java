package Y2;

import Z2.AbstractC0156a;
import k2.C0943h;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final int f4329a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4330b;

    public /* synthetic */ H(int i7, long j7, boolean z7) {
        this.f4329a = i7;
        this.f4330b = j7;
    }

    public static H a(C0943h c0943h, Z2.y yVar) {
        c0943h.i(yVar.f4691a, 0, 8, false);
        yVar.F(0);
        return new H(yVar.g(), yVar.l(), false);
    }

    public H(long j7, int i7) {
        AbstractC0156a.f(j7 >= 0);
        this.f4329a = i7;
        this.f4330b = j7;
    }
}
