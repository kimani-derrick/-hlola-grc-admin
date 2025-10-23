package v4;

import r0.AbstractC1111a;
/* renamed from: v4.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324b extends AbstractC1335m {

    /* renamed from: b  reason: collision with root package name */
    public final String f15325b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15326c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f15327e;
    public final long f;

    public C1324b(String str, String str2, String str3, String str4, long j7) {
        if (str != null) {
            this.f15325b = str;
            if (str2 != null) {
                this.f15326c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f15327e = str4;
                        this.f = j7;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1335m)) {
            return false;
        }
        AbstractC1335m abstractC1335m = (AbstractC1335m) obj;
        if (this.f15325b.equals(((C1324b) abstractC1335m).f15325b)) {
            C1324b c1324b = (C1324b) abstractC1335m;
            if (this.f15326c.equals(c1324b.f15326c) && this.d.equals(c1324b.d) && this.f15327e.equals(c1324b.f15327e) && this.f == c1324b.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f;
        return ((((((((this.f15325b.hashCode() ^ 1000003) * 1000003) ^ this.f15326c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f15327e.hashCode()) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f15325b);
        sb.append(", parameterKey=");
        sb.append(this.f15326c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.f15327e);
        sb.append(", templateVersion=");
        return AbstractC1111a.s(sb, this.f, "}");
    }
}
