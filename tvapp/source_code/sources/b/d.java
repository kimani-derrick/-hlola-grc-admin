package b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(11);

    /* renamed from: q  reason: collision with root package name */
    public b f6992q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        synchronized (this) {
            try {
                if (this.f6992q == null) {
                    this.f6992q = new c(this);
                }
                parcel.writeStrongBinder(this.f6992q.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i7, Bundle bundle) {
    }
}
