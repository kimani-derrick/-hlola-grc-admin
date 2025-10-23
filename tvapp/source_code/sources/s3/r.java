package s3;

import a.AbstractC0189a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h3.AbstractC0748a;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class r extends AbstractC0748a implements Iterable {
    public static final Parcelable.Creator<r> CREATOR = new C1199t(0);

    /* renamed from: q  reason: collision with root package name */
    public final Bundle f14215q;

    public r(Bundle bundle) {
        this.f14215q = bundle;
    }

    public final Double g() {
        return Double.valueOf(this.f14215q.getDouble("value"));
    }

    public final Bundle h() {
        return new Bundle(this.f14215q);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new O3.L(this);
    }

    public final String toString() {
        return this.f14215q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.J(parcel, 2, h());
        AbstractC0189a.Q(parcel, P6);
    }
}
