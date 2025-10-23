package K0;

import java.io.IOException;
import k1.C0929b;
import v6.C1341f;
import v6.F;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class b extends v6.m {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f1515r = 1;

    /* renamed from: s  reason: collision with root package name */
    public Object f1516s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0929b c0929b, InterfaceC1343h interfaceC1343h) {
        super(interfaceC1343h);
        this.f1516s = c0929b;
    }

    @Override // v6.m, v6.F
    public final long L(C1341f c1341f, long j7) {
        switch (this.f1515r) {
            case 0:
                try {
                    return super.L(c1341f, j7);
                } catch (Exception e3) {
                    this.f1516s = e3;
                    throw e3;
                }
            default:
                try {
                    return super.L(c1341f, j7);
                } catch (IOException e7) {
                    ((C0929b) this.f1516s).f12124t = e7;
                    throw e7;
                }
        }
    }

    public /* synthetic */ b(F f) {
        super(f);
    }
}
