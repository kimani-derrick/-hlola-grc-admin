package V5;

import M5.g;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: r  reason: collision with root package name */
    public static final long f3729r;

    /* renamed from: s  reason: collision with root package name */
    public static final long f3730s;

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f3731t = 0;

    /* renamed from: q  reason: collision with root package name */
    public final long f3732q;

    static {
        int i7 = b.f3733a;
        f3729r = Long.MAX_VALUE;
        f3730s = -9223372036854775805L;
    }

    public /* synthetic */ a(long j7) {
        this.f3732q = j7;
    }

    public static final void a(StringBuilder sb, int i7, int i8, int i9, String str) {
        CharSequence charSequence;
        sb.append(i7);
        if (i8 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i8);
            g.f(valueOf, "<this>");
            if (i9 >= 0) {
                if (i9 <= valueOf.length()) {
                    charSequence = valueOf.subSequence(0, valueOf.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(i9);
                    R5.b it = new R5.a(1, i9 - valueOf.length(), 1).iterator();
                    while (it.f2927s) {
                        it.a();
                        sb2.append('0');
                    }
                    sb2.append((CharSequence) valueOf);
                    charSequence = sb2;
                }
                String obj = charSequence.toString();
                int i10 = -1;
                int length = obj.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i11 = length - 1;
                        if (obj.charAt(length) != '0') {
                            i10 = length;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            length = i11;
                        }
                    }
                }
                int i12 = i10 + 1;
                if (i12 < 3) {
                    sb.append((CharSequence) obj, 0, i12);
                } else {
                    sb.append((CharSequence) obj, 0, ((i10 + 3) / 3) * 3);
                }
            } else {
                throw new IllegalArgumentException(AbstractC1111a.n(i9, "Desired length ", " is less than zero."));
            }
        }
        sb.append(str);
    }

    public static int b(long j7, long j8) {
        long j9 = j7 ^ j8;
        if (j9 >= 0 && (((int) j9) & 1) != 0) {
            int i7 = (((int) j7) & 1) - (((int) j8) & 1);
            return j7 < 0 ? -i7 : i7;
        }
        int i8 = (j7 > j8 ? 1 : (j7 == j8 ? 0 : -1));
        if (i8 < 0) {
            return -1;
        }
        return i8 == 0 ? 0 : 1;
    }

    public static final boolean c(long j7) {
        if (j7 != f3729r && j7 != f3730s) {
            return false;
        }
        return true;
    }

    public static final long d(long j7, c cVar) {
        c cVar2;
        g.f(cVar, "unit");
        if (j7 == f3729r) {
            return Long.MAX_VALUE;
        }
        if (j7 == f3730s) {
            return Long.MIN_VALUE;
        }
        long j8 = j7 >> 1;
        if ((((int) j7) & 1) == 0) {
            cVar2 = c.NANOSECONDS;
        } else {
            cVar2 = c.MILLISECONDS;
        }
        g.f(cVar2, "sourceUnit");
        return cVar.f3741q.convert(j8, cVar2.f3741q);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.f3732q, ((a) obj).f3732q);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.f3732q != ((a) obj).f3732q) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j7 = this.f3732q;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public final String toString() {
        boolean z7;
        boolean z8;
        boolean z9;
        int d;
        int d7;
        int d8;
        long j7;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i8;
        long j8 = this.f3732q;
        int i9 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        if (i9 == 0) {
            return "0s";
        }
        if (j8 == f3729r) {
            return "Infinity";
        }
        if (j8 == f3730s) {
            return "-Infinity";
        }
        if (i9 < 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z7) {
            sb.append('-');
        }
        if (i9 < 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            j8 = (((int) j8) & 1) + ((-(j8 >> 1)) << 1);
            int i10 = b.f3733a;
        }
        long d9 = d(j8, c.DAYS);
        if (c(j8)) {
            z9 = z7;
            d = 0;
        } else {
            z9 = z7;
            d = (int) (d(j8, c.HOURS) % 24);
        }
        if (c(j8)) {
            d7 = 0;
        } else {
            d7 = (int) (d(j8, c.MINUTES) % 60);
        }
        if (c(j8)) {
            d8 = 0;
        } else {
            d8 = (int) (d(j8, c.SECONDS) % 60);
        }
        if (c(j8)) {
            i7 = 0;
        } else {
            if ((((int) j8) & 1) == 1) {
                j7 = ((j8 >> 1) % 1000) * 1000000;
            } else {
                j7 = (j8 >> 1) % 1000000000;
            }
            i7 = (int) j7;
        }
        if (d9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (d != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (d7 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (d8 == 0 && i7 == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10) {
            sb.append(d9);
            sb.append('d');
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(d);
            sb.append('h');
            i8 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            sb.append(d7);
            sb.append('m');
            i8 = i12;
        }
        if (z13) {
            int i13 = i8 + 1;
            if (i8 > 0) {
                sb.append(' ');
            }
            if (d8 == 0 && !z10 && !z11 && !z12) {
                if (i7 >= 1000000) {
                    a(sb, i7 / 1000000, i7 % 1000000, 6, "ms");
                } else if (i7 >= 1000) {
                    a(sb, i7 / 1000, i7 % 1000, 3, "us");
                } else {
                    sb.append(i7);
                    sb.append("ns");
                }
            } else {
                a(sb, d8, i7, 9, "s");
            }
            i8 = i13;
        }
        if (z9 && i8 > 1) {
            sb.insert(1, '(').append(')');
        }
        String sb2 = sb.toString();
        g.e(sb2, "toString(...)");
        return sb2;
    }
}
