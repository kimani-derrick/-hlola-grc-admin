package M5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
import z5.InterfaceC1519a;
/* loaded from: classes.dex */
public abstract class f extends b implements e, S5.a, InterfaceC1519a {

    /* renamed from: w  reason: collision with root package name */
    public final int f2306w;

    /* renamed from: x  reason: collision with root package name */
    public final int f2307x;

    public f(int i7, Class cls, String str, String str2, int i8) {
        this(i7, a.f2296q, cls, str, str2, i8);
    }

    @Override // M5.b
    public final S5.a a() {
        p.f2316a.getClass();
        return this;
    }

    @Override // M5.e
    public final int e() {
        return this.f2306w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f2300t.equals(fVar.f2300t) && this.f2301u.equals(fVar.f2301u) && this.f2307x == fVar.f2307x && this.f2306w == fVar.f2306w && g.a(this.f2298r, fVar.f2298r) && g.a(d(), fVar.d())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof f)) {
            return false;
        } else {
            S5.a aVar = this.f2297q;
            if (aVar == null) {
                a();
                this.f2297q = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        int hashCode;
        if (d() == null) {
            hashCode = 0;
        } else {
            hashCode = d().hashCode() * 31;
        }
        return this.f2301u.hashCode() + AbstractC0515y1.i(hashCode, 31, this.f2300t);
    }

    public final String toString() {
        S5.a aVar = this.f2297q;
        if (aVar == null) {
            a();
            this.f2297q = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f2300t;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AbstractC1111a.r("function ", str, " (Kotlin reflection is not available)");
    }

    public f(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.f2306w = i7;
        this.f2307x = 0;
    }
}
