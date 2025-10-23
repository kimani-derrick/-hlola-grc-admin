package h6;

import f5.C0700a;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public B f11080a;

    /* renamed from: b  reason: collision with root package name */
    public A f11081b;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public p f11083e;

    /* renamed from: g  reason: collision with root package name */
    public I f11084g;

    /* renamed from: h  reason: collision with root package name */
    public G f11085h;

    /* renamed from: i  reason: collision with root package name */
    public G f11086i;

    /* renamed from: j  reason: collision with root package name */
    public G f11087j;

    /* renamed from: k  reason: collision with root package name */
    public long f11088k;

    /* renamed from: l  reason: collision with root package name */
    public long f11089l;

    /* renamed from: m  reason: collision with root package name */
    public C0700a f11090m;

    /* renamed from: c  reason: collision with root package name */
    public int f11082c = -1;
    public q f = new q(0);

    public static void b(G g7, String str) {
        if (g7 != null) {
            if (g7.f11101w == null) {
                if (g7.f11102x == null) {
                    if (g7.f11103y == null) {
                        if (g7.f11104z == null) {
                            return;
                        }
                        throw new IllegalArgumentException(M5.g.k(".priorResponse != null", str).toString());
                    }
                    throw new IllegalArgumentException(M5.g.k(".cacheResponse != null", str).toString());
                }
                throw new IllegalArgumentException(M5.g.k(".networkResponse != null", str).toString());
            }
            throw new IllegalArgumentException(M5.g.k(".body != null", str).toString());
        }
    }

    public final G a() {
        int i7 = this.f11082c;
        if (i7 >= 0) {
            B b7 = this.f11080a;
            if (b7 != null) {
                A a7 = this.f11081b;
                if (a7 != null) {
                    String str = this.d;
                    if (str != null) {
                        return new G(b7, a7, str, i7, this.f11083e, this.f.c(), this.f11084g, this.f11085h, this.f11086i, this.f11087j, this.f11088k, this.f11089l, this.f11090m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(M5.g.k(Integer.valueOf(i7), "code < 0: ").toString());
    }
}
