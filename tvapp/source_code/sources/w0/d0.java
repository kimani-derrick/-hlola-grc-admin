package w0;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d0 extends S.b {
    public static final Parcelable.Creator<d0> CREATOR = new A3.b(6);

    /* renamed from: s  reason: collision with root package name */
    public Parcelable f15519s;

    public d0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f15519s = parcel.readParcelable(classLoader == null ? U.class.getClassLoader() : classLoader);
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeParcelable(this.f15519s, 0);
    }
}
