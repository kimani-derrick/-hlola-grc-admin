package g3;

import a.AbstractC0189a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* loaded from: classes.dex */
public final class t extends AbstractC0748a {
    public static final Parcelable.Creator<t> CREATOR = new android.support.v4.media.a(20);

    /* renamed from: q  reason: collision with root package name */
    public Bundle f10818q;

    /* renamed from: r  reason: collision with root package name */
    public d3.c[] f10819r;

    /* renamed from: s  reason: collision with root package name */
    public int f10820s;

    /* renamed from: t  reason: collision with root package name */
    public C0734c f10821t;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.J(parcel, 1, this.f10818q);
        AbstractC0189a.N(parcel, 2, this.f10819r, i7);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(this.f10820s);
        AbstractC0189a.L(parcel, 4, this.f10821t, i7);
        AbstractC0189a.Q(parcel, P6);
    }
}
