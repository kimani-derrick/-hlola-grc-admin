package s3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* renamed from: s3.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1201u extends AbstractC0748a {
    public static final Parcelable.Creator<C1201u> CREATOR = new C1199t(1);

    /* renamed from: q  reason: collision with root package name */
    public final String f14244q;

    /* renamed from: r  reason: collision with root package name */
    public final r f14245r;

    /* renamed from: s  reason: collision with root package name */
    public final String f14246s;

    /* renamed from: t  reason: collision with root package name */
    public final long f14247t;

    public C1201u(String str, r rVar, String str2, long j7) {
        this.f14244q = str;
        this.f14245r = rVar;
        this.f14246s = str2;
        this.f14247t = j7;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14245r);
        return "origin=" + this.f14246s + ",name=" + this.f14244q + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.M(parcel, 2, this.f14244q);
        AbstractC0189a.L(parcel, 3, this.f14245r, i7);
        AbstractC0189a.M(parcel, 4, this.f14246s);
        AbstractC0189a.R(parcel, 5, 8);
        parcel.writeLong(this.f14247t);
        AbstractC0189a.Q(parcel, P6);
    }

    public C1201u(C1201u c1201u, long j7) {
        g3.n.g(c1201u);
        this.f14244q = c1201u.f14244q;
        this.f14245r = c1201u.f14245r;
        this.f14246s = c1201u.f14246s;
        this.f14247t = j7;
    }
}
