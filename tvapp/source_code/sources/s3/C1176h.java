package s3;

import a.AbstractC0189a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
/* renamed from: s3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176h extends AbstractC0748a {
    public static final Parcelable.Creator<C1176h> CREATOR = new android.support.v4.media.a(29);

    /* renamed from: q  reason: collision with root package name */
    public final Bundle f14069q;

    public C1176h(Bundle bundle) {
        this.f14069q = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.J(parcel, 1, this.f14069q);
        AbstractC0189a.Q(parcel, P6);
    }
}
