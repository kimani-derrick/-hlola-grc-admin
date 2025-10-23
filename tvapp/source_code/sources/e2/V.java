package e2;

import H2.C0002c;
import a4.C0214f;
import android.net.Uri;
/* loaded from: classes.dex */
public final class V implements InterfaceC0604f {

    /* renamed from: s  reason: collision with root package name */
    public static final V f9769s = new V(new C0002c(26, (byte) 0));

    /* renamed from: t  reason: collision with root package name */
    public static final String f9770t;

    /* renamed from: u  reason: collision with root package name */
    public static final String f9771u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f9772v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0214f f9773w;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f9774q;

    /* renamed from: r  reason: collision with root package name */
    public final String f9775r;

    static {
        int i7 = Z2.H.f4603a;
        f9770t = Integer.toString(0, 36);
        f9771u = Integer.toString(1, 36);
        f9772v = Integer.toString(2, 36);
        f9773w = new C0214f(15);
    }

    public V(C0002c c0002c) {
        this.f9774q = (Uri) c0002c.f1017r;
        this.f9775r = (String) c0002c.f1018s;
        Object obj = c0002c.f1019t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v5 = (V) obj;
        if (Z2.H.a(this.f9774q, v5.f9774q) && Z2.H.a(this.f9775r, v5.f9775r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Uri uri = this.f9774q;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i8 = hashCode * 31;
        String str = this.f9775r;
        if (str != null) {
            i7 = str.hashCode();
        }
        return i8 + i7;
    }
}
