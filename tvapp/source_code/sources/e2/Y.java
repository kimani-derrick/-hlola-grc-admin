package e2;

import a4.C0214f;
import android.net.Uri;
/* loaded from: classes.dex */
public class Y implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9781A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f9782B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f9783C;

    /* renamed from: D  reason: collision with root package name */
    public static final String f9784D;

    /* renamed from: E  reason: collision with root package name */
    public static final C0214f f9785E;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9786x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9787y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9788z;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f9789q;

    /* renamed from: r  reason: collision with root package name */
    public final String f9790r;

    /* renamed from: s  reason: collision with root package name */
    public final String f9791s;

    /* renamed from: t  reason: collision with root package name */
    public final int f9792t;

    /* renamed from: u  reason: collision with root package name */
    public final int f9793u;

    /* renamed from: v  reason: collision with root package name */
    public final String f9794v;

    /* renamed from: w  reason: collision with root package name */
    public final String f9795w;

    static {
        int i7 = Z2.H.f4603a;
        f9786x = Integer.toString(0, 36);
        f9787y = Integer.toString(1, 36);
        f9788z = Integer.toString(2, 36);
        f9781A = Integer.toString(3, 36);
        f9782B = Integer.toString(4, 36);
        f9783C = Integer.toString(5, 36);
        f9784D = Integer.toString(6, 36);
        f9785E = new C0214f(16);
    }

    public Y(X x7) {
        this.f9789q = (Uri) x7.d;
        this.f9790r = x7.f9776a;
        this.f9791s = (String) x7.f9779e;
        this.f9792t = x7.f9777b;
        this.f9793u = x7.f9778c;
        this.f9794v = (String) x7.f;
        this.f9795w = (String) x7.f9780g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.X, java.lang.Object] */
    public final X a() {
        ?? obj = new Object();
        obj.d = this.f9789q;
        obj.f9776a = this.f9790r;
        obj.f9779e = this.f9791s;
        obj.f9777b = this.f9792t;
        obj.f9778c = this.f9793u;
        obj.f = this.f9794v;
        obj.f9780g = this.f9795w;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y3 = (Y) obj;
        if (this.f9789q.equals(y3.f9789q) && Z2.H.a(this.f9790r, y3.f9790r) && Z2.H.a(this.f9791s, y3.f9791s) && this.f9792t == y3.f9792t && this.f9793u == y3.f9793u && Z2.H.a(this.f9794v, y3.f9794v) && Z2.H.a(this.f9795w, y3.f9795w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f9789q.hashCode() * 31;
        int i7 = 0;
        String str = this.f9790r;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode4 + hashCode) * 31;
        String str2 = this.f9791s;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (((((i8 + hashCode2) * 31) + this.f9792t) * 31) + this.f9793u) * 31;
        String str3 = this.f9794v;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        String str4 = this.f9795w;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i10 + i7;
    }
}
