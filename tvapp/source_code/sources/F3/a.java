package F3;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a extends S.b {
    public static final Parcelable.Creator<a> CREATOR = new A3.b(1);

    /* renamed from: s  reason: collision with root package name */
    public boolean f660s;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f660s = parcel.readInt() == 1;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f660s ? 1 : 0);
    }
}
