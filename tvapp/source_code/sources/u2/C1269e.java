package u2;

import e2.C0593J;
import e2.K;
import java.util.Arrays;
import k2.C0945j;
import k2.InterfaceC0948m;
/* renamed from: u2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269e implements h {

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f14753v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14754a;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public String f14757e;
    public k2.w f;

    /* renamed from: g  reason: collision with root package name */
    public k2.w f14758g;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14762k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14763l;

    /* renamed from: o  reason: collision with root package name */
    public int f14765o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14766p;

    /* renamed from: r  reason: collision with root package name */
    public int f14768r;

    /* renamed from: t  reason: collision with root package name */
    public k2.w f14770t;

    /* renamed from: u  reason: collision with root package name */
    public long f14771u;

    /* renamed from: b  reason: collision with root package name */
    public final N2.f f14755b = new N2.f(7, new byte[7]);

    /* renamed from: c  reason: collision with root package name */
    public final Z2.y f14756c = new Z2.y(Arrays.copyOf(f14753v, 10));

    /* renamed from: h  reason: collision with root package name */
    public int f14759h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f14760i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f14761j = 256;

    /* renamed from: m  reason: collision with root package name */
    public int f14764m = -1;
    public int n = -1;

    /* renamed from: q  reason: collision with root package name */
    public long f14767q = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f14769s = -9223372036854775807L;

    public C1269e(boolean z7, String str) {
        this.f14754a = z7;
        this.d = str;
    }

    @Override // u2.h
    public final void a() {
        this.f14769s = -9223372036854775807L;
        this.f14763l = false;
        this.f14759h = 0;
        this.f14760i = 0;
        this.f14761j = 256;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f5  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // u2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Z2.y r22) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C1269e.c(Z2.y):void");
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f14769s = j7;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        f.a();
        f.b();
        this.f14757e = f.f14725e;
        f.b();
        k2.w q5 = interfaceC0948m.q(f.d, 1);
        this.f = q5;
        this.f14770t = q5;
        if (this.f14754a) {
            f.a();
            f.b();
            k2.w q7 = interfaceC0948m.q(f.d, 5);
            this.f14758g = q7;
            C0593J c0593j = new C0593J();
            f.b();
            c0593j.f9597a = f.f14725e;
            c0593j.f9605k = "application/id3";
            q7.e(new K(c0593j));
            return;
        }
        this.f14758g = new C0945j();
    }

    @Override // u2.h
    public final void d() {
    }
}
