package a;

import G.c;
import K.N;
import K.O;
import L5.l;
import L5.p;
import M5.g;
import M5.r;
import U5.f;
import W5.AbstractC0117y;
import W5.C0109p;
import X.i;
import Y0.b;
import Z2.y;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b6.s;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import h6.K;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k3.AbstractC0958a;
import q.C1094d;
import v6.C1344i;
import z.h;
import z5.C1524f;
/* renamed from: a.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0189a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4954a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f4955b;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f4956c;
    public static Method d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f4957e;
    public static Constructor f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f4958g;

    public static int A(int i7, Rect rect, Rect rect2) {
        int height;
        int i8;
        int height2;
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i8 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i8));
        }
        height = (rect.height() / 2) + rect.top;
        i8 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i8));
    }

    public static void B() {
        if (f4956c == null || d == null || f4957e == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f4956c = cls.getConstructor(null);
            d = cls.getMethod("setRotationDegrees", Float.TYPE);
            f4957e = cls.getMethod("build", null);
        }
        if (f == null || f4958g == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            f = cls2.getConstructor(null);
            f4958g = cls2.getMethod("build", null);
        }
    }

    public static int E(int i7, y yVar) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return yVar.u() + 1;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return yVar.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static long F(y yVar, int i7, int i8) {
        yVar.F(i7);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int g7 = yVar.g();
        if ((8388608 & g7) != 0 || ((2096896 & g7) >> 8) != i8 || (g7 & 32) == 0 || yVar.u() < 7 || yVar.a() < 7 || (yVar.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yVar.e(bArr, 0, 6);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
    }

    public static final int G(C1344i c1344i, int i7) {
        g.f(c1344i, "<this>");
        if (i7 == -1234567890) {
            return c1344i.d();
        }
        return i7;
    }

    public static final Object H(s sVar, s sVar2, p pVar) {
        Object c0109p;
        Object R6;
        try {
            r.b(2, pVar);
            c0109p = pVar.j(sVar2, sVar);
        } catch (Throwable th) {
            c0109p = new C0109p(th, false);
        }
        E5.a aVar = E5.a.f612q;
        if (c0109p != aVar && (R6 = sVar.R(c0109p)) != AbstractC0117y.f4037e) {
            if (!(R6 instanceof C0109p)) {
                return AbstractC0117y.w(R6);
            }
            throw ((C0109p) R6).f4012a;
        }
        return aVar;
    }

    public static void J(Parcel parcel, int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int P6 = P(parcel, i7);
        parcel.writeBundle(bundle);
        Q(parcel, P6);
    }

    public static void K(Parcel parcel, int i7, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int P6 = P(parcel, i7);
        parcel.writeStrongBinder(iBinder);
        Q(parcel, P6);
    }

    public static void L(Parcel parcel, int i7, Parcelable parcelable, int i8) {
        if (parcelable == null) {
            return;
        }
        int P6 = P(parcel, i7);
        parcelable.writeToParcel(parcel, i8);
        Q(parcel, P6);
    }

    public static void M(Parcel parcel, int i7, String str) {
        if (str == null) {
            return;
        }
        int P6 = P(parcel, i7);
        parcel.writeString(str);
        Q(parcel, P6);
    }

    public static void N(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8) {
        if (parcelableArr == null) {
            return;
        }
        int P6 = P(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i8);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        Q(parcel, P6);
    }

    public static int O(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 != 0) {
                if (i10 == i7) {
                    return i9;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static int P(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void Q(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public static void R(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i8) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i8, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i8 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i8, 33);
    }

    public static void b(StringBuilder sb, Object obj, l lVar) {
        CharSequence valueOf;
        if (lVar != null) {
            obj = lVar.c(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
                return;
            }
            valueOf = String.valueOf(obj);
            sb.append(valueOf);
        }
        valueOf = (CharSequence) obj;
        sb.append(valueOf);
    }

    public static final boolean c(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        g.f(bArr, "a");
        g.f(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static int d(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility == 4) {
                return 4;
            }
            if (visibility == 8) {
                return 3;
            }
            throw new IllegalArgumentException(AbstractC0515y1.l("Unknown visibility ", visibility));
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, M5.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(P1.c r6, D5.d r7) {
        /*
            boolean r0 = r7 instanceof X0.b
            if (r0 == 0) goto L13
            r0 = r7
            X0.b r0 = (X0.b) r0
            int r1 = r0.f4056w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4056w = r1
            goto L18
        L13:
            X0.b r0 = new X0.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4055v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4056w
            z5.l r3 = z5.C1530l.f16479a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            M5.o r6 = r0.f4054u
            P1.c r0 = r0.f4053t
            k3.AbstractC0958a.H(r7)     // Catch: java.lang.Throwable -> L2d
            goto L71
        L2d:
            r7 = move-exception
            goto L80
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            k3.AbstractC0958a.H(r7)
            androidx.lifecycle.o r7 = r6.l()
            androidx.lifecycle.o r2 = androidx.lifecycle.EnumC0337o.f6820t
            int r7 = r7.compareTo(r2)
            if (r7 < 0) goto L47
            return r3
        L47:
            M5.o r7 = new M5.o
            r7.<init>()
            r0.f4053t = r6     // Catch: java.lang.Throwable -> L7b
            r0.f4054u = r7     // Catch: java.lang.Throwable -> L7b
            r0.f4056w = r4     // Catch: java.lang.Throwable -> L7b
            W5.g r2 = new W5.g     // Catch: java.lang.Throwable -> L7b
            D5.d r0 = w4.l0.x(r0)     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7b
            r2.w()     // Catch: java.lang.Throwable -> L7b
            coil.util.-Lifecycles$awaitStarted$2$1 r0 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch: java.lang.Throwable -> L7b
            r0.<init>()     // Catch: java.lang.Throwable -> L7b
            r7.f2315q = r0     // Catch: java.lang.Throwable -> L7b
            r6.g(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r2.v()     // Catch: java.lang.Throwable -> L7b
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r6
            r6 = r7
        L71:
            java.lang.Object r6 = r6.f2315q
            androidx.lifecycle.t r6 = (androidx.lifecycle.InterfaceC0341t) r6
            if (r6 == 0) goto L7a
            r0.v(r6)
        L7a:
            return r3
        L7b:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L80:
            java.lang.Object r6 = r6.f2315q
            androidx.lifecycle.t r6 = (androidx.lifecycle.InterfaceC0341t) r6
            if (r6 == 0) goto L89
            r0.v(r6)
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0189a.e(P1.c, D5.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r9 == 17) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r9 != 66) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        r11 = z(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r9 == 17) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r9 == 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r9 == 66) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r9 != 130) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = g(r9, r10, r11)
            boolean r1 = g(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = z(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0189a.f(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean g(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static final Bundle h(C1524f... c1524fArr) {
        Bundle bundle = new Bundle(c1524fArr.length);
        for (C1524f c1524f : c1524fArr) {
            String str = (String) c1524f.f16468q;
            Object obj = c1524f.f16469r;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                g.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else {
                if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        c.a(bundle, str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        c.b(bundle, str, (SizeF) obj);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r13 == r21.f) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
        if ((r20.u() * 1000) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
        if (r6 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(Z2.y r20, k2.C0951p r21, int r22, U4.k r23) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0189a.l(Z2.y, k2.p, int, U4.k):boolean");
    }

    public static final void m(long j7, long j8, long j9) {
        if ((j8 | j9) >= 0 && j8 <= j7 && j7 - j8 >= j9) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
    }

    public static int n(Context context, String str) {
        if (str != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                h hVar = new h(context);
                if (i7 >= 24) {
                    if (z.g.a(hVar.f16379a)) {
                        return 0;
                    }
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i8 = applicationInfo.uid;
                    try {
                        Class<?> cls = Class.forName(AppOpsManager.class.getName());
                        Class<?> cls2 = Integer.TYPE;
                        Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
                        Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                        num.getClass();
                        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i8), packageName)).intValue() == 0) {
                            return 0;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                        return 0;
                    }
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static boolean p(String str, String str2) {
        g.f(str, "current");
        if (g.a(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i7 < str.length()) {
                    char charAt = str.charAt(i7);
                    int i10 = i9 + 1;
                    if (i9 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i8++;
                    } else if (charAt == ')' && i8 - 1 == 0 && i9 != str.length() - 1) {
                        break;
                    }
                    i7++;
                    i9 = i10;
                } else if (i8 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return g.a(f.C0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, K.N] */
    public static boolean q(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        Field field = O.f1447a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = N.d;
        N n = (N) view.getTag(R.id.tag_unhandled_key_event_manager);
        N n7 = n;
        if (n == null) {
            ?? obj = new Object();
            obj.f1444a = null;
            obj.f1445b = null;
            obj.f1446c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            n7 = obj;
        }
        WeakReference weakReference2 = n7.f1446c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        n7.f1446c = new WeakReference(keyEvent);
        if (n7.f1445b == null) {
            n7.f1445b = new SparseArray();
        }
        SparseArray sparseArray = n7.f1445b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        AbstractC0515y1.v(arrayList.get(size));
        throw null;
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static K s(String str) {
        g.f(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return K.f11114t;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return K.f11113s;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return K.f11112r;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return K.f11115u;
            }
        } else if (str.equals("SSLv3")) {
            return K.f11116v;
        }
        throw new IllegalArgumentException(g.k(str, "Unexpected TLS version: "));
    }

    public static int t(View view, int i7) {
        return AbstractC0958a.E(i7, view.getContext(), view.getClass().getCanonicalName());
    }

    public static String u(Context context, int i7) {
        String valueOf;
        g.f(context, "context");
        if (i7 <= 16777215) {
            return String.valueOf(i7);
        }
        try {
            valueOf = context.getResources().getResourceName(i7);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i7);
        }
        g.e(valueOf, "try {\n                co….toString()\n            }");
        return valueOf;
    }

    public static final Serializable v(Y0.c cVar) {
        g.f(cVar, "<this>");
        if (cVar instanceof b) {
            return Boolean.TRUE;
        }
        if (cVar instanceof Y0.a) {
            return AbstractC0958a.m(((Y0.a) cVar).f4308a);
        }
        throw new RuntimeException();
    }

    public static final Object w(Y0.c cVar, J1.l lVar) {
        g.f(cVar, "<this>");
        g.f(lVar, "mapper");
        if (cVar instanceof b) {
            return lVar.s(((b) cVar).f4309a);
        }
        if (cVar instanceof Y0.a) {
            return AbstractC0958a.m(((Y0.a) cVar).f4308a);
        }
        throw new RuntimeException();
    }

    public static boolean x(int i7, Rect rect, Rect rect2) {
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 == 130) {
                        int i8 = rect.top;
                        int i9 = rect2.top;
                        if ((i8 >= i9 && rect.bottom > i9) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i10 = rect.left;
                int i11 = rect2.left;
                if ((i10 >= i11 && rect.right > i11) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 <= i13 && rect.top < i13) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i14 = rect.right;
        int i15 = rect2.right;
        if ((i14 <= i15 && rect.left < i15) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static int y(float f7, int i7, int i8) {
        return D.a.b(D.a.d(i8, Math.round(Color.alpha(i8) * f7)), i7);
    }

    public static int z(int i7, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i7 != 17) {
            if (i7 != 33) {
                if (i7 != 66) {
                    if (i7 == 130) {
                        i8 = rect2.top;
                        i9 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i8 = rect2.left;
                    i9 = rect.right;
                }
            } else {
                i8 = rect.top;
                i9 = rect2.bottom;
            }
        } else {
            i8 = rect.left;
            i9 = rect2.right;
        }
        return Math.max(0, i8 - i9);
    }

    public abstract void C(q.g gVar, q.g gVar2);

    public abstract void D(q.g gVar, Thread thread);

    public abstract void I(View view, View view2);

    public abstract boolean i(q.h hVar, C1094d c1094d, C1094d c1094d2);

    public abstract boolean j(q.h hVar, Object obj, Object obj2);

    public abstract boolean k(q.h hVar, q.g gVar, q.g gVar2);

    public abstract View o(RecyclerView recyclerView);
}
