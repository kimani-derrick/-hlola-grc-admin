package h6;

import f5.C0700a;
import java.io.Closeable;
/* loaded from: classes.dex */
public final class G implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final long f11091A;

    /* renamed from: B  reason: collision with root package name */
    public final long f11092B;

    /* renamed from: C  reason: collision with root package name */
    public final C0700a f11093C;

    /* renamed from: D  reason: collision with root package name */
    public C0753c f11094D;

    /* renamed from: q  reason: collision with root package name */
    public final B f11095q;

    /* renamed from: r  reason: collision with root package name */
    public final A f11096r;

    /* renamed from: s  reason: collision with root package name */
    public final String f11097s;

    /* renamed from: t  reason: collision with root package name */
    public final int f11098t;

    /* renamed from: u  reason: collision with root package name */
    public final p f11099u;

    /* renamed from: v  reason: collision with root package name */
    public final r f11100v;

    /* renamed from: w  reason: collision with root package name */
    public final I f11101w;

    /* renamed from: x  reason: collision with root package name */
    public final G f11102x;

    /* renamed from: y  reason: collision with root package name */
    public final G f11103y;

    /* renamed from: z  reason: collision with root package name */
    public final G f11104z;

    public G(B b7, A a7, String str, int i7, p pVar, r rVar, I i8, G g7, G g8, G g9, long j7, long j8, C0700a c0700a) {
        this.f11095q = b7;
        this.f11096r = a7;
        this.f11097s = str;
        this.f11098t = i7;
        this.f11099u = pVar;
        this.f11100v = rVar;
        this.f11101w = i8;
        this.f11102x = g7;
        this.f11103y = g8;
        this.f11104z = g9;
        this.f11091A = j7;
        this.f11092B = j8;
        this.f11093C = c0700a;
    }

    public static String b(G g7, String str) {
        g7.getClass();
        String b7 = g7.f11100v.b(str);
        if (b7 == null) {
            return null;
        }
        return b7;
    }

    public final C0753c a() {
        C0753c c0753c = this.f11094D;
        if (c0753c == null) {
            C0753c c0753c2 = C0753c.n;
            C0753c x02 = android.support.v4.media.session.b.x0(this.f11100v);
            this.f11094D = x02;
            return x02;
        }
        return c0753c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        I i7 = this.f11101w;
        if (i7 != null) {
            i7.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean f() {
        int i7 = this.f11098t;
        if (200 > i7 || i7 >= 300) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.F, java.lang.Object] */
    public final F h() {
        ?? obj = new Object();
        obj.f11080a = this.f11095q;
        obj.f11081b = this.f11096r;
        obj.f11082c = this.f11098t;
        obj.d = this.f11097s;
        obj.f11083e = this.f11099u;
        obj.f = this.f11100v.g();
        obj.f11084g = this.f11101w;
        obj.f11085h = this.f11102x;
        obj.f11086i = this.f11103y;
        obj.f11087j = this.f11104z;
        obj.f11088k = this.f11091A;
        obj.f11089l = this.f11092B;
        obj.f11090m = this.f11093C;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f11096r + ", code=" + this.f11098t + ", message=" + this.f11097s + ", url=" + this.f11095q.f11070a + '}';
    }
}
