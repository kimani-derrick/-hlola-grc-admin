package k1;

import F1.t;
import h6.I;
import v6.C1341f;
import v6.InterfaceC1343h;
import v6.m;
/* renamed from: k1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928a extends m {

    /* renamed from: r  reason: collision with root package name */
    public long f12119r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0929b f12120s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0928a(C0929b c0929b, InterfaceC1343h interfaceC1343h) {
        super(interfaceC1343h);
        this.f12120s = c0929b;
    }

    @Override // v6.m, v6.F
    public final long L(C1341f c1341f, long j7) {
        long j8;
        M5.g.f(c1341f, "sink");
        long L6 = super.L(c1341f, j7);
        C0929b c0929b = this.f12120s;
        if (((t) c0929b.f12124t) != null) {
            long j9 = this.f12119r;
            if (L6 != -1) {
                j8 = L6;
            } else {
                j8 = 0;
            }
            long j10 = j9 + j8;
            this.f12119r = j10;
            I i7 = c0929b.f12122r;
            long j11 = 1024;
            long j12 = this.f12119r / j11;
            long a7 = i7.a() / j11;
            ((t) c0929b.f12124t).a((int) ((j10 * 100) / i7.a()));
        }
        return L6;
    }
}
