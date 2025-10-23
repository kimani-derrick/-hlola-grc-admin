package u2;

import Z2.AbstractC0156a;
import k2.InterfaceC0948m;
/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f14814l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final C1264B f14815a;

    /* renamed from: b  reason: collision with root package name */
    public final Z2.y f14816b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f14817c = new boolean[4];
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final u f14818e;
    public l f;

    /* renamed from: g  reason: collision with root package name */
    public long f14819g;

    /* renamed from: h  reason: collision with root package name */
    public String f14820h;

    /* renamed from: i  reason: collision with root package name */
    public k2.w f14821i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14822j;

    /* renamed from: k  reason: collision with root package name */
    public long f14823k;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, u2.k] */
    public m(C1264B c1264b) {
        this.f14815a = c1264b;
        ?? obj = new Object();
        obj.f14807e = new byte[128];
        this.d = obj;
        this.f14823k = -9223372036854775807L;
        this.f14818e = new u(178);
        this.f14816b = new Z2.y();
    }

    @Override // u2.h
    public final void a() {
        AbstractC0156a.n(this.f14817c);
        k kVar = this.d;
        kVar.f14804a = false;
        kVar.f14806c = 0;
        kVar.f14805b = 0;
        l lVar = this.f;
        if (lVar != null) {
            lVar.f14809b = false;
            lVar.f14810c = false;
            lVar.d = false;
            lVar.f14811e = -1;
        }
        u uVar = this.f14818e;
        if (uVar != null) {
            uVar.f();
        }
        this.f14819g = 0L;
        this.f14823k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v41 */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r26) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.m.c(Z2.y):void");
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f14823k = j7;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.f14820h = f.f14725e;
        f.b();
        k2.w q5 = interfaceC0948m.q(f.d, 2);
        this.f14821i = q5;
        this.f = new l(q5);
        C1264B c1264b = this.f14815a;
        if (c1264b != null) {
            c1264b.b(interfaceC0948m, f);
        }
    }

    @Override // u2.h
    public final void d() {
    }
}
