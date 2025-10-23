package d3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
import w4.l0;
/* loaded from: classes.dex */
public final class n extends AbstractC0748a {
    public static final Parcelable.Creator<n> CREATOR = new android.support.v4.media.a(17);

    /* renamed from: q  reason: collision with root package name */
    public final boolean f9245q;

    /* renamed from: r  reason: collision with root package name */
    public final String f9246r;

    /* renamed from: s  reason: collision with root package name */
    public final int f9247s;

    /* renamed from: t  reason: collision with root package name */
    public final int f9248t;

    public n(int i7, int i8, String str, boolean z7) {
        this.f9245q = z7;
        this.f9246r = str;
        this.f9247s = AbstractC0189a.O(i7) - 1;
        this.f9248t = l0.a0(i8) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.R(parcel, 1, 4);
        parcel.writeInt(this.f9245q ? 1 : 0);
        AbstractC0189a.M(parcel, 2, this.f9246r);
        AbstractC0189a.R(parcel, 3, 4);
        parcel.writeInt(this.f9247s);
        AbstractC0189a.R(parcel, 4, 4);
        parcel.writeInt(this.f9248t);
        AbstractC0189a.Q(parcel, P6);
    }
}
