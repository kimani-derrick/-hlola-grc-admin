package s3;

import android.os.Bundle;
import java.util.EnumMap;
/* renamed from: s3.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198s0 {

    /* renamed from: c  reason: collision with root package name */
    public static final C1198s0 f14233c = new C1198s0(null, null, 100);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f14234a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14235b;

    public C1198s0(Boolean bool, Boolean bool2, int i7) {
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        this.f14234a = enumMap;
        EnumC1196r0 enumC1196r0 = EnumC1196r0.f14216r;
        EnumC1202u0 enumC1202u0 = EnumC1202u0.f14250s;
        EnumC1202u0 enumC1202u02 = EnumC1202u0.f14251t;
        EnumC1202u0 enumC1202u03 = EnumC1202u0.f14248q;
        enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) (bool == null ? enumC1202u03 : bool.booleanValue() ? enumC1202u02 : enumC1202u0));
        EnumC1196r0 enumC1196r02 = EnumC1196r0.f14217s;
        if (bool2 == null) {
            enumC1202u0 = enumC1202u03;
        } else if (bool2.booleanValue()) {
            enumC1202u0 = enumC1202u02;
        }
        enumMap.put((EnumMap) enumC1196r02, (EnumC1196r0) enumC1202u0);
        this.f14235b = i7;
    }

    public static char a(EnumC1202u0 enumC1202u0) {
        if (enumC1202u0 != null) {
            int ordinal = enumC1202u0.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static String b(int i7) {
        if (i7 != -30) {
            if (i7 != -20) {
                if (i7 != -10) {
                    if (i7 != 0) {
                        if (i7 != 30) {
                            if (i7 != 90) {
                                if (i7 != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static C1198s0 c(int i7, Bundle bundle) {
        EnumC1196r0[] enumC1196r0Arr;
        if (bundle == null) {
            return new C1198s0(null, null, i7);
        }
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.STORAGE.f14242q) {
            enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) g(bundle.getString(enumC1196r0.f14221q)));
        }
        return new C1198s0(enumMap, i7);
    }

    public static C1198s0 d(String str, int i7) {
        EnumC1202u0 enumC1202u0;
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        if (str == null) {
            str = "";
        }
        EnumC1200t0 enumC1200t0 = EnumC1200t0.STORAGE;
        int i8 = 0;
        while (true) {
            EnumC1196r0[] enumC1196r0Arr = enumC1200t0.f14242q;
            if (i8 < enumC1196r0Arr.length) {
                EnumC1196r0 enumC1196r0 = enumC1196r0Arr[i8];
                int i9 = i8 + 2;
                if (i9 < str.length()) {
                    enumC1202u0 = f(str.charAt(i9));
                } else {
                    enumC1202u0 = EnumC1202u0.f14248q;
                }
                enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) enumC1202u0);
                i8++;
            } else {
                return new C1198s0(enumMap, i7);
            }
        }
    }

    public static EnumC1202u0 f(char c5) {
        if (c5 != '+') {
            if (c5 != '0') {
                if (c5 != '1') {
                    return EnumC1202u0.f14248q;
                }
                return EnumC1202u0.f14251t;
            }
            return EnumC1202u0.f14250s;
        }
        return EnumC1202u0.f14249r;
    }

    public static EnumC1202u0 g(String str) {
        EnumC1202u0 enumC1202u0 = EnumC1202u0.f14248q;
        if (str == null) {
            return enumC1202u0;
        }
        if (str.equals("granted")) {
            return EnumC1202u0.f14251t;
        }
        if (str.equals("denied")) {
            return EnumC1202u0.f14250s;
        }
        return enumC1202u0;
    }

    public static boolean h(int i7, int i8) {
        if (i7 != -20 || i8 != -30) {
            if ((i7 == -30 && i8 == -20) || i7 == i8 || i7 < i8) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s3.C1198s0 e(s3.C1198s0 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<s3.r0> r1 = s3.EnumC1196r0.class
            r0.<init>(r1)
            s3.t0 r1 = s3.EnumC1200t0.STORAGE
            s3.r0[] r1 = r1.f14242q
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f14234a
            java.lang.Object r5 = r5.get(r4)
            s3.u0 r5 = (s3.EnumC1202u0) r5
            java.util.EnumMap r6 = r9.f14234a
            java.lang.Object r6 = r6.get(r4)
            s3.u0 r6 = (s3.EnumC1202u0) r6
            if (r5 != 0) goto L24
            goto L33
        L24:
            if (r6 != 0) goto L27
            goto L43
        L27:
            s3.u0 r7 = s3.EnumC1202u0.f14248q
            if (r5 != r7) goto L2c
            goto L33
        L2c:
            if (r6 != r7) goto L2f
            goto L43
        L2f:
            s3.u0 r7 = s3.EnumC1202u0.f14249r
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L43
        L35:
            if (r6 != r7) goto L38
            goto L43
        L38:
            s3.u0 r7 = s3.EnumC1202u0.f14250s
            if (r5 == r7) goto L42
            if (r6 != r7) goto L3f
            goto L42
        L3f:
            s3.u0 r5 = s3.EnumC1202u0.f14251t
            goto L43
        L42:
            r5 = r7
        L43:
            if (r5 == 0) goto L48
            r0.put(r4, r5)
        L48:
            int r3 = r3 + 1
            goto Ld
        L4b:
            s3.s0 r9 = new s3.s0
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1198s0.e(s3.s0):s3.s0");
    }

    public final boolean equals(Object obj) {
        EnumC1196r0[] enumC1196r0Arr;
        if (!(obj instanceof C1198s0)) {
            return false;
        }
        C1198s0 c1198s0 = (C1198s0) obj;
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.STORAGE.f14242q) {
            if (this.f14234a.get(enumC1196r0) != c1198s0.f14234a.get(enumC1196r0)) {
                return false;
            }
        }
        if (this.f14235b != c1198s0.f14235b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f14235b * 17;
        for (EnumC1202u0 enumC1202u0 : this.f14234a.values()) {
            i7 = (i7 * 31) + enumC1202u0.hashCode();
        }
        return i7;
    }

    public final boolean i(EnumC1196r0 enumC1196r0) {
        if (((EnumC1202u0) this.f14234a.get(enumC1196r0)) == EnumC1202u0.f14250s) {
            return false;
        }
        return true;
    }

    public final C1198s0 j(C1198s0 c1198s0) {
        EnumC1196r0[] enumC1196r0Arr;
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.STORAGE.f14242q) {
            EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14234a.get(enumC1196r0);
            if (enumC1202u0 == EnumC1202u0.f14248q) {
                enumC1202u0 = (EnumC1202u0) c1198s0.f14234a.get(enumC1196r0);
            }
            if (enumC1202u0 != null) {
                enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) enumC1202u0);
            }
        }
        return new C1198s0(enumMap, this.f14235b);
    }

    public final boolean k(C1198s0 c1198s0, EnumC1196r0... enumC1196r0Arr) {
        for (EnumC1196r0 enumC1196r0 : enumC1196r0Arr) {
            EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14234a.get(enumC1196r0);
            EnumC1202u0 enumC1202u02 = (EnumC1202u0) c1198s0.f14234a.get(enumC1196r0);
            EnumC1202u0 enumC1202u03 = EnumC1202u0.f14250s;
            if (enumC1202u0 == enumC1202u03 && enumC1202u02 != enumC1202u03) {
                return true;
            }
        }
        return false;
    }

    public final boolean l(C1198s0 c1198s0) {
        return k(c1198s0, (EnumC1196r0[]) this.f14234a.keySet().toArray(new EnumC1196r0[0]));
    }

    public final Boolean m() {
        EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14234a.get(EnumC1196r0.f14216r);
        if (enumC1202u0 != null) {
            int ordinal = enumC1202u0.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean n() {
        EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14234a.get(EnumC1196r0.f14217s);
        if (enumC1202u0 != null) {
            int ordinal = enumC1202u0.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final String o() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.STORAGE.f14242q) {
            EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14234a.get(enumC1196r0);
            char c5 = '-';
            if (enumC1202u0 != null && (ordinal = enumC1202u0.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c5 = '0';
                    }
                }
                c5 = '1';
            }
            sb.append(c5);
        }
        return sb.toString();
    }

    public final String p() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.STORAGE.f14242q) {
            sb.append(a((EnumC1202u0) this.f14234a.get(enumC1196r0)));
        }
        return sb.toString();
    }

    public final boolean q() {
        return i(EnumC1196r0.f14217s);
    }

    public final boolean r() {
        for (EnumC1202u0 enumC1202u0 : this.f14234a.values()) {
            if (enumC1202u0 != EnumC1202u0.f14248q) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        EnumC1196r0[] enumC1196r0Arr;
        int ordinal;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(b(this.f14235b));
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.STORAGE.f14242q) {
            sb.append(",");
            sb.append(enumC1196r0.f14221q);
            sb.append("=");
            EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14234a.get(enumC1196r0);
            if (enumC1202u0 == null || (ordinal = enumC1202u0.ordinal()) == 0) {
                sb.append("uninitialized");
            } else {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            str = "granted";
                        }
                    } else {
                        str = "denied";
                    }
                } else {
                    str = "default";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public C1198s0(EnumMap enumMap, int i7) {
        EnumMap enumMap2 = new EnumMap(EnumC1196r0.class);
        this.f14234a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f14235b = i7;
    }
}
