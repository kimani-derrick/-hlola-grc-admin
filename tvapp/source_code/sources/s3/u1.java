package s3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* loaded from: classes.dex */
public final class u1 extends AbstractC0748a {
    public static final Parcelable.Creator<u1> CREATOR = new C1199t(3);

    /* renamed from: q  reason: collision with root package name */
    public final int f14253q;

    /* renamed from: r  reason: collision with root package name */
    public final String f14254r;

    /* renamed from: s  reason: collision with root package name */
    public final long f14255s;

    /* renamed from: t  reason: collision with root package name */
    public final Long f14256t;

    /* renamed from: u  reason: collision with root package name */
    public final String f14257u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14258v;

    /* renamed from: w  reason: collision with root package name */
    public final Double f14259w;

    public u1(int i7, String str, long j7, Long l7, Float f, String str2, String str3, Double d) {
        this.f14253q = i7;
        this.f14254r = str;
        this.f14255s = j7;
        this.f14256t = l7;
        if (i7 == 1) {
            this.f14259w = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f14259w = d;
        }
        this.f14257u = str2;
        this.f14258v = str3;
    }

    public final Object a() {
        Long l7 = this.f14256t;
        if (l7 != null) {
            return l7;
        }
        Double d = this.f14259w;
        if (d != null) {
            return d;
        }
        String str = this.f14257u;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.R(parcel, 1, 4);
        parcel.writeInt(this.f14253q);
        AbstractC0189a.M(parcel, 2, this.f14254r);
        AbstractC0189a.R(parcel, 3, 8);
        parcel.writeLong(this.f14255s);
        Long l7 = this.f14256t;
        if (l7 != null) {
            AbstractC0189a.R(parcel, 4, 8);
            parcel.writeLong(l7.longValue());
        }
        AbstractC0189a.M(parcel, 6, this.f14257u);
        AbstractC0189a.M(parcel, 7, this.f14258v);
        Double d = this.f14259w;
        if (d != null) {
            AbstractC0189a.R(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC0189a.Q(parcel, P6);
    }

    public u1(long j7, Object obj, String str, String str2) {
        g3.n.c(str);
        this.f14253q = 2;
        this.f14254r = str;
        this.f14255s = j7;
        this.f14258v = str2;
        if (obj == null) {
            this.f14256t = null;
            this.f14259w = null;
            this.f14257u = null;
        } else if (obj instanceof Long) {
            this.f14256t = (Long) obj;
            this.f14259w = null;
            this.f14257u = null;
        } else if (obj instanceof String) {
            this.f14256t = null;
            this.f14259w = null;
            this.f14257u = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.f14256t = null;
            this.f14259w = (Double) obj;
            this.f14257u = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u1(s3.v1 r7) {
        /*
            r6 = this;
            java.lang.String r4 = r7.f14370c
            java.lang.Object r3 = r7.f14371e
            java.lang.String r5 = r7.f14369b
            long r1 = r7.d
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.u1.<init>(s3.v1):void");
    }
}
