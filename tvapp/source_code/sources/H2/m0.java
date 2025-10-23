package H2;

import Z2.AbstractC0156a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.InterfaceC0604f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class m0 implements InterfaceC0604f {

    /* renamed from: v  reason: collision with root package name */
    public static final String f1130v;

    /* renamed from: w  reason: collision with root package name */
    public static final String f1131w;

    /* renamed from: x  reason: collision with root package name */
    public static final A4.a f1132x;

    /* renamed from: q  reason: collision with root package name */
    public final int f1133q;

    /* renamed from: r  reason: collision with root package name */
    public final String f1134r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1135s;

    /* renamed from: t  reason: collision with root package name */
    public final e2.K[] f1136t;

    /* renamed from: u  reason: collision with root package name */
    public int f1137u;

    static {
        int i7 = Z2.H.f4603a;
        f1130v = Integer.toString(0, 36);
        f1131w = Integer.toString(1, 36);
        f1132x = new A4.a(4);
    }

    public m0(String str, e2.K... kArr) {
        boolean z7;
        String str2;
        String str3;
        String str4;
        if (kArr.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        this.f1134r = str;
        this.f1136t = kArr;
        this.f1133q = kArr.length;
        int h7 = Z2.r.h(kArr[0].f9655B);
        this.f1135s = h7 == -1 ? Z2.r.h(kArr[0].f9654A) : h7;
        String str5 = kArr[0].f9678s;
        str5 = (str5 == null || str5.equals("und")) ? "" : "";
        int i7 = kArr[0].f9680u | 16384;
        for (int i8 = 1; i8 < kArr.length; i8++) {
            String str6 = kArr[i8].f9678s;
            if (!str5.equals((str6 == null || str6.equals("und")) ? "" : "")) {
                str2 = kArr[0].f9678s;
                str3 = kArr[i8].f9678s;
                str4 = "languages";
            } else if (i7 != (kArr[i8].f9680u | 16384)) {
                str2 = Integer.toBinaryString(kArr[0].f9680u);
                str3 = Integer.toBinaryString(kArr[i8].f9680u);
                str4 = "role flags";
            }
            b(i8, str4, str2, str3);
            return;
        }
    }

    public static void b(int i7, String str, String str2, String str3) {
        AbstractC0156a.r("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i7 + ")"));
    }

    public final int a(e2.K k5) {
        int i7 = 0;
        while (true) {
            e2.K[] kArr = this.f1136t;
            if (i7 < kArr.length) {
                if (k5 == kArr[i7]) {
                    return i7;
                }
                i7++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (this.f1134r.equals(m0Var.f1134r) && Arrays.equals(this.f1136t, m0Var.f1136t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1137u == 0) {
            this.f1137u = AbstractC0515y1.i(527, 31, this.f1134r) + Arrays.hashCode(this.f1136t);
        }
        return this.f1137u;
    }
}
