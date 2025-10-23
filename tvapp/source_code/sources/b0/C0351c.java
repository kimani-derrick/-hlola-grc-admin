package b0;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: b0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351c {

    /* renamed from: a  reason: collision with root package name */
    public final int f7001a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7002b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7003c;
    public final byte[] d;

    public C0351c(long j7, byte[] bArr, int i7, int i8) {
        this.f7001a = i7;
        this.f7002b = i8;
        this.f7003c = j7;
        this.d = bArr;
    }

    public static C0351c a(long j7, ByteOrder byteOrder) {
        long[] jArr = {j7};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f7011C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C0351c(wrap.array(), 4, 1);
    }

    public static C0351c b(C0353e c0353e, ByteOrder byteOrder) {
        C0353e[] c0353eArr = {c0353e};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f7011C[5]]);
        wrap.order(byteOrder);
        C0353e c0353e2 = c0353eArr[0];
        wrap.putInt((int) c0353e2.f7007a);
        wrap.putInt((int) c0353e2.f7008b);
        return new C0351c(wrap.array(), 5, 1);
    }

    public static C0351c c(int i7, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.f7011C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i7}[0]);
        return new C0351c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g7 = g(byteOrder);
        if (g7 != null) {
            if (g7 instanceof String) {
                return Double.parseDouble((String) g7);
            }
            if (g7 instanceof long[]) {
                long[] jArr = (long[]) g7;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof int[]) {
                int[] iArr = (int[]) g7;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof double[]) {
                double[] dArr = (double[]) g7;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof C0353e[]) {
                C0353e[] c0353eArr = (C0353e[]) g7;
                if (c0353eArr.length == 1) {
                    C0353e c0353e = c0353eArr[0];
                    return c0353e.f7007a / c0353e.f7008b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g7 = g(byteOrder);
        if (g7 != null) {
            if (g7 instanceof String) {
                return Integer.parseInt((String) g7);
            }
            if (g7 instanceof long[]) {
                long[] jArr = (long[]) g7;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof int[]) {
                int[] iArr = (int[]) g7;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g7 = g(byteOrder);
        if (g7 == null) {
            return null;
        }
        if (g7 instanceof String) {
            return (String) g7;
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        if (g7 instanceof long[]) {
            long[] jArr = (long[]) g7;
            while (i7 < jArr.length) {
                sb.append(jArr[i7]);
                i7++;
                if (i7 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g7 instanceof int[]) {
            int[] iArr = (int[]) g7;
            while (i7 < iArr.length) {
                sb.append(iArr[i7]);
                i7++;
                if (i7 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (g7 instanceof double[]) {
            double[] dArr = (double[]) g7;
            while (i7 < dArr.length) {
                sb.append(dArr[i7]);
                i7++;
                if (i7 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(g7 instanceof C0353e[])) {
            return null;
        } else {
            C0353e[] c0353eArr = (C0353e[]) g7;
            while (i7 < c0353eArr.length) {
                sb.append(c0353eArr[i7].f7007a);
                sb.append('/');
                sb.append(c0353eArr[i7].f7008b);
                i7++;
                if (i7 != c0353eArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:89|(2:91|(2:92|(2:94|(2:97|98)(1:96))(2:99|100)))|101|(2:103|(6:112|113|114|115|116|117)(3:105|(2:107|108)(2:110|111)|109))|121|114|115|116|117) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [b0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [b0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0351c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f7010B[this.f7001a]);
        sb.append(", data length:");
        return AbstractC0515y1.n(sb, this.d.length, ")");
    }

    public C0351c(byte[] bArr, int i7, int i8) {
        this(-1L, bArr, i7, i8);
    }
}
