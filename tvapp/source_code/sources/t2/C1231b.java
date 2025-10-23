package t2;

import Z2.AbstractC0156a;
import Z2.H;
import k2.InterfaceC0955t;
/* renamed from: t2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231b implements InterfaceC1236g {

    /* renamed from: A  reason: collision with root package name */
    public long f14528A;

    /* renamed from: B  reason: collision with root package name */
    public long f14529B;

    /* renamed from: q  reason: collision with root package name */
    public final C1235f f14530q;

    /* renamed from: r  reason: collision with root package name */
    public final long f14531r;

    /* renamed from: s  reason: collision with root package name */
    public final long f14532s;

    /* renamed from: t  reason: collision with root package name */
    public final j f14533t;

    /* renamed from: u  reason: collision with root package name */
    public int f14534u;

    /* renamed from: v  reason: collision with root package name */
    public long f14535v;

    /* renamed from: w  reason: collision with root package name */
    public long f14536w;

    /* renamed from: x  reason: collision with root package name */
    public long f14537x;

    /* renamed from: y  reason: collision with root package name */
    public long f14538y;

    /* renamed from: z  reason: collision with root package name */
    public long f14539z;

    public C1231b(j jVar, long j7, long j8, long j9, long j10, boolean z7) {
        boolean z8;
        if (j7 >= 0 && j8 > j7) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        this.f14533t = jVar;
        this.f14531r = j7;
        this.f14532s = j8;
        if (j9 != j8 - j7 && !z7) {
            this.f14534u = 0;
        } else {
            this.f14535v = j10;
            this.f14534u = 4;
        }
        this.f14530q = new C1235f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // t2.InterfaceC1236g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(k2.C0943h r25) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C1231b.b(k2.h):long");
    }

    @Override // t2.InterfaceC1236g
    public final InterfaceC0955t c() {
        if (this.f14535v != 0) {
            return new C1230a(this);
        }
        return null;
    }

    @Override // t2.InterfaceC1236g
    public final void d(long j7) {
        this.f14537x = H.k(j7, 0L, this.f14535v - 1);
        this.f14534u = 2;
        this.f14538y = this.f14531r;
        this.f14539z = this.f14532s;
        this.f14528A = 0L;
        this.f14529B = this.f14535v;
    }
}
