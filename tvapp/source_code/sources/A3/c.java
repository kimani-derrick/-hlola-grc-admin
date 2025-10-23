package A3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class c extends S.b {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: s  reason: collision with root package name */
    public boolean f68s;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.f68s = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f68s ? 1 : 0);
    }
}
