package k;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class Q0 extends S.b {
    public static final Parcelable.Creator<Q0> CREATOR = new A3.b(5);

    /* renamed from: s  reason: collision with root package name */
    public int f11928s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f11929t;

    public Q0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z7;
        this.f11928s = parcel.readInt();
        if (parcel.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f11929t = z7;
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f11928s);
        parcel.writeInt(this.f11929t ? 1 : 0);
    }
}
