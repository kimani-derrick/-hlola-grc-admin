package w4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
/* loaded from: classes.dex */
public final class H extends E0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15897a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15898b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15899c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f15900e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final m0 f15901g;

    /* renamed from: h  reason: collision with root package name */
    public final D0 f15902h;

    /* renamed from: i  reason: collision with root package name */
    public final C0 f15903i;

    /* renamed from: j  reason: collision with root package name */
    public final n0 f15904j;

    /* renamed from: k  reason: collision with root package name */
    public final List f15905k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15906l;

    public H(String str, String str2, String str3, long j7, Long l7, boolean z7, m0 m0Var, D0 d02, C0 c02, n0 n0Var, List list, int i7) {
        this.f15897a = str;
        this.f15898b = str2;
        this.f15899c = str3;
        this.d = j7;
        this.f15900e = l7;
        this.f = z7;
        this.f15901g = m0Var;
        this.f15902h = d02;
        this.f15903i = c02;
        this.f15904j = n0Var;
        this.f15905k = list;
        this.f15906l = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J3.j, java.lang.Object] */
    @Override // w4.E0
    public final J3.j a() {
        ?? obj = new Object();
        obj.f1373a = this.f15897a;
        obj.f1374b = this.f15898b;
        obj.f1375c = this.f15899c;
        obj.d = Long.valueOf(this.d);
        obj.f1376e = this.f15900e;
        obj.f = Boolean.valueOf(this.f);
        obj.f1377g = this.f15901g;
        obj.f1378h = this.f15902h;
        obj.f1379i = this.f15903i;
        obj.f1380j = this.f15904j;
        obj.f1381k = this.f15905k;
        obj.f1382l = Integer.valueOf(this.f15906l);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f15897a.equals(((H) e02).f15897a)) {
            H h7 = (H) e02;
            if (this.f15898b.equals(h7.f15898b)) {
                String str = h7.f15899c;
                String str2 = this.f15899c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == h7.d) {
                        Long l7 = h7.f15900e;
                        Long l8 = this.f15900e;
                        if (l8 != null ? l8.equals(l7) : l7 == null) {
                            if (this.f == h7.f && this.f15901g.equals(h7.f15901g)) {
                                D0 d02 = h7.f15902h;
                                D0 d03 = this.f15902h;
                                if (d03 != null ? d03.equals(d02) : d02 == null) {
                                    C0 c02 = h7.f15903i;
                                    C0 c03 = this.f15903i;
                                    if (c03 != null ? c03.equals(c02) : c02 == null) {
                                        n0 n0Var = h7.f15904j;
                                        n0 n0Var2 = this.f15904j;
                                        if (n0Var2 != null ? n0Var2.equals(n0Var) : n0Var == null) {
                                            List list = h7.f15905k;
                                            List list2 = this.f15905k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.f15906l == h7.f15906l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f15897a.hashCode() ^ 1000003) * 1000003) ^ this.f15898b.hashCode()) * 1000003;
        int i8 = 0;
        String str = this.f15899c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j7 = this.d;
        int i9 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        Long l7 = this.f15900e;
        if (l7 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l7.hashCode();
        }
        int i10 = (i9 ^ hashCode2) * 1000003;
        if (this.f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode7 = (((i10 ^ i7) * 1000003) ^ this.f15901g.hashCode()) * 1000003;
        D0 d02 = this.f15902h;
        if (d02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d02.hashCode();
        }
        int i11 = (hashCode7 ^ hashCode3) * 1000003;
        C0 c02 = this.f15903i;
        if (c02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c02.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        n0 n0Var = this.f15904j;
        if (n0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = n0Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        List list = this.f15905k;
        if (list != null) {
            i8 = list.hashCode();
        }
        return ((i13 ^ i8) * 1000003) ^ this.f15906l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f15897a);
        sb.append(", identifier=");
        sb.append(this.f15898b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f15899c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.f15900e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.f15901g);
        sb.append(", user=");
        sb.append(this.f15902h);
        sb.append(", os=");
        sb.append(this.f15903i);
        sb.append(", device=");
        sb.append(this.f15904j);
        sb.append(", events=");
        sb.append(this.f15905k);
        sb.append(", generatorType=");
        return AbstractC0515y1.n(sb, this.f15906l, "}");
    }
}
