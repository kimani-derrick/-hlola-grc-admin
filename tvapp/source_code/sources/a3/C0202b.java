package a3;

import Z2.H;
import e2.InterfaceC0604f;
import java.util.Arrays;
/* renamed from: a3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202b implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final A4.a f5016A;

    /* renamed from: v  reason: collision with root package name */
    public static final C0202b f5017v = new C0202b(1, 2, 3, null);

    /* renamed from: w  reason: collision with root package name */
    public static final String f5018w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f5019x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f5020y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f5021z;

    /* renamed from: q  reason: collision with root package name */
    public final int f5022q;

    /* renamed from: r  reason: collision with root package name */
    public final int f5023r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5024s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f5025t;

    /* renamed from: u  reason: collision with root package name */
    public int f5026u;

    static {
        int i7 = H.f4603a;
        f5018w = Integer.toString(0, 36);
        f5019x = Integer.toString(1, 36);
        f5020y = Integer.toString(2, 36);
        f5021z = Integer.toString(3, 36);
        f5016A = new A4.a(28);
    }

    public C0202b(int i7, int i8, int i9, byte[] bArr) {
        this.f5022q = i7;
        this.f5023r = i8;
        this.f5024s = i9;
        this.f5025t = bArr;
    }

    public static String a(int i7) {
        if (i7 != -1) {
            if (i7 != 10) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    return "Undefined color transfer";
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static int b(int i7) {
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 9) {
            return 6;
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            return -1;
        }
        return 2;
    }

    public static int c(int i7) {
        if (i7 != 1) {
            if (i7 != 4) {
                if (i7 != 13) {
                    if (i7 == 16) {
                        return 6;
                    }
                    if (i7 == 18) {
                        return 7;
                    }
                    if (i7 != 6 && i7 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0202b.class != obj.getClass()) {
            return false;
        }
        C0202b c0202b = (C0202b) obj;
        if (this.f5022q == c0202b.f5022q && this.f5023r == c0202b.f5023r && this.f5024s == c0202b.f5024s && Arrays.equals(this.f5025t, c0202b.f5025t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5026u == 0) {
            this.f5026u = Arrays.hashCode(this.f5025t) + ((((((527 + this.f5022q) * 31) + this.f5023r) * 31) + this.f5024s) * 31);
        }
        return this.f5026u;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        boolean z7 = true;
        int i7 = this.f5022q;
        if (i7 != -1) {
            if (i7 != 6) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        str = "Undefined color space";
                    } else {
                        str = "BT601";
                    }
                } else {
                    str = "BT709";
                }
            } else {
                str = "BT2020";
            }
        } else {
            str = "Unset color space";
        }
        sb.append(str);
        sb.append(", ");
        int i8 = this.f5023r;
        if (i8 != -1) {
            if (i8 != 1) {
                if (i8 != 2) {
                    str2 = "Undefined color range";
                } else {
                    str2 = "Limited range";
                }
            } else {
                str2 = "Full range";
            }
        } else {
            str2 = "Unset color range";
        }
        sb.append(str2);
        sb.append(", ");
        sb.append(a(this.f5024s));
        sb.append(", ");
        if (this.f5025t == null) {
            z7 = false;
        }
        sb.append(z7);
        sb.append(")");
        return sb.toString();
    }
}
