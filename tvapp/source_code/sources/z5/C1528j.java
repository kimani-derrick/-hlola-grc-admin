package z5;

import java.io.Serializable;
/* renamed from: z5.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528j implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Object f16475q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f16476r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f16477s;

    public C1528j(String str, String str2, String str3) {
        this.f16475q = str;
        this.f16476r = str2;
        this.f16477s = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1528j)) {
            return false;
        }
        C1528j c1528j = (C1528j) obj;
        if (M5.g.a(this.f16475q, c1528j.f16475q) && M5.g.a(this.f16476r, c1528j.f16476r) && M5.g.a(this.f16477s, c1528j.f16477s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        Object obj = this.f16475q;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = hashCode * 31;
        Object obj2 = this.f16476r;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Object obj3 = this.f16477s;
        if (obj3 != null) {
            i7 = obj3.hashCode();
        }
        return i9 + i7;
    }

    public final String toString() {
        return "(" + this.f16475q + ", " + this.f16476r + ", " + this.f16477s + ')';
    }
}
