package k;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: k.D0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849D0 extends S.b {
    public static final Parcelable.Creator<C0849D0> CREATOR = new A3.b(4);

    /* renamed from: s  reason: collision with root package name */
    public boolean f11868s;

    public C0849D0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11868s = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f11868s + "}";
    }

    @Override // S.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Boolean.valueOf(this.f11868s));
    }
}
