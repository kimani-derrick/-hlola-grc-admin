package e2;

import a4.C0214f;
import android.net.Uri;
/* loaded from: classes.dex */
public final class M implements InterfaceC0604f {

    /* renamed from: r  reason: collision with root package name */
    public static final String f9702r;

    /* renamed from: s  reason: collision with root package name */
    public static final C0214f f9703s;

    /* renamed from: q  reason: collision with root package name */
    public final Uri f9704q;

    static {
        int i7 = Z2.H.f4603a;
        f9702r = Integer.toString(0, 36);
        f9703s = new C0214f(9);
    }

    public M(Z5.n nVar) {
        this.f9704q = (Uri) nVar.f4918q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        if (this.f9704q.equals(((M) obj).f9704q) && Z2.H.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9704q.hashCode() * 31;
    }
}
