package s3;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;
/* renamed from: s3.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188n {
    public static final C1188n f = new C1188n((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f14153a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14154b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f14155c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumMap f14156e;

    public C1188n(Boolean bool, int i7, Boolean bool2, String str) {
        EnumC1202u0 enumC1202u0;
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        this.f14156e = enumMap;
        EnumC1196r0 enumC1196r0 = EnumC1196r0.f14218t;
        if (bool == null) {
            enumC1202u0 = EnumC1202u0.f14248q;
        } else {
            enumC1202u0 = bool.booleanValue() ? EnumC1202u0.f14251t : EnumC1202u0.f14250s;
        }
        enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) enumC1202u0);
        this.f14153a = i7;
        this.f14154b = e();
        this.f14155c = bool2;
        this.d = str;
    }

    public static Boolean a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i7 = AbstractC1186m.f14117a[C1198s0.g(bundle.getString("ad_personalization")).ordinal()];
        if (i7 != 3) {
            if (i7 != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static C1188n b(int i7, Bundle bundle) {
        EnumC1196r0[] enumC1196r0Arr;
        Boolean bool = null;
        if (bundle == null) {
            return new C1188n((Boolean) null, i7, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC1196r0.class);
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.DMA.f14242q) {
            enumMap.put((EnumMap) enumC1196r0, (EnumC1196r0) C1198s0.g(bundle.getString(enumC1196r0.f14221q)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C1188n(enumMap, i7, bool, bundle.getString("cps_display_str"));
    }

    public static C1188n c(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(EnumC1196r0.class);
            EnumC1196r0[] enumC1196r0Arr = EnumC1200t0.DMA.f14242q;
            int length = enumC1196r0Arr.length;
            int i7 = 1;
            int i8 = 0;
            while (i8 < length) {
                enumMap.put((EnumMap) enumC1196r0Arr[i8], (EnumC1196r0) C1198s0.f(split[i7].charAt(0)));
                i8++;
                i7++;
            }
            return new C1188n(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f;
    }

    public final EnumC1202u0 d() {
        EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14156e.get(EnumC1196r0.f14218t);
        if (enumC1202u0 == null) {
            return EnumC1202u0.f14248q;
        }
        return enumC1202u0;
    }

    public final String e() {
        EnumC1196r0[] enumC1196r0Arr;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14153a);
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.DMA.f14242q) {
            sb.append(":");
            sb.append(C1198s0.a((EnumC1202u0) this.f14156e.get(enumC1196r0)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1188n)) {
            return false;
        }
        C1188n c1188n = (C1188n) obj;
        if (!this.f14154b.equalsIgnoreCase(c1188n.f14154b) || !Objects.equals(this.f14155c, c1188n.f14155c)) {
            return false;
        }
        return Objects.equals(this.d, c1188n.d);
    }

    public final int hashCode() {
        int i7;
        int hashCode;
        Boolean bool = this.f14155c;
        if (bool == null) {
            i7 = 3;
        } else if (bool == Boolean.TRUE) {
            i7 = 7;
        } else {
            i7 = 13;
        }
        String str = this.d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + (i7 * 29) + this.f14154b.hashCode();
    }

    public final String toString() {
        EnumC1196r0[] enumC1196r0Arr;
        int i7;
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C1198s0.b(this.f14153a));
        for (EnumC1196r0 enumC1196r0 : EnumC1200t0.DMA.f14242q) {
            sb.append(",");
            sb.append(enumC1196r0.f14221q);
            sb.append("=");
            EnumC1202u0 enumC1202u0 = (EnumC1202u0) this.f14156e.get(enumC1196r0);
            if (enumC1202u0 == null || (i7 = AbstractC1186m.f14117a[enumC1202u0.ordinal()]) == 1) {
                sb.append("uninitialized");
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 == 4) {
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
        Boolean bool = this.f14155c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str2 = this.d;
        if (str2 != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str2);
        }
        return sb.toString();
    }

    public C1188n(EnumMap enumMap, int i7, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC1196r0.class);
        this.f14156e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f14153a = i7;
        this.f14154b = e();
        this.f14155c = bool;
        this.d = str;
    }
}
