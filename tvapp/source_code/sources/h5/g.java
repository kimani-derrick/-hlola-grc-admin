package h5;

import android.os.Parcel;
import android.os.Parcelable;
import d5.EnumC0557c;
/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final f CREATOR = new Object();

    /* renamed from: q  reason: collision with root package name */
    public final int f11041q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f11042r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f11043s;

    /* renamed from: t  reason: collision with root package name */
    public final EnumC0557c f11044t;

    public g(int i7, boolean z7, boolean z8, EnumC0557c enumC0557c) {
        M5.g.f(enumC0557c, "loopDirection");
        this.f11041q = i7;
        this.f11042r = z7;
        this.f11043s = z8;
        this.f11044t = enumC0557c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f11041q == gVar.f11041q && this.f11042r == gVar.f11042r && this.f11043s == gVar.f11043s && this.f11044t == gVar.f11044t) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = this.f11041q * 31;
        int i9 = 1237;
        if (this.f11042r) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i10 = (i8 + i7) * 31;
        if (this.f11043s) {
            i9 = 1231;
        }
        return this.f11044t.hashCode() + ((i10 + i9) * 31);
    }

    public final String toString() {
        return "SavedState(selectedPosition=" + this.f11041q + ", isLoopingStart=" + this.f11042r + ", isLoopingAllowed=" + this.f11043s + ", loopDirection=" + this.f11044t + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        M5.g.f(parcel, "parcel");
        parcel.writeInt(this.f11041q);
        parcel.writeByte(this.f11042r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11043s ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f11044t.ordinal());
    }
}
