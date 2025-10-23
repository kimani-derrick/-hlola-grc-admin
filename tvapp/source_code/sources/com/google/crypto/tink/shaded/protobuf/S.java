package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.C0230i;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.Z1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import r0.AbstractC1111a;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class S implements b0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f9076o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f9077p = n0.m();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f9078a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9079b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9080c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0523a f9081e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9082g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f9083h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9084i;

    /* renamed from: j  reason: collision with root package name */
    public final int f9085j;

    /* renamed from: k  reason: collision with root package name */
    public final U f9086k;

    /* renamed from: l  reason: collision with root package name */
    public final H f9087l;

    /* renamed from: m  reason: collision with root package name */
    public final f0 f9088m;
    public final M n;

    public S(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0523a abstractC0523a, boolean z7, int[] iArr2, int i9, int i10, U u7, H h7, f0 f0Var, C0537o c0537o, M m7) {
        this.f9078a = iArr;
        this.f9079b = objArr;
        this.f9080c = i7;
        this.d = i8;
        this.f = abstractC0523a instanceof AbstractC0543v;
        this.f9082g = z7;
        this.f9083h = iArr2;
        this.f9084i = i9;
        this.f9085j = i10;
        this.f9086k = u7;
        this.f9087l = h7;
        this.f9088m = f0Var;
        this.f9081e = abstractC0523a;
        this.n = m7;
    }

    public static S C(a0 a0Var, U u7, H h7, f0 f0Var, C0537o c0537o, M m7) {
        if (a0Var instanceof a0) {
            return D(a0Var, u7, h7, f0Var, c0537o, m7);
        }
        AbstractC0515y1.v(a0Var);
        throw null;
    }

    public static S D(a0 a0Var, U u7, H h7, f0 f0Var, C0537o c0537o, M m7) {
        boolean z7;
        int i7;
        int charAt;
        int charAt2;
        int charAt3;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        char charAt4;
        int i12;
        char charAt5;
        int i13;
        char charAt6;
        int i14;
        char charAt7;
        int i15;
        char charAt8;
        int i16;
        char charAt9;
        int i17;
        char charAt10;
        int i18;
        char charAt11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Field Q4;
        char charAt12;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Field Q6;
        Field Q7;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        int i38;
        char charAt16;
        int i39 = 0;
        if (a0Var.d() == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        String c5 = a0Var.c();
        int length = c5.length();
        if (c5.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i7 = i40 + 1;
                if (c5.charAt(i40) < 55296) {
                    break;
                }
                i40 = i7;
            }
        } else {
            i7 = 1;
        }
        int i41 = i7 + 1;
        int charAt17 = c5.charAt(i7);
        if (charAt17 >= 55296) {
            int i42 = charAt17 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt16 = c5.charAt(i41);
                if (charAt16 < 55296) {
                    break;
                }
                i42 |= (charAt16 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            charAt17 = i42 | (charAt16 << i43);
            i41 = i38;
        }
        if (charAt17 == 0) {
            i10 = 0;
            charAt = 0;
            charAt2 = 0;
            i8 = 0;
            charAt3 = 0;
            iArr = f9076o;
            i9 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt18 = c5.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i18 = i44 + 1;
                    charAt11 = c5.charAt(i44);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i45 |= (charAt11 & 8191) << i46;
                    i46 += 13;
                    i44 = i18;
                }
                charAt18 = i45 | (charAt11 << i46);
                i44 = i18;
            }
            int i47 = i44 + 1;
            int charAt19 = c5.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i17 = i47 + 1;
                    charAt10 = c5.charAt(i47);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i48 |= (charAt10 & 8191) << i49;
                    i49 += 13;
                    i47 = i17;
                }
                charAt19 = i48 | (charAt10 << i49);
                i47 = i17;
            }
            int i50 = i47 + 1;
            int charAt20 = c5.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i16 = i50 + 1;
                    charAt9 = c5.charAt(i50);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i51 |= (charAt9 & 8191) << i52;
                    i52 += 13;
                    i50 = i16;
                }
                charAt20 = i51 | (charAt9 << i52);
                i50 = i16;
            }
            int i53 = i50 + 1;
            charAt = c5.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i15 = i53 + 1;
                    charAt8 = c5.charAt(i53);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i54 |= (charAt8 & 8191) << i55;
                    i55 += 13;
                    i53 = i15;
                }
                charAt = i54 | (charAt8 << i55);
                i53 = i15;
            }
            int i56 = i53 + 1;
            int charAt21 = c5.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i14 = i56 + 1;
                    charAt7 = c5.charAt(i56);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i57 |= (charAt7 & 8191) << i58;
                    i58 += 13;
                    i56 = i14;
                }
                charAt21 = i57 | (charAt7 << i58);
                i56 = i14;
            }
            int i59 = i56 + 1;
            charAt2 = c5.charAt(i56);
            if (charAt2 >= 55296) {
                int i60 = charAt2 & 8191;
                int i61 = 13;
                while (true) {
                    i13 = i59 + 1;
                    charAt6 = c5.charAt(i59);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i60 |= (charAt6 & 8191) << i61;
                    i61 += 13;
                    i59 = i13;
                }
                charAt2 = i60 | (charAt6 << i61);
                i59 = i13;
            }
            int i62 = i59 + 1;
            int charAt22 = c5.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = 13;
                while (true) {
                    i12 = i62 + 1;
                    charAt5 = c5.charAt(i62);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i63 |= (charAt5 & 8191) << i64;
                    i64 += 13;
                    i62 = i12;
                }
                charAt22 = i63 | (charAt5 << i64);
                i62 = i12;
            }
            int i65 = i62 + 1;
            charAt3 = c5.charAt(i62);
            if (charAt3 >= 55296) {
                int i66 = charAt3 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i11 = i67 + 1;
                    charAt4 = c5.charAt(i67);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i66 |= (charAt4 & 8191) << i68;
                    i68 += 13;
                    i67 = i11;
                }
                charAt3 = i66 | (charAt4 << i68);
                i65 = i11;
            }
            i8 = (charAt18 * 2) + charAt19;
            i9 = charAt20;
            i10 = charAt21;
            iArr = new int[charAt3 + charAt2 + charAt22];
            i39 = charAt18;
            i41 = i65;
        }
        Unsafe unsafe = f9077p;
        Object[] b7 = a0Var.b();
        Class<?> cls = a0Var.a().getClass();
        int[] iArr2 = new int[i10 * 3];
        Object[] objArr = new Object[i10 * 2];
        int i69 = charAt2 + charAt3;
        int i70 = i69;
        int i71 = charAt3;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int charAt23 = c5.charAt(i41);
            if (charAt23 >= 55296) {
                int i75 = charAt23 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i37 = i76 + 1;
                    charAt15 = c5.charAt(i76);
                    i19 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i75 |= (charAt15 & 8191) << i77;
                    i77 += 13;
                    i76 = i37;
                    length = i19;
                }
                charAt23 = i75 | (charAt15 << i77);
                i20 = i37;
            } else {
                i19 = length;
                i20 = i74;
            }
            int i78 = i20 + 1;
            int charAt24 = c5.charAt(i20);
            if (charAt24 >= 55296) {
                int i79 = charAt24 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i36 = i80 + 1;
                    charAt14 = c5.charAt(i80);
                    i21 = i69;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i79 |= (charAt14 & 8191) << i81;
                    i81 += 13;
                    i80 = i36;
                    i69 = i21;
                }
                charAt24 = i79 | (charAt14 << i81);
                i22 = i36;
            } else {
                i21 = i69;
                i22 = i78;
            }
            int i82 = charAt24 & 255;
            int i83 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            if (i82 >= 51) {
                int i84 = i22 + 1;
                int charAt25 = c5.charAt(i22);
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i35 = i86 + 1;
                        charAt13 = c5.charAt(i86);
                        i23 = charAt;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i85 |= (charAt13 & 8191) << i87;
                        i87 += 13;
                        i86 = i35;
                        charAt = i23;
                    }
                    charAt25 = i85 | (charAt13 << i87);
                    i33 = i35;
                } else {
                    i23 = charAt;
                    i33 = i84;
                }
                int i88 = i82 - 51;
                int i89 = i33;
                if (i88 != 9 && i88 != 17) {
                    if (i88 == 12 && !z7) {
                        objArr[((i73 / 3) * 2) + 1] = b7[i8];
                        i8++;
                    }
                    i34 = 2;
                } else {
                    i34 = 2;
                    objArr[((i73 / 3) * 2) + 1] = b7[i8];
                    i8++;
                }
                int i90 = charAt25 * i34;
                Object obj = b7[i90];
                if (obj instanceof Field) {
                    Q6 = (Field) obj;
                } else {
                    Q6 = Q(cls, (String) obj);
                    b7[i90] = Q6;
                }
                int i91 = i8;
                i28 = (int) unsafe.objectFieldOffset(Q6);
                int i92 = i90 + 1;
                Object obj2 = b7[i92];
                if (obj2 instanceof Field) {
                    Q7 = (Field) obj2;
                } else {
                    Q7 = Q(cls, (String) obj2);
                    b7[i92] = Q7;
                }
                i25 = (int) unsafe.objectFieldOffset(Q7);
                i27 = 0;
                i24 = i9;
                i29 = i91;
                i26 = i89;
            } else {
                i23 = charAt;
                int i93 = i8 + 1;
                Field Q8 = Q(cls, (String) b7[i8]);
                i24 = i9;
                if (i82 != 9 && i82 != 17) {
                    if (i82 != 27 && i82 != 49) {
                        if (i82 != 12 && i82 != 30 && i82 != 44) {
                            if (i82 == 50) {
                                int i94 = i71 + 1;
                                iArr[i71] = i73;
                                int i95 = (i73 / 3) * 2;
                                int i96 = i8 + 2;
                                objArr[i95] = b7[i93];
                                if ((charAt24 & 2048) != 0) {
                                    i93 = i8 + 3;
                                    objArr[i95 + 1] = b7[i96];
                                    i71 = i94;
                                } else {
                                    i71 = i94;
                                    i93 = i96;
                                }
                            }
                        } else if (!z7) {
                            i30 = i8 + 2;
                            objArr[((i73 / 3) * 2) + 1] = b7[i93];
                        }
                    } else {
                        i30 = i8 + 2;
                        objArr[((i73 / 3) * 2) + 1] = b7[i93];
                    }
                    i93 = i30;
                } else {
                    objArr[((i73 / 3) * 2) + 1] = Q8.getType();
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(Q8);
                if ((charAt24 & 4096) == 4096 && i82 <= 17) {
                    int i97 = i22 + 1;
                    int charAt26 = c5.charAt(i22);
                    if (charAt26 >= 55296) {
                        int i98 = charAt26 & 8191;
                        int i99 = 13;
                        while (true) {
                            i26 = i97 + 1;
                            charAt12 = c5.charAt(i97);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i98 |= (charAt12 & 8191) << i99;
                            i99 += 13;
                            i97 = i26;
                        }
                        charAt26 = i98 | (charAt12 << i99);
                    } else {
                        i26 = i97;
                    }
                    int i100 = (charAt26 / 32) + (i39 * 2);
                    Object obj3 = b7[i100];
                    if (obj3 instanceof Field) {
                        Q4 = (Field) obj3;
                    } else {
                        Q4 = Q(cls, (String) obj3);
                        b7[i100] = Q4;
                    }
                    i25 = (int) unsafe.objectFieldOffset(Q4);
                    i27 = charAt26 % 32;
                } else {
                    i25 = 1048575;
                    i26 = i22;
                    i27 = 0;
                }
                if (i82 >= 18 && i82 <= 49) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
                int i101 = i93;
                i28 = objectFieldOffset;
                i29 = i101;
            }
            int i102 = i73 + 1;
            iArr2[i73] = charAt23;
            int i103 = i73 + 2;
            String str = c5;
            if ((charAt24 & 512) != 0) {
                i31 = 536870912;
            } else {
                i31 = 0;
            }
            if ((charAt24 & 256) != 0) {
                i32 = 268435456;
            } else {
                i32 = 0;
            }
            iArr2[i102] = i31 | i32 | (i82 << 20) | i28;
            i73 += 3;
            iArr2[i103] = (i27 << 20) | i25;
            i8 = i29;
            charAt3 = i83;
            c5 = str;
            i9 = i24;
            length = i19;
            i69 = i21;
            i41 = i26;
            charAt = i23;
        }
        return new S(iArr2, objArr, i9, charAt, a0Var.a(), z7, iArr, charAt3, i69, u7, h7, f0Var, c0537o, m7);
    }

    public static long E(int i7) {
        return i7 & 1048575;
    }

    public static int F(long j7, Object obj) {
        return ((Integer) n0.f9149c.i(j7, obj)).intValue();
    }

    public static long G(long j7, Object obj) {
        return ((Long) n0.f9149c.i(j7, obj)).longValue();
    }

    public static Field Q(Class cls, String str) {
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

    public static int W(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void Z(int i7, Object obj, K k5) {
        if (obj instanceof String) {
            C0533k c0533k = (C0533k) k5.f9070a;
            c0533k.p0(i7, 2);
            c0533k.o0((String) obj);
            return;
        }
        k5.b(i7, (AbstractC0530h) obj);
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        throw new IllegalArgumentException(AbstractC1111a.p(obj, "Mutating immutable message: "));
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0543v) {
            return ((AbstractC0543v) obj).p();
        }
        return true;
    }

    public static List v(long j7, Object obj) {
        return (List) n0.f9149c.i(j7, obj);
    }

    public final Object A(int i7, Object obj) {
        b0 p3 = p(i7);
        long X6 = X(i7) & 1048575;
        if (!s(i7, obj)) {
            return p3.e();
        }
        Object object = f9077p.getObject(obj, X6);
        if (t(object)) {
            return object;
        }
        Object e3 = p3.e();
        if (object != null) {
            p3.b(e3, object);
        }
        return e3;
    }

    public final Object B(int i7, int i8, Object obj) {
        b0 p3 = p(i8);
        if (!u(i7, i8, obj)) {
            return p3.e();
        }
        Object object = f9077p.getObject(obj, X(i8) & 1048575);
        if (t(object)) {
            return object;
        }
        Object e3 = p3.e();
        if (object != null) {
            p3.b(e3, object);
        }
        return e3;
    }

    public final void H(int i7, long j7, Object obj) {
        Unsafe unsafe = f9077p;
        Object o7 = o(i7);
        Object object = unsafe.getObject(obj, j7);
        this.n.getClass();
        if (M.c(object)) {
            L e3 = M.e();
            M.d(e3, object);
            unsafe.putObject(obj, j7, e3);
        }
        M.a(o7);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, Z1 z12) {
        Object valueOf;
        Object valueOf2;
        int d02;
        long j8;
        int i15;
        Object valueOf3;
        Object B6;
        int s02;
        Unsafe unsafe = f9077p;
        long j9 = this.f9078a[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    valueOf = Double.valueOf(android.support.v4.media.session.b.A(i7, bArr));
                    unsafe.putObject(obj, j7, valueOf);
                    d02 = i7 + 8;
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 52:
                if (i11 == 5) {
                    valueOf2 = Float.valueOf(android.support.v4.media.session.b.G(i7, bArr));
                    unsafe.putObject(obj, j7, valueOf2);
                    d02 = i7 + 4;
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 53:
            case 54:
                if (i11 == 0) {
                    d02 = android.support.v4.media.session.b.d0(bArr, i7, z12);
                    j8 = z12.f8499b;
                    valueOf3 = Long.valueOf(j8);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 55:
            case 62:
                if (i11 == 0) {
                    d02 = android.support.v4.media.session.b.b0(bArr, i7, z12);
                    i15 = z12.f8498a;
                    valueOf3 = Integer.valueOf(i15);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 56:
            case 65:
                if (i11 == 1) {
                    valueOf = Long.valueOf(android.support.v4.media.session.b.E(i7, bArr));
                    unsafe.putObject(obj, j7, valueOf);
                    d02 = i7 + 8;
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 57:
            case 64:
                if (i11 == 5) {
                    valueOf2 = Integer.valueOf(android.support.v4.media.session.b.C(i7, bArr));
                    unsafe.putObject(obj, j7, valueOf2);
                    d02 = i7 + 4;
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 58:
                if (i11 == 0) {
                    d02 = android.support.v4.media.session.b.d0(bArr, i7, z12);
                    valueOf3 = Boolean.valueOf(z12.f8499b != 0);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 59:
                if (i11 == 2) {
                    d02 = android.support.v4.media.session.b.b0(bArr, i7, z12);
                    int i16 = z12.f8498a;
                    if (i16 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(obj, j7, valueOf3);
                        unsafe.putInt(obj, j9, i10);
                        return d02;
                    } else if ((i12 & 536870912) == 0 || q0.e(bArr, d02, d02 + i16)) {
                        unsafe.putObject(obj, j7, new String(bArr, d02, i16, AbstractC0547z.f9165a));
                        d02 += i16;
                        unsafe.putInt(obj, j9, i10);
                        return d02;
                    } else {
                        throw B.b();
                    }
                }
                return i7;
            case 60:
                if (i11 == 2) {
                    B6 = B(i10, i14, obj);
                    s02 = android.support.v4.media.session.b.s0(B6, p(i14), bArr, i7, i8, z12);
                    V(obj, i10, B6, i14);
                    return s02;
                }
                return i7;
            case 61:
                if (i11 == 2) {
                    d02 = android.support.v4.media.session.b.y(bArr, i7, z12);
                    valueOf3 = z12.f8500c;
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 63:
                if (i11 == 0) {
                    d02 = android.support.v4.media.session.b.b0(bArr, i7, z12);
                    i15 = z12.f8498a;
                    n(i14);
                    valueOf3 = Integer.valueOf(i15);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 66:
                if (i11 == 0) {
                    d02 = android.support.v4.media.session.b.b0(bArr, i7, z12);
                    i15 = B5.e.d(z12.f8498a);
                    valueOf3 = Integer.valueOf(i15);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 67:
                if (i11 == 0) {
                    d02 = android.support.v4.media.session.b.d0(bArr, i7, z12);
                    j8 = B5.e.e(z12.f8499b);
                    valueOf3 = Long.valueOf(j8);
                    unsafe.putObject(obj, j7, valueOf3);
                    unsafe.putInt(obj, j9, i10);
                    return d02;
                }
                return i7;
            case 68:
                if (i11 == 3) {
                    B6 = B(i10, i14, obj);
                    s02 = android.support.v4.media.session.b.r0(B6, p(i14), bArr, i7, i8, (i9 & (-8)) | 4, z12);
                    V(obj, i10, B6, i14);
                    return s02;
                }
                return i7;
            default:
                return i7;
        }
    }

    public final int J(Object obj, byte[] bArr, int i7, int i8, int i9, Z1 z12) {
        Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        long j7;
        int d02;
        long j8;
        Unsafe unsafe2;
        Object obj2;
        long j9;
        int i29;
        int i30;
        long j10;
        int i31;
        int i32;
        int i33;
        S s6 = this;
        byte[] bArr2 = bArr;
        int i34 = i8;
        int i35 = i9;
        Z1 z13 = z12;
        l(obj);
        Unsafe unsafe3 = f9077p;
        int i36 = i7;
        int i37 = -1;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 1048575;
        while (true) {
            if (i36 < i34) {
                int i42 = i36 + 1;
                byte b7 = bArr2[i36];
                if (b7 < 0) {
                    i12 = android.support.v4.media.session.b.a0(b7, bArr2, i42, z13);
                    i11 = z13.f8498a;
                } else {
                    i11 = b7;
                    i12 = i42;
                }
                int i43 = i11 >>> 3;
                int i44 = i11 & 7;
                int i45 = s6.d;
                int i46 = i12;
                int i47 = s6.f9080c;
                int i48 = i11;
                if (i43 > i37) {
                    int i49 = i38 / 3;
                    if (i43 >= i47 && i43 <= i45) {
                        i33 = s6.T(i43, i49);
                    } else {
                        i33 = -1;
                    }
                    i15 = i33;
                    i16 = -1;
                    i13 = 0;
                } else {
                    if (i43 >= i47 && i43 <= i45) {
                        i13 = 0;
                        i14 = s6.T(i43, 0);
                    } else {
                        i13 = 0;
                        i14 = -1;
                    }
                    i15 = i14;
                    i16 = -1;
                }
                if (i15 == i16) {
                    i17 = i41;
                    i18 = i43;
                    i19 = i13;
                    unsafe = unsafe3;
                    i10 = i35;
                    i20 = i46;
                    i21 = i48;
                    i22 = i40;
                } else {
                    int[] iArr = s6.f9078a;
                    int i50 = iArr[i15 + 1];
                    int W = W(i50);
                    long j11 = i50 & 1048575;
                    if (W <= 17) {
                        int i51 = iArr[i15 + 2];
                        boolean z7 = true;
                        int i52 = 1 << (i51 >>> 20);
                        int i53 = i51 & 1048575;
                        if (i53 != i41) {
                            if (i41 != 1048575) {
                                unsafe3.putInt(obj, i41, i40);
                            }
                            i24 = i53;
                            i23 = unsafe3.getInt(obj, i53);
                        } else {
                            i23 = i40;
                            i24 = i41;
                        }
                        switch (W) {
                            case 0:
                                i18 = i43;
                                i25 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 == 1) {
                                    n0.r(obj, j11, android.support.v4.media.session.b.A(i25, bArr2));
                                    i36 = i25 + 8;
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 1:
                                i18 = i43;
                                i25 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 == 5) {
                                    n0.s(obj, j11, android.support.v4.media.session.b.G(i25, bArr2));
                                    i36 = i25 + 4;
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 2:
                            case 3:
                                i18 = i43;
                                i25 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                j7 = j11;
                                if (i44 == 0) {
                                    d02 = android.support.v4.media.session.b.d0(bArr2, i25, z13);
                                    j8 = z13.f8499b;
                                    unsafe2 = unsafe3;
                                    obj2 = obj;
                                    unsafe2.putLong(obj2, j7, j8);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i36 = d02;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 4:
                            case 11:
                                i18 = i43;
                                i25 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                j9 = j11;
                                if (i44 == 0) {
                                    i36 = android.support.v4.media.session.b.b0(bArr2, i25, z13);
                                    i29 = z13.f8498a;
                                    unsafe3.putInt(obj, j9, i29);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 5:
                            case 14:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 != 1) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    unsafe3.putLong(obj, j11, android.support.v4.media.session.b.E(i30, bArr2));
                                    i36 = i30 + 8;
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 != 5) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    unsafe3.putInt(obj, j11, android.support.v4.media.session.b.C(i30, bArr2));
                                    i36 = i30 + 4;
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 != 0) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    int d03 = android.support.v4.media.session.b.d0(bArr2, i30, z13);
                                    if (z13.f8499b == 0) {
                                        z7 = false;
                                    }
                                    n0.n(obj, j11, z7);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i36 = d03;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 8:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                j10 = j11;
                                if (i44 != 2) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    if ((i50 & 536870912) == 0) {
                                        i36 = android.support.v4.media.session.b.V(bArr2, i30, z13);
                                    } else {
                                        i36 = android.support.v4.media.session.b.Y(bArr2, i30, z13);
                                    }
                                    unsafe3.putObject(obj, j10, z13.f8500c);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 9:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 != 2) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    Object A6 = s6.A(i28, obj);
                                    i36 = android.support.v4.media.session.b.s0(A6, s6.p(i28), bArr, i30, i8, z12);
                                    s6.U(obj, i28, A6);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 10:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                j10 = j11;
                                if (i44 != 2) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    i36 = android.support.v4.media.session.b.y(bArr2, i30, z13);
                                    unsafe3.putObject(obj, j10, z13.f8500c);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 12:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                j9 = j11;
                                if (i44 != 0) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    i36 = android.support.v4.media.session.b.b0(bArr2, i30, z13);
                                    i29 = z13.f8498a;
                                    s6.n(i28);
                                    unsafe3.putInt(obj, j9, i29);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 15:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 != 0) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    i36 = android.support.v4.media.session.b.b0(bArr2, i30, z13);
                                    i29 = B5.e.d(z13.f8498a);
                                    j9 = j11;
                                    unsafe3.putInt(obj, j9, i29);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 16:
                                i18 = i43;
                                i30 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                if (i44 != 0) {
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                } else {
                                    d02 = android.support.v4.media.session.b.d0(bArr2, i30, z13);
                                    j8 = B5.e.e(z13.f8499b);
                                    unsafe2 = unsafe3;
                                    obj2 = obj;
                                    j7 = j11;
                                    unsafe2.putLong(obj2, j7, j8);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i36 = d02;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                }
                            case 17:
                                if (i44 == 3) {
                                    Object A7 = s6.A(i15, obj);
                                    i27 = i24;
                                    i26 = i48;
                                    i28 = i15;
                                    i18 = i43;
                                    i36 = android.support.v4.media.session.b.r0(A7, s6.p(i15), bArr, i46, i8, (i43 << 3) | 4, z12);
                                    s6.U(obj, i28, A7);
                                    i40 = i23 | i52;
                                    i34 = i8;
                                    i38 = i28;
                                    i37 = i18;
                                    i39 = i26;
                                    i41 = i27;
                                    break;
                                } else {
                                    i18 = i43;
                                    i30 = i46;
                                    i26 = i48;
                                    i27 = i24;
                                    i28 = i15;
                                    i25 = i30;
                                    i20 = i25;
                                    unsafe = unsafe3;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            default:
                                i18 = i43;
                                i25 = i46;
                                i26 = i48;
                                i27 = i24;
                                i28 = i15;
                                i20 = i25;
                                unsafe = unsafe3;
                                i19 = i28;
                                i21 = i26;
                                i17 = i27;
                                i10 = i9;
                                i22 = i23;
                                break;
                        }
                        i35 = i9;
                    } else {
                        i18 = i43;
                        int i54 = i15;
                        if (W == 27) {
                            if (i44 == 2) {
                                AbstractC0524b abstractC0524b = (AbstractC0524b) ((InterfaceC0546y) unsafe3.getObject(obj, j11));
                                boolean c5 = abstractC0524b.c();
                                InterfaceC0546y interfaceC0546y = abstractC0524b;
                                if (!c5) {
                                    int size = abstractC0524b.size();
                                    if (size == 0) {
                                        i32 = 10;
                                    } else {
                                        i32 = size * 2;
                                    }
                                    InterfaceC0546y j12 = abstractC0524b.j(i32);
                                    unsafe3.putObject(obj, j11, j12);
                                    interfaceC0546y = j12;
                                }
                                i36 = android.support.v4.media.session.b.J(s6.p(i54), i48, bArr, i46, i8, interfaceC0546y, z12);
                                i34 = i8;
                                i38 = i54;
                                i37 = i18;
                                i39 = i48;
                                i40 = i40;
                                i41 = i41;
                                i35 = i9;
                            } else {
                                i22 = i40;
                                i17 = i41;
                                i31 = i46;
                                unsafe = unsafe3;
                                i19 = i54;
                            }
                        } else {
                            i22 = i40;
                            i17 = i41;
                            if (W <= 49) {
                                unsafe = unsafe3;
                                i19 = i54;
                                i36 = L(obj, bArr, i46, i8, i48, i44, i54, i50, W, j11, z12);
                                if (i36 != i46) {
                                    s6 = this;
                                    bArr2 = bArr;
                                    i34 = i8;
                                    i35 = i9;
                                    z13 = z12;
                                    i37 = i18;
                                    i39 = i48;
                                    i40 = i22;
                                    i41 = i17;
                                    unsafe3 = unsafe;
                                    i38 = i19;
                                } else {
                                    i10 = i9;
                                    i20 = i36;
                                }
                            } else {
                                i31 = i46;
                                unsafe = unsafe3;
                                i19 = i54;
                                if (W == 50) {
                                    if (i44 == 2) {
                                        H(i19, j11, obj);
                                        throw null;
                                    }
                                } else {
                                    i36 = I(obj, bArr, i31, i8, i48, i18, i44, i50, W, j11, i19, z12);
                                    if (i36 != i31) {
                                        s6 = this;
                                        bArr2 = bArr;
                                        i34 = i8;
                                        i35 = i9;
                                        z13 = z12;
                                        i38 = i19;
                                        i37 = i18;
                                        i39 = i48;
                                        i40 = i22;
                                        i41 = i17;
                                        unsafe3 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i20 = i36;
                                        i19 = i19;
                                    }
                                }
                            }
                            i21 = i48;
                        }
                        i10 = i9;
                        i20 = i31;
                        i21 = i48;
                    }
                }
                if (i21 == i10 && i10 != 0) {
                    i36 = i20;
                    i39 = i21;
                    i40 = i22;
                    i41 = i17;
                } else {
                    AbstractC0543v abstractC0543v = (AbstractC0543v) obj;
                    e0 e0Var = abstractC0543v.unknownFields;
                    if (e0Var == e0.f) {
                        e0Var = e0.c();
                        abstractC0543v.unknownFields = e0Var;
                    }
                    i36 = android.support.v4.media.session.b.Z(i21, bArr, i20, i8, e0Var, z12);
                    s6 = this;
                    bArr2 = bArr;
                    i34 = i8;
                    z13 = z12;
                    i35 = i10;
                    i39 = i21;
                    i37 = i18;
                    i40 = i22;
                    i41 = i17;
                    unsafe3 = unsafe;
                    i38 = i19;
                }
            } else {
                unsafe = unsafe3;
                i10 = i35;
            }
        }
        if (i41 != 1048575) {
            unsafe.putInt(obj, i41, i40);
        }
        for (int i55 = this.f9084i; i55 < this.f9085j; i55++) {
            m(obj, this.f9083h[i55], null);
        }
        if (i10 == 0) {
            if (i36 != i8) {
                throw B.f();
            }
        } else if (i36 > i8 || i39 != i10) {
            throw B.f();
        }
        return i36;
    }

    public final void K(Object obj, byte[] bArr, int i7, int i8, Z1 z12) {
        byte b7;
        int i9;
        int T6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int d02;
        Unsafe unsafe2;
        long j7;
        int i20;
        boolean z7;
        int i21;
        S s6 = this;
        byte[] bArr2 = bArr;
        int i22 = i8;
        Z1 z13 = z12;
        l(obj);
        Unsafe unsafe3 = f9077p;
        int i23 = 0;
        int i24 = i7;
        int i25 = 0;
        int i26 = 0;
        int i27 = -1;
        int i28 = 1048575;
        while (i24 < i22) {
            int i29 = i24 + 1;
            byte b8 = bArr2[i24];
            if (b8 < 0) {
                i9 = android.support.v4.media.session.b.a0(b8, bArr2, i29, z13);
                b7 = z13.f8498a;
            } else {
                b7 = b8;
                i9 = i29;
            }
            int i30 = b7 >>> 3;
            int i31 = b7 & 7;
            int i32 = s6.d;
            int i33 = s6.f9080c;
            if (i30 > i27) {
                int i34 = i25 / 3;
                if (i30 >= i33 && i30 <= i32) {
                    T6 = s6.T(i30, i34);
                }
                T6 = -1;
            } else {
                if (i30 >= i33 && i30 <= i32) {
                    T6 = s6.T(i30, i23);
                }
                T6 = -1;
            }
            int i35 = T6;
            if (i35 == -1) {
                i10 = i30;
                i11 = i9;
                i12 = i26;
                i13 = i23;
                i14 = i13;
                unsafe = unsafe3;
            } else {
                int[] iArr = s6.f9078a;
                int i36 = iArr[i35 + 1];
                int W = W(i36);
                i10 = i30;
                int i37 = i9;
                long j8 = i36 & 1048575;
                if (W <= 17) {
                    int i38 = iArr[i35 + 2];
                    int i39 = 1 << (i38 >>> 20);
                    int i40 = i38 & 1048575;
                    if (i40 != i28) {
                        if (i28 != 1048575) {
                            unsafe3.putInt(obj, i28, i26);
                        }
                        if (i40 != 1048575) {
                            i26 = unsafe3.getInt(obj, i40);
                        }
                        i18 = i40;
                    } else {
                        i18 = i28;
                    }
                    int i41 = i26;
                    switch (W) {
                        case 0:
                            i19 = i37;
                            if (i31 == 1) {
                                n0.r(obj, j8, android.support.v4.media.session.b.A(i19, bArr2));
                                i24 = i19 + 8;
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            } else {
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 1:
                            i19 = i37;
                            if (i31 == 5) {
                                n0.s(obj, j8, android.support.v4.media.session.b.G(i19, bArr2));
                                i24 = i19 + 4;
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            } else {
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 2:
                        case 3:
                            i19 = i37;
                            if (i31 == 0) {
                                d02 = android.support.v4.media.session.b.d0(bArr2, i19, z13);
                                unsafe2 = unsafe3;
                                j7 = z13.f8499b;
                                unsafe2.putLong(obj, j8, j7);
                                i26 = i41 | i39;
                                i28 = i18;
                                i25 = i35;
                                i24 = d02;
                                i27 = i10;
                                i23 = 0;
                                i22 = i8;
                                break;
                            } else {
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 4:
                        case 11:
                            i19 = i37;
                            if (i31 == 0) {
                                i24 = android.support.v4.media.session.b.b0(bArr2, i19, z13);
                                i21 = z13.f8498a;
                                unsafe3.putInt(obj, j8, i21);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            } else {
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 5:
                        case 14:
                            i20 = i37;
                            if (i31 != 1) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i19 = i20;
                                unsafe3.putLong(obj, j8, android.support.v4.media.session.b.E(i20, bArr2));
                                i24 = i19 + 8;
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        case 13:
                            i20 = i37;
                            if (i31 != 5) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                unsafe3.putInt(obj, j8, android.support.v4.media.session.b.C(i20, bArr2));
                                i24 = i20 + 4;
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            i20 = i37;
                            if (i31 != 0) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i24 = android.support.v4.media.session.b.d0(bArr2, i20, z13);
                                if (z13.f8499b != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                n0.n(obj, j8, z7);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case 8:
                            i20 = i37;
                            if (i31 != 2) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                if ((536870912 & i36) == 0) {
                                    i24 = android.support.v4.media.session.b.V(bArr2, i20, z13);
                                } else {
                                    i24 = android.support.v4.media.session.b.Y(bArr2, i20, z13);
                                }
                                unsafe3.putObject(obj, j8, z13.f8500c);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case 9:
                            i20 = i37;
                            if (i31 != 2) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                Object A6 = s6.A(i35, obj);
                                i24 = android.support.v4.media.session.b.s0(A6, s6.p(i35), bArr, i20, i8, z12);
                                s6.U(obj, i35, A6);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case 10:
                            i20 = i37;
                            if (i31 != 2) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i24 = android.support.v4.media.session.b.y(bArr2, i20, z13);
                                unsafe3.putObject(obj, j8, z13.f8500c);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case 12:
                            i20 = i37;
                            if (i31 != 0) {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i24 = android.support.v4.media.session.b.b0(bArr2, i20, z13);
                                i21 = z13.f8498a;
                                unsafe3.putInt(obj, j8, i21);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            }
                        case 15:
                            i20 = i37;
                            if (i31 == 0) {
                                i24 = android.support.v4.media.session.b.b0(bArr2, i20, z13);
                                i21 = B5.e.d(z13.f8498a);
                                unsafe3.putInt(obj, j8, i21);
                                i26 = i41 | i39;
                                i22 = i8;
                                i28 = i18;
                                i25 = i35;
                                i27 = i10;
                                i23 = 0;
                                break;
                            } else {
                                i19 = i20;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 16:
                            if (i31 != 0) {
                                i19 = i37;
                                i12 = i41;
                                i28 = i18;
                                i14 = i35;
                                unsafe = unsafe3;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                d02 = android.support.v4.media.session.b.d0(bArr2, i37, z13);
                                j7 = B5.e.e(z13.f8499b);
                                unsafe2 = unsafe3;
                                unsafe2.putLong(obj, j8, j7);
                                i26 = i41 | i39;
                                i28 = i18;
                                i25 = i35;
                                i24 = d02;
                                i27 = i10;
                                i23 = 0;
                                i22 = i8;
                                break;
                            }
                        default:
                            i19 = i37;
                            i12 = i41;
                            i28 = i18;
                            i14 = i35;
                            unsafe = unsafe3;
                            i11 = i19;
                            i13 = 0;
                            break;
                    }
                } else {
                    if (W == 27) {
                        if (i31 == 2) {
                            AbstractC0524b abstractC0524b = (AbstractC0524b) ((InterfaceC0546y) unsafe3.getObject(obj, j8));
                            boolean c5 = abstractC0524b.c();
                            InterfaceC0546y interfaceC0546y = abstractC0524b;
                            if (!c5) {
                                int size = abstractC0524b.size();
                                if (size == 0) {
                                    i17 = 10;
                                } else {
                                    i17 = size * 2;
                                }
                                InterfaceC0546y j9 = abstractC0524b.j(i17);
                                unsafe3.putObject(obj, j8, j9);
                                interfaceC0546y = j9;
                            }
                            i24 = android.support.v4.media.session.b.J(s6.p(i35), b7, bArr, i37, i8, interfaceC0546y, z12);
                            i26 = i26;
                            i25 = i35;
                            i28 = i28;
                            i27 = i10;
                            i23 = 0;
                            i22 = i8;
                        } else {
                            i12 = i26;
                            i16 = i37;
                            i14 = i35;
                            unsafe = unsafe3;
                            i15 = i28;
                            i13 = 0;
                        }
                    } else {
                        int i42 = i28;
                        int i43 = i26;
                        if (W <= 49) {
                            i15 = i42;
                            i12 = i43;
                            i14 = i35;
                            i13 = 0;
                            unsafe = unsafe3;
                            i24 = L(obj, bArr, i37, i8, b7, i31, i35, i36, W, j8, z12);
                            if (i24 != i37) {
                                s6 = this;
                                bArr2 = bArr;
                                i22 = i8;
                                z13 = z12;
                                i23 = 0;
                                i27 = i10;
                                i28 = i15;
                                i26 = i12;
                                i25 = i14;
                            } else {
                                i11 = i24;
                            }
                        } else {
                            i15 = i42;
                            i12 = i43;
                            i16 = i37;
                            i14 = i35;
                            unsafe = unsafe3;
                            i13 = 0;
                            if (W == 50) {
                                if (i31 == 2) {
                                    H(i14, j8, obj);
                                    throw null;
                                }
                            } else {
                                i24 = I(obj, bArr, i16, i8, b7, i10, i31, i36, W, j8, i14, z12);
                                if (i24 != i16) {
                                    s6 = this;
                                    bArr2 = bArr;
                                    i22 = i8;
                                    z13 = z12;
                                    i23 = 0;
                                    i27 = i10;
                                    i25 = i14;
                                    i28 = i15;
                                    i26 = i12;
                                } else {
                                    i11 = i24;
                                    i14 = i14;
                                }
                            }
                        }
                        i28 = i15;
                    }
                    i11 = i16;
                    i28 = i15;
                }
                unsafe3 = unsafe;
            }
            AbstractC0543v abstractC0543v = (AbstractC0543v) obj;
            e0 e0Var = abstractC0543v.unknownFields;
            if (e0Var == e0.f) {
                e0Var = e0.c();
                abstractC0543v.unknownFields = e0Var;
            }
            i24 = android.support.v4.media.session.b.Z(b7, bArr, i11, i8, e0Var, z12);
            s6 = this;
            bArr2 = bArr;
            i22 = i8;
            z13 = z12;
            i23 = i13;
            i27 = i10;
            i26 = i12;
            i25 = i14;
            unsafe3 = unsafe;
        }
        int i44 = i26;
        int i45 = i28;
        Unsafe unsafe4 = unsafe3;
        if (i45 != 1048575) {
            unsafe4.putInt(obj, i45, i44);
        }
        if (i24 == i8) {
            return;
        }
        throw B.f();
    }

    public final int L(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j7, int i12, long j8, Z1 z12) {
        int c02;
        Unsafe unsafe = f9077p;
        AbstractC0524b abstractC0524b = (AbstractC0524b) ((InterfaceC0546y) unsafe.getObject(obj, j8));
        boolean c5 = abstractC0524b.c();
        InterfaceC0546y interfaceC0546y = abstractC0524b;
        if (!c5) {
            int size = abstractC0524b.size();
            InterfaceC0546y j9 = abstractC0524b.j(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j8, j9);
            interfaceC0546y = j9;
        }
        switch (i12) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.L(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 1) {
                    return android.support.v4.media.session.b.B(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.O(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 5) {
                    return android.support.v4.media.session.b.H(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.S(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 0) {
                    return android.support.v4.media.session.b.e0(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.R(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 0) {
                    return android.support.v4.media.session.b.c0(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.N(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 1) {
                    return android.support.v4.media.session.b.F(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.M(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 5) {
                    return android.support.v4.media.session.b.D(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.K(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 0) {
                    return android.support.v4.media.session.b.x(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 26:
                if (i10 == 2) {
                    InterfaceC0546y interfaceC0546y2 = interfaceC0546y;
                    return (j7 & 536870912) == 0 ? android.support.v4.media.session.b.W(i9, bArr, i7, i8, interfaceC0546y2, z12) : android.support.v4.media.session.b.X(i9, bArr, i7, i8, interfaceC0546y2, z12);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.J(p(i11), i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.z(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    c02 = android.support.v4.media.session.b.R(bArr, i7, interfaceC0546y, z12);
                } else if (i10 == 0) {
                    c02 = android.support.v4.media.session.b.c0(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                n(i11);
                Class cls = c0.f9106a;
                return c02;
            case 33:
            case 47:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.P(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 0) {
                    return android.support.v4.media.session.b.T(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return android.support.v4.media.session.b.Q(bArr, i7, interfaceC0546y, z12);
                }
                if (i10 == 0) {
                    return android.support.v4.media.session.b.U(i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return android.support.v4.media.session.b.I(p(i11), i9, bArr, i7, i8, interfaceC0546y, z12);
                }
                break;
        }
        return i7;
    }

    public final void M(Object obj, long j7, C0230i c0230i, b0 b0Var, C0536n c0536n) {
        int D6;
        List c5 = this.f9087l.c(j7, obj);
        int i7 = c0230i.f5782b;
        if ((i7 & 7) == 3) {
            do {
                Object e3 = b0Var.e();
                c0230i.h(e3, b0Var, c0536n);
                b0Var.f(e3);
                c5.add(e3);
                B5.e eVar = (B5.e) c0230i.f5784e;
                if (!eVar.k() && c0230i.d == 0) {
                    D6 = eVar.D();
                } else {
                    return;
                }
            } while (D6 == i7);
            c0230i.d = D6;
            return;
        }
        throw B.c();
    }

    public final void N(Object obj, int i7, C0230i c0230i, b0 b0Var, C0536n c0536n) {
        int D6;
        List c5 = this.f9087l.c(i7 & 1048575, obj);
        int i8 = c0230i.f5782b;
        if ((i8 & 7) == 2) {
            do {
                Object e3 = b0Var.e();
                c0230i.i(e3, b0Var, c0536n);
                b0Var.f(e3);
                c5.add(e3);
                B5.e eVar = (B5.e) c0230i.f5784e;
                if (!eVar.k() && c0230i.d == 0) {
                    D6 = eVar.D();
                } else {
                    return;
                }
            } while (D6 == i8);
            c0230i.d = D6;
            return;
        }
        throw B.c();
    }

    public final void O(Object obj, int i7, C0230i c0230i) {
        boolean z7;
        long j7;
        String B6;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            j7 = i7 & 1048575;
            c0230i.f0(2);
            B6 = ((B5.e) c0230i.f5784e).C();
        } else if (this.f) {
            j7 = i7 & 1048575;
            c0230i.f0(2);
            B6 = ((B5.e) c0230i.f5784e).B();
        } else {
            n0.v(i7 & 1048575, obj, c0230i.m());
            return;
        }
        n0.v(j7, obj, B6);
    }

    public final void P(Object obj, int i7, C0230i c0230i) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        H h7 = this.f9087l;
        if (z7) {
            c0230i.U(h7.c(i7 & 1048575, obj), true);
        } else {
            c0230i.U(h7.c(i7 & 1048575, obj), false);
        }
    }

    public final void R(int i7, Object obj) {
        int i8 = this.f9078a[i7 + 2];
        long j7 = 1048575 & i8;
        if (j7 == 1048575) {
            return;
        }
        n0.t((1 << (i8 >>> 20)) | n0.f9149c.g(j7, obj), j7, obj);
    }

    public final void S(int i7, int i8, Object obj) {
        n0.t(i7, this.f9078a[i8 + 2] & 1048575, obj);
    }

    public final int T(int i7, int i8) {
        int[] iArr = this.f9078a;
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

    public final void U(Object obj, int i7, Object obj2) {
        f9077p.putObject(obj, X(i7) & 1048575, obj2);
        R(i7, obj);
    }

    public final void V(Object obj, int i7, Object obj2, int i8) {
        f9077p.putObject(obj, X(i8) & 1048575, obj2);
        S(i7, i8, obj);
    }

    public final int X(int i7) {
        return this.f9078a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Y(Object obj, K k5) {
        int i7;
        boolean z7;
        int[] iArr = this.f9078a;
        int length = iArr.length;
        Unsafe unsafe = f9077p;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int X6 = X(i10);
            int i12 = iArr[i10];
            int W = W(X6);
            if (W <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            int i15 = i7;
            long j7 = X6 & i8;
            switch (W) {
                case 0:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.c(i12, n0.f9149c.e(j7, obj));
                        break;
                    }
                case 1:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.g(i12, n0.f9149c.f(j7, obj));
                        break;
                    }
                case 2:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.j(unsafe.getLong(obj, j7), i12);
                        break;
                    }
                case 3:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.q(unsafe.getLong(obj, j7), i12);
                        break;
                    }
                case 4:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.i(i12, unsafe.getInt(obj, j7));
                        break;
                    }
                case 5:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.f(unsafe.getLong(obj, j7), i12);
                        break;
                    }
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.e(i12, unsafe.getInt(obj, j7));
                        break;
                    }
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.a(i12, n0.f9149c.c(j7, obj));
                        break;
                    }
                case 8:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        Z(i12, unsafe.getObject(obj, j7), k5);
                        break;
                    }
                case 9:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.k(i12, unsafe.getObject(obj, j7), p(i10));
                        break;
                    }
                case 10:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.b(i12, (AbstractC0530h) unsafe.getObject(obj, j7));
                        break;
                    }
                case 11:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.p(i12, unsafe.getInt(obj, j7));
                        break;
                    }
                case 12:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.d(i12, unsafe.getInt(obj, j7));
                        break;
                    }
                case 13:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.l(i12, unsafe.getInt(obj, j7));
                        break;
                    }
                case 14:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.m(unsafe.getLong(obj, j7), i12);
                        break;
                    }
                case 15:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.n(i12, unsafe.getInt(obj, j7));
                        break;
                    }
                case 16:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.o(unsafe.getLong(obj, j7), i12);
                        break;
                    }
                case 17:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        k5.h(i12, unsafe.getObject(obj, j7), p(i10));
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
                    c0.N(iArr[i10], (List) unsafe.getObject(obj, j7), k5, p(i10));
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
                    c0.K(iArr[i10], (List) unsafe.getObject(obj, j7), k5, p(i10));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j7) != null) {
                        Object o7 = o(i10);
                        this.n.getClass();
                        AbstractC0515y1.v(o7);
                        throw null;
                    }
                    break;
                case 51:
                    if (u(i12, i10, obj)) {
                        k5.c(i12, ((Double) n0.f9149c.i(j7, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (u(i12, i10, obj)) {
                        k5.g(i12, ((Float) n0.f9149c.i(j7, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (u(i12, i10, obj)) {
                        k5.j(G(j7, obj), i12);
                    }
                    break;
                case 54:
                    if (u(i12, i10, obj)) {
                        k5.q(G(j7, obj), i12);
                    }
                    break;
                case 55:
                    if (u(i12, i10, obj)) {
                        k5.i(i12, F(j7, obj));
                    }
                    break;
                case 56:
                    if (u(i12, i10, obj)) {
                        k5.f(G(j7, obj), i12);
                    }
                    break;
                case 57:
                    if (u(i12, i10, obj)) {
                        k5.e(i12, F(j7, obj));
                    }
                    break;
                case 58:
                    if (u(i12, i10, obj)) {
                        k5.a(i12, ((Boolean) n0.f9149c.i(j7, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (u(i12, i10, obj)) {
                        Z(i12, unsafe.getObject(obj, j7), k5);
                    }
                    break;
                case 60:
                    if (u(i12, i10, obj)) {
                        k5.k(i12, unsafe.getObject(obj, j7), p(i10));
                    }
                    break;
                case 61:
                    if (u(i12, i10, obj)) {
                        k5.b(i12, (AbstractC0530h) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (u(i12, i10, obj)) {
                        k5.p(i12, F(j7, obj));
                    }
                    break;
                case 63:
                    if (u(i12, i10, obj)) {
                        k5.d(i12, F(j7, obj));
                    }
                    break;
                case 64:
                    if (u(i12, i10, obj)) {
                        k5.l(i12, F(j7, obj));
                    }
                    break;
                case 65:
                    if (u(i12, i10, obj)) {
                        k5.m(G(j7, obj), i12);
                    }
                    break;
                case 66:
                    if (u(i12, i10, obj)) {
                        k5.n(i12, F(j7, obj));
                    }
                    break;
                case 67:
                    if (u(i12, i10, obj)) {
                        k5.o(G(j7, obj), i12);
                    }
                    break;
                case 68:
                    if (u(i12, i10, obj)) {
                        k5.h(i12, unsafe.getObject(obj, j7), p(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        this.f9088m.getClass();
        ((AbstractC0543v) obj).unknownFields.e(k5);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.a(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void b(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f9078a;
            if (i7 < iArr.length) {
                int X6 = X(i7);
                long j7 = 1048575 & X6;
                int i8 = iArr[i7];
                switch (W(X6)) {
                    case 0:
                        if (!s(i7, obj2)) {
                            break;
                        } else {
                            n0.r(obj, j7, n0.f9149c.e(j7, obj2));
                            R(i7, obj);
                            break;
                        }
                    case 1:
                        if (!s(i7, obj2)) {
                            break;
                        } else {
                            n0.s(obj, j7, n0.f9149c.f(j7, obj2));
                            R(i7, obj);
                            break;
                        }
                    case 2:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.u(obj, j7, n0.f9149c.h(j7, obj2));
                        R(i7, obj);
                        break;
                    case 3:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.u(obj, j7, n0.f9149c.h(j7, obj2));
                        R(i7, obj);
                        break;
                    case 4:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.t(n0.f9149c.g(j7, obj2), j7, obj);
                        R(i7, obj);
                        break;
                    case 5:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.u(obj, j7, n0.f9149c.h(j7, obj2));
                        R(i7, obj);
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.t(n0.f9149c.g(j7, obj2), j7, obj);
                        R(i7, obj);
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!s(i7, obj2)) {
                            break;
                        } else {
                            n0.n(obj, j7, n0.f9149c.c(j7, obj2));
                            R(i7, obj);
                            break;
                        }
                    case 8:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.v(j7, obj, n0.f9149c.i(j7, obj2));
                        R(i7, obj);
                        break;
                    case 9:
                    case 17:
                        y(obj, i7, obj2);
                        break;
                    case 10:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.v(j7, obj, n0.f9149c.i(j7, obj2));
                        R(i7, obj);
                        break;
                    case 11:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.t(n0.f9149c.g(j7, obj2), j7, obj);
                        R(i7, obj);
                        break;
                    case 12:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.t(n0.f9149c.g(j7, obj2), j7, obj);
                        R(i7, obj);
                        break;
                    case 13:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.t(n0.f9149c.g(j7, obj2), j7, obj);
                        R(i7, obj);
                        break;
                    case 14:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.u(obj, j7, n0.f9149c.h(j7, obj2));
                        R(i7, obj);
                        break;
                    case 15:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.t(n0.f9149c.g(j7, obj2), j7, obj);
                        R(i7, obj);
                        break;
                    case 16:
                        if (!s(i7, obj2)) {
                            break;
                        }
                        n0.u(obj, j7, n0.f9149c.h(j7, obj2));
                        R(i7, obj);
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
                        this.f9087l.b(j7, obj, obj2);
                        break;
                    case 50:
                        Class cls = c0.f9106a;
                        m0 m0Var = n0.f9149c;
                        Object i9 = m0Var.i(j7, obj);
                        Object i10 = m0Var.i(j7, obj2);
                        this.n.getClass();
                        n0.v(j7, obj, M.d(i9, i10));
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
                        if (!u(i8, i7, obj2)) {
                            break;
                        }
                        n0.v(j7, obj, n0.f9149c.i(j7, obj2));
                        S(i8, i7, obj);
                        break;
                    case 60:
                    case 68:
                        z(obj, i7, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!u(i8, i7, obj2)) {
                            break;
                        }
                        n0.v(j7, obj, n0.f9149c.i(j7, obj2));
                        S(i8, i7, obj);
                        break;
                }
                i7 += 3;
            } else {
                c0.B(this.f9088m, obj, obj2);
                return;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final boolean c(Object obj, Object obj2) {
        m0 m0Var;
        Object i7;
        int[] iArr = this.f9078a;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int X6 = X(i8);
            long j7 = X6 & 1048575;
            switch (W(X6)) {
                case 0:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var2 = n0.f9149c;
                        if (Double.doubleToLongBits(m0Var2.e(j7, obj)) == Double.doubleToLongBits(m0Var2.e(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var3 = n0.f9149c;
                        if (Float.floatToIntBits(m0Var3.f(j7, obj)) == Float.floatToIntBits(m0Var3.f(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var4 = n0.f9149c;
                        if (m0Var4.h(j7, obj) == m0Var4.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var5 = n0.f9149c;
                        if (m0Var5.h(j7, obj) == m0Var5.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var6 = n0.f9149c;
                        if (m0Var6.g(j7, obj) == m0Var6.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var7 = n0.f9149c;
                        if (m0Var7.h(j7, obj) == m0Var7.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var8 = n0.f9149c;
                        if (m0Var8.g(j7, obj) == m0Var8.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var9 = n0.f9149c;
                        if (m0Var9.c(j7, obj) == m0Var9.c(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var10 = n0.f9149c;
                        if (c0.C(m0Var10.i(j7, obj), m0Var10.i(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var11 = n0.f9149c;
                        if (c0.C(m0Var11.i(j7, obj), m0Var11.i(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var12 = n0.f9149c;
                        if (c0.C(m0Var12.i(j7, obj), m0Var12.i(j7, obj2))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var13 = n0.f9149c;
                        if (m0Var13.g(j7, obj) == m0Var13.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var14 = n0.f9149c;
                        if (m0Var14.g(j7, obj) == m0Var14.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var15 = n0.f9149c;
                        if (m0Var15.g(j7, obj) == m0Var15.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var16 = n0.f9149c;
                        if (m0Var16.h(j7, obj) == m0Var16.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var17 = n0.f9149c;
                        if (m0Var17.g(j7, obj) == m0Var17.g(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var18 = n0.f9149c;
                        if (m0Var18.h(j7, obj) == m0Var18.h(j7, obj2)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (k(obj, i8, obj2)) {
                        m0 m0Var19 = n0.f9149c;
                        if (c0.C(m0Var19.i(j7, obj), m0Var19.i(j7, obj2))) {
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
                    m0Var = n0.f9149c;
                    i7 = m0Var.i(j7, obj);
                    break;
                case 50:
                    m0Var = n0.f9149c;
                    i7 = m0Var.i(j7, obj);
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
                    m0 m0Var20 = n0.f9149c;
                    if (m0Var20.g(j8, obj) == m0Var20.g(j8, obj2) && c0.C(m0Var20.i(j7, obj), m0Var20.i(j7, obj2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!c0.C(i7, m0Var.i(j7, obj2))) {
                return false;
            }
        }
        this.f9088m.getClass();
        if (!((AbstractC0543v) obj).unknownFields.equals(((AbstractC0543v) obj2).unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final int d(Object obj) {
        return this.f9082g ? r(obj) : q(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object e() {
        this.f9086k.getClass();
        return ((AbstractC0543v) this.f9081e).t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void f(Object obj) {
        if (!t(obj)) {
            return;
        }
        if (obj instanceof AbstractC0543v) {
            AbstractC0543v abstractC0543v = (AbstractC0543v) obj;
            abstractC0543v.i();
            abstractC0543v.h();
            abstractC0543v.r();
        }
        int length = this.f9078a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int X6 = X(i7);
            long j7 = 1048575 & X6;
            int W = W(X6);
            if (W != 9) {
                switch (W) {
                    case 17:
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
                        this.f9087l.a(j7, obj);
                        continue;
                    case 50:
                        Unsafe unsafe = f9077p;
                        Object object = unsafe.getObject(obj, j7);
                        if (object != null) {
                            this.n.getClass();
                            M.f(object);
                            unsafe.putObject(obj, j7, object);
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (s(i7, obj)) {
                p(i7).f(f9077p.getObject(obj, j7));
            }
        }
        this.f9088m.getClass();
        f0.b(obj);
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
    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.g(java.lang.Object):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void h(Object obj, K k5) {
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
        if (this.f9082g) {
            int[] iArr = this.f9078a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int X6 = X(i7);
                int i8 = iArr[i7];
                switch (W(X6)) {
                    case 0:
                        if (s(i7, obj)) {
                            e3 = n0.f9149c.e(X6 & 1048575, obj);
                            k5.c(i8, e3);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i7, obj)) {
                            f = n0.f9149c.f(X6 & 1048575, obj);
                            k5.g(i8, f);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i7, obj)) {
                            h7 = n0.f9149c.h(X6 & 1048575, obj);
                            k5.j(h7, i8);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i7, obj)) {
                            h8 = n0.f9149c.h(X6 & 1048575, obj);
                            k5.q(h8, i8);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i7, obj)) {
                            g7 = n0.f9149c.g(X6 & 1048575, obj);
                            k5.i(i8, g7);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i7, obj)) {
                            h9 = n0.f9149c.h(X6 & 1048575, obj);
                            k5.f(h9, i8);
                            break;
                        } else {
                            break;
                        }
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (s(i7, obj)) {
                            g8 = n0.f9149c.g(X6 & 1048575, obj);
                            k5.e(i8, g8);
                            break;
                        } else {
                            break;
                        }
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (s(i7, obj)) {
                            c5 = n0.f9149c.c(X6 & 1048575, obj);
                            k5.a(i8, c5);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(i7, obj)) {
                            j7 = X6 & 1048575;
                            Z(i8, n0.f9149c.i(j7, obj), k5);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (s(i7, obj)) {
                            j8 = X6 & 1048575;
                            k5.k(i8, n0.f9149c.i(j8, obj), p(i7));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (s(i7, obj)) {
                            j9 = X6 & 1048575;
                            k5.b(i8, (AbstractC0530h) n0.f9149c.i(j9, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (s(i7, obj)) {
                            g9 = n0.f9149c.g(X6 & 1048575, obj);
                            k5.p(i8, g9);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (s(i7, obj)) {
                            g10 = n0.f9149c.g(X6 & 1048575, obj);
                            k5.d(i8, g10);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i7, obj)) {
                            g11 = n0.f9149c.g(X6 & 1048575, obj);
                            k5.l(i8, g11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i7, obj)) {
                            h10 = n0.f9149c.h(X6 & 1048575, obj);
                            k5.m(h10, i8);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (s(i7, obj)) {
                            g12 = n0.f9149c.g(X6 & 1048575, obj);
                            k5.n(i8, g12);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i7, obj)) {
                            h11 = n0.f9149c.h(X6 & 1048575, obj);
                            k5.o(h11, i8);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i7, obj)) {
                            j10 = X6 & 1048575;
                            k5.h(i8, n0.f9149c.i(j10, obj), p(i7));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c0.F(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 19:
                        c0.J(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 20:
                        c0.M(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 21:
                        c0.U(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 22:
                        c0.L(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 23:
                        c0.I(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 24:
                        c0.H(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 25:
                        c0.D(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 26:
                        c0.S(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5);
                        break;
                    case 27:
                        c0.N(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, p(i7));
                        break;
                    case 28:
                        c0.E(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5);
                        break;
                    case 29:
                        c0.T(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 30:
                        c0.G(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 31:
                        c0.O(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 32:
                        c0.P(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 33:
                        c0.Q(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 34:
                        c0.R(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, false);
                        break;
                    case 35:
                        c0.F(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 36:
                        c0.J(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 37:
                        c0.M(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 38:
                        c0.U(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 39:
                        c0.L(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 40:
                        c0.I(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 41:
                        c0.H(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 42:
                        c0.D(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 43:
                        c0.T(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 44:
                        c0.G(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 45:
                        c0.O(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 46:
                        c0.P(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 47:
                        c0.Q(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 48:
                        c0.R(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, true);
                        break;
                    case 49:
                        c0.K(iArr[i7], (List) n0.f9149c.i(X6 & 1048575, obj), k5, p(i7));
                        break;
                    case 50:
                        if (n0.f9149c.i(X6 & 1048575, obj) != null) {
                            Object o7 = o(i7);
                            this.n.getClass();
                            AbstractC0515y1.v(o7);
                            throw null;
                        }
                        break;
                    case 51:
                        if (u(i8, i7, obj)) {
                            e3 = ((Double) n0.f9149c.i(X6 & 1048575, obj)).doubleValue();
                            k5.c(i8, e3);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (u(i8, i7, obj)) {
                            f = ((Float) n0.f9149c.i(X6 & 1048575, obj)).floatValue();
                            k5.g(i8, f);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (u(i8, i7, obj)) {
                            h7 = G(X6 & 1048575, obj);
                            k5.j(h7, i8);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (u(i8, i7, obj)) {
                            h8 = G(X6 & 1048575, obj);
                            k5.q(h8, i8);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (u(i8, i7, obj)) {
                            g7 = F(X6 & 1048575, obj);
                            k5.i(i8, g7);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (u(i8, i7, obj)) {
                            h9 = G(X6 & 1048575, obj);
                            k5.f(h9, i8);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (u(i8, i7, obj)) {
                            g8 = F(X6 & 1048575, obj);
                            k5.e(i8, g8);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (u(i8, i7, obj)) {
                            c5 = ((Boolean) n0.f9149c.i(X6 & 1048575, obj)).booleanValue();
                            k5.a(i8, c5);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (u(i8, i7, obj)) {
                            j7 = X6 & 1048575;
                            Z(i8, n0.f9149c.i(j7, obj), k5);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (u(i8, i7, obj)) {
                            j8 = X6 & 1048575;
                            k5.k(i8, n0.f9149c.i(j8, obj), p(i7));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (u(i8, i7, obj)) {
                            j9 = X6 & 1048575;
                            k5.b(i8, (AbstractC0530h) n0.f9149c.i(j9, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (u(i8, i7, obj)) {
                            g9 = F(X6 & 1048575, obj);
                            k5.p(i8, g9);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (u(i8, i7, obj)) {
                            g10 = F(X6 & 1048575, obj);
                            k5.d(i8, g10);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (u(i8, i7, obj)) {
                            g11 = F(X6 & 1048575, obj);
                            k5.l(i8, g11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (u(i8, i7, obj)) {
                            h10 = G(X6 & 1048575, obj);
                            k5.m(h10, i8);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (u(i8, i7, obj)) {
                            g12 = F(X6 & 1048575, obj);
                            k5.n(i8, g12);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (u(i8, i7, obj)) {
                            h11 = G(X6 & 1048575, obj);
                            k5.o(h11, i8);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (u(i8, i7, obj)) {
                            j10 = X6 & 1048575;
                            k5.h(i8, n0.f9149c.i(j10, obj), p(i7));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f9088m.getClass();
            ((AbstractC0543v) obj).unknownFields.e(k5);
            return;
        }
        Y(obj, k5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void i(Object obj, byte[] bArr, int i7, int i8, Z1 z12) {
        if (this.f9082g) {
            K(obj, bArr, i7, i8, z12);
        } else {
            J(obj, bArr, i7, i8, 0, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void j(Object obj, C0230i c0230i, C0536n c0536n) {
        c0536n.getClass();
        l(obj);
        w(this.f9088m, obj, c0230i, c0536n);
    }

    public final boolean k(Object obj, int i7, Object obj2) {
        if (s(i7, obj) == s(i7, obj2)) {
            return true;
        }
        return false;
    }

    public final void m(Object obj, int i7, Object obj2) {
        int i8 = this.f9078a[i7];
        if (n0.f9149c.i(X(i7) & 1048575, obj) == null) {
            return;
        }
        n(i7);
    }

    public final void n(int i7) {
        AbstractC0515y1.v(this.f9079b[((i7 / 3) * 2) + 1]);
    }

    public final Object o(int i7) {
        return this.f9079b[(i7 / 3) * 2];
    }

    public final b0 p(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f9079b;
        b0 b0Var = (b0) objArr[i8];
        if (b0Var != null) {
            return b0Var;
        }
        b0 a7 = Y.f9094c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a7;
        return a7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x031c, code lost:
        if ((r7 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC0530h) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if ((r7 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC0530h) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r7 = com.google.crypto.tink.shaded.protobuf.C0533k.K(r9, (com.google.crypto.tink.shaded.protobuf.AbstractC0530h) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        r4 = r7 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
        r7 = com.google.crypto.tink.shaded.protobuf.C0533k.Z((java.lang.String) r7, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.q(java.lang.Object):int");
    }

    public final int r(Object obj) {
        long k5;
        long k7;
        int j7;
        int Z6;
        int j8;
        int j9;
        int j10;
        long k8;
        int i7;
        Unsafe unsafe = f9077p;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f9078a;
            if (i8 < iArr.length) {
                int X6 = X(i8);
                int W = W(X6);
                int i10 = iArr[i8];
                long j11 = X6 & 1048575;
                if (W >= EnumC0539q.f9155r.a() && W <= EnumC0539q.f9156s.a()) {
                    int i11 = iArr[i8 + 2];
                }
                switch (W) {
                    case 0:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.M(i10);
                        i9 = Z6 + i9;
                        break;
                    case 1:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.Q(i10);
                        i9 = Z6 + i9;
                        break;
                    case 2:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            k5 = n0.k(j11, obj);
                            Z6 = C0533k.U(k5, i10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 3:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            k7 = n0.k(j11, obj);
                            Z6 = C0533k.e0(k7, i10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 4:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            j7 = n0.j(j11, obj);
                            Z6 = C0533k.S(i10, j7);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 5:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.P(i10);
                        i9 = Z6 + i9;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.O(i10);
                        i9 = Z6 + i9;
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.J(i10);
                        i9 = Z6 + i9;
                        break;
                    case 8:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            Object l7 = n0.l(j11, obj);
                            if (l7 instanceof AbstractC0530h) {
                                Z6 = C0533k.K(i10, (AbstractC0530h) l7);
                            } else {
                                Z6 = C0533k.Z((String) l7, i10);
                            }
                            i9 = Z6 + i9;
                            break;
                        }
                    case 9:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = c0.o(i10, n0.l(j11, obj), p(i8));
                        i9 = Z6 + i9;
                        break;
                    case 10:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.K(i10, (AbstractC0530h) n0.l(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 11:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            j8 = n0.j(j11, obj);
                            Z6 = C0533k.c0(i10, j8);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 12:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            j9 = n0.j(j11, obj);
                            Z6 = C0533k.N(i10, j9);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 13:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.V(i10);
                        i9 = Z6 + i9;
                        break;
                    case 14:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.W(i10);
                        i9 = Z6 + i9;
                        break;
                    case 15:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            j10 = n0.j(j11, obj);
                            Z6 = C0533k.X(i10, j10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 16:
                        if (!s(i8, obj)) {
                            break;
                        } else {
                            k8 = n0.k(j11, obj);
                            Z6 = C0533k.Y(k8, i10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 17:
                        if (!s(i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.R(i10, (AbstractC0523a) n0.l(j11, obj), p(i8));
                        i9 = Z6 + i9;
                        break;
                    case 18:
                    case 23:
                    case 32:
                        Z6 = c0.h(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 19:
                    case 24:
                    case 31:
                        Z6 = c0.f(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 20:
                        Z6 = c0.m(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 21:
                        Z6 = c0.x(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 22:
                        Z6 = c0.k(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 25:
                        Z6 = c0.a(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 26:
                        Z6 = c0.u(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 27:
                        Z6 = c0.p(i10, v(j11, obj), p(i8));
                        i9 = Z6 + i9;
                        break;
                    case 28:
                        Z6 = c0.c(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 29:
                        Z6 = c0.v(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 30:
                        Z6 = c0.d(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 33:
                        Z6 = c0.q(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 34:
                        Z6 = c0.s(i10, v(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 35:
                        i7 = c0.i((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 36:
                        i7 = c0.g((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 37:
                        i7 = c0.n((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 38:
                        i7 = c0.y((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 39:
                        i7 = c0.l((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 40:
                        i7 = c0.i((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 41:
                        i7 = c0.g((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 42:
                        i7 = c0.b((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 43:
                        i7 = c0.w((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 44:
                        i7 = c0.e((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 45:
                        i7 = c0.g((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 46:
                        i7 = c0.i((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 47:
                        i7 = c0.r((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 48:
                        i7 = c0.t((List) unsafe.getObject(obj, j11));
                        if (i7 <= 0) {
                            break;
                        }
                        i9 = AbstractC0515y1.h(i7, C0533k.b0(i10), i7, i9);
                        break;
                    case 49:
                        Z6 = c0.j(i10, v(j11, obj), p(i8));
                        i9 = Z6 + i9;
                        break;
                    case 50:
                        Object l8 = n0.l(j11, obj);
                        Object o7 = o(i8);
                        this.n.getClass();
                        M.b(l8, o7);
                        break;
                    case 51:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.M(i10);
                        i9 = Z6 + i9;
                        break;
                    case 52:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.Q(i10);
                        i9 = Z6 + i9;
                        break;
                    case 53:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            k5 = G(j11, obj);
                            Z6 = C0533k.U(k5, i10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 54:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            k7 = G(j11, obj);
                            Z6 = C0533k.e0(k7, i10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 55:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            j7 = F(j11, obj);
                            Z6 = C0533k.S(i10, j7);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 56:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.P(i10);
                        i9 = Z6 + i9;
                        break;
                    case 57:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.O(i10);
                        i9 = Z6 + i9;
                        break;
                    case 58:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.J(i10);
                        i9 = Z6 + i9;
                        break;
                    case 59:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            Object l9 = n0.l(j11, obj);
                            if (l9 instanceof AbstractC0530h) {
                                Z6 = C0533k.K(i10, (AbstractC0530h) l9);
                            } else {
                                Z6 = C0533k.Z((String) l9, i10);
                            }
                            i9 = Z6 + i9;
                            break;
                        }
                    case 60:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = c0.o(i10, n0.l(j11, obj), p(i8));
                        i9 = Z6 + i9;
                        break;
                    case 61:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.K(i10, (AbstractC0530h) n0.l(j11, obj));
                        i9 = Z6 + i9;
                        break;
                    case 62:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            j8 = F(j11, obj);
                            Z6 = C0533k.c0(i10, j8);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 63:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            j9 = F(j11, obj);
                            Z6 = C0533k.N(i10, j9);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 64:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.V(i10);
                        i9 = Z6 + i9;
                        break;
                    case 65:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.W(i10);
                        i9 = Z6 + i9;
                        break;
                    case 66:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            j10 = F(j11, obj);
                            Z6 = C0533k.X(i10, j10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 67:
                        if (!u(i10, i8, obj)) {
                            break;
                        } else {
                            k8 = G(j11, obj);
                            Z6 = C0533k.Y(k8, i10);
                            i9 = Z6 + i9;
                            break;
                        }
                    case 68:
                        if (!u(i10, i8, obj)) {
                            break;
                        }
                        Z6 = C0533k.R(i10, (AbstractC0523a) n0.l(j11, obj), p(i8));
                        i9 = Z6 + i9;
                        break;
                }
                i8 += 3;
            } else {
                this.f9088m.getClass();
                return ((AbstractC0543v) obj).unknownFields.b() + i9;
            }
        }
    }

    public final boolean s(int i7, Object obj) {
        int i8 = this.f9078a[i7 + 2];
        long j7 = i8 & 1048575;
        if (j7 == 1048575) {
            int X6 = X(i7);
            long j8 = X6 & 1048575;
            switch (W(X6)) {
                case 0:
                    if (Double.doubleToRawLongBits(n0.f9149c.e(j8, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(n0.f9149c.f(j8, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (n0.f9149c.h(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (n0.f9149c.h(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (n0.f9149c.g(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (n0.f9149c.h(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n0.f9149c.g(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return n0.f9149c.c(j8, obj);
                case 8:
                    Object i9 = n0.f9149c.i(j8, obj);
                    if (i9 instanceof String) {
                        return !((String) i9).isEmpty();
                    }
                    if (i9 instanceof AbstractC0530h) {
                        return !AbstractC0530h.f9118r.equals(i9);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n0.f9149c.i(j8, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC0530h.f9118r.equals(n0.f9149c.i(j8, obj));
                case 11:
                    if (n0.f9149c.g(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (n0.f9149c.g(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (n0.f9149c.g(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (n0.f9149c.h(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (n0.f9149c.g(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (n0.f9149c.h(j8, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (n0.f9149c.i(j8, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & n0.f9149c.g(j7, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean u(int i7, int i8, Object obj) {
        if (n0.f9149c.g(this.f9078a[i8 + 2] & 1048575, obj) == i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x054b A[Catch: all -> 0x0023, TryCatch #1 {all -> 0x0023, blocks: (B:3:0x0011, B:5:0x001a, B:7:0x001e, B:20:0x0043, B:22:0x0048, B:23:0x004c, B:31:0x0065, B:32:0x0069, B:36:0x0079, B:38:0x0085, B:45:0x00a0, B:46:0x00b0, B:48:0x00b7, B:49:0x00ca, B:50:0x00ce, B:51:0x00e2, B:52:0x00f6, B:53:0x010a, B:54:0x0121, B:55:0x0135, B:56:0x0141, B:57:0x0154, B:58:0x0159, B:59:0x016e, B:60:0x0183, B:61:0x0198, B:62:0x01ad, B:63:0x01c2, B:64:0x01d7, B:65:0x01ec, B:66:0x0201, B:68:0x020a, B:148:0x0546, B:150:0x054b, B:151:0x0550, B:127:0x03fc, B:128:0x040c, B:129:0x0411, B:130:0x0422, B:131:0x0427, B:132:0x0439, B:133:0x044b, B:134:0x045d, B:135:0x0472, B:136:0x0484, B:137:0x0492, B:138:0x04a7, B:139:0x04ae, B:140:0x04c1, B:141:0x04d4, B:142:0x04e7, B:143:0x04fa, B:144:0x050d, B:145:0x0520, B:146:0x0533), top: B:166:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(com.google.crypto.tink.shaded.protobuf.f0 r18, java.lang.Object r19, androidx.datastore.preferences.protobuf.C0230i r20, com.google.crypto.tink.shaded.protobuf.C0536n r21) {
        /*
            Method dump skipped, instructions count: 1548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.w(com.google.crypto.tink.shaded.protobuf.f0, java.lang.Object, androidx.datastore.preferences.protobuf.i, com.google.crypto.tink.shaded.protobuf.n):void");
    }

    public final void x(Object obj, int i7, Object obj2) {
        long X6 = X(i7) & 1048575;
        Object i8 = n0.f9149c.i(X6, obj);
        M m7 = this.n;
        m7.getClass();
        if (i8 != null) {
            if (M.c(i8)) {
                L d = L.f9071r.d();
                M.d(d, i8);
                n0.v(X6, obj, d);
                i8 = d;
            }
        } else {
            i8 = L.f9071r.d();
            n0.v(X6, obj, i8);
        }
        m7.getClass();
        L l7 = (L) i8;
        AbstractC0515y1.v(obj2);
        throw null;
    }

    public final void y(Object obj, int i7, Object obj2) {
        if (!s(i7, obj2)) {
            return;
        }
        long X6 = X(i7) & 1048575;
        Unsafe unsafe = f9077p;
        Object object = unsafe.getObject(obj2, X6);
        if (object != null) {
            b0 p3 = p(i7);
            if (!s(i7, obj)) {
                if (!t(object)) {
                    unsafe.putObject(obj, X6, object);
                } else {
                    Object e3 = p3.e();
                    p3.b(e3, object);
                    unsafe.putObject(obj, X6, e3);
                }
                R(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X6);
            if (!t(object2)) {
                Object e7 = p3.e();
                p3.b(e7, object2);
                unsafe.putObject(obj, X6, e7);
                object2 = e7;
            }
            p3.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f9078a[i7] + " is present but null: " + obj2);
    }

    public final void z(Object obj, int i7, Object obj2) {
        int[] iArr;
        int i8 = this.f9078a[i7];
        if (!u(i8, i7, obj2)) {
            return;
        }
        long X6 = X(i7) & 1048575;
        Unsafe unsafe = f9077p;
        Object object = unsafe.getObject(obj2, X6);
        if (object != null) {
            b0 p3 = p(i7);
            if (!u(i8, i7, obj)) {
                if (!t(object)) {
                    unsafe.putObject(obj, X6, object);
                } else {
                    Object e3 = p3.e();
                    p3.b(e3, object);
                    unsafe.putObject(obj, X6, e3);
                }
                S(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X6);
            if (!t(object2)) {
                Object e7 = p3.e();
                p3.b(e7, object2);
                unsafe.putObject(obj, X6, e7);
                object2 = e7;
            }
            p3.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
    }
}
