package s3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* renamed from: s3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168d extends AbstractC0748a {
    public static final Parcelable.Creator<C1168d> CREATOR = new android.support.v4.media.a(28);

    /* renamed from: A  reason: collision with root package name */
    public final C1201u f13983A;

    /* renamed from: q  reason: collision with root package name */
    public String f13984q;

    /* renamed from: r  reason: collision with root package name */
    public String f13985r;

    /* renamed from: s  reason: collision with root package name */
    public u1 f13986s;

    /* renamed from: t  reason: collision with root package name */
    public long f13987t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13988u;

    /* renamed from: v  reason: collision with root package name */
    public String f13989v;

    /* renamed from: w  reason: collision with root package name */
    public final C1201u f13990w;

    /* renamed from: x  reason: collision with root package name */
    public long f13991x;

    /* renamed from: y  reason: collision with root package name */
    public C1201u f13992y;

    /* renamed from: z  reason: collision with root package name */
    public final long f13993z;

    public C1168d(String str, String str2, u1 u1Var, long j7, boolean z7, String str3, C1201u c1201u, long j8, C1201u c1201u2, long j9, C1201u c1201u3) {
        this.f13984q = str;
        this.f13985r = str2;
        this.f13986s = u1Var;
        this.f13987t = j7;
        this.f13988u = z7;
        this.f13989v = str3;
        this.f13990w = c1201u;
        this.f13991x = j8;
        this.f13992y = c1201u2;
        this.f13993z = j9;
        this.f13983A = c1201u3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.M(parcel, 2, this.f13984q);
        AbstractC0189a.M(parcel, 3, this.f13985r);
        AbstractC0189a.L(parcel, 4, this.f13986s, i7);
        long j7 = this.f13987t;
        AbstractC0189a.R(parcel, 5, 8);
        parcel.writeLong(j7);
        boolean z7 = this.f13988u;
        AbstractC0189a.R(parcel, 6, 4);
        parcel.writeInt(z7 ? 1 : 0);
        AbstractC0189a.M(parcel, 7, this.f13989v);
        AbstractC0189a.L(parcel, 8, this.f13990w, i7);
        long j8 = this.f13991x;
        AbstractC0189a.R(parcel, 9, 8);
        parcel.writeLong(j8);
        AbstractC0189a.L(parcel, 10, this.f13992y, i7);
        AbstractC0189a.R(parcel, 11, 8);
        parcel.writeLong(this.f13993z);
        AbstractC0189a.L(parcel, 12, this.f13983A, i7);
        AbstractC0189a.Q(parcel, P6);
    }

    public C1168d(C1168d c1168d) {
        g3.n.g(c1168d);
        this.f13984q = c1168d.f13984q;
        this.f13985r = c1168d.f13985r;
        this.f13986s = c1168d.f13986s;
        this.f13987t = c1168d.f13987t;
        this.f13988u = c1168d.f13988u;
        this.f13989v = c1168d.f13989v;
        this.f13990w = c1168d.f13990w;
        this.f13991x = c1168d.f13991x;
        this.f13992y = c1168d.f13992y;
        this.f13993z = c1168d.f13993z;
        this.f13983A = c1168d.f13983A;
    }
}
