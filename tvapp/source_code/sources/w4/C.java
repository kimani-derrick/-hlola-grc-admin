package w4;

import java.util.List;
/* loaded from: classes.dex */
public final class C extends h0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f15880a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15881b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15882c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15883e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f15884g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15885h;

    /* renamed from: i  reason: collision with root package name */
    public final List f15886i;

    public C(int i7, String str, int i8, int i9, long j7, long j8, long j9, String str2, List list) {
        this.f15880a = i7;
        this.f15881b = str;
        this.f15882c = i8;
        this.d = i9;
        this.f15883e = j7;
        this.f = j8;
        this.f15884g = j9;
        this.f15885h = str2;
        this.f15886i = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f15880a == ((C) h0Var).f15880a) {
            C c5 = (C) h0Var;
            if (this.f15881b.equals(c5.f15881b) && this.f15882c == c5.f15882c && this.d == c5.d && this.f15883e == c5.f15883e && this.f == c5.f && this.f15884g == c5.f15884g) {
                String str = c5.f15885h;
                String str2 = this.f15885h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    List list = c5.f15886i;
                    List list2 = this.f15886i;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f15883e;
        long j8 = this.f;
        long j9 = this.f15884g;
        int hashCode2 = (((((((((((((this.f15880a ^ 1000003) * 1000003) ^ this.f15881b.hashCode()) * 1000003) ^ this.f15882c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        int i7 = 0;
        String str = this.f15885h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        List list = this.f15886i;
        if (list != null) {
            i7 = list.hashCode();
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f15880a + ", processName=" + this.f15881b + ", reasonCode=" + this.f15882c + ", importance=" + this.d + ", pss=" + this.f15883e + ", rss=" + this.f + ", timestamp=" + this.f15884g + ", traceFile=" + this.f15885h + ", buildIdMappingForArch=" + this.f15886i + "}";
    }
}
