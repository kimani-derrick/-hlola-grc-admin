package I2;

import Z2.AbstractC0156a;
import Z2.H;
import android.net.Uri;
import e2.InterfaceC0604f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f1214A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f1215B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f1216C;

    /* renamed from: D  reason: collision with root package name */
    public static final String f1217D;

    /* renamed from: E  reason: collision with root package name */
    public static final String f1218E;
    public static final String F;

    /* renamed from: G  reason: collision with root package name */
    public static final A4.a f1219G;

    /* renamed from: y  reason: collision with root package name */
    public static final String f1220y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f1221z;

    /* renamed from: q  reason: collision with root package name */
    public final long f1222q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1223r;

    /* renamed from: s  reason: collision with root package name */
    public final int f1224s;

    /* renamed from: t  reason: collision with root package name */
    public final Uri[] f1225t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f1226u;

    /* renamed from: v  reason: collision with root package name */
    public final long[] f1227v;

    /* renamed from: w  reason: collision with root package name */
    public final long f1228w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1229x;

    static {
        int i7 = H.f4603a;
        f1220y = Integer.toString(0, 36);
        f1221z = Integer.toString(1, 36);
        f1214A = Integer.toString(2, 36);
        f1215B = Integer.toString(3, 36);
        f1216C = Integer.toString(4, 36);
        f1217D = Integer.toString(5, 36);
        f1218E = Integer.toString(6, 36);
        F = Integer.toString(7, 36);
        f1219G = new A4.a(7);
    }

    public a(long j7, int i7, int i8, int[] iArr, Uri[] uriArr, long[] jArr, long j8, boolean z7) {
        boolean z8;
        if (iArr.length == uriArr.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0156a.f(z8);
        this.f1222q = j7;
        this.f1223r = i7;
        this.f1224s = i8;
        this.f1226u = iArr;
        this.f1225t = uriArr;
        this.f1227v = jArr;
        this.f1228w = j8;
        this.f1229x = z7;
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f1226u;
            if (i9 >= iArr.length || this.f1229x || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1222q == aVar.f1222q && this.f1223r == aVar.f1223r && this.f1224s == aVar.f1224s && Arrays.equals(this.f1225t, aVar.f1225t) && Arrays.equals(this.f1226u, aVar.f1226u) && Arrays.equals(this.f1227v, aVar.f1227v) && this.f1228w == aVar.f1228w && this.f1229x == aVar.f1229x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f1222q;
        int hashCode = Arrays.hashCode(this.f1226u);
        int hashCode2 = Arrays.hashCode(this.f1227v);
        long j8 = this.f1228w;
        return ((((hashCode2 + ((hashCode + (((((((this.f1223r * 31) + this.f1224s) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f1225t)) * 31)) * 31)) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f1229x ? 1 : 0);
    }
}
