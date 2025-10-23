package S;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: q  reason: collision with root package name */
    public final Parcelable f2938q;

    /* renamed from: r  reason: collision with root package name */
    public static final a f2937r = new b();
    public static final Parcelable.Creator<b> CREATOR = new A3.b(3);

    public b() {
        this.f2938q = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f2938q, i7);
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2938q = readParcelable == null ? f2937r : readParcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2938q = parcelable == f2937r ? null : parcelable;
    }
}
