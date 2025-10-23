package z0;

import M5.g;
import U5.f;
import a.AbstractC0189a;
import java.util.Locale;
import r0.AbstractC1111a;
/* renamed from: z0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1499a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16381a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16382b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f16383c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f16384e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16385g;

    public C1499a(int i7, int i8, String str, String str2, String str3, boolean z7) {
        int i9;
        this.f16381a = str;
        this.f16382b = str2;
        this.f16383c = z7;
        this.d = i7;
        this.f16384e = str3;
        this.f = i8;
        Locale locale = Locale.US;
        g.e(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        g.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (f.d0(upperCase, "INT")) {
            i9 = 3;
        } else if (!f.d0(upperCase, "CHAR") && !f.d0(upperCase, "CLOB") && !f.d0(upperCase, "TEXT")) {
            if (f.d0(upperCase, "BLOB")) {
                i9 = 5;
            } else if (!f.d0(upperCase, "REAL") && !f.d0(upperCase, "FLOA") && !f.d0(upperCase, "DOUB")) {
                i9 = 1;
            } else {
                i9 = 4;
            }
        } else {
            i9 = 2;
        }
        this.f16385g = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1499a)) {
            return false;
        }
        C1499a c1499a = (C1499a) obj;
        if (this.d != c1499a.d) {
            return false;
        }
        if (!g.a(this.f16381a, c1499a.f16381a) || this.f16383c != c1499a.f16383c) {
            return false;
        }
        int i7 = c1499a.f;
        String str = c1499a.f16384e;
        String str2 = this.f16384e;
        int i8 = this.f;
        if (i8 == 1 && i7 == 2 && str2 != null && !AbstractC0189a.p(str2, str)) {
            return false;
        }
        if (i8 == 2 && i7 == 1 && str != null && !AbstractC0189a.p(str, str2)) {
            return false;
        }
        if ((i8 == 0 || i8 != i7 || (str2 == null ? str == null : AbstractC0189a.p(str2, str))) && this.f16385g == c1499a.f16385g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = ((this.f16381a.hashCode() * 31) + this.f16385g) * 31;
        if (this.f16383c) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((hashCode + i7) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f16381a);
        sb.append("', type='");
        sb.append(this.f16382b);
        sb.append("', affinity='");
        sb.append(this.f16385g);
        sb.append("', notNull=");
        sb.append(this.f16383c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.f16384e;
        if (str == null) {
            str = "undefined";
        }
        return AbstractC1111a.t(sb, str, "'}");
    }
}
