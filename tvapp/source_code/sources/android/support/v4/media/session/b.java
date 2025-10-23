package android.support.v4.media.session;

import B5.e;
import M5.g;
import R5.d;
import X2.C0123e;
import Z2.y;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.D;
import androidx.leanback.transition.FadeAndShortSlide;
import androidx.lifecycle.Y;
import com.boxhdo.android.tv.customviews.CustomNavigationView;
import com.google.android.gms.internal.measurement.Z1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0526d;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0534l;
import com.google.crypto.tink.shaded.protobuf.AbstractC0544w;
import com.google.crypto.tink.shaded.protobuf.AbstractC0547z;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0546y;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import k.C0915t0;
import n0.L;
import org.xmlpull.v1.XmlPullParserException;
import t2.i;
import u5.C1298f;
import u5.InterfaceC1294b;
import w4.l0;
import w5.InterfaceC1436a;
import w5.InterfaceC1437b;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static long f5288a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f5289b;

    /* renamed from: c  reason: collision with root package name */
    public static SparseArray f5290c;

    public static double A(int i7, byte[] bArr) {
        return Double.longBitsToDouble(E(i7, bArr));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.ViewOutlineProvider, java.lang.Object, androidx.leanback.widget.c0] */
    public static void A0(View view, int i7) {
        if (f5290c == null) {
            f5290c = new SparseArray();
        }
        ViewOutlineProvider viewOutlineProvider = (ViewOutlineProvider) f5290c.get(i7);
        ViewOutlineProvider viewOutlineProvider2 = viewOutlineProvider;
        if (viewOutlineProvider == null) {
            ?? viewOutlineProvider3 = new ViewOutlineProvider();
            viewOutlineProvider3.f6575a = i7;
            viewOutlineProvider2 = viewOutlineProvider3;
            if (f5290c.size() < 32) {
                f5290c.put(i7, viewOutlineProvider3);
                viewOutlineProvider2 = viewOutlineProvider3;
            }
        }
        view.setOutlineProvider(viewOutlineProvider2);
        view.setClipToOutline(true);
    }

    public static int B(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0534l abstractC0534l = (AbstractC0534l) interfaceC0546y;
        abstractC0534l.f(A(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int b02 = b0(bArr, i10, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            abstractC0534l.f(Double.longBitsToDouble(E(b02, bArr)));
            i10 = b02 + 8;
        }
        return i10;
    }

    public static int[] B0(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof Q3.a) {
            Q3.a aVar = (Q3.a) abstractCollection;
            return Arrays.copyOfRange(aVar.f2858q, aVar.f2859r, aVar.f2860s);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int C(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static final long C0(int i7, V5.c cVar) {
        g.f(cVar, "unit");
        if (cVar.compareTo(V5.c.SECONDS) <= 0) {
            long h7 = h4.b.h(i7, cVar, V5.c.NANOSECONDS) << 1;
            int i8 = V5.a.f3731t;
            int i9 = V5.b.f3733a;
            return h7;
        }
        return D0(i7, cVar);
    }

    public static int D(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0544w abstractC0544w = (AbstractC0544w) interfaceC0546y;
        abstractC0544w.f(C(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int b02 = b0(bArr, i10, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            abstractC0544w.f(C(b02, bArr));
            i10 = b02 + 4;
        }
        return i10;
    }

    public static final long D0(long j7, V5.c cVar) {
        g.f(cVar, "unit");
        V5.c cVar2 = V5.c.NANOSECONDS;
        long h7 = h4.b.h(4611686018426999999L, cVar2, cVar);
        long j8 = -h7;
        d dVar = new d(j8, h7);
        if (j8 <= j7 && j7 <= dVar.f2931r) {
            long h8 = h4.b.h(j7, cVar, cVar2) << 1;
            int i7 = V5.a.f3731t;
            int i8 = V5.b.f3733a;
            return h8;
        }
        V5.c cVar3 = V5.c.MILLISECONDS;
        g.f(cVar3, "targetUnit");
        long e3 = (l0.e(cVar3.f3741q.convert(j7, cVar.f3741q), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        int i9 = V5.a.f3731t;
        int i10 = V5.b.f3733a;
        return e3;
    }

    public static long E(int i7, byte[] bArr) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int F(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        I i10 = (I) interfaceC0546y;
        i10.f(E(i8, bArr));
        int i11 = i8 + 8;
        while (i11 < i9) {
            int b02 = b0(bArr, i11, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            i10.f(E(b02, bArr));
            i11 = b02 + 8;
        }
        return i11;
    }

    public static Bundle F0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static float G(int i7, byte[] bArr) {
        return Float.intBitsToFloat(C(i7, bArr));
    }

    public static int H(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        r rVar = (r) interfaceC0546y;
        rVar.f(G(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int b02 = b0(bArr, i10, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            rVar.f(Float.intBitsToFloat(C(b02, bArr)));
            i10 = b02 + 4;
        }
        return i10;
    }

    public static int I(b0 b0Var, int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        int i10 = (i7 & (-8)) | 4;
        Object e3 = b0Var.e();
        int r02 = r0(e3, b0Var, bArr, i8, i9, i10, z12);
        b0Var.f(e3);
        z12.f8500c = e3;
        interfaceC0546y.add(e3);
        while (r02 < i9) {
            int b02 = b0(bArr, r02, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            Object e7 = b0Var.e();
            int r03 = r0(e7, b0Var, bArr, b02, i9, i10, z12);
            b0Var.f(e7);
            z12.f8500c = e7;
            interfaceC0546y.add(e7);
            r02 = r03;
        }
        return r02;
    }

    public static int J(b0 b0Var, int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        Object e3 = b0Var.e();
        int s02 = s0(e3, b0Var, bArr, i8, i9, z12);
        b0Var.f(e3);
        z12.f8500c = e3;
        interfaceC0546y.add(e3);
        while (s02 < i9) {
            int b02 = b0(bArr, s02, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            Object e7 = b0Var.e();
            int s03 = s0(e7, b0Var, bArr, b02, i9, z12);
            b0Var.f(e7);
            z12.f8500c = e7;
            interfaceC0546y.add(e7);
            s02 = s03;
        }
        return s02;
    }

    public static int K(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        boolean z7;
        AbstractC0526d abstractC0526d = (AbstractC0526d) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a + b02;
        while (b02 < i8) {
            b02 = d0(bArr, b02, z12);
            if (z12.f8499b != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            abstractC0526d.f(z7);
        }
        if (b02 == i8) {
            return b02;
        }
        throw B.g();
    }

    public static int L(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0534l abstractC0534l = (AbstractC0534l) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a + b02;
        while (b02 < i8) {
            abstractC0534l.f(Double.longBitsToDouble(E(b02, bArr)));
            b02 += 8;
        }
        if (b02 == i8) {
            return b02;
        }
        throw B.g();
    }

    public static int M(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0544w abstractC0544w = (AbstractC0544w) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a + b02;
        while (b02 < i8) {
            abstractC0544w.f(C(b02, bArr));
            b02 += 4;
        }
        if (b02 == i8) {
            return b02;
        }
        throw B.g();
    }

    public static int N(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        I i8 = (I) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i9 = z12.f8498a + b02;
        while (b02 < i9) {
            i8.f(E(b02, bArr));
            b02 += 8;
        }
        if (b02 == i9) {
            return b02;
        }
        throw B.g();
    }

    public static int O(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        r rVar = (r) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a + b02;
        while (b02 < i8) {
            rVar.f(Float.intBitsToFloat(C(b02, bArr)));
            b02 += 4;
        }
        if (b02 == i8) {
            return b02;
        }
        throw B.g();
    }

    public static int P(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0544w abstractC0544w = (AbstractC0544w) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a + b02;
        while (b02 < i8) {
            b02 = b0(bArr, b02, z12);
            abstractC0544w.f(e.d(z12.f8498a));
        }
        if (b02 == i8) {
            return b02;
        }
        throw B.g();
    }

    public static int Q(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        I i8 = (I) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i9 = z12.f8498a + b02;
        while (b02 < i9) {
            b02 = d0(bArr, b02, z12);
            i8.f(e.e(z12.f8499b));
        }
        if (b02 == i9) {
            return b02;
        }
        throw B.g();
    }

    public static int R(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0544w abstractC0544w = (AbstractC0544w) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a + b02;
        while (b02 < i8) {
            b02 = b0(bArr, b02, z12);
            abstractC0544w.f(z12.f8498a);
        }
        if (b02 == i8) {
            return b02;
        }
        throw B.g();
    }

    public static int S(byte[] bArr, int i7, InterfaceC0546y interfaceC0546y, Z1 z12) {
        I i8 = (I) interfaceC0546y;
        int b02 = b0(bArr, i7, z12);
        int i9 = z12.f8498a + b02;
        while (b02 < i9) {
            b02 = d0(bArr, b02, z12);
            i8.f(z12.f8499b);
        }
        if (b02 == i9) {
            return b02;
        }
        throw B.g();
    }

    public static int T(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0544w abstractC0544w = (AbstractC0544w) interfaceC0546y;
        int b02 = b0(bArr, i8, z12);
        while (true) {
            abstractC0544w.f(e.d(z12.f8498a));
            if (b02 >= i9) {
                break;
            }
            int b03 = b0(bArr, b02, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            b02 = b0(bArr, b03, z12);
        }
        return b02;
    }

    public static int U(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        I i10 = (I) interfaceC0546y;
        int d02 = d0(bArr, i8, z12);
        while (true) {
            i10.f(e.e(z12.f8499b));
            if (d02 >= i9) {
                break;
            }
            int b02 = b0(bArr, d02, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            d02 = d0(bArr, b02, z12);
        }
        return d02;
    }

    public static int V(byte[] bArr, int i7, Z1 z12) {
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a;
        if (i8 >= 0) {
            if (i8 == 0) {
                z12.f8500c = "";
                return b02;
            }
            z12.f8500c = new String(bArr, b02, i8, AbstractC0547z.f9165a);
            return b02 + i8;
        }
        throw B.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002e -> B:6:0x000c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0017 -> B:9:0x001b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int W(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.InterfaceC0546y r8, com.google.android.gms.internal.measurement.Z1 r9) {
        /*
            int r6 = b0(r5, r6, r9)
            int r0 = r9.f8498a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.AbstractC0547z.f9165a
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = b0(r5, r6, r9)
            int r2 = r9.f8498a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = b0(r5, r0, r9)
            int r0 = r9.f8498a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.AbstractC0547z.f9165a
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.crypto.tink.shaded.protobuf.B r4 = com.google.crypto.tink.shaded.protobuf.B.e()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.B r4 = com.google.crypto.tink.shaded.protobuf.B.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.W(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y, com.google.android.gms.internal.measurement.Z1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int X(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.InterfaceC0546y r9, com.google.android.gms.internal.measurement.Z1 r10) {
        /*
            int r7 = b0(r6, r7, r10)
            int r0 = r10.f8498a
            if (r0 < 0) goto L60
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
            r9.add(r1)
            goto L25
        L10:
            int r2 = r7 + r0
            p6.d r3 = com.google.crypto.tink.shaded.protobuf.q0.f9160a
            int r3 = r3.z(r6, r7, r2)
            if (r3 != 0) goto L5b
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.AbstractC0547z.f9165a
            r3.<init>(r6, r7, r0, r4)
        L21:
            r9.add(r3)
            r7 = r2
        L25:
            if (r7 >= r8) goto L5a
            int r0 = b0(r6, r7, r10)
            int r2 = r10.f8498a
            if (r5 == r2) goto L30
            goto L5a
        L30:
            int r7 = b0(r6, r0, r10)
            int r0 = r10.f8498a
            if (r0 < 0) goto L55
            if (r0 != 0) goto L3e
            r9.add(r1)
            goto L25
        L3e:
            int r2 = r7 + r0
            p6.d r3 = com.google.crypto.tink.shaded.protobuf.q0.f9160a
            int r3 = r3.z(r6, r7, r2)
            if (r3 != 0) goto L50
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.AbstractC0547z.f9165a
            r3.<init>(r6, r7, r0, r4)
            goto L21
        L50:
            com.google.crypto.tink.shaded.protobuf.B r5 = com.google.crypto.tink.shaded.protobuf.B.b()
            throw r5
        L55:
            com.google.crypto.tink.shaded.protobuf.B r5 = com.google.crypto.tink.shaded.protobuf.B.e()
            throw r5
        L5a:
            return r7
        L5b:
            com.google.crypto.tink.shaded.protobuf.B r5 = com.google.crypto.tink.shaded.protobuf.B.b()
            throw r5
        L60:
            com.google.crypto.tink.shaded.protobuf.B r5 = com.google.crypto.tink.shaded.protobuf.B.e()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.X(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y, com.google.android.gms.internal.measurement.Z1):int");
    }

    public static int Y(byte[] bArr, int i7, Z1 z12) {
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a;
        if (i8 >= 0) {
            if (i8 == 0) {
                z12.f8500c = "";
                return b02;
            }
            z12.f8500c = q0.f9160a.g(bArr, b02, i8);
            return b02 + i8;
        }
        throw B.e();
    }

    public static int Z(int i7, byte[] bArr, int i8, int i9, e0 e0Var, Z1 z12) {
        Object f;
        if ((i7 >>> 3) != 0) {
            int i10 = i7 & 7;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 5) {
                                e0Var.d(i7, Integer.valueOf(C(i8, bArr)));
                                return i8 + 4;
                            }
                            throw B.a();
                        }
                        e0 c5 = e0.c();
                        int i11 = (i7 & (-8)) | 4;
                        int i12 = 0;
                        while (true) {
                            if (i8 >= i9) {
                                break;
                            }
                            int b02 = b0(bArr, i8, z12);
                            int i13 = z12.f8498a;
                            i12 = i13;
                            if (i13 == i11) {
                                i8 = b02;
                                break;
                            }
                            int Z6 = Z(i12, bArr, b02, i9, c5, z12);
                            i12 = i13;
                            i8 = Z6;
                        }
                        if (i8 <= i9 && i12 == i11) {
                            e0Var.d(i7, c5);
                            return i8;
                        }
                        throw B.f();
                    }
                    int b03 = b0(bArr, i8, z12);
                    int i14 = z12.f8498a;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - b03) {
                            if (i14 == 0) {
                                f = AbstractC0530h.f9118r;
                            } else {
                                f = AbstractC0530h.f(bArr, b03, i14);
                            }
                            e0Var.d(i7, f);
                            return b03 + i14;
                        }
                        throw B.g();
                    }
                    throw B.e();
                }
                e0Var.d(i7, Long.valueOf(E(i8, bArr)));
                return i8 + 8;
            }
            int d02 = d0(bArr, i8, z12);
            e0Var.d(i7, Long.valueOf(z12.f8499b));
            return d02;
        }
        throw B.a();
    }

    public static void a(Throwable th, Throwable th2) {
        g.f(th, "<this>");
        g.f(th2, "exception");
        if (th != th2) {
            Integer num = H5.a.f1186a;
            if (num != null && num.intValue() < 19) {
                Method method = G5.a.f768a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static int a0(int i7, byte[] bArr, int i8, Z1 z12) {
        int i9;
        int i10 = i7 & 127;
        int i11 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            i9 = b7 << 7;
        } else {
            int i12 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
            int i13 = i8 + 2;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                z12.f8498a = i12 | (b8 << 14);
                return i13;
            }
            i10 = i12 | ((b8 & Byte.MAX_VALUE) << 14);
            i11 = i8 + 3;
            byte b9 = bArr[i13];
            if (b9 >= 0) {
                i9 = b9 << 21;
            } else {
                int i14 = i10 | ((b9 & Byte.MAX_VALUE) << 21);
                int i15 = i8 + 4;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    z12.f8498a = i14 | (b10 << 28);
                    return i15;
                }
                int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i17 = i15 + 1;
                    if (bArr[i15] < 0) {
                        i15 = i17;
                    } else {
                        z12.f8498a = i16;
                        return i17;
                    }
                }
            }
        }
        z12.f8498a = i10 | i9;
        return i11;
    }

    public static void b(CustomNavigationView customNavigationView, ValueAnimator valueAnimator) {
        valueAnimator.addUpdateListener(new C0123e(customNavigationView, 1));
        valueAnimator.setInterpolator(new AccelerateInterpolator());
        valueAnimator.setDuration(100L);
        valueAnimator.start();
    }

    public static int b0(byte[] bArr, int i7, Z1 z12) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            z12.f8498a = b7;
            return i8;
        }
        return a0(b7, bArr, i8, z12);
    }

    public static String c(int i7, int i8, String str) {
        if (i7 < 0) {
            return h4.b.B("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return h4.b.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int c0(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        AbstractC0544w abstractC0544w = (AbstractC0544w) interfaceC0546y;
        int b02 = b0(bArr, i8, z12);
        while (true) {
            abstractC0544w.f(z12.f8498a);
            if (b02 >= i9) {
                break;
            }
            int b03 = b0(bArr, b02, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            b02 = b0(bArr, b03, z12);
        }
        return b02;
    }

    public static boolean d(D.g[] gVarArr, D.g[] gVarArr2) {
        if (gVarArr == null || gVarArr2 == null || gVarArr.length != gVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < gVarArr.length; i7++) {
            D.g gVar = gVarArr[i7];
            char c5 = gVar.f433a;
            D.g gVar2 = gVarArr2[i7];
            if (c5 != gVar2.f433a || gVar.f434b.length != gVar2.f434b.length) {
                return false;
            }
        }
        return true;
    }

    public static int d0(byte[] bArr, int i7, Z1 z12) {
        byte b7;
        int i8 = i7 + 1;
        long j7 = bArr[i7];
        if (j7 >= 0) {
            z12.f8499b = j7;
            return i8;
        }
        int i9 = i7 + 2;
        byte b8 = bArr[i8];
        long j8 = (j7 & 127) | ((b8 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b8 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j8 |= (b7 & Byte.MAX_VALUE) << i10;
            b8 = bArr[i9];
            i9 = i11;
        }
        z12.f8499b = j8;
        return i9;
    }

    public static void e(long j7, String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(h4.b.B(str, Long.valueOf(j7)));
    }

    public static int e0(int i7, byte[] bArr, int i8, int i9, InterfaceC0546y interfaceC0546y, Z1 z12) {
        I i10 = (I) interfaceC0546y;
        int d02 = d0(bArr, i8, z12);
        while (true) {
            i10.f(z12.f8499b);
            if (d02 >= i9) {
                break;
            }
            int b02 = b0(bArr, d02, z12);
            if (i7 != z12.f8498a) {
                break;
            }
            d02 = d0(bArr, b02, z12);
        }
        return d02;
    }

    public static void f(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static D.g[] f0(D.g[] gVarArr) {
        D.g[] gVarArr2 = new D.g[gVarArr.length];
        for (int i7 = 0; i7 < gVarArr.length; i7++) {
            gVarArr2[i7] = new D.g(gVarArr[i7]);
        }
        return gVarArr2;
    }

    public static void g(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static Object g0(Class cls, Object obj) {
        if (obj instanceof InterfaceC1436a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC1437b) {
            return g0(cls, ((InterfaceC1437b) obj).k());
        }
        Class<?> cls2 = obj.getClass();
        throw new IllegalStateException("Given component holder " + cls2 + " does not implement " + InterfaceC1436a.class + " or " + InterfaceC1437b.class);
    }

    public static void h(int i7, int i8) {
        String B6;
        if (i7 >= 0 && i7 < i8) {
            return;
        }
        if (i7 >= 0) {
            if (i8 >= 0) {
                B6 = h4.b.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
            } else {
                StringBuilder sb = new StringBuilder(26);
                sb.append("negative size: ");
                sb.append(i8);
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            B6 = h4.b.B("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(B6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5.f337c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList h0(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            C.m r1 = new C.m
            r1.<init>(r0, r8)
            java.lang.Object r2 = C.o.f345c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = C.o.f344b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            C.l r5 = (C.l) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f336b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f337c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L92
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f337c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f335a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L91
        L54:
            java.lang.ThreadLocal r2 = C.o.f343a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = C.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8d
            C.o.a(r1, r9, r4, r8)
            r3 = r4
            goto L91
        L8d:
            android.content.res.ColorStateList r3 = C.k.b(r0, r9, r8)
        L91:
            return r3
        L92:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.h0(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static L i(TypedValue typedValue, L l7, L l8, String str, String str2) {
        if (l7 != null && l7 != l8) {
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        } else if (l7 == null) {
            return l8;
        } else {
            return l7;
        }
    }

    public static Drawable i0(Context context, int i7) {
        return C0915t0.d().f(context, i7);
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static C1298f j0(ComponentCallbacksC0269x componentCallbacksC0269x, Y y3) {
        i a7 = ((h1.g) ((InterfaceC1294b) g0(InterfaceC1294b.class, componentCallbacksC0269x))).f10876a.a();
        y3.getClass();
        return new C1298f((Set) a7.f14556r, y3, (D) a7.f14557s);
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void l(int i7, int i8) {
        if (i7 >= 0 && i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException(c(i7, i8, "index"));
    }

    public static void m(int i7, int i8, int i9) {
        String c5;
        if (i7 >= 0 && i8 >= i7 && i8 <= i9) {
            return;
        }
        if (i7 >= 0 && i7 <= i9) {
            if (i8 >= 0 && i8 <= i9) {
                c5 = h4.b.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            } else {
                c5 = c(i8, i9, "end index");
            }
        } else {
            c5 = c(i7, i9, "start index");
        }
        throw new IndexOutOfBoundsException(c5);
    }

    public static int n(Context context, String str) {
        int c5;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d = z.c.d(str);
        if (d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c6 = z.d.c(context);
                    c5 = z.d.a(c6, d, Binder.getCallingUid(), packageName);
                    if (c5 == 0) {
                        c5 = z.d.a(c6, d, myUid, z.d.b(context));
                    }
                } else {
                    c5 = z.c.c((AppOpsManager) z.c.a(context, AppOpsManager.class), d, packageName);
                }
            } else {
                c5 = z.c.c((AppOpsManager) z.c.a(context, AppOpsManager.class), d, packageName);
            }
            if (c5 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void o(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static int o0(int i7, int i8, int i9, int[] iArr) {
        while (i8 < i9) {
            if (iArr[i8] == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public static void p(boolean z7, String str, Object... objArr) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static boolean p0() {
        try {
            if (f5289b == null) {
                return D.b.s();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f5289b == null) {
                f5288a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f5289b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f5289b.invoke(null, Long.valueOf(f5288a))).booleanValue();
        } catch (Exception e3) {
            if (e3 instanceof InvocationTargetException) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
            return false;
        }
    }

    public static int q(long j7) {
        boolean z7;
        int i7 = (int) j7;
        if (i7 == j7) {
            z7 = true;
        } else {
            z7 = false;
        }
        e(j7, "Out of range: %s", z7);
        return i7;
    }

    public static boolean q0(MotionEvent motionEvent, int i7) {
        if ((motionEvent.getSource() & i7) == i7) {
            return true;
        }
        return false;
    }

    public static int r0(Object obj, b0 b0Var, byte[] bArr, int i7, int i8, int i9, Z1 z12) {
        int J6 = ((S) b0Var).J(obj, bArr, i7, i8, i9, z12);
        z12.f8500c = obj;
        return J6;
    }

    public static int s0(Object obj, b0 b0Var, byte[] bArr, int i7, int i8, Z1 z12) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = a0(i10, bArr, i9, z12);
            i10 = z12.f8498a;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = i10 + i11;
            b0Var.i(obj, bArr, i11, i12, z12);
            z12.f8500c = obj;
            return i12;
        }
        throw B.g();
    }

    public static int t(int i7, int i8) {
        if (i8 <= 1073741823) {
            return Math.min(Math.max(i7, i8), 1073741823);
        }
        throw new IllegalArgumentException(h4.b.B("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i8), 1073741823));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (h4.b.g(r9, r1, r3, r2, r8) == 1.0d) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap u(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, T0.f r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.u(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, T0.f, int, boolean):android.graphics.Bitmap");
    }

    public static float[] v(float[] fArr, int i7) {
        if (i7 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i7, length);
                float[] fArr2 = new float[i7];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D.g[] w(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.w(java.lang.String):D.g[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r9 = d0(r8, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r12.f8499b == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r12.f8499b != 0) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        r11.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r9 >= r10) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        r0 = b0(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r7 == r12.f8498a) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0010). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0012 -> B:6:0x0013). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x(int r7, byte[] r8, int r9, int r10, com.google.crypto.tink.shaded.protobuf.InterfaceC0546y r11, com.google.android.gms.internal.measurement.Z1 r12) {
        /*
            com.google.crypto.tink.shaded.protobuf.d r11 = (com.google.crypto.tink.shaded.protobuf.AbstractC0526d) r11
            int r9 = d0(r8, r9, r12)
            long r0 = r12.f8499b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L12
        L10:
            r0 = r4
            goto L13
        L12:
            r0 = r1
        L13:
            r11.f(r0)
            if (r9 >= r10) goto L2c
            int r0 = b0(r8, r9, r12)
            int r5 = r12.f8498a
            if (r7 == r5) goto L21
            goto L2c
        L21:
            int r9 = d0(r8, r0, r12)
            long r5 = r12.f8499b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.x(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y, com.google.android.gms.internal.measurement.Z1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h6.C0753c x0(h6.r r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.x0(h6.r):h6.c");
    }

    public static int y(byte[] bArr, int i7, Z1 z12) {
        int b02 = b0(bArr, i7, z12);
        int i8 = z12.f8498a;
        if (i8 >= 0) {
            if (i8 <= bArr.length - b02) {
                if (i8 == 0) {
                    z12.f8500c = AbstractC0530h.f9118r;
                    return b02;
                }
                z12.f8500c = AbstractC0530h.f(bArr, b02, i8);
                return b02 + i8;
            }
            throw B.g();
        }
        throw B.e();
    }

    public static D y0(y yVar) {
        yVar.G(1);
        int w7 = yVar.w();
        long j7 = yVar.f4692b + w7;
        int i7 = w7 / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long o7 = yVar.o();
            if (o7 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = o7;
            jArr2[i8] = yVar.o();
            yVar.G(2);
            i8++;
        }
        yVar.G((int) (j7 - yVar.f4692b));
        return new D(jArr, jArr2, 20, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = b0(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r2 == r7.f8498a) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4 = b0(r3, r0, r7);
        r0 = r7.f8498a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r0 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        throw com.google.crypto.tink.shaded.protobuf.B.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        throw com.google.crypto.tink.shaded.protobuf.B.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC0530h.f9118r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC0530h.f(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 >= r5) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0033 -> B:7:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0014 -> B:9:0x001c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int z(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.InterfaceC0546y r6, com.google.android.gms.internal.measurement.Z1 r7) {
        /*
            int r4 = b0(r3, r4, r7)
            int r0 = r7.f8498a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.crypto.tink.shaded.protobuf.g r0 = com.google.crypto.tink.shaded.protobuf.AbstractC0530h.f9118r
            r6.add(r0)
            goto L1c
        L14:
            com.google.crypto.tink.shaded.protobuf.g r1 = com.google.crypto.tink.shaded.protobuf.AbstractC0530h.f(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = b0(r3, r4, r7)
            int r1 = r7.f8498a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = b0(r3, r0, r7)
            int r0 = r7.f8498a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.crypto.tink.shaded.protobuf.B r2 = com.google.crypto.tink.shaded.protobuf.B.g()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.B r2 = com.google.crypto.tink.shaded.protobuf.B.e()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.B r2 = com.google.crypto.tink.shaded.protobuf.B.g()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.B r2 = com.google.crypto.tink.shaded.protobuf.B.e()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.z(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.y, com.google.android.gms.internal.measurement.Z1):int");
    }

    public static int z0(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public abstract boolean E0(View view, int i7);

    public float k0(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationX();
    }

    public float l0(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        return view.getTranslationY();
    }

    public int m0(View view) {
        return 0;
    }

    public int n0() {
        return 0;
    }

    public abstract int r(View view, int i7);

    public abstract int s(View view, int i7);

    public abstract void u0(int i7);

    public abstract void v0(View view, int i7, int i8);

    public abstract void w0(View view, float f, float f7);

    public void t0(View view, int i7) {
    }
}
