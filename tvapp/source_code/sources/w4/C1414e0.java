package w4;

import r0.AbstractC1111a;
/* renamed from: w4.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414e0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f16001a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16002b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16003c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f16004e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16005g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16006h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16007i;

    public C1414e0(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
        this.f16001a = i7;
        if (str != null) {
            this.f16002b = str;
            this.f16003c = i8;
            this.d = j7;
            this.f16004e = j8;
            this.f = z7;
            this.f16005g = i9;
            if (str2 != null) {
                this.f16006h = str2;
                if (str3 != null) {
                    this.f16007i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1414e0)) {
            return false;
        }
        C1414e0 c1414e0 = (C1414e0) obj;
        if (this.f16001a == c1414e0.f16001a && this.f16002b.equals(c1414e0.f16002b) && this.f16003c == c1414e0.f16003c && this.d == c1414e0.d && this.f16004e == c1414e0.f16004e && this.f == c1414e0.f && this.f16005g == c1414e0.f16005g && this.f16006h.equals(c1414e0.f16006h) && this.f16007i.equals(c1414e0.f16007i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        long j7 = this.d;
        long j8 = this.f16004e;
        int hashCode = (((((((((this.f16001a ^ 1000003) * 1000003) ^ this.f16002b.hashCode()) * 1000003) ^ this.f16003c) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        if (this.f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((((((hashCode ^ i7) * 1000003) ^ this.f16005g) * 1000003) ^ this.f16006h.hashCode()) * 1000003) ^ this.f16007i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f16001a);
        sb.append(", model=");
        sb.append(this.f16002b);
        sb.append(", availableProcessors=");
        sb.append(this.f16003c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.f16004e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.f16005g);
        sb.append(", manufacturer=");
        sb.append(this.f16006h);
        sb.append(", modelClass=");
        return AbstractC1111a.t(sb, this.f16007i, "}");
    }
}
