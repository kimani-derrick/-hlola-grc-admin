package a2;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: a2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198a {
    public static final C0198a f = new C0198a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a  reason: collision with root package name */
    public final long f4982a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4983b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4984c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4985e;

    public C0198a(long j7, int i7, int i8, long j8, int i9) {
        this.f4982a = j7;
        this.f4983b = i7;
        this.f4984c = i8;
        this.d = j8;
        this.f4985e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0198a)) {
            return false;
        }
        C0198a c0198a = (C0198a) obj;
        if (this.f4982a == c0198a.f4982a && this.f4983b == c0198a.f4983b && this.f4984c == c0198a.f4984c && this.d == c0198a.d && this.f4985e == c0198a.f4985e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f4982a;
        long j8 = this.d;
        return ((((((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f4983b) * 1000003) ^ this.f4984c) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f4985e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f4982a);
        sb.append(", loadBatchSize=");
        sb.append(this.f4983b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f4984c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0515y1.n(sb, this.f4985e, "}");
    }
}
