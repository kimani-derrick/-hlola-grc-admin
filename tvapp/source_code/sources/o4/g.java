package o4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final o f12935a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12936b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12937c;

    public g(int i7, int i8, Class cls) {
        this(o.a(cls), i7, i8);
    }

    public static g a(Class cls) {
        return new g(1, 0, cls);
    }

    public static g b(o oVar) {
        return new g(oVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f12935a.equals(gVar.f12935a) || this.f12936b != gVar.f12936b || this.f12937c != gVar.f12937c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f12935a.hashCode() ^ 1000003) * 1000003) ^ this.f12936b) * 1000003) ^ this.f12937c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f12935a);
        sb.append(", type=");
        int i7 = this.f12936b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i8 = this.f12937c;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(AbstractC0515y1.l("Unsupported injection: ", i8));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return AbstractC1111a.t(sb, str2, "}");
    }

    public g(o oVar, int i7, int i8) {
        p6.l.h(oVar, "Null dependency anInterface.");
        this.f12935a = oVar;
        this.f12936b = i7;
        this.f12937c = i8;
    }
}
