package e2;

import Z2.AbstractC0156a;
import android.net.Uri;
import com.google.android.gms.internal.measurement.S1;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class I0 implements InterfaceC0604f {

    /* renamed from: H  reason: collision with root package name */
    public static final Object f9561H = new Object();

    /* renamed from: I  reason: collision with root package name */
    public static final Object f9562I = new Object();

    /* renamed from: J  reason: collision with root package name */
    public static final Z f9563J;

    /* renamed from: K  reason: collision with root package name */
    public static final String f9564K;

    /* renamed from: L  reason: collision with root package name */
    public static final String f9565L;

    /* renamed from: M  reason: collision with root package name */
    public static final String f9566M;

    /* renamed from: N  reason: collision with root package name */
    public static final String f9567N;

    /* renamed from: O  reason: collision with root package name */
    public static final String f9568O;

    /* renamed from: P  reason: collision with root package name */
    public static final String f9569P;

    /* renamed from: Q  reason: collision with root package name */
    public static final String f9570Q;

    /* renamed from: R  reason: collision with root package name */
    public static final String f9571R;

    /* renamed from: S  reason: collision with root package name */
    public static final String f9572S;

    /* renamed from: T  reason: collision with root package name */
    public static final String f9573T;

    /* renamed from: U  reason: collision with root package name */
    public static final String f9574U;

    /* renamed from: V  reason: collision with root package name */
    public static final String f9575V;
    public static final String W;

    /* renamed from: A  reason: collision with root package name */
    public T f9576A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f9577B;

    /* renamed from: C  reason: collision with root package name */
    public long f9578C;

    /* renamed from: D  reason: collision with root package name */
    public long f9579D;

    /* renamed from: E  reason: collision with root package name */
    public int f9580E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public long f9581G;

    /* renamed from: r  reason: collision with root package name */
    public Object f9583r;

    /* renamed from: t  reason: collision with root package name */
    public Object f9585t;

    /* renamed from: u  reason: collision with root package name */
    public long f9586u;

    /* renamed from: v  reason: collision with root package name */
    public long f9587v;

    /* renamed from: w  reason: collision with root package name */
    public long f9588w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f9589x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f9590y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9591z;

    /* renamed from: q  reason: collision with root package name */
    public Object f9582q = f9561H;

    /* renamed from: s  reason: collision with root package name */
    public Z f9584s = f9563J;

    /* JADX WARN: Type inference failed for: r12v0, types: [e2.O, e2.P] */
    static {
        boolean z7;
        U u7;
        N n = new N();
        S1 s12 = new S1();
        List emptyList = Collections.emptyList();
        O3.U u8 = O3.U.f2621u;
        V v5 = V.f9769s;
        Uri uri = Uri.EMPTY;
        if (s12.f8415a != null && ((UUID) s12.f8418e) == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        Q q5 = null;
        if (uri != null) {
            if (((UUID) s12.f8418e) != null) {
                q5 = new Q(s12);
            }
            u7 = new U(uri, null, q5, null, emptyList, null, u8, null);
        } else {
            u7 = null;
        }
        f9563J = new Z("com.google.android.exoplayer2.Timeline", new O(n), u7, new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0597b0.f9850Y, v5);
        int i7 = Z2.H.f4603a;
        f9564K = Integer.toString(1, 36);
        f9565L = Integer.toString(2, 36);
        f9566M = Integer.toString(3, 36);
        f9567N = Integer.toString(4, 36);
        f9568O = Integer.toString(5, 36);
        f9569P = Integer.toString(6, 36);
        f9570Q = Integer.toString(7, 36);
        f9571R = Integer.toString(8, 36);
        f9572S = Integer.toString(9, 36);
        f9573T = Integer.toString(10, 36);
        f9574U = Integer.toString(11, 36);
        f9575V = Integer.toString(12, 36);
        W = Integer.toString(13, 36);
    }

    public final boolean a() {
        boolean z7;
        boolean z8;
        boolean z9 = this.f9591z;
        if (this.f9576A != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z9 == z7) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.k(z8);
        if (this.f9576A == null) {
            return false;
        }
        return true;
    }

    public final void b(Object obj, Z z7, Object obj2, long j7, long j8, long j9, boolean z8, boolean z9, T t5, long j10, long j11, int i7, int i8, long j12) {
        Z z10;
        Object obj3;
        boolean z11;
        U u7;
        this.f9582q = obj;
        if (z7 != null) {
            z10 = z7;
        } else {
            z10 = f9563J;
        }
        this.f9584s = z10;
        if (z7 != null && (u7 = z7.f9805r) != null) {
            obj3 = u7.f9768x;
        } else {
            obj3 = null;
        }
        this.f9583r = obj3;
        this.f9585t = obj2;
        this.f9586u = j7;
        this.f9587v = j8;
        this.f9588w = j9;
        this.f9589x = z8;
        this.f9590y = z9;
        if (t5 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f9591z = z11;
        this.f9576A = t5;
        this.f9578C = j10;
        this.f9579D = j11;
        this.f9580E = i7;
        this.F = i8;
        this.f9581G = j12;
        this.f9577B = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !I0.class.equals(obj.getClass())) {
            return false;
        }
        I0 i02 = (I0) obj;
        if (Z2.H.a(this.f9582q, i02.f9582q) && Z2.H.a(this.f9584s, i02.f9584s) && Z2.H.a(this.f9585t, i02.f9585t) && Z2.H.a(this.f9576A, i02.f9576A) && this.f9586u == i02.f9586u && this.f9587v == i02.f9587v && this.f9588w == i02.f9588w && this.f9589x == i02.f9589x && this.f9590y == i02.f9590y && this.f9577B == i02.f9577B && this.f9578C == i02.f9578C && this.f9579D == i02.f9579D && this.f9580E == i02.f9580E && this.F == i02.F && this.f9581G == i02.f9581G) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f9584s.hashCode() + ((this.f9582q.hashCode() + 217) * 31)) * 31;
        Object obj = this.f9585t;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        T t5 = this.f9576A;
        if (t5 != null) {
            i7 = t5.hashCode();
        }
        long j7 = this.f9586u;
        long j8 = this.f9587v;
        long j9 = this.f9588w;
        long j10 = this.f9578C;
        long j11 = this.f9579D;
        long j12 = this.f9581G;
        return ((((((((((((((((((((((i8 + i7) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f9589x ? 1 : 0)) * 31) + (this.f9590y ? 1 : 0)) * 31) + (this.f9577B ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f9580E) * 31) + this.F) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }
}
