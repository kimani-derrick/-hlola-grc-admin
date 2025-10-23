package Z2;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.U;
import a3.C0202b;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.InterfaceC0602e;
import e2.InterfaceC0604f;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: Z2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0156a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4614a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f4615b = {"", "A", "B", "C"};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4616c = new Object();
    public static final byte[] d = {0, 0, 0, 1};

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f4617e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static int[] f4618g = new int[10];

    public static boolean A(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean B(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void C(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static s D(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        float f7;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        N2.f fVar = new N2.f(bArr, i7 + 2, i8);
        int i23 = 4;
        fVar.s(4);
        int i24 = fVar.i(3);
        fVar.r();
        int i25 = fVar.i(2);
        boolean h7 = fVar.h();
        int i26 = fVar.i(5);
        int i27 = 0;
        int i28 = 0;
        while (true) {
            i9 = 1;
            if (i28 >= 32) {
                break;
            }
            if (fVar.h()) {
                i27 |= 1 << i28;
            }
            i28++;
        }
        int i29 = 6;
        int[] iArr2 = new int[6];
        for (int i30 = 0; i30 < 6; i30++) {
            iArr2[i30] = fVar.i(8);
        }
        int i31 = fVar.i(8);
        int i32 = 0;
        for (int i33 = 0; i33 < i24; i33++) {
            if (fVar.h()) {
                i32 += 89;
            }
            if (fVar.h()) {
                i32 += 8;
            }
        }
        fVar.s(i32);
        if (i24 > 0) {
            fVar.s((8 - i24) * 2);
        }
        fVar.l();
        int l7 = fVar.l();
        if (l7 == 3) {
            fVar.r();
        }
        int l8 = fVar.l();
        int l9 = fVar.l();
        if (fVar.h()) {
            int l10 = fVar.l();
            int l11 = fVar.l();
            int l12 = fVar.l();
            int l13 = fVar.l();
            if (l7 != 1 && l7 != 2) {
                i21 = 1;
            } else {
                i21 = 2;
            }
            if (l7 == 1) {
                i22 = 2;
            } else {
                i22 = 1;
            }
            l8 -= (l10 + l11) * i21;
            l9 -= (l12 + l13) * i22;
        }
        int i34 = l9;
        int i35 = l8;
        fVar.l();
        fVar.l();
        int l14 = fVar.l();
        if (fVar.h()) {
            i10 = 0;
        } else {
            i10 = i24;
        }
        for (int i36 = i10; i36 <= i24; i36++) {
            fVar.l();
            fVar.l();
            fVar.l();
        }
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        if (fVar.h() && fVar.h()) {
            int i37 = 0;
            while (i37 < i23) {
                int i38 = 0;
                while (i38 < i29) {
                    if (!fVar.h()) {
                        fVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i37 << 1) + 4));
                        if (i37 > 1) {
                            fVar.m();
                        }
                        for (int i39 = 0; i39 < min; i39++) {
                            fVar.m();
                        }
                    }
                    if (i37 == 3) {
                        i20 = 3;
                    } else {
                        i20 = 1;
                    }
                    i38 += i20;
                    i29 = 6;
                }
                i37++;
                i23 = 4;
                i29 = 6;
            }
        }
        fVar.s(2);
        if (fVar.h()) {
            fVar.s(8);
            fVar.l();
            fVar.l();
            fVar.r();
        }
        int l15 = fVar.l();
        int i40 = 0;
        int[] iArr3 = new int[0];
        int[] iArr4 = new int[0];
        int i41 = -1;
        int i42 = -1;
        int i43 = -1;
        while (i40 < l15) {
            if (i40 != 0 && fVar.h()) {
                int i44 = i43 + i42;
                int l16 = (1 - ((fVar.h() ? 1 : 0) * 2)) * (fVar.l() + 1);
                i14 = l15;
                int i45 = i44 + 1;
                i17 = i31;
                boolean[] zArr = new boolean[i45];
                iArr = iArr2;
                for (int i46 = 0; i46 <= i44; i46++) {
                    if (!fVar.h()) {
                        zArr[i46] = fVar.h();
                    } else {
                        zArr[i46] = true;
                    }
                }
                int[] iArr5 = new int[i45];
                int[] iArr6 = new int[i45];
                int i47 = 0;
                for (int i48 = i42 - 1; i48 >= 0; i48--) {
                    int i49 = iArr4[i48] + l16;
                    if (i49 < 0 && zArr[i43 + i48]) {
                        iArr5[i47] = i49;
                        i47++;
                    }
                }
                if (l16 < 0 && zArr[i44]) {
                    iArr5[i47] = l16;
                    i47++;
                }
                i16 = i27;
                int i50 = i47;
                i15 = i26;
                for (int i51 = 0; i51 < i43; i51++) {
                    int i52 = iArr3[i51] + l16;
                    if (i52 < 0 && zArr[i51]) {
                        iArr5[i50] = i52;
                        i50++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i50);
                int i53 = 0;
                for (int i54 = i43 - 1; i54 >= 0; i54--) {
                    int i55 = iArr3[i54] + l16;
                    if (i55 > 0 && zArr[i54]) {
                        iArr6[i53] = i55;
                        i53++;
                    }
                }
                if (l16 > 0 && zArr[i44]) {
                    iArr6[i53] = l16;
                    i53++;
                }
                int i56 = i53;
                for (int i57 = 0; i57 < i42; i57++) {
                    int i58 = iArr4[i57] + l16;
                    if (i58 > 0 && zArr[i43 + i57]) {
                        iArr6[i56] = i58;
                        i56++;
                    }
                }
                iArr4 = Arrays.copyOf(iArr6, i56);
                i43 = i50;
                i42 = i56;
                i9 = 1;
                iArr3 = copyOf;
            } else {
                i14 = l15;
                i15 = i26;
                i16 = i27;
                iArr = iArr2;
                i17 = i31;
                int l17 = fVar.l();
                int l18 = fVar.l();
                int[] iArr7 = new int[l17];
                for (int i59 = 0; i59 < l17; i59++) {
                    if (i59 > 0) {
                        i19 = iArr7[i59 - 1];
                    } else {
                        i19 = 0;
                    }
                    iArr7[i59] = i19 - (fVar.l() + 1);
                    fVar.r();
                }
                int[] iArr8 = new int[l18];
                for (int i60 = 0; i60 < l18; i60++) {
                    if (i60 > 0) {
                        i18 = iArr8[i60 - 1];
                    } else {
                        i18 = 0;
                    }
                    iArr8[i60] = fVar.l() + 1 + i18;
                    fVar.r();
                }
                i9 = 1;
                iArr3 = iArr7;
                iArr4 = iArr8;
                i43 = l17;
                i42 = l18;
            }
            i40++;
            l15 = i14;
            i31 = i17;
            iArr2 = iArr;
            i27 = i16;
            i26 = i15;
        }
        int i61 = i26;
        int i62 = i27;
        int[] iArr9 = iArr2;
        int i63 = i31;
        if (fVar.h()) {
            int l19 = fVar.l();
            for (int i64 = 0; i64 < l19; i64++) {
                fVar.s(l14 + 5);
            }
        }
        int i65 = 2;
        fVar.s(2);
        float f8 = 1.0f;
        if (fVar.h()) {
            if (fVar.h()) {
                int i66 = fVar.i(8);
                if (i66 == 255) {
                    int i67 = fVar.i(16);
                    int i68 = fVar.i(16);
                    if (i67 != 0 && i68 != 0) {
                        f8 = i67 / i68;
                    }
                } else if (i66 < 17) {
                    f8 = f4617e[i66];
                } else {
                    AbstractC0515y1.q(i66, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (fVar.h()) {
                fVar.r();
            }
            if (fVar.h()) {
                fVar.s(3);
                if (fVar.h()) {
                    i65 = i9;
                }
                if (fVar.h()) {
                    int i69 = fVar.i(8);
                    int i70 = fVar.i(8);
                    fVar.s(8);
                    i41 = C0202b.b(i69);
                    i13 = C0202b.c(i70);
                } else {
                    i13 = -1;
                }
            } else {
                i65 = -1;
                i13 = -1;
            }
            if (fVar.h()) {
                fVar.l();
                fVar.l();
            }
            fVar.r();
            if (fVar.h()) {
                i34 *= 2;
            }
            f7 = f8;
            i11 = i34;
            i12 = i41;
            i41 = i13;
        } else {
            f7 = 1.0f;
            i11 = i34;
            i65 = -1;
            i12 = -1;
        }
        return new s(i25, h7, i61, i62, iArr9, i63, i35, i11, f7, i12, i65, i41);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z2.u E(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0156a.E(byte[], int, int):Z2.u");
    }

    public static String F(StringBuilder sb, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i12 = i7;
        int i13 = i12;
        while (i12 <= i8) {
            if (i12 == i8) {
                i9 = i12;
            } else if (sb.charAt(i12) == '/') {
                i9 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb.charAt(i13) == '.') {
                sb.delete(i13, i9);
                i8 -= i9 - i13;
            } else {
                if (i12 == i13 + 2 && sb.charAt(i13) == '.' && sb.charAt(i14) == '.') {
                    i10 = sb.lastIndexOf("/", i13 - 2) + 1;
                    if (i10 > i7) {
                        i11 = i10;
                    } else {
                        i11 = i7;
                    }
                    sb.delete(i11, i9);
                    i8 -= i9 - i11;
                } else {
                    i10 = i12 + 1;
                }
                i13 = i10;
            }
            i12 = i13;
        }
        return sb.toString();
    }

    public static String G(String str, String str2) {
        int i7;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] w7 = w(str2);
        if (w7[0] != -1) {
            sb.append(str2);
            F(sb, w7[1], w7[2]);
            return sb.toString();
        }
        int[] w8 = w(str);
        if (w7[3] == 0) {
            sb.append((CharSequence) str, 0, w8[3]);
            sb.append(str2);
            return sb.toString();
        } else if (w7[2] == 0) {
            sb.append((CharSequence) str, 0, w8[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i8 = w7[1];
            if (i8 != 0) {
                int i9 = w8[0] + 1;
                sb.append((CharSequence) str, 0, i9);
                sb.append(str2);
                return F(sb, w7[1] + i9, i9 + w7[2]);
            } else if (str2.charAt(i8) == '/') {
                sb.append((CharSequence) str, 0, w8[1]);
                sb.append(str2);
                int i10 = w8[1];
                return F(sb, i10, w7[2] + i10);
            } else {
                int i11 = w8[0] + 2;
                int i12 = w8[1];
                if (i11 < i12 && i12 == w8[2]) {
                    sb.append((CharSequence) str, 0, i12);
                    sb.append('/');
                    sb.append(str2);
                    int i13 = w8[1];
                    return F(sb, i13, w7[2] + i13 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, w8[2] - 1);
                if (lastIndexOf == -1) {
                    i7 = w8[1];
                } else {
                    i7 = lastIndexOf + 1;
                }
                sb.append((CharSequence) str, 0, i7);
                sb.append(str2);
                return F(sb, w8[1], i7 + w7[2]);
            }
        }
    }

    public static Uri H(String str, String str2) {
        return Uri.parse(G(str, str2));
    }

    public static void I(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer(AbstractC0515y1.l("csd-", i7), ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }

    public static int J(int i7, byte[] bArr) {
        int i8;
        synchronized (f) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    if (i9 < i7 - 2) {
                        try {
                            if (bArr[i9] == 0 && bArr[i9 + 1] == 0 && bArr[i9 + 2] == 3) {
                                break;
                            }
                            i9++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i9 = i7;
                        break;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = f4618g;
                    if (iArr.length <= i10) {
                        f4618g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f4618g[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = f4618g[i13] - i12;
                System.arraycopy(bArr, i12, bArr, i11, i14);
                int i15 = i11 + i14;
                int i16 = i15 + 1;
                bArr[i15] = 0;
                i11 = i15 + 2;
                bArr[i16] = 0;
                i12 += i14 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i11, i8 - i11);
        }
        return i8;
    }

    public static void K(String str, String str2) {
        synchronized (f4616c) {
            Log.w(str, str2);
        }
    }

    public static void L(String str, String str2, Throwable th) {
        K(str, a(str2, th));
    }

    public static String a(String str, Throwable th) {
        String replace;
        synchronized (f4616c) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                                break;
                            }
                            th2 = th2.getCause();
                        } else {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static void b(String str) {
        if (H.f4603a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void c(int i7, int i8) {
        GLES20.glBindTexture(i7, i8);
        g();
        GLES20.glTexParameteri(i7, 10240, 9729);
        g();
        GLES20.glTexParameteri(i7, 10241, 9729);
        g();
        GLES20.glTexParameteri(i7, 10242, 33071);
        g();
        GLES20.glTexParameteri(i7, 10243, 33071);
        g();
    }

    public static String d(int i7, boolean z7, int i8, int i9, int[] iArr, int i10) {
        char c5;
        String str = f4615b[i7];
        Integer valueOf = Integer.valueOf(i8);
        Integer valueOf2 = Integer.valueOf(i9);
        if (z7) {
            c5 = 'H';
        } else {
            c5 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c5), Integer.valueOf(i10)};
        int i11 = H.f4603a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i12])));
        }
        return sb.toString();
    }

    public static void e(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void f(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void g() {
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z7) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z7 = true;
        }
        if (!z7) {
            return;
        }
        throw new Exception(sb.toString());
    }

    public static void h(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new Exception(str);
    }

    public static void i(int i7, int i8) {
        if (i7 >= 0 && i7 < i8) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void k(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void n(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static FloatBuffer o(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void p(String str, String str2) {
        synchronized (f4616c) {
            Log.d(str, str2);
        }
    }

    public static void q(String str, String str2) {
        synchronized (f4616c) {
            Log.e(str, str2);
        }
    }

    public static void r(String str, String str2, Throwable th) {
        q(str, a(str2, th));
    }

    public static void s() {
        if (H.f4603a >= 18) {
            Trace.endSection();
        }
    }

    public static int t(byte[] bArr, int i7, int i8, boolean[] zArr) {
        boolean z7;
        boolean z8;
        boolean z9;
        int i9 = i8 - i7;
        boolean z10 = false;
        if (i9 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        k(z7);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            n(zArr);
            return i7 - 3;
        } else if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            n(zArr);
            return i7 - 2;
        } else if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            n(zArr);
            return i7 - 1;
        } else {
            int i10 = i8 - 1;
            int i11 = i7 + 2;
            while (i11 < i10) {
                byte b7 = bArr[i11];
                if ((b7 & 254) == 0) {
                    int i12 = i11 - 2;
                    if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                        n(zArr);
                        return i12;
                    }
                    i11 -= 2;
                }
                i11 += 3;
            }
            if (i9 <= 2 ? !(i9 != 2 ? !zArr[1] || bArr[i10] != 1 : !zArr[2] || bArr[i8 - 2] != 0 || bArr[i10] != 1) : !(bArr[i8 - 3] != 0 || bArr[i8 - 2] != 0 || bArr[i10] != 1)) {
                z8 = true;
            } else {
                z8 = false;
            }
            zArr[0] = z8;
            if (i9 <= 1 ? !(!zArr[2] || bArr[i10] != 0) : !(bArr[i8 - 2] != 0 || bArr[i10] != 0)) {
                z9 = true;
            } else {
                z9 = false;
            }
            zArr[1] = z9;
            if (bArr[i10] == 0) {
                z10 = true;
            }
            zArr[2] = z10;
            return i8;
        }
    }

    public static U u(InterfaceC0602e interfaceC0602e, ArrayList arrayList) {
        O3.C c5 = O3.E.f2597r;
        AbstractC0072p.c("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i7 = 0;
        int i8 = 0;
        boolean z7 = false;
        while (i7 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i7);
            bundle.getClass();
            InterfaceC0604f e3 = interfaceC0602e.e(bundle);
            e3.getClass();
            int i9 = i8 + 1;
            if (objArr.length < i9) {
                objArr = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, i9));
            } else if (z7) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i8] = e3;
                i7++;
                i8++;
            }
            z7 = false;
            objArr[i8] = e3;
            i7++;
            i8++;
        }
        return O3.E.o(i8, objArr);
    }

    public static String v(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            if (xmlPullParser.getAttributeName(i7).equals(str)) {
                return xmlPullParser.getAttributeValue(i7);
            }
        }
        return null;
    }

    public static int[] w(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void x(String str, String str2) {
        synchronized (f4616c) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0195, code lost:
        if (r0.equals("video/mp2t") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.AbstractC0156a.y(java.lang.String):int");
    }

    public static int z(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}
