package e2;

import Z2.AbstractC0156a;
import a4.C0214f;
import android.net.Uri;
import com.google.android.gms.internal.measurement.S1;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes.dex */
public final class Q implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9722A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f9723B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f9724C;

    /* renamed from: D  reason: collision with root package name */
    public static final String f9725D;

    /* renamed from: E  reason: collision with root package name */
    public static final String f9726E;
    public static final String F;

    /* renamed from: G  reason: collision with root package name */
    public static final C0214f f9727G;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9728y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9729z;

    /* renamed from: q  reason: collision with root package name */
    public final UUID f9730q;

    /* renamed from: r  reason: collision with root package name */
    public final Uri f9731r;

    /* renamed from: s  reason: collision with root package name */
    public final O3.Z f9732s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9733t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f9734u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f9735v;

    /* renamed from: w  reason: collision with root package name */
    public final O3.E f9736w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f9737x;

    static {
        int i7 = Z2.H.f4603a;
        f9728y = Integer.toString(0, 36);
        f9729z = Integer.toString(1, 36);
        f9722A = Integer.toString(2, 36);
        f9723B = Integer.toString(3, 36);
        f9724C = Integer.toString(4, 36);
        f9725D = Integer.toString(5, 36);
        f9726E = Integer.toString(6, 36);
        F = Integer.toString(7, 36);
        f9727G = new C0214f(11);
    }

    public Q(S1 s12) {
        boolean z7;
        byte[] bArr;
        if (s12.d && s12.f8415a == null) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.k(z7);
        UUID uuid = (UUID) s12.f8418e;
        uuid.getClass();
        this.f9730q = uuid;
        this.f9731r = s12.f8415a;
        this.f9732s = (O3.Z) s12.f;
        this.f9733t = s12.f8416b;
        this.f9735v = s12.d;
        this.f9734u = s12.f8417c;
        this.f9736w = (O3.E) s12.f8419g;
        byte[] bArr2 = (byte[]) s12.f8420h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        this.f9737x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q5 = (Q) obj;
        if (this.f9730q.equals(q5.f9730q) && Z2.H.a(this.f9731r, q5.f9731r) && Z2.H.a(this.f9732s, q5.f9732s) && this.f9733t == q5.f9733t && this.f9735v == q5.f9735v && this.f9734u == q5.f9734u && this.f9736w.equals(q5.f9736w) && Arrays.equals(this.f9737x, q5.f9737x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f9730q.hashCode() * 31;
        Uri uri = this.f9731r;
        if (uri != null) {
            i7 = uri.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f9732s.hashCode();
        int hashCode3 = this.f9736w.hashCode();
        return Arrays.hashCode(this.f9737x) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i7) * 31)) * 31) + (this.f9733t ? 1 : 0)) * 31) + (this.f9735v ? 1 : 0)) * 31) + (this.f9734u ? 1 : 0)) * 31)) * 31);
    }
}
