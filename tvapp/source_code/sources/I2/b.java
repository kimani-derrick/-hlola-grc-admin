package I2;

import Z2.H;
import android.net.Uri;
import e2.InterfaceC0604f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f1230A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f1231B;

    /* renamed from: C  reason: collision with root package name */
    public static final A4.a f1232C;

    /* renamed from: w  reason: collision with root package name */
    public static final b f1233w = new b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: x  reason: collision with root package name */
    public static final a f1234x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f1235y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f1236z;

    /* renamed from: q  reason: collision with root package name */
    public final Object f1237q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1238r;

    /* renamed from: s  reason: collision with root package name */
    public final long f1239s;

    /* renamed from: t  reason: collision with root package name */
    public final long f1240t;

    /* renamed from: u  reason: collision with root package name */
    public final int f1241u;

    /* renamed from: v  reason: collision with root package name */
    public final a[] f1242v;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f1226u;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f1227v;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f1234x = new a(aVar.f1222q, 0, aVar.f1224s, copyOf, (Uri[]) Arrays.copyOf(aVar.f1225t, 0), copyOf2, aVar.f1228w, aVar.f1229x);
        int i7 = H.f4603a;
        f1235y = Integer.toString(1, 36);
        f1236z = Integer.toString(2, 36);
        f1230A = Integer.toString(3, 36);
        f1231B = Integer.toString(4, 36);
        f1232C = new A4.a(6);
    }

    public b(Object obj, a[] aVarArr, long j7, long j8, int i7) {
        this.f1237q = obj;
        this.f1239s = j7;
        this.f1240t = j8;
        this.f1238r = aVarArr.length + i7;
        this.f1242v = aVarArr;
        this.f1241u = i7;
    }

    public final a a(int i7) {
        int i8 = this.f1241u;
        if (i7 < i8) {
            return f1234x;
        }
        return this.f1242v[i7 - i8];
    }

    public final boolean b(int i7) {
        if (i7 == this.f1238r - 1) {
            a a7 = a(i7);
            if (a7.f1229x && a7.f1222q == Long.MIN_VALUE && a7.f1223r == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (H.a(this.f1237q, bVar.f1237q) && this.f1238r == bVar.f1238r && this.f1239s == bVar.f1239s && this.f1240t == bVar.f1240t && this.f1241u == bVar.f1241u && Arrays.equals(this.f1242v, bVar.f1242v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = this.f1238r * 31;
        Object obj = this.f1237q;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i7 + hashCode) * 31) + ((int) this.f1239s)) * 31) + ((int) this.f1240t)) * 31) + this.f1241u) * 31) + Arrays.hashCode(this.f1242v);
    }

    public final String toString() {
        char c5;
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f1237q);
        sb.append(", adResumePositionUs=");
        sb.append(this.f1239s);
        sb.append(", adGroups=[");
        int i7 = 0;
        while (true) {
            a[] aVarArr = this.f1242v;
            if (i7 < aVarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(aVarArr[i7].f1222q);
                sb.append(", ads=[");
                for (int i8 = 0; i8 < aVarArr[i7].f1226u.length; i8++) {
                    sb.append("ad(state=");
                    int i9 = aVarArr[i7].f1226u[i8];
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 != 4) {
                                        c5 = '?';
                                    } else {
                                        c5 = '!';
                                    }
                                } else {
                                    c5 = 'P';
                                }
                            } else {
                                c5 = 'S';
                            }
                        } else {
                            c5 = 'R';
                        }
                    } else {
                        c5 = '_';
                    }
                    sb.append(c5);
                    sb.append(", durationUs=");
                    sb.append(aVarArr[i7].f1227v[i8]);
                    sb.append(')');
                    if (i8 < aVarArr[i7].f1226u.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i7 < aVarArr.length - 1) {
                    sb.append(", ");
                }
                i7++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
