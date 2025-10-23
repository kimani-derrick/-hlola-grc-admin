package g3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* loaded from: classes.dex */
public final class f extends AbstractC0748a {
    public static final Parcelable.Creator<f> CREATOR = new android.support.v4.media.a(19);

    /* renamed from: q  reason: collision with root package name */
    public final int f10797q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f10798r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f10799s;

    /* renamed from: t  reason: collision with root package name */
    public final int f10800t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10801u;

    public f(int i7, int i8, int i9, boolean z7, boolean z8) {
        this.f10797q = i7;
        this.f10798r = z7;
        this.f10799s = z8;
        this.f10800t = i8;
        this.f10801u = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.R(parcel, 1, 4);
        parcel.writeInt(this.f10797q);
        AbstractC0189a.R(parcel, 2, 4);
        parcel.writeInt(this.f10798r ? 1 : 0);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(this.f10799s ? 1 : 0);
        AbstractC0189a.R(parcel, 4, 4);
        parcel.writeInt(this.f10800t);
        AbstractC0189a.R(parcel, 5, 4);
        parcel.writeInt(this.f10801u);
        AbstractC0189a.Q(parcel, P6);
    }
}
