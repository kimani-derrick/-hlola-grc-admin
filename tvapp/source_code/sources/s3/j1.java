package s3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* loaded from: classes.dex */
public final class j1 extends AbstractC0748a {
    public static final Parcelable.Creator<j1> CREATOR = new C1199t(2);

    /* renamed from: q  reason: collision with root package name */
    public final String f14096q;

    /* renamed from: r  reason: collision with root package name */
    public final long f14097r;

    /* renamed from: s  reason: collision with root package name */
    public final int f14098s;

    public j1(int i7, long j7, String str) {
        this.f14096q = str;
        this.f14097r = j7;
        this.f14098s = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.M(parcel, 1, this.f14096q);
        AbstractC0189a.R(parcel, 2, 8);
        parcel.writeLong(this.f14097r);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(this.f14098s);
        AbstractC0189a.Q(parcel, P6);
    }
}
