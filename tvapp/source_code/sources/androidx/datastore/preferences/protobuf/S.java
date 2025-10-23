package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import r0.AbstractC1111a;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class S implements InterfaceC0223b0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f5715o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f5716p = s0.l();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f5717a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f5718b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5719c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0220a f5720e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5721g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f5722h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5723i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5724j;

    /* renamed from: k  reason: collision with root package name */
    public final U f5725k;

    /* renamed from: l  reason: collision with root package name */
    public final H f5726l;

    /* renamed from: m  reason: collision with root package name */
    public final k0 f5727m;
    public final N n;

    public S(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0220a abstractC0220a, boolean z7, int[] iArr2, int i9, int i10, U u7, H h7, k0 k0Var, C0236o c0236o, N n) {
        this.f5717a = iArr;
        this.f5718b = objArr;
        this.f5719c = i7;
        this.d = i8;
        this.f = abstractC0220a instanceof AbstractC0243w;
        this.f5721g = z7;
        this.f5722h = iArr2;
        this.f5723i = i9;
        this.f5724j = i10;
        this.f5725k = u7;
        this.f5726l = h7;
        this.f5727m = k0Var;
        this.f5720e = abstractC0220a;
        this.n = n;
    }

    public static int A(long j7, Object obj) {
        return ((Integer) s0.d.i(j7, obj)).intValue();
    }

    public static long B(long j7, Object obj) {
        return ((Long) s0.d.i(j7, obj)).longValue();
    }

    public static Field H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder u7 = AbstractC1111a.u("Field ", str, " for ");
            u7.append(cls.getName());
            u7.append(" not found. Known fields are ");
            u7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(u7.toString());
        }
    }

    public static int K(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void O(int i7, Object obj, K k5) {
        if (obj instanceof String) {
            ((C0232k) k5.f5705a).g0((String) obj, i7);
            return;
        }
        k5.b(i7, (C0228g) obj);
    }

    public static List s(long j7, Object obj) {
        return (List) s0.d.i(j7, obj);
    }

    public static S x(C0221a0 c0221a0, U u7, H h7, k0 k0Var, C0236o c0236o, N n) {
        if (c0221a0 instanceof C0221a0) {
            return y(c0221a0, u7, h7, k0Var, c0236o, n);
        }
        AbstractC0515y1.v(c0221a0);
        throw null;
    }

    public static S y(C0221a0 c0221a0, U u7, H h7, k0 k0Var, C0236o c0236o, N n) {
        boolean z7;
        int i7;
        int charAt;
        int charAt2;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str;
        char c5;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field H6;
        int i34;
        char charAt11;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        Field H7;
        Field H8;
        int i40;
        char charAt12;
        int i41;
        char charAt13;
        int i42;
        char charAt14;
        int i43;
        char charAt15;
        char charAt16;
        int i44 = 0;
        if (c0221a0.d() == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        String c6 = c0221a0.c();
        int length = c6.length();
        int charAt17 = c6.charAt(0);
        if (charAt17 >= 55296) {
            int i45 = charAt17 & 8191;
            int i46 = 1;
            int i47 = 13;
            while (true) {
                i7 = i46 + 1;
                charAt16 = c6.charAt(i46);
                if (charAt16 < 55296) {
                    break;
                }
                i45 |= (charAt16 & 8191) << i47;
                i47 += 13;
                i46 = i7;
            }
            charAt17 = i45 | (charAt16 << i47);
        } else {
            i7 = 1;
        }
        int i48 = i7 + 1;
        int charAt18 = c6.charAt(i7);
        if (charAt18 >= 55296) {
            int i49 = charAt18 & 8191;
            int i50 = 13;
            while (true) {
                i43 = i48 + 1;
                charAt15 = c6.charAt(i48);
                if (charAt15 < 55296) {
                    break;
                }
                i49 |= (charAt15 & 8191) << i50;
                i50 += 13;
                i48 = i43;
            }
            charAt18 = i49 | (charAt15 << i50);
            i48 = i43;
        }
        if (charAt18 == 0) {
            i12 = 0;
            charAt = 0;
            charAt2 = 0;
            i11 = 0;
            i9 = 0;
            iArr = f5715o;
            i10 = 0;
        } else {
            int i51 = i48 + 1;
            int charAt19 = c6.charAt(i48);
            if (charAt19 >= 55296) {
                int i52 = charAt19 & 8191;
                int i53 = 13;
                while (true) {
                    i20 = i51 + 1;
                    charAt10 = c6.charAt(i51);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i52 |= (charAt10 & 8191) << i53;
                    i53 += 13;
                    i51 = i20;
                }
                charAt19 = i52 | (charAt10 << i53);
                i51 = i20;
            }
            int i54 = i51 + 1;
            int charAt20 = c6.charAt(i51);
            if (charAt20 >= 55296) {
                int i55 = charAt20 & 8191;
                int i56 = 13;
                while (true) {
                    i19 = i54 + 1;
                    charAt9 = c6.charAt(i54);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i55 |= (charAt9 & 8191) << i56;
                    i56 += 13;
                    i54 = i19;
                }
                charAt20 = i55 | (charAt9 << i56);
                i54 = i19;
            }
            int i57 = i54 + 1;
            charAt = c6.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i18 = i57 + 1;
                    charAt8 = c6.charAt(i57);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i58 |= (charAt8 & 8191) << i59;
                    i59 += 13;
                    i57 = i18;
                }
                charAt = i58 | (charAt8 << i59);
                i57 = i18;
            }
            int i60 = i57 + 1;
            charAt2 = c6.charAt(i57);
            if (charAt2 >= 55296) {
                int i61 = charAt2 & 8191;
                int i62 = 13;
                while (true) {
                    i17 = i60 + 1;
                    charAt7 = c6.charAt(i60);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i61 |= (charAt7 & 8191) << i62;
                    i62 += 13;
                    i60 = i17;
                }
                charAt2 = i61 | (charAt7 << i62);
                i60 = i17;
            }
            int i63 = i60 + 1;
            int charAt21 = c6.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i16 = i63 + 1;
                    charAt6 = c6.charAt(i63);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i64 |= (charAt6 & 8191) << i65;
                    i65 += 13;
                    i63 = i16;
                }
                charAt21 = i64 | (charAt6 << i65);
                i63 = i16;
            }
            int i66 = i63 + 1;
            int charAt22 = c6.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i15 = i66 + 1;
                    charAt5 = c6.charAt(i66);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i67 |= (charAt5 & 8191) << i68;
                    i68 += 13;
                    i66 = i15;
                }
                charAt22 = i67 | (charAt5 << i68);
                i66 = i15;
            }
            int i69 = i66 + 1;
            int charAt23 = c6.charAt(i66);
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i14 = i71 + 1;
                    charAt4 = c6.charAt(i71);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i70 |= (charAt4 & 8191) << i72;
                    i72 += 13;
                    i71 = i14;
                }
                charAt23 = i70 | (charAt4 << i72);
                i8 = i14;
            } else {
                i8 = i69;
            }
            int i73 = i8 + 1;
            int charAt24 = c6.charAt(i8);
            if (charAt24 >= 55296) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i13 = i75 + 1;
                    charAt3 = c6.charAt(i75);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i74 |= (charAt3 & 8191) << i76;
                    i76 += 13;
                    i75 = i13;
                }
                charAt24 = i74 | (charAt3 << i76);
                i73 = i13;
            }
            i9 = (charAt19 * 2) + charAt20;
            i10 = charAt22;
            i11 = charAt24;
            i44 = charAt19;
            i48 = i73;
            int i77 = charAt21;
            iArr = new int[charAt24 + charAt22 + charAt23];
            i12 = i77;
        }
        Unsafe unsafe = f5716p;
        Object[] b7 = c0221a0.b();
        Class<?> cls = c0221a0.a().getClass();
        int i78 = i48;
        int[] iArr2 = new int[i12 * 3];
        Object[] objArr = new Object[i12 * 2];
        int i79 = i11 + i10;
        int i80 = i11;
        int i81 = i78;
        int i82 = i79;
        int i83 = 0;
        int i84 = 0;
        while (i81 < length) {
            int i85 = i81 + 1;
            int charAt25 = c6.charAt(i81);
            if (charAt25 >= 55296) {
                int i86 = charAt25 & 8191;
                int i87 = i85;
                int i88 = 13;
                while (true) {
                    i42 = i87 + 1;
                    charAt14 = c6.charAt(i87);
                    i21 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i86 |= (charAt14 & 8191) << i88;
                    i88 += 13;
                    i87 = i42;
                    length = i21;
                }
                charAt25 = i86 | (charAt14 << i88);
                i22 = i42;
            } else {
                i21 = length;
                i22 = i85;
            }
            int i89 = i22 + 1;
            int charAt26 = c6.charAt(i22);
            if (charAt26 >= 55296) {
                int i90 = charAt26 & 8191;
                int i91 = i89;
                int i92 = 13;
                while (true) {
                    i41 = i91 + 1;
                    charAt13 = c6.charAt(i91);
                    i23 = i11;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i90 |= (charAt13 & 8191) << i92;
                    i92 += 13;
                    i91 = i41;
                    i11 = i23;
                }
                charAt26 = i90 | (charAt13 << i92);
                i24 = i41;
            } else {
                i23 = i11;
                i24 = i89;
            }
            int i93 = charAt26 & 255;
            boolean z8 = z7;
            if ((charAt26 & 1024) != 0) {
                iArr[i83] = i84;
                i83++;
            }
            if (i93 >= 51) {
                int i94 = i24 + 1;
                int charAt27 = c6.charAt(i24);
                if (charAt27 >= 55296) {
                    int i95 = charAt27 & 8191;
                    int i96 = i94;
                    int i97 = 13;
                    while (true) {
                        i40 = i96 + 1;
                        charAt12 = c6.charAt(i96);
                        i25 = charAt2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i95 |= (charAt12 & 8191) << i97;
                        i97 += 13;
                        i96 = i40;
                        charAt2 = i25;
                    }
                    charAt27 = i95 | (charAt12 << i97);
                    i38 = i40;
                } else {
                    i25 = charAt2;
                    i38 = i94;
                }
                int i98 = i93 - 51;
                int i99 = i38;
                if (i98 != 9 && i98 != 17) {
                    if (i98 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i84 / 3) * 2) + 1] = b7[i9];
                        i9++;
                    }
                    i39 = 2;
                } else {
                    i39 = 2;
                    objArr[((i84 / 3) * 2) + 1] = b7[i9];
                    i9++;
                }
                int i100 = charAt27 * i39;
                Object obj = b7[i100];
                if (obj instanceof Field) {
                    H7 = (Field) obj;
                } else {
                    H7 = H(cls, (String) obj);
                    b7[i100] = H7;
                }
                int i101 = charAt;
                int objectFieldOffset = (int) unsafe.objectFieldOffset(H7);
                int i102 = i100 + 1;
                Object obj2 = b7[i102];
                if (obj2 instanceof Field) {
                    H8 = (Field) obj2;
                } else {
                    H8 = H(cls, (String) obj2);
                    b7[i102] = H8;
                }
                i33 = objectFieldOffset;
                c5 = 2;
                i27 = charAt26;
                i32 = i9;
                str = c6;
                i30 = (int) unsafe.objectFieldOffset(H8);
                i31 = 0;
                i26 = i101;
                i29 = i99;
            } else {
                i25 = charAt2;
                int i103 = charAt;
                int i104 = i9 + 1;
                Field H9 = H(cls, (String) b7[i9]);
                i26 = i103;
                if (i93 == 9 || i93 == 17) {
                    i27 = charAt26;
                    i28 = 1;
                    objArr[((i84 / 3) * 2) + 1] = H9.getType();
                } else {
                    if (i93 == 27 || i93 == 49) {
                        i27 = charAt26;
                        i28 = 1;
                        i35 = i9 + 2;
                        objArr[((i84 / 3) * 2) + 1] = b7[i104];
                    } else if (i93 != 12 && i93 != 30 && i93 != 44) {
                        if (i93 == 50) {
                            int i105 = i80 + 1;
                            iArr[i80] = i84;
                            int i106 = (i84 / 3) * 2;
                            int i107 = i9 + 2;
                            objArr[i106] = b7[i104];
                            if ((charAt26 & 2048) != 0) {
                                i104 = i9 + 3;
                                objArr[i106 + 1] = b7[i107];
                                i27 = charAt26;
                                i80 = i105;
                                i28 = 1;
                            } else {
                                i80 = i105;
                                i104 = i107;
                            }
                        }
                        i27 = charAt26;
                        i28 = 1;
                    } else {
                        i27 = charAt26;
                        i28 = 1;
                        if ((charAt17 & 1) == 1) {
                            i35 = i9 + 2;
                            objArr[((i84 / 3) * 2) + 1] = b7[i104];
                        }
                    }
                    i104 = i35;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(H9);
                if ((charAt17 & 1) == i28 && i93 <= 17) {
                    i29 = i24 + 1;
                    int charAt28 = c6.charAt(i24);
                    if (charAt28 >= 55296) {
                        int i108 = charAt28 & 8191;
                        int i109 = 13;
                        while (true) {
                            i34 = i29 + 1;
                            charAt11 = c6.charAt(i29);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i108 |= (charAt11 & 8191) << i109;
                            i109 += 13;
                            i29 = i34;
                        }
                        charAt28 = i108 | (charAt11 << i109);
                        i29 = i34;
                    }
                    c5 = 2;
                    int i110 = (charAt28 / 32) + (i44 * 2);
                    Object obj3 = b7[i110];
                    if (obj3 instanceof Field) {
                        H6 = (Field) obj3;
                    } else {
                        H6 = H(cls, (String) obj3);
                        b7[i110] = H6;
                    }
                    str = c6;
                    i30 = (int) unsafe.objectFieldOffset(H6);
                    i31 = charAt28 % 32;
                } else {
                    str = c6;
                    c5 = 2;
                    i29 = i24;
                    i30 = 0;
                    i31 = 0;
                }
                if (i93 >= 18 && i93 <= 49) {
                    iArr[i82] = objectFieldOffset2;
                    i82++;
                }
                i32 = i104;
                i33 = objectFieldOffset2;
            }
            int i111 = i84 + 1;
            iArr2[i84] = charAt25;
            int i112 = i84 + 2;
            int i113 = i32;
            int i114 = i27;
            int i115 = i44;
            if ((i114 & 512) != 0) {
                i36 = 536870912;
            } else {
                i36 = 0;
            }
            if ((i114 & 256) != 0) {
                i37 = 268435456;
            } else {
                i37 = 0;
            }
            iArr2[i111] = i37 | i36 | (i93 << 20) | i33;
            i84 += 3;
            iArr2[i112] = i30 | (i31 << 20);
            i81 = i29;
            c6 = str;
            z7 = z8;
            i9 = i113;
            charAt = i26;
            length = i21;
            i11 = i23;
            i44 = i115;
            charAt2 = i25;
        }
        return new S(iArr2, objArr, charAt, charAt2, c0221a0.a(), z7, iArr, i11, i79, u7, h7, k0Var, c0236o, n);
    }

    public static long z(int i7) {
        return i7 & 1048575;
    }

    public final int C(int i7) {
        if (i7 < this.f5719c || i7 > this.d) {
            return -1;
        }
        int[] iArr = this.f5717a;
        int length = (iArr.length / 3) - 1;
        int i8 = 0;
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

    public final void D(Object obj, long j7, C0230i c0230i, InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        c0230i.B(this.f5726l.c(j7, obj), interfaceC0223b0, c0235n);
    }

    public final void E(Object obj, int i7, C0230i c0230i, InterfaceC0223b0 interfaceC0223b0, C0235n c0235n) {
        c0230i.J(this.f5726l.c(i7 & 1048575, obj), interfaceC0223b0, c0235n);
    }

    public final void F(Object obj, int i7, C0230i c0230i) {
        boolean z7;
        long j7;
        Object l7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j7 = i7 & 1048575;
            l7 = c0230i.W();
        } else if (this.f) {
            j7 = i7 & 1048575;
            l7 = c0230i.S();
        } else {
            j7 = i7 & 1048575;
            l7 = c0230i.l();
        }
        s0.r(j7, obj, l7);
    }

    public final void G(Object obj, int i7, C0230i c0230i) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        H h7 = this.f5726l;
        if (z7) {
            c0230i.V(h7.c(i7 & 1048575, obj));
        } else {
            c0230i.T(h7.c(i7 & 1048575, obj));
        }
    }

    public final void I(int i7, Object obj) {
        if (this.f5721g) {
            return;
        }
        int i8 = this.f5717a[i7 + 2];
        long j7 = i8 & 1048575;
        s0.p(s0.d.g(j7, obj) | (1 << (i8 >>> 20)), j7, obj);
    }

    public final void J(int i7, int i8, Object obj) {
        s0.p(i7, this.f5717a[i8 + 2] & 1048575, obj);
    }

    public final int L(int i7) {
        return this.f5717a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, K k5) {
        int i7;
        boolean z7;
        int[] iArr = this.f5717a;
        int length = iArr.length;
        Unsafe unsafe = f5716p;
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int L6 = L(i10);
            int i11 = iArr[i10];
            int K6 = K(L6);
            if (!this.f5721g && K6 <= 17) {
                int i12 = iArr[i10 + 2];
                int i13 = i12 & 1048575;
                if (i13 != i8) {
                    i9 = unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i7 = 1 << (i12 >>> 20);
            } else {
                i7 = 0;
            }
            long j7 = L6 & 1048575;
            switch (K6) {
                case 0:
                    if ((i7 & i9) != 0) {
                        k5.c(i11, s0.d.e(j7, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i7 & i9) != 0) {
                        k5.g(i11, s0.d.f(j7, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i9) != 0) {
                        k5.j(unsafe.getLong(obj, j7), i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i9) != 0) {
                        k5.q(unsafe.getLong(obj, j7), i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i9) != 0) {
                        k5.i(i11, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i7 & i9) != 0) {
                        k5.f(unsafe.getLong(obj, j7), i11);
                        break;
                    } else {
                        break;
                    }
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i7 & i9) != 0) {
                        k5.e(i11, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i7 & i9) != 0) {
                        k5.a(i11, s0.d.c(j7, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i9) != 0) {
                        O(i11, unsafe.getObject(obj, j7), k5);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i7 & i9) != 0) {
                        k5.k(i11, unsafe.getObject(obj, j7), n(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i7 & i9) != 0) {
                        k5.b(i11, (C0228g) unsafe.getObject(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i7 & i9) != 0) {
                        k5.p(i11, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i9) != 0) {
                        k5.d(i11, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i7 & i9) != 0) {
                        k5.l(i11, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i7 & i9) != 0) {
                        k5.m(unsafe.getLong(obj, j7), i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i7 & i9) != 0) {
                        k5.n(i11, unsafe.getInt(obj, j7));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i7 & i9) != 0) {
                        k5.o(unsafe.getLong(obj, j7), i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i9) != 0) {
                        k5.h(i11, unsafe.getObject(obj, j7), n(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c0.F(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 19:
                    c0.J(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 20:
                    c0.M(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 21:
                    c0.U(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 22:
                    c0.L(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 23:
                    c0.I(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 24:
                    c0.H(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 25:
                    c0.D(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 26:
                    c0.S(iArr[i10], (List) unsafe.getObject(obj, j7), k5);
                    break;
                case 27:
                    c0.N(iArr[i10], (List) unsafe.getObject(obj, j7), k5, n(i10));
                    break;
                case 28:
                    c0.E(iArr[i10], (List) unsafe.getObject(obj, j7), k5);
                    break;
                case 29:
                    z7 = false;
                    c0.T(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 30:
                    z7 = false;
                    c0.G(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 31:
                    z7 = false;
                    c0.O(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 32:
                    z7 = false;
                    c0.P(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 33:
                    z7 = false;
                    c0.Q(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 34:
                    z7 = false;
                    c0.R(iArr[i10], (List) unsafe.getObject(obj, j7), k5, false);
                    break;
                case 35:
                    c0.F(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 36:
                    c0.J(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 37:
                    c0.M(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 38:
                    c0.U(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 39:
                    c0.L(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 40:
                    c0.I(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 41:
                    c0.H(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 42:
                    c0.D(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 43:
                    c0.T(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 44:
                    c0.G(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 45:
                    c0.O(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 46:
                    c0.P(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 47:
                    c0.Q(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 48:
                    c0.R(iArr[i10], (List) unsafe.getObject(obj, j7), k5, true);
                    break;
                case 49:
                    c0.K(iArr[i10], (List) unsafe.getObject(obj, j7), k5, n(i10));
                    break;
                case 50:
                    N(k5, i11, unsafe.getObject(obj, j7), i10);
                    break;
                case 51:
                    if (r(i11, i10, obj)) {
                        k5.c(i11, ((Double) s0.d.i(j7, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (r(i11, i10, obj)) {
                        k5.g(i11, ((Float) s0.d.i(j7, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (r(i11, i10, obj)) {
                        k5.j(B(j7, obj), i11);
                    }
                    break;
                case 54:
                    if (r(i11, i10, obj)) {
                        k5.q(B(j7, obj), i11);
                    }
                    break;
                case 55:
                    if (r(i11, i10, obj)) {
                        k5.i(i11, A(j7, obj));
                    }
                    break;
                case 56:
                    if (r(i11, i10, obj)) {
                        k5.f(B(j7, obj), i11);
                    }
                    break;
                case 57:
                    if (r(i11, i10, obj)) {
                        k5.e(i11, A(j7, obj));
                    }
                    break;
                case 58:
                    if (r(i11, i10, obj)) {
                        k5.a(i11, ((Boolean) s0.d.i(j7, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i11, i10, obj)) {
                        O(i11, unsafe.getObject(obj, j7), k5);
                    }
                    break;
                case 60:
                    if (r(i11, i10, obj)) {
                        k5.k(i11, unsafe.getObject(obj, j7), n(i10));
                    }
                    break;
                case 61:
                    if (r(i11, i10, obj)) {
                        k5.b(i11, (C0228g) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (r(i11, i10, obj)) {
                        k5.p(i11, A(j7, obj));
                    }
                    break;
                case 63:
                    if (r(i11, i10, obj)) {
                        k5.d(i11, A(j7, obj));
                    }
                    break;
                case 64:
                    if (r(i11, i10, obj)) {
                        k5.l(i11, A(j7, obj));
                    }
                    break;
                case 65:
                    if (r(i11, i10, obj)) {
                        k5.m(B(j7, obj), i11);
                    }
                    break;
                case 66:
                    if (r(i11, i10, obj)) {
                        k5.n(i11, A(j7, obj));
                    }
                    break;
                case 67:
                    if (r(i11, i10, obj)) {
                        k5.o(B(j7, obj), i11);
                    }
                    break;
                case 68:
                    if (r(i11, i10, obj)) {
                        k5.h(i11, unsafe.getObject(obj, j7), n(i10));
                    }
                    break;
            }
        }
        this.f5727m.getClass();
        ((AbstractC0243w) obj).unknownFields.d(k5);
    }

    public final void N(K k5, int i7, Object obj, int i8) {
        Object obj2;
        Object obj3;
        int O5;
        int a7;
        int M6;
        Object obj4;
        Object obj5;
        int a8;
        int M7;
        if (obj != null) {
            Object m7 = m(i8);
            this.n.getClass();
            C4.b bVar = ((L) m7).f5706a;
            C0232k c0232k = (C0232k) k5.f5705a;
            c0232k.getClass();
            for (Map.Entry entry : ((M) obj).entrySet()) {
                c0232k.i0(i7, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                A0 a02 = (A0) bVar.f421r;
                int i9 = C0238q.f5805c;
                int K6 = C0232k.K(1);
                x0 x0Var = A0.f5671t;
                if (a02 == x0Var) {
                    K6 *= 2;
                }
                int i10 = 8;
                switch (a02.ordinal()) {
                    case 0:
                        obj2 = (Double) key;
                        obj2.getClass();
                        O5 = 8;
                        break;
                    case 1:
                        obj3 = (Float) key;
                        obj3.getClass();
                        O5 = 4;
                        break;
                    case 2:
                        O5 = C0232k.O(((Long) key).longValue());
                        break;
                    case 3:
                        O5 = C0232k.O(((Long) key).longValue());
                        break;
                    case 4:
                        O5 = C0232k.C(((Integer) key).intValue());
                        break;
                    case 5:
                    case 15:
                        obj2 = (Long) key;
                        obj2.getClass();
                        O5 = 8;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 14:
                        obj3 = (Integer) key;
                        obj3.getClass();
                        O5 = 4;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) key).getClass();
                        O5 = 1;
                        break;
                    case 8:
                        if (!(key instanceof C0228g)) {
                            O5 = C0232k.J((String) key);
                            break;
                        }
                        O5 = C0232k.u((C0228g) key);
                        break;
                    case 9:
                        O5 = ((AbstractC0220a) key).a();
                        break;
                    case 10:
                        a7 = ((AbstractC0220a) key).a();
                        M6 = C0232k.M(a7);
                        O5 = a7 + M6;
                        break;
                    case 11:
                        if (!(key instanceof C0228g)) {
                            a7 = ((byte[]) key).length;
                            M6 = C0232k.M(a7);
                            O5 = a7 + M6;
                            break;
                        }
                        O5 = C0232k.u((C0228g) key);
                        break;
                    case 12:
                        O5 = C0232k.M(((Integer) key).intValue());
                        break;
                    case 13:
                        O5 = C0232k.C(((Integer) key).intValue());
                        break;
                    case 16:
                        int intValue = ((Integer) key).intValue();
                        O5 = C0232k.M((intValue >> 31) ^ (intValue << 1));
                        break;
                    case 17:
                        long longValue = ((Long) key).longValue();
                        O5 = C0232k.O((longValue << 1) ^ (longValue >> 63));
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
                int i11 = O5 + K6;
                int K7 = C0232k.K(2);
                A0 a03 = (A0) bVar.f423t;
                if (a03 == x0Var) {
                    K7 *= 2;
                }
                switch (a03.ordinal()) {
                    case 0:
                        obj4 = (Double) value;
                        obj4.getClass();
                        break;
                    case 1:
                        obj5 = (Float) value;
                        obj5.getClass();
                        i10 = 4;
                        break;
                    case 2:
                        i10 = C0232k.O(((Long) value).longValue());
                        break;
                    case 3:
                        i10 = C0232k.O(((Long) value).longValue());
                        break;
                    case 4:
                        i10 = C0232k.C(((Integer) value).intValue());
                        break;
                    case 5:
                    case 15:
                        obj4 = (Long) value;
                        obj4.getClass();
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 14:
                        obj5 = (Integer) value;
                        obj5.getClass();
                        i10 = 4;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) value).getClass();
                        i10 = 1;
                        break;
                    case 8:
                        if (!(value instanceof C0228g)) {
                            i10 = C0232k.J((String) value);
                            break;
                        }
                        i10 = C0232k.u((C0228g) value);
                        break;
                    case 9:
                        i10 = ((AbstractC0220a) value).a();
                        break;
                    case 10:
                        a8 = ((AbstractC0220a) value).a();
                        M7 = C0232k.M(a8);
                        i10 = M7 + a8;
                        break;
                    case 11:
                        if (!(value instanceof C0228g)) {
                            a8 = ((byte[]) value).length;
                            M7 = C0232k.M(a8);
                            i10 = M7 + a8;
                            break;
                        }
                        i10 = C0232k.u((C0228g) value);
                        break;
                    case 12:
                        i10 = C0232k.M(((Integer) value).intValue());
                        break;
                    case 13:
                        i10 = C0232k.C(((Integer) value).intValue());
                        break;
                    case 16:
                        int intValue2 = ((Integer) value).intValue();
                        i10 = C0232k.M((intValue2 >> 31) ^ (intValue2 << 1));
                        break;
                    case 17:
                        long longValue2 = ((Long) value).longValue();
                        i10 = C0232k.O((longValue2 << 1) ^ (longValue2 >> 63));
                        break;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
                c0232k.k0(i10 + K7 + i11);
                Object key2 = entry.getKey();
                Object value2 = entry.getValue();
                C0238q.b(c0232k, (A0) bVar.f421r, 1, key2);
                C0238q.b(c0232k, a03, 2, value2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011e A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.a(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void b(Object obj, Object obj2) {
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f5717a;
            if (i7 < iArr.length) {
                int L6 = L(i7);
                long j7 = 1048575 & L6;
                int i8 = iArr[i7];
                switch (K(L6)) {
                    case 0:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            r0 r0Var = s0.d;
                            r0Var.m(obj, j7, r0Var.e(j7, obj2));
                            I(i7, obj);
                            break;
                        }
                    case 1:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            r0 r0Var2 = s0.d;
                            r0Var2.n(obj, j7, r0Var2.f(j7, obj2));
                            I(i7, obj);
                            break;
                        }
                    case 2:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.q(obj, j7, s0.d.h(j7, obj2));
                        I(i7, obj);
                        break;
                    case 3:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.q(obj, j7, s0.d.h(j7, obj2));
                        I(i7, obj);
                        break;
                    case 4:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.p(s0.d.g(j7, obj2), j7, obj);
                        I(i7, obj);
                        break;
                    case 5:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.q(obj, j7, s0.d.h(j7, obj2));
                        I(i7, obj);
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.p(s0.d.g(j7, obj2), j7, obj);
                        I(i7, obj);
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            r0 r0Var3 = s0.d;
                            r0Var3.k(obj, j7, r0Var3.c(j7, obj2));
                            I(i7, obj);
                            break;
                        }
                    case 8:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.r(j7, obj, s0.d.i(j7, obj2));
                        I(i7, obj);
                        break;
                    case 9:
                    case 17:
                        v(obj, i7, obj2);
                        break;
                    case 10:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.r(j7, obj, s0.d.i(j7, obj2));
                        I(i7, obj);
                        break;
                    case 11:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.p(s0.d.g(j7, obj2), j7, obj);
                        I(i7, obj);
                        break;
                    case 12:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.p(s0.d.g(j7, obj2), j7, obj);
                        I(i7, obj);
                        break;
                    case 13:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.p(s0.d.g(j7, obj2), j7, obj);
                        I(i7, obj);
                        break;
                    case 14:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.q(obj, j7, s0.d.h(j7, obj2));
                        I(i7, obj);
                        break;
                    case 15:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.p(s0.d.g(j7, obj2), j7, obj);
                        I(i7, obj);
                        break;
                    case 16:
                        if (!q(i7, obj2)) {
                            break;
                        }
                        s0.q(obj, j7, s0.d.h(j7, obj2));
                        I(i7, obj);
                        break;
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
                        this.f5726l.b(j7, obj, obj2);
                        break;
                    case 50:
                        Class cls = c0.f5745a;
                        r0 r0Var4 = s0.d;
                        Object i9 = r0Var4.i(j7, obj);
                        Object i10 = r0Var4.i(j7, obj2);
                        this.n.getClass();
                        s0.r(j7, obj, N.b(i9, i10));
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
                        if (!r(i8, i7, obj2)) {
                            break;
                        }
                        s0.r(j7, obj, s0.d.i(j7, obj2));
                        J(i8, i7, obj);
                        break;
                    case 60:
                    case 68:
                        w(obj, i7, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!r(i8, i7, obj2)) {
                            break;
                        }
                        s0.r(j7, obj, s0.d.i(j7, obj2));
                        J(i8, i7, obj);
                        break;
                }
                i7 += 3;
            } else if (!this.f5721g) {
                c0.B(this.f5727m, obj, obj2);
                return;
            } else {
                return;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final boolean c(Object obj, Object obj2) {
        r0 r0Var;
        Object i7;
        int[] iArr = this.f5717a;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int L6 = L(i8);
            long j7 = L6 & 1048575;
            switch (K(L6)) {
                case 0:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var2 = s0.d;
                        if (Double.doubleToLongBits(r0Var2.e(j7, obj)) == Double.doubleToLongBits(r0Var2.e(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var3 = s0.d;
                        if (Float.floatToIntBits(r0Var3.f(j7, obj)) == Float.floatToIntBits(r0Var3.f(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var4 = s0.d;
                        if (r0Var4.h(j7, obj) == r0Var4.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var5 = s0.d;
                        if (r0Var5.h(j7, obj) == r0Var5.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var6 = s0.d;
                        if (r0Var6.g(j7, obj) == r0Var6.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var7 = s0.d;
                        if (r0Var7.h(j7, obj) == r0Var7.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var8 = s0.d;
                        if (r0Var8.g(j7, obj) == r0Var8.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var9 = s0.d;
                        if (r0Var9.c(j7, obj) == r0Var9.c(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var10 = s0.d;
                        if (c0.C(r0Var10.i(j7, obj), r0Var10.i(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var11 = s0.d;
                        if (c0.C(r0Var11.i(j7, obj), r0Var11.i(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var12 = s0.d;
                        if (c0.C(r0Var12.i(j7, obj), r0Var12.i(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var13 = s0.d;
                        if (r0Var13.g(j7, obj) == r0Var13.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var14 = s0.d;
                        if (r0Var14.g(j7, obj) == r0Var14.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var15 = s0.d;
                        if (r0Var15.g(j7, obj) == r0Var15.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var16 = s0.d;
                        if (r0Var16.h(j7, obj) == r0Var16.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var17 = s0.d;
                        if (r0Var17.g(j7, obj) == r0Var17.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var18 = s0.d;
                        if (r0Var18.h(j7, obj) == r0Var18.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (j(obj, i8, obj2)) {
                        r0 r0Var19 = s0.d;
                        if (c0.C(r0Var19.i(j7, obj), r0Var19.i(j7, obj2))) {
                            continue;
                        }
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
                    r0Var = s0.d;
                    i7 = r0Var.i(j7, obj);
                    break;
                case 50:
                    r0Var = s0.d;
                    i7 = r0Var.i(j7, obj);
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j8 = iArr[i8 + 2] & 1048575;
                    r0 r0Var20 = s0.d;
                    if (r0Var20.g(j8, obj) == r0Var20.g(j8, obj2) && c0.C(r0Var20.i(j7, obj), r0Var20.i(j7, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!c0.C(i7, r0Var.i(j7, obj2))) {
                return false;
            }
        }
        this.f5727m.getClass();
        if (!((AbstractC0243w) obj).unknownFields.equals(((AbstractC0243w) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final int d(Object obj) {
        return this.f5721g ? p(obj) : o(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final Object e() {
        this.f5725k.getClass();
        return ((AbstractC0243w) this.f5720e).d(4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void f(Object obj) {
        int[] iArr;
        int i7;
        int i8 = this.f5723i;
        while (true) {
            iArr = this.f5722h;
            i7 = this.f5724j;
            if (i8 >= i7) {
                break;
            }
            long L6 = L(iArr[i8]) & 1048575;
            Object i9 = s0.d.i(L6, obj);
            if (i9 != null) {
                this.n.getClass();
                ((M) i9).f5710q = false;
                s0.r(L6, obj, i9);
            }
            i8++;
        }
        int length = iArr.length;
        while (i7 < length) {
            this.f5726l.a(iArr[i7], obj);
            i7++;
        }
        this.f5727m.getClass();
        ((AbstractC0243w) obj).unknownFields.f5790e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r4 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
        r10 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0128, code lost:
        r3 = (r3 * 53) + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0168, code lost:
        if (r4 != false) goto L51;
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.g(java.lang.Object):int");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void h(Object obj, C0230i c0230i, C0235n c0235n) {
        c0235n.getClass();
        t(this.f5727m, obj, c0230i, c0235n);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0223b0
    public final void i(Object obj, K k5) {
        double e3;
        float f;
        long h7;
        long h8;
        int g7;
        long h9;
        int g8;
        boolean c5;
        long j7;
        long j8;
        long j9;
        int g9;
        int g10;
        int g11;
        long h10;
        int g12;
        long h11;
        long j10;
        k5.getClass();
        if (this.f5721g) {
            int[] iArr = this.f5717a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int L6 = L(i7);
                int i8 = iArr[i7];
                switch (K(L6)) {
                    case 0:
                        if (q(i7, obj)) {
                            e3 = s0.d.e(L6 & 1048575, obj);
                            k5.c(i8, e3);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (q(i7, obj)) {
                            f = s0.d.f(L6 & 1048575, obj);
                            k5.g(i8, f);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (q(i7, obj)) {
                            h7 = s0.d.h(L6 & 1048575, obj);
                            k5.j(h7, i8);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (q(i7, obj)) {
                            h8 = s0.d.h(L6 & 1048575, obj);
                            k5.q(h8, i8);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (q(i7, obj)) {
                            g7 = s0.d.g(L6 & 1048575, obj);
                            k5.i(i8, g7);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (q(i7, obj)) {
                            h9 = s0.d.h(L6 & 1048575, obj);
                            k5.f(h9, i8);
                            break;
                        } else {
                            break;
                        }
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (q(i7, obj)) {
                            g8 = s0.d.g(L6 & 1048575, obj);
                            k5.e(i8, g8);
                            break;
                        } else {
                            break;
                        }
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (q(i7, obj)) {
                            c5 = s0.d.c(L6 & 1048575, obj);
                            k5.a(i8, c5);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (q(i7, obj)) {
                            j7 = L6 & 1048575;
                            O(i8, s0.d.i(j7, obj), k5);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (q(i7, obj)) {
                            j8 = L6 & 1048575;
                            k5.k(i8, s0.d.i(j8, obj), n(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (q(i7, obj)) {
                            j9 = L6 & 1048575;
                            k5.b(i8, (C0228g) s0.d.i(j9, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (q(i7, obj)) {
                            g9 = s0.d.g(L6 & 1048575, obj);
                            k5.p(i8, g9);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (q(i7, obj)) {
                            g10 = s0.d.g(L6 & 1048575, obj);
                            k5.d(i8, g10);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (q(i7, obj)) {
                            g11 = s0.d.g(L6 & 1048575, obj);
                            k5.l(i8, g11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (q(i7, obj)) {
                            h10 = s0.d.h(L6 & 1048575, obj);
                            k5.m(h10, i8);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (q(i7, obj)) {
                            g12 = s0.d.g(L6 & 1048575, obj);
                            k5.n(i8, g12);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (q(i7, obj)) {
                            h11 = s0.d.h(L6 & 1048575, obj);
                            k5.o(h11, i8);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (q(i7, obj)) {
                            j10 = L6 & 1048575;
                            k5.h(i8, s0.d.i(j10, obj), n(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c0.F(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 19:
                        c0.J(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 20:
                        c0.M(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 21:
                        c0.U(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 22:
                        c0.L(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 23:
                        c0.I(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 24:
                        c0.H(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 25:
                        c0.D(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 26:
                        c0.S(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5);
                        break;
                    case 27:
                        c0.N(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, n(i7));
                        break;
                    case 28:
                        c0.E(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5);
                        break;
                    case 29:
                        c0.T(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 30:
                        c0.G(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 31:
                        c0.O(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 32:
                        c0.P(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 33:
                        c0.Q(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 34:
                        c0.R(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, false);
                        break;
                    case 35:
                        c0.F(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 36:
                        c0.J(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 37:
                        c0.M(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 38:
                        c0.U(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 39:
                        c0.L(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 40:
                        c0.I(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 41:
                        c0.H(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 42:
                        c0.D(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 43:
                        c0.T(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 44:
                        c0.G(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 45:
                        c0.O(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 46:
                        c0.P(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 47:
                        c0.Q(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 48:
                        c0.R(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, true);
                        break;
                    case 49:
                        c0.K(iArr[i7], (List) s0.d.i(L6 & 1048575, obj), k5, n(i7));
                        break;
                    case 50:
                        N(k5, i8, s0.d.i(L6 & 1048575, obj), i7);
                        break;
                    case 51:
                        if (r(i8, i7, obj)) {
                            e3 = ((Double) s0.d.i(L6 & 1048575, obj)).doubleValue();
                            k5.c(i8, e3);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (r(i8, i7, obj)) {
                            f = ((Float) s0.d.i(L6 & 1048575, obj)).floatValue();
                            k5.g(i8, f);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (r(i8, i7, obj)) {
                            h7 = B(L6 & 1048575, obj);
                            k5.j(h7, i8);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (r(i8, i7, obj)) {
                            h8 = B(L6 & 1048575, obj);
                            k5.q(h8, i8);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (r(i8, i7, obj)) {
                            g7 = A(L6 & 1048575, obj);
                            k5.i(i8, g7);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (r(i8, i7, obj)) {
                            h9 = B(L6 & 1048575, obj);
                            k5.f(h9, i8);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (r(i8, i7, obj)) {
                            g8 = A(L6 & 1048575, obj);
                            k5.e(i8, g8);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (r(i8, i7, obj)) {
                            c5 = ((Boolean) s0.d.i(L6 & 1048575, obj)).booleanValue();
                            k5.a(i8, c5);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (r(i8, i7, obj)) {
                            j7 = L6 & 1048575;
                            O(i8, s0.d.i(j7, obj), k5);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (r(i8, i7, obj)) {
                            j8 = L6 & 1048575;
                            k5.k(i8, s0.d.i(j8, obj), n(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (r(i8, i7, obj)) {
                            j9 = L6 & 1048575;
                            k5.b(i8, (C0228g) s0.d.i(j9, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (r(i8, i7, obj)) {
                            g9 = A(L6 & 1048575, obj);
                            k5.p(i8, g9);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (r(i8, i7, obj)) {
                            g10 = A(L6 & 1048575, obj);
                            k5.d(i8, g10);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (r(i8, i7, obj)) {
                            g11 = A(L6 & 1048575, obj);
                            k5.l(i8, g11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (r(i8, i7, obj)) {
                            h10 = B(L6 & 1048575, obj);
                            k5.m(h10, i8);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (r(i8, i7, obj)) {
                            g12 = A(L6 & 1048575, obj);
                            k5.n(i8, g12);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (r(i8, i7, obj)) {
                            h11 = B(L6 & 1048575, obj);
                            k5.o(h11, i8);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (r(i8, i7, obj)) {
                            j10 = L6 & 1048575;
                            k5.h(i8, s0.d.i(j10, obj), n(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f5727m.getClass();
            ((AbstractC0243w) obj).unknownFields.d(k5);
            return;
        }
        M(obj, k5);
    }

    public final boolean j(Object obj, int i7, Object obj2) {
        if (q(i7, obj) == q(i7, obj2)) {
            return true;
        }
        return false;
    }

    public final void k(Object obj, int i7, Object obj2) {
        int i8 = this.f5717a[i7];
        if (s0.d.i(L(i7) & 1048575, obj) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        AbstractC0515y1.v(this.f5718b[((i7 / 3) * 2) + 1]);
    }

    public final Object m(int i7) {
        return this.f5718b[(i7 / 3) * 2];
    }

    public final InterfaceC0223b0 n(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f5718b;
        InterfaceC0223b0 interfaceC0223b0 = (InterfaceC0223b0) objArr[i8];
        if (interfaceC0223b0 != null) {
            return interfaceC0223b0;
        }
        InterfaceC0223b0 a7 = Y.f5733c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a7;
        return a7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x031d, code lost:
        if ((r6 instanceof androidx.datastore.preferences.protobuf.C0228g) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if ((r6 instanceof androidx.datastore.preferences.protobuf.C0228g) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r6 = androidx.datastore.preferences.protobuf.C0232k.t(r8, (androidx.datastore.preferences.protobuf.C0228g) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        r4 = r6 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
        r6 = androidx.datastore.preferences.protobuf.C0232k.I((java.lang.String) r6, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.o(java.lang.Object):int");
    }

    public final int p(Object obj) {
        long j7;
        long j8;
        int i7;
        int I6;
        int i8;
        int i9;
        int i10;
        long j9;
        int i11;
        Unsafe unsafe = f5716p;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f5717a;
            if (i12 < iArr.length) {
                int L6 = L(i12);
                int K6 = K(L6);
                int i14 = iArr[i12];
                long j10 = L6 & 1048575;
                if (K6 >= r.f5808r.a() && K6 <= r.f5809s.a()) {
                    int i15 = iArr[i12 + 2];
                }
                switch (K6) {
                    case 0:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.v(i14);
                        i13 = I6 + i13;
                        break;
                    case 1:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.z(i14);
                        i13 = I6 + i13;
                        break;
                    case 2:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            j7 = s0.j(j10, obj);
                            I6 = C0232k.D(j7, i14);
                            i13 = I6 + i13;
                            break;
                        }
                    case 3:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            j8 = s0.j(j10, obj);
                            I6 = C0232k.N(j8, i14);
                            i13 = I6 + i13;
                            break;
                        }
                    case 4:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            i7 = s0.i(j10, obj);
                            I6 = C0232k.B(i14, i7);
                            i13 = I6 + i13;
                            break;
                        }
                    case 5:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.y(i14);
                        i13 = I6 + i13;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.x(i14);
                        i13 = I6 + i13;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.s(i14);
                        i13 = I6 + i13;
                        break;
                    case 8:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            Object k5 = s0.k(j10, obj);
                            if (k5 instanceof C0228g) {
                                I6 = C0232k.t(i14, (C0228g) k5);
                            } else {
                                I6 = C0232k.I((String) k5, i14);
                            }
                            i13 = I6 + i13;
                            break;
                        }
                    case 9:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = c0.o(i14, s0.k(j10, obj), n(i12));
                        i13 = I6 + i13;
                        break;
                    case 10:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.t(i14, (C0228g) s0.k(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 11:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            i8 = s0.i(j10, obj);
                            I6 = C0232k.L(i14, i8);
                            i13 = I6 + i13;
                            break;
                        }
                    case 12:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            i9 = s0.i(j10, obj);
                            I6 = C0232k.w(i14, i9);
                            i13 = I6 + i13;
                            break;
                        }
                    case 13:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.E(i14);
                        i13 = I6 + i13;
                        break;
                    case 14:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.F(i14);
                        i13 = I6 + i13;
                        break;
                    case 15:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            i10 = s0.i(j10, obj);
                            I6 = C0232k.G(i14, i10);
                            i13 = I6 + i13;
                            break;
                        }
                    case 16:
                        if (!q(i12, obj)) {
                            break;
                        } else {
                            j9 = s0.j(j10, obj);
                            I6 = C0232k.H(j9, i14);
                            i13 = I6 + i13;
                            break;
                        }
                    case 17:
                        if (!q(i12, obj)) {
                            break;
                        }
                        I6 = C0232k.A(i14, (AbstractC0220a) s0.k(j10, obj), n(i12));
                        i13 = I6 + i13;
                        break;
                    case 18:
                    case 23:
                    case 32:
                        I6 = c0.h(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        I6 = c0.f(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 20:
                        I6 = c0.m(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 21:
                        I6 = c0.x(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 22:
                        I6 = c0.k(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 25:
                        I6 = c0.a(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 26:
                        I6 = c0.u(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 27:
                        I6 = c0.p(i14, s(j10, obj), n(i12));
                        i13 = I6 + i13;
                        break;
                    case 28:
                        I6 = c0.c(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 29:
                        I6 = c0.v(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 30:
                        I6 = c0.d(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 33:
                        I6 = c0.q(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 34:
                        I6 = c0.s(i14, s(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 35:
                        i11 = c0.i((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 36:
                        i11 = c0.g((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 37:
                        i11 = c0.n((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 38:
                        i11 = c0.y((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 39:
                        i11 = c0.l((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 40:
                        i11 = c0.i((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 41:
                        i11 = c0.g((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 42:
                        i11 = c0.b((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 43:
                        i11 = c0.w((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 44:
                        i11 = c0.e((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 45:
                        i11 = c0.g((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 46:
                        i11 = c0.i((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 47:
                        i11 = c0.r((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 48:
                        i11 = c0.t((List) unsafe.getObject(obj, j10));
                        if (i11 <= 0) {
                            break;
                        }
                        i13 = AbstractC1111a.l(i11, C0232k.K(i14), i11, i13);
                        break;
                    case 49:
                        I6 = c0.j(i14, s(j10, obj), n(i12));
                        i13 = I6 + i13;
                        break;
                    case 50:
                        Object k7 = s0.k(j10, obj);
                        Object m7 = m(i12);
                        this.n.getClass();
                        I6 = N.a(k7, i14, m7);
                        i13 = I6 + i13;
                        break;
                    case 51:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.v(i14);
                        i13 = I6 + i13;
                        break;
                    case 52:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.z(i14);
                        i13 = I6 + i13;
                        break;
                    case 53:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            j7 = B(j10, obj);
                            I6 = C0232k.D(j7, i14);
                            i13 = I6 + i13;
                            break;
                        }
                    case 54:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            j8 = B(j10, obj);
                            I6 = C0232k.N(j8, i14);
                            i13 = I6 + i13;
                            break;
                        }
                    case 55:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            i7 = A(j10, obj);
                            I6 = C0232k.B(i14, i7);
                            i13 = I6 + i13;
                            break;
                        }
                    case 56:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.y(i14);
                        i13 = I6 + i13;
                        break;
                    case 57:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.x(i14);
                        i13 = I6 + i13;
                        break;
                    case 58:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.s(i14);
                        i13 = I6 + i13;
                        break;
                    case 59:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            Object k8 = s0.k(j10, obj);
                            if (k8 instanceof C0228g) {
                                I6 = C0232k.t(i14, (C0228g) k8);
                            } else {
                                I6 = C0232k.I((String) k8, i14);
                            }
                            i13 = I6 + i13;
                            break;
                        }
                    case 60:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = c0.o(i14, s0.k(j10, obj), n(i12));
                        i13 = I6 + i13;
                        break;
                    case 61:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.t(i14, (C0228g) s0.k(j10, obj));
                        i13 = I6 + i13;
                        break;
                    case 62:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            i8 = A(j10, obj);
                            I6 = C0232k.L(i14, i8);
                            i13 = I6 + i13;
                            break;
                        }
                    case 63:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            i9 = A(j10, obj);
                            I6 = C0232k.w(i14, i9);
                            i13 = I6 + i13;
                            break;
                        }
                    case 64:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.E(i14);
                        i13 = I6 + i13;
                        break;
                    case 65:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.F(i14);
                        i13 = I6 + i13;
                        break;
                    case 66:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            i10 = A(j10, obj);
                            I6 = C0232k.G(i14, i10);
                            i13 = I6 + i13;
                            break;
                        }
                    case 67:
                        if (!r(i14, i12, obj)) {
                            break;
                        } else {
                            j9 = B(j10, obj);
                            I6 = C0232k.H(j9, i14);
                            i13 = I6 + i13;
                            break;
                        }
                    case 68:
                        if (!r(i14, i12, obj)) {
                            break;
                        }
                        I6 = C0232k.A(i14, (AbstractC0220a) s0.k(j10, obj), n(i12));
                        i13 = I6 + i13;
                        break;
                }
                i12 += 3;
            } else {
                this.f5727m.getClass();
                return ((AbstractC0243w) obj).unknownFields.a() + i13;
            }
        }
    }

    public final boolean q(int i7, Object obj) {
        int i8;
        if (this.f5721g) {
            int L6 = L(i7);
            long j7 = L6 & 1048575;
            switch (K(L6)) {
                case 0:
                    if (s0.d.e(j7, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (s0.d.f(j7, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (s0.d.h(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (s0.d.h(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (s0.d.g(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (s0.d.h(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (s0.d.g(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return s0.d.c(j7, obj);
                case 8:
                    Object i9 = s0.d.i(j7, obj);
                    if (i9 instanceof String) {
                        return !((String) i9).isEmpty();
                    }
                    if (i9 instanceof C0228g) {
                        return !C0228g.f5760s.equals(i9);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (s0.d.i(j7, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !C0228g.f5760s.equals(s0.d.i(j7, obj));
                case 11:
                    if (s0.d.g(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (s0.d.g(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (s0.d.g(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (s0.d.h(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (s0.d.g(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (s0.d.h(j7, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (s0.d.i(j7, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((s0.d.g(i8 & 1048575, obj) & (1 << (this.f5717a[i7 + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean r(int i7, int i8, Object obj) {
        if (s0.d.g(this.f5717a[i8 + 2] & 1048575, obj) == i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x055a A[Catch: all -> 0x021a, TryCatch #3 {all -> 0x021a, blocks: (B:148:0x0555, B:150:0x055a, B:152:0x0561, B:154:0x0568, B:73:0x0215, B:76:0x021d, B:77:0x0228, B:78:0x022d, B:79:0x0238, B:80:0x023d, B:81:0x0248, B:82:0x024d, B:83:0x0258, B:84:0x025d, B:85:0x026e, B:86:0x0273, B:87:0x027e, B:88:0x0283, B:89:0x028e, B:90:0x0293, B:91:0x029e, B:92:0x02a3, B:93:0x02ae, B:94:0x02b3, B:95:0x02be, B:96:0x02c3, B:97:0x02ce, B:98:0x02d3, B:99:0x02de, B:100:0x02e3, B:101:0x02ee, B:102:0x02f3, B:103:0x02fe, B:104:0x0303, B:105:0x0310, B:106:0x031d, B:107:0x032a, B:108:0x0337, B:109:0x034a, B:110:0x0357, B:111:0x0367, B:112:0x037b, B:113:0x0383, B:114:0x0390, B:115:0x039d, B:116:0x03aa, B:117:0x03b7, B:118:0x03c4, B:119:0x03d1, B:120:0x03de, B:121:0x03eb, B:123:0x03f4, B:124:0x040c, B:125:0x0411, B:126:0x0420, B:127:0x0425, B:128:0x0434, B:129:0x0443, B:130:0x0452, B:131:0x0461, B:132:0x0473, B:133:0x0482, B:134:0x0491, B:136:0x049a, B:137:0x04b4, B:138:0x04c5, B:139:0x04cd, B:140:0x04df, B:141:0x04ef, B:142:0x04ff, B:143:0x050f, B:144:0x051f, B:145:0x052f, B:146:0x0541), top: B:176:0x0555 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x056e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.datastore.preferences.protobuf.k0 r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.C0230i r20, androidx.datastore.preferences.protobuf.C0235n r21) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(androidx.datastore.preferences.protobuf.k0, java.lang.Object, androidx.datastore.preferences.protobuf.i, androidx.datastore.preferences.protobuf.n):void");
    }

    public final void u(Object obj, int i7, Object obj2, C0235n c0235n, C0230i c0230i) {
        long L6 = L(i7) & 1048575;
        Object i8 = s0.d.i(L6, obj);
        N n = this.n;
        n.getClass();
        if (i8 == null) {
            i8 = M.f5709r.c();
            s0.r(L6, obj, i8);
        } else if (!((M) i8).f5710q) {
            M c5 = M.f5709r.c();
            N.b(c5, i8);
            s0.r(L6, obj, c5);
            i8 = c5;
        }
        n.getClass();
        c0230i.G((M) i8, ((L) obj2).f5706a, c0235n);
    }

    public final void v(Object obj, int i7, Object obj2) {
        long L6 = L(i7) & 1048575;
        if (!q(i7, obj2)) {
            return;
        }
        r0 r0Var = s0.d;
        Object i8 = r0Var.i(L6, obj);
        Object i9 = r0Var.i(L6, obj2);
        if (i8 != null && i9 != null) {
            i9 = AbstractC0246z.c(i8, i9);
        } else if (i9 == null) {
            return;
        }
        s0.r(L6, obj, i9);
        I(i7, obj);
    }

    public final void w(Object obj, int i7, Object obj2) {
        int L6 = L(i7);
        int i8 = this.f5717a[i7];
        long j7 = L6 & 1048575;
        if (!r(i8, i7, obj2)) {
            return;
        }
        r0 r0Var = s0.d;
        Object i9 = r0Var.i(j7, obj);
        Object i10 = r0Var.i(j7, obj2);
        if (i9 != null && i10 != null) {
            i10 = AbstractC0246z.c(i9, i10);
        } else if (i10 == null) {
            return;
        }
        s0.r(j7, obj, i10);
        J(i8, i7, obj);
    }
}
