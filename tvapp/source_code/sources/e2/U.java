package e2;

import a4.C0214f;
import android.net.Uri;
import java.util.List;
/* loaded from: classes.dex */
public final class U implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9754A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f9755B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f9756C;

    /* renamed from: D  reason: collision with root package name */
    public static final String f9757D;

    /* renamed from: E  reason: collision with root package name */
    public static final String f9758E;
    public static final C0214f F;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9759y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9760z;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f9761q;

    /* renamed from: r  reason: collision with root package name */
    public final String f9762r;

    /* renamed from: s  reason: collision with root package name */
    public final Q f9763s;

    /* renamed from: t  reason: collision with root package name */
    public final M f9764t;

    /* renamed from: u  reason: collision with root package name */
    public final List f9765u;

    /* renamed from: v  reason: collision with root package name */
    public final String f9766v;

    /* renamed from: w  reason: collision with root package name */
    public final O3.E f9767w;

    /* renamed from: x  reason: collision with root package name */
    public final Object f9768x;

    static {
        int i7 = Z2.H.f4603a;
        f9759y = Integer.toString(0, 36);
        f9760z = Integer.toString(1, 36);
        f9754A = Integer.toString(2, 36);
        f9755B = Integer.toString(3, 36);
        f9756C = Integer.toString(4, 36);
        f9757D = Integer.toString(5, 36);
        f9758E = Integer.toString(6, 36);
        F = new C0214f(13);
    }

    public U(Uri uri, String str, Q q5, M m7, List list, String str2, O3.E e3, Object obj) {
        this.f9761q = uri;
        this.f9762r = str;
        this.f9763s = q5;
        this.f9764t = m7;
        this.f9765u = list;
        this.f9766v = str2;
        this.f9767w = e3;
        O3.B r3 = O3.E.r();
        for (int i7 = 0; i7 < e3.size(); i7++) {
            r3.d(X.a(((Y) e3.get(i7)).a()));
        }
        r3.h();
        this.f9768x = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u7 = (U) obj;
        if (this.f9761q.equals(u7.f9761q) && Z2.H.a(this.f9762r, u7.f9762r) && Z2.H.a(this.f9763s, u7.f9763s) && Z2.H.a(this.f9764t, u7.f9764t) && this.f9765u.equals(u7.f9765u) && Z2.H.a(this.f9766v, u7.f9766v) && this.f9767w.equals(u7.f9767w) && Z2.H.a(this.f9768x, u7.f9768x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f9761q.hashCode() * 31;
        int i7 = 0;
        String str = this.f9762r;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode5 + hashCode) * 31;
        Q q5 = this.f9763s;
        if (q5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = q5.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        M m7 = this.f9764t;
        if (m7 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = m7.hashCode();
        }
        int hashCode6 = (this.f9765u.hashCode() + ((i9 + hashCode3) * 31)) * 31;
        String str2 = this.f9766v;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int hashCode7 = (this.f9767w.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
        Object obj = this.f9768x;
        if (obj != null) {
            i7 = obj.hashCode();
        }
        return hashCode7 + i7;
    }
}
