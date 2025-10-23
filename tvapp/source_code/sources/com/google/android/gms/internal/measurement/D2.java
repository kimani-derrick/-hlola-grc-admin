package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class D2 implements L2 {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f8249m = new int[0];
    public static final Unsafe n = Q2.i();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8250a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8251b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8252c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final V1 f8253e;
    public final int[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8254g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8255h;

    /* renamed from: i  reason: collision with root package name */
    public final C0442j2 f8256i;

    /* renamed from: j  reason: collision with root package name */
    public final C0442j2 f8257j;

    /* renamed from: k  reason: collision with root package name */
    public final C0442j2 f8258k;

    /* renamed from: l  reason: collision with root package name */
    public final C0442j2 f8259l;

    public D2(int[] iArr, Object[] objArr, int i7, int i8, V1 v12, int[] iArr2, int i9, int i10, C0442j2 c0442j2) {
        C0442j2 c0442j22 = Q.f8397b;
        C0442j2 c0442j23 = M1.f8375b;
        C0442j2 c0442j24 = C1.f8238c;
        C0442j2 c0442j25 = AbstractC0447k2.f8600a;
        this.f8250a = iArr;
        this.f8251b = objArr;
        this.f8252c = i7;
        this.d = i8;
        boolean z7 = v12 instanceof AbstractC0457m2;
        this.f = iArr2;
        this.f8254g = i9;
        this.f8255h = i10;
        this.f8256i = c0442j22;
        this.f8257j = c0442j23;
        this.f8258k = c0442j24;
        this.f8253e = v12;
        this.f8259l = c0442j25;
    }

    public static long A(long j7, Object obj) {
        return ((Long) Q2.o(j7, obj)).longValue();
    }

    public static boolean E(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0457m2) {
            return ((AbstractC0457m2) obj).q();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.D2 l(com.google.android.gms.internal.measurement.J2 r31, com.google.android.gms.internal.measurement.C0442j2 r32) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D2.l(com.google.android.gms.internal.measurement.J2, com.google.android.gms.internal.measurement.j2):com.google.android.gms.internal.measurement.D2");
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int w(long j7, Object obj) {
        return ((Integer) Q2.o(j7, obj)).intValue();
    }

    public final InterfaceC0477q2 B(int i7) {
        return (InterfaceC0477q2) this.f8251b[((i7 / 3) << 1) + 1];
    }

    public final L2 C(int i7) {
        int i8 = (i7 / 3) << 1;
        Object[] objArr = this.f8251b;
        L2 l22 = (L2) objArr[i8];
        if (l22 != null) {
            return l22;
        }
        L2 a7 = I2.f8358c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a7;
        return a7;
    }

    public final Object D(int i7) {
        return this.f8251b[(i7 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final AbstractC0457m2 a() {
        this.f8256i.getClass();
        return (AbstractC0457m2) ((AbstractC0457m2) this.f8253e).g(4);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void b(Object obj, C0516y2 c0516y2) {
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        boolean z7;
        boolean z8;
        D2 d22 = this;
        c0516y2.getClass();
        int[] iArr2 = d22.f8250a;
        int length = iArr2.length;
        Unsafe unsafe = n;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            int v5 = d22.v(i14);
            int i15 = iArr2[i14];
            int i16 = (267386880 & v5) >>> 20;
            if (i16 <= 17) {
                int i17 = iArr2[i14 + 2];
                int i18 = i17 & i11;
                if (i18 != i12) {
                    if (i18 == i11) {
                        i13 = 0;
                    } else {
                        i13 = unsafe.getInt(obj, i18);
                    }
                    i12 = i18;
                }
                i7 = i12;
                i8 = i13;
                i9 = 1 << (i17 >>> 20);
            } else {
                i7 = i12;
                i8 = i13;
                i9 = 0;
            }
            long j7 = v5 & i11;
            C0412d2 c0412d2 = (C0412d2) c0516y2.f8717a;
            switch (i16) {
                case 0:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.e(i15, Q2.a(j7, obj));
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 1:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.f(i15, Q2.g(j7, obj));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 2:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.o(unsafe.getLong(obj, j7), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 3:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.u(unsafe.getLong(obj, j7), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 4:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.p(i15, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 5:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.k(unsafe.getLong(obj, j7), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.m(i15, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.j(i15, Q2.p(j7, obj));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 8:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof String) {
                            c0412d2.M(i15, 2);
                            c0412d2.s((String) object);
                        } else {
                            c0516y2.h(i15, (C0407c2) object);
                        }
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 9:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.n(i15, unsafe.getObject(obj, j7), d22.C(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 10:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.h(i15, (C0407c2) unsafe.getObject(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 11:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.v(i15, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 12:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.g(i15, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 13:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.r(i15, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 14:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.q(unsafe.getLong(obj, j7), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 15:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.t(i15, unsafe.getInt(obj, j7));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 16:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.s(unsafe.getLong(obj, j7), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 17:
                    iArr = iArr2;
                    i10 = length;
                    if (s(obj, i14, i7, i8, i9)) {
                        c0516y2.i(i15, unsafe.getObject(obj, j7), d22.C(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 18:
                    z7 = false;
                    C1.v(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 19:
                    z7 = false;
                    C1.I(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 20:
                    z7 = false;
                    C1.O(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 21:
                    z7 = false;
                    C1.Y(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 22:
                    z7 = false;
                    C1.L(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 23:
                    z7 = false;
                    C1.F(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 24:
                    z7 = false;
                    C1.C(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 25:
                    z7 = false;
                    C1.k(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 26:
                    C1.t(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2);
                    break;
                case 27:
                    C1.u(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, d22.C(i14));
                    break;
                case 28:
                    C1.i(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2);
                    break;
                case 29:
                    z8 = false;
                    C1.X(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 30:
                    z8 = false;
                    C1.z(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 31:
                    z8 = false;
                    C1.R(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 32:
                    z8 = false;
                    C1.U(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 33:
                    z8 = false;
                    C1.V(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 34:
                    z8 = false;
                    C1.W(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, false);
                    iArr = iArr2;
                    i10 = length;
                    i14 += 3;
                    i11 = 1048575;
                    d22 = this;
                    i12 = i7;
                    iArr2 = iArr;
                    i13 = i8;
                    length = i10;
                case 35:
                    C1.v(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 36:
                    C1.I(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 37:
                    C1.O(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 38:
                    C1.Y(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 39:
                    C1.L(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 40:
                    C1.F(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 41:
                    C1.C(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 42:
                    C1.k(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 43:
                    C1.X(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 44:
                    C1.z(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 45:
                    C1.R(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 46:
                    C1.U(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 47:
                    C1.V(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 48:
                    C1.W(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, true);
                    break;
                case 49:
                    C1.j(iArr2[i14], (List) unsafe.getObject(obj, j7), c0516y2, d22.C(i14));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j7) != null) {
                        Object D6 = d22.D(i14);
                        d22.f8259l.getClass();
                        C0442j2.g(D6);
                        throw null;
                    }
                    break;
                case 51:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.e(i15, ((Double) Q2.o(j7, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.f(i15, ((Float) Q2.o(j7, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.o(A(j7, obj), i15);
                        break;
                    }
                    break;
                case 54:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.u(A(j7, obj), i15);
                        break;
                    }
                    break;
                case 55:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.p(i15, w(j7, obj));
                        break;
                    }
                    break;
                case 56:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.k(A(j7, obj), i15);
                        break;
                    }
                    break;
                case 57:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.m(i15, w(j7, obj));
                        break;
                    }
                    break;
                case 58:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.j(i15, ((Boolean) Q2.o(j7, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (d22.x(i15, i14, obj)) {
                        Object object2 = unsafe.getObject(obj, j7);
                        if (object2 instanceof String) {
                            c0412d2.M(i15, 2);
                            c0412d2.s((String) object2);
                            break;
                        } else {
                            c0516y2.h(i15, (C0407c2) object2);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.n(i15, unsafe.getObject(obj, j7), d22.C(i14));
                        break;
                    }
                    break;
                case 61:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.h(i15, (C0407c2) unsafe.getObject(obj, j7));
                        break;
                    }
                    break;
                case 62:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.v(i15, w(j7, obj));
                        break;
                    }
                    break;
                case 63:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.g(i15, w(j7, obj));
                        break;
                    }
                    break;
                case 64:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.r(i15, w(j7, obj));
                        break;
                    }
                    break;
                case 65:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.q(A(j7, obj), i15);
                        break;
                    }
                    break;
                case 66:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.t(i15, w(j7, obj));
                        break;
                    }
                    break;
                case 67:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.s(A(j7, obj), i15);
                        break;
                    }
                    break;
                case 68:
                    if (d22.x(i15, i14, obj)) {
                        c0516y2.i(i15, unsafe.getObject(obj, j7), d22.C(i14));
                        break;
                    }
                    break;
            }
            iArr = iArr2;
            i10 = length;
            i14 += 3;
            i11 = 1048575;
            d22 = this;
            i12 = i7;
            iArr2 = iArr;
            i13 = i8;
            length = i10;
        }
        d22.f8258k.getClass();
        ((AbstractC0457m2) obj).zzb.d(c0516y2);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void c(Object obj, Object obj2) {
        P2 p22;
        long m7;
        int i7;
        if (E(obj)) {
            obj2.getClass();
            int i8 = 0;
            while (true) {
                int[] iArr = this.f8250a;
                if (i8 < iArr.length) {
                    int v5 = v(i8);
                    long j7 = v5 & 1048575;
                    int i9 = iArr[i8];
                    switch ((v5 & 267386880) >>> 20) {
                        case 0:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                Q2.e(obj, j7, Q2.f8400c.a(j7, obj2));
                                t(i8, obj);
                                break;
                            }
                        case 1:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                Q2.f(obj, j7, Q2.f8400c.i(j7, obj2));
                                t(i8, obj);
                                break;
                            }
                        case 2:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                p22 = Q2.f8400c;
                                m7 = p22.m(j7, obj2);
                                p22.f(obj, j7, m7);
                                t(i8, obj);
                                break;
                            }
                        case 3:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                p22 = Q2.f8400c;
                                m7 = p22.m(j7, obj2);
                                p22.f(obj, j7, m7);
                                t(i8, obj);
                                break;
                            }
                        case 4:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.c(Q2.f8400c.l(j7, obj2), j7, obj);
                            t(i8, obj);
                            break;
                        case 5:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                p22 = Q2.f8400c;
                                m7 = p22.m(j7, obj2);
                                p22.f(obj, j7, m7);
                                t(i8, obj);
                                break;
                            }
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.c(Q2.f8400c.l(j7, obj2), j7, obj);
                            t(i8, obj);
                            break;
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                Q2.l(obj, j7, Q2.f8400c.k(j7, obj2));
                                t(i8, obj);
                                break;
                            }
                        case 8:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.d(j7, obj, Q2.o(j7, obj2));
                            t(i8, obj);
                            break;
                        case 9:
                        case 17:
                            r(obj, obj2, i8);
                            break;
                        case 10:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.d(j7, obj, Q2.o(j7, obj2));
                            t(i8, obj);
                            break;
                        case 11:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.c(Q2.f8400c.l(j7, obj2), j7, obj);
                            t(i8, obj);
                            break;
                        case 12:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.c(Q2.f8400c.l(j7, obj2), j7, obj);
                            t(i8, obj);
                            break;
                        case 13:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.c(Q2.f8400c.l(j7, obj2), j7, obj);
                            t(i8, obj);
                            break;
                        case 14:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                p22 = Q2.f8400c;
                                m7 = p22.m(j7, obj2);
                                p22.f(obj, j7, m7);
                                t(i8, obj);
                                break;
                            }
                        case 15:
                            if (!y(i8, obj2)) {
                                break;
                            }
                            Q2.c(Q2.f8400c.l(j7, obj2), j7, obj);
                            t(i8, obj);
                            break;
                        case 16:
                            if (!y(i8, obj2)) {
                                break;
                            } else {
                                p22 = Q2.f8400c;
                                m7 = p22.m(j7, obj2);
                                p22.f(obj, j7, m7);
                                t(i8, obj);
                                break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f8257j.getClass();
                            InterfaceC0481r2 interfaceC0481r2 = (InterfaceC0481r2) Q2.o(j7, obj);
                            InterfaceC0481r2 interfaceC0481r22 = (InterfaceC0481r2) Q2.o(j7, obj2);
                            int size = interfaceC0481r2.size();
                            int size2 = interfaceC0481r22.size();
                            if (size > 0 && size2 > 0) {
                                if (!((W1) interfaceC0481r2).f8443q) {
                                    interfaceC0481r2 = interfaceC0481r2.d(size2 + size);
                                }
                                interfaceC0481r2.addAll(interfaceC0481r22);
                            }
                            if (size > 0) {
                                interfaceC0481r22 = interfaceC0481r2;
                            }
                            Q2.d(j7, obj, interfaceC0481r22);
                            break;
                        case 50:
                            Object o7 = Q2.o(j7, obj);
                            Object o8 = Q2.o(j7, obj2);
                            this.f8259l.getClass();
                            Q2.d(j7, obj, C0442j2.d(o7, o8));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (!x(i9, i8, obj2)) {
                                break;
                            } else {
                                Q2.d(j7, obj, Q2.o(j7, obj2));
                                i7 = iArr[i8 + 2];
                                Q2.c(i9, i7 & 1048575, obj);
                                break;
                            }
                        case 60:
                        case 68:
                            u(obj, i8, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!x(i9, i8, obj2)) {
                                break;
                            } else {
                                Q2.d(j7, obj, Q2.o(j7, obj2));
                                i7 = iArr[i8 + 2];
                                Q2.c(i9, i7 & 1048575, obj);
                                break;
                            }
                    }
                    i8 += 3;
                } else {
                    C1.m(this.f8258k, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03ae, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C0407c2) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ef, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C0407c2) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
        r0 = com.google.android.gms.internal.measurement.C0412d2.j((java.lang.String) r0, r13);
     */
    @Override // com.google.android.gms.internal.measurement.L2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D2.d(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void e(Object obj, byte[] bArr, int i7, int i8, Z1 z12) {
        k(obj, bArr, i7, i8, 0, z12);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void f(Object obj) {
        int i7;
        if (E(obj)) {
            if (obj instanceof AbstractC0457m2) {
                AbstractC0457m2 abstractC0457m2 = (AbstractC0457m2) obj;
                abstractC0457m2.m(Integer.MAX_VALUE);
                abstractC0457m2.zza = 0;
                abstractC0457m2.p();
            }
            int[] iArr = this.f8250a;
            int length = iArr.length;
            while (i7 < length) {
                int v5 = v(i7);
                long j7 = 1048575 & v5;
                int i8 = (v5 & 267386880) >>> 20;
                if (i8 != 9) {
                    if (i8 != 60 && i8 != 68) {
                        switch (i8) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f8257j.getClass();
                                C0442j2.j(j7, obj);
                                break;
                            case 50:
                                Unsafe unsafe = n;
                                Object object = unsafe.getObject(obj, j7);
                                if (object == null) {
                                    break;
                                } else {
                                    this.f8259l.getClass();
                                    C0442j2.k(object);
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                }
                        }
                    } else {
                        if (!x(iArr[i7], i7, obj)) {
                        }
                        C(i7).f(n.getObject(obj, j7));
                    }
                }
                i7 = y(i7, obj) ? 0 : i7 + 3;
                C(i7).f(n.getObject(obj, j7));
            }
            this.f8258k.getClass();
            C0442j2.n(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean g(Object obj, Object obj2) {
        int[] iArr = this.f8250a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int v5 = v(i7);
            long j7 = v5 & 1048575;
            switch ((v5 & 267386880) >>> 20) {
                case 0:
                    if (z(obj, i7, obj2)) {
                        P2 p22 = Q2.f8400c;
                        if (Double.doubleToLongBits(p22.a(j7, obj)) == Double.doubleToLongBits(p22.a(j7, obj2))) {
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (z(obj, i7, obj2)) {
                        P2 p23 = Q2.f8400c;
                        if (Float.floatToIntBits(p23.i(j7, obj)) == Float.floatToIntBits(p23.i(j7, obj2))) {
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (z(obj, i7, obj2)) {
                        P2 p24 = Q2.f8400c;
                        if (p24.m(j7, obj) == p24.m(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 3:
                    if (z(obj, i7, obj2)) {
                        P2 p25 = Q2.f8400c;
                        if (p25.m(j7, obj) == p25.m(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 4:
                    if (z(obj, i7, obj2)) {
                        P2 p26 = Q2.f8400c;
                        if (p26.l(j7, obj) == p26.l(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 5:
                    if (z(obj, i7, obj2)) {
                        P2 p27 = Q2.f8400c;
                        if (p27.m(j7, obj) == p27.m(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (z(obj, i7, obj2)) {
                        P2 p28 = Q2.f8400c;
                        if (p28.l(j7, obj) == p28.l(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (z(obj, i7, obj2)) {
                        P2 p29 = Q2.f8400c;
                        if (p29.k(j7, obj) == p29.k(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 8:
                    if (z(obj, i7, obj2) && C1.o(Q2.o(j7, obj), Q2.o(j7, obj2))) {
                        break;
                    }
                    return false;
                case 9:
                    if (z(obj, i7, obj2) && C1.o(Q2.o(j7, obj), Q2.o(j7, obj2))) {
                        break;
                    }
                    return false;
                case 10:
                    if (z(obj, i7, obj2) && C1.o(Q2.o(j7, obj), Q2.o(j7, obj2))) {
                        break;
                    }
                    return false;
                case 11:
                    if (z(obj, i7, obj2)) {
                        P2 p210 = Q2.f8400c;
                        if (p210.l(j7, obj) == p210.l(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (z(obj, i7, obj2)) {
                        P2 p211 = Q2.f8400c;
                        if (p211.l(j7, obj) == p211.l(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (z(obj, i7, obj2)) {
                        P2 p212 = Q2.f8400c;
                        if (p212.l(j7, obj) == p212.l(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (z(obj, i7, obj2)) {
                        P2 p213 = Q2.f8400c;
                        if (p213.m(j7, obj) == p213.m(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (z(obj, i7, obj2)) {
                        P2 p214 = Q2.f8400c;
                        if (p214.l(j7, obj) == p214.l(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (z(obj, i7, obj2)) {
                        P2 p215 = Q2.f8400c;
                        if (p215.m(j7, obj) == p215.m(j7, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (z(obj, i7, obj2) && C1.o(Q2.o(j7, obj), Q2.o(j7, obj2))) {
                        break;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (C1.o(Q2.o(j7, obj), Q2.o(j7, obj2))) {
                        break;
                    } else {
                        return false;
                    }
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j8 = iArr[i7 + 2] & 1048575;
                    P2 p216 = Q2.f8400c;
                    if (p216.l(j8, obj) == p216.l(j8, obj2) && C1.o(Q2.o(j7, obj), Q2.o(j7, obj2))) {
                        break;
                    }
                    return false;
            }
        }
        this.f8258k.getClass();
        if (!((AbstractC0457m2) obj).zzb.equals(((AbstractC0457m2) obj2).zzb)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (r4 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0126, code lost:
        if (r4 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
        r10 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0154, code lost:
        if (r4 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016f, code lost:
        if (r4 != false) goto L48;
     */
    @Override // com.google.android.gms.internal.measurement.L2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D2.h(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean i(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f8254g) {
            int i12 = this.f[i11];
            int[] iArr = this.f8250a;
            int i13 = iArr[i12];
            int v5 = v(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = n.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & v5) != 0 && !s(obj, i12, i7, i8, i16)) {
                return false;
            }
            int i17 = (267386880 & v5) >>> 20;
            if (i17 != 9 && i17 != 17) {
                if (i17 != 27) {
                    if (i17 != 60 && i17 != 68) {
                        if (i17 != 49) {
                            if (i17 != 50) {
                                continue;
                            } else {
                                Object o7 = Q2.o(v5 & 1048575, obj);
                                this.f8259l.getClass();
                                if (!C0442j2.l(o7).isEmpty()) {
                                    C0442j2.g(D(i12));
                                    throw null;
                                }
                            }
                        }
                    } else if (x(i13, i12, obj) && !C(i12).i(Q2.o(v5 & 1048575, obj))) {
                        return false;
                    }
                }
                List list = (List) Q2.o(v5 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    L2 C3 = C(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!C3.i(list.get(i18))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (s(obj, i12, i7, i8, i16) && !C(i12).i(Q2.o(v5 & 1048575, obj))) {
                return false;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return true;
    }

    public final int j(int i7, int i8) {
        int[] iArr = this.f8250a;
        int length = (iArr.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0684, code lost:
        if (r2 == 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0686, code lost:
        r15.add(com.google.android.gms.internal.measurement.C0407c2.f8526s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x068c, code lost:
        r15.add(com.google.android.gms.internal.measurement.C0407c2.f(r42, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0694, code lost:
        if (r1 >= r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0696, code lost:
        r2 = com.google.android.gms.internal.measurement.M1.p(r42, r1, r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x069c, code lost:
        if (r11 != r46.f8498a) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x069e, code lost:
        r1 = com.google.android.gms.internal.measurement.M1.p(r42, r2, r46);
        r2 = r46.f8498a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x06a4, code lost:
        if (r2 < 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x06a8, code lost:
        if (r2 > (r42.length - r1)) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x06aa, code lost:
        if (r2 != 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x06b1, code lost:
        throw com.google.android.gms.internal.measurement.C0496u2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x06b6, code lost:
        throw com.google.android.gms.internal.measurement.C0496u2.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0cd9, code lost:
        if (r13 == 1048575) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0cdb, code lost:
        r35.putInt(r14, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ce1, code lost:
        r1 = r40.f8254g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0ce7, code lost:
        if (r1 >= r40.f8255h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0ce9, code lost:
        r2 = r40.f[r1];
        r3 = r21[r2];
        r3 = com.google.android.gms.internal.measurement.Q2.o(v(r2) & 1048575, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0cfc, code lost:
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0d03, code lost:
        if (B(r2) != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0d05, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0d08, code lost:
        r22.getClass();
        r3 = (com.google.android.gms.internal.measurement.B2) r3;
        com.google.android.gms.internal.measurement.C0442j2.g(D(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0d14, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0d17, code lost:
        if (r7 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0d19, code lost:
        if (r8 != r44) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0d20, code lost:
        throw com.google.android.gms.internal.measurement.C0496u2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0d21, code lost:
        if (r8 > r44) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0d23, code lost:
        if (r11 != r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0d25, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0d2a, code lost:
        throw com.google.android.gms.internal.measurement.C0496u2.d();
     */
    /* JADX WARN: Removed duplicated region for block: B:249:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0c7b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c8f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x068c -> B:215:0x0694). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x06aa -> B:213:0x0686). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:247:0x0726 -> B:248:0x072a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:253:0x073c -> B:245:0x071b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:268:0x0778 -> B:269:0x077c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x078e -> B:264:0x0765). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(java.lang.Object r41, byte[] r42, int r43, int r44, int r45, com.google.android.gms.internal.measurement.Z1 r46) {
        /*
            Method dump skipped, instructions count: 3536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D2.k(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.Z1):int");
    }

    public final Object m(int i7, int i8, Object obj) {
        L2 C3 = C(i8);
        if (!x(i7, i8, obj)) {
            return C3.a();
        }
        Object object = n.getObject(obj, v(i8) & 1048575);
        if (E(object)) {
            return object;
        }
        AbstractC0457m2 a7 = C3.a();
        if (object != null) {
            C3.c(a7, object);
        }
        return a7;
    }

    public final Object n(int i7, Object obj) {
        L2 C3 = C(i7);
        long v5 = v(i7) & 1048575;
        if (!y(i7, obj)) {
            return C3.a();
        }
        Object object = n.getObject(obj, v5);
        if (E(object)) {
            return object;
        }
        AbstractC0457m2 a7 = C3.a();
        if (object != null) {
            C3.c(a7, object);
        }
        return a7;
    }

    public final void p(Object obj, int i7, Object obj2) {
        n.putObject(obj, v(i7) & 1048575, obj2);
        t(i7, obj);
    }

    public final void q(Object obj, int i7, Object obj2, int i8) {
        n.putObject(obj, v(i8) & 1048575, obj2);
        Q2.c(i7, this.f8250a[i8 + 2] & 1048575, obj);
    }

    public final void r(Object obj, Object obj2, int i7) {
        if (y(i7, obj2)) {
            long v5 = v(i7) & 1048575;
            Unsafe unsafe = n;
            Object object = unsafe.getObject(obj2, v5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f8250a[i7] + " is present but null: " + String.valueOf(obj2));
            }
            L2 C3 = C(i7);
            if (!y(i7, obj)) {
                if (E(object)) {
                    AbstractC0457m2 a7 = C3.a();
                    C3.c(a7, object);
                    unsafe.putObject(obj, v5, a7);
                } else {
                    unsafe.putObject(obj, v5, object);
                }
                t(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, v5);
            if (!E(object2)) {
                AbstractC0457m2 a8 = C3.a();
                C3.c(a8, object2);
                unsafe.putObject(obj, v5, a8);
                object2 = a8;
            }
            C3.c(object2, object);
        }
    }

    public final boolean s(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? y(i7, obj) : (i9 & i10) != 0;
    }

    public final void t(int i7, Object obj) {
        int i8 = this.f8250a[i7 + 2];
        long j7 = 1048575 & i8;
        if (j7 == 1048575) {
            return;
        }
        Q2.c((1 << (i8 >>> 20)) | Q2.f8400c.l(j7, obj), j7, obj);
    }

    public final void u(Object obj, int i7, Object obj2) {
        int[] iArr = this.f8250a;
        int i8 = iArr[i7];
        if (!x(i8, i7, obj2)) {
            return;
        }
        long v5 = v(i7) & 1048575;
        Unsafe unsafe = n;
        Object object = unsafe.getObject(obj2, v5);
        if (object != null) {
            L2 C3 = C(i7);
            if (!x(i8, i7, obj)) {
                if (!E(object)) {
                    unsafe.putObject(obj, v5, object);
                } else {
                    AbstractC0457m2 a7 = C3.a();
                    C3.c(a7, object);
                    unsafe.putObject(obj, v5, a7);
                }
                Q2.c(i8, iArr[i7 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, v5);
            if (!E(object2)) {
                AbstractC0457m2 a8 = C3.a();
                C3.c(a8, object2);
                unsafe.putObject(obj, v5, a8);
                object2 = a8;
            }
            C3.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + String.valueOf(obj2));
    }

    public final int v(int i7) {
        return this.f8250a[i7 + 1];
    }

    public final boolean x(int i7, int i8, Object obj) {
        if (Q2.f8400c.l(this.f8250a[i8 + 2] & 1048575, obj) == i7) {
            return true;
        }
        return false;
    }

    public final boolean y(int i7, Object obj) {
        int i8 = this.f8250a[i7 + 2];
        long j7 = i8 & 1048575;
        if (j7 == 1048575) {
            int v5 = v(i7);
            long j8 = v5 & 1048575;
            switch ((v5 & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(Q2.f8400c.a(j8, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(Q2.f8400c.i(j8, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (Q2.f8400c.m(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (Q2.f8400c.m(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (Q2.f8400c.l(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (Q2.f8400c.m(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (Q2.f8400c.l(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return Q2.f8400c.k(j8, obj);
                case 8:
                    Object o7 = Q2.o(j8, obj);
                    if (o7 instanceof String) {
                        if (((String) o7).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (o7 instanceof C0407c2) {
                        if (C0407c2.f8526s.equals(o7)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (Q2.o(j8, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (C0407c2.f8526s.equals(Q2.o(j8, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (Q2.f8400c.l(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (Q2.f8400c.l(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (Q2.f8400c.l(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (Q2.f8400c.m(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (Q2.f8400c.l(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (Q2.f8400c.m(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (Q2.o(j8, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & Q2.f8400c.l(j7, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean z(Object obj, int i7, Object obj2) {
        if (y(i7, obj) == y(i7, obj2)) {
            return true;
        }
        return false;
    }
}
