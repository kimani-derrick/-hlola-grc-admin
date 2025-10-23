package d5;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final q CREATOR = new Object();

    /* renamed from: q  reason: collision with root package name */
    public final r f9282q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9283r;

    /* renamed from: s  reason: collision with root package name */
    public final float f9284s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9285t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f9286u;

    public s(r rVar, int i7, float f, boolean z7, boolean z8) {
        M5.g.f(rVar, "edge");
        this.f9282q = rVar;
        this.f9283r = i7;
        this.f9284s = f;
        this.f9285t = z7;
        this.f9286u = z8;
        if (0.0f <= f && f <= 1.0f) {
            return;
        }
        throw new IllegalArgumentException("fraction must be a value between 0f and 1f".toString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f9282q == sVar.f9282q && this.f9283r == sVar.f9283r && Float.compare(this.f9284s, sVar.f9284s) == 0 && this.f9285t == sVar.f9285t && this.f9286u == sVar.f9286u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int floatToIntBits = (Float.floatToIntBits(this.f9284s) + (((this.f9282q.hashCode() * 31) + this.f9283r) * 31)) * 31;
        int i8 = 1237;
        if (this.f9285t) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i9 = (floatToIntBits + i7) * 31;
        if (this.f9286u) {
            i8 = 1231;
        }
        return i9 + i8;
    }

    public final String toString() {
        return "ParentAlignment(edge=" + this.f9282q + ", offset=" + this.f9283r + ", fraction=" + this.f9284s + ", isFractionEnabled=" + this.f9285t + ", preferKeylineOverEdge=" + this.f9286u + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        M5.g.f(parcel, "parcel");
        parcel.writeInt(this.f9282q.ordinal());
        parcel.writeInt(this.f9283r);
        parcel.writeFloat(this.f9284s);
        parcel.writeByte(this.f9285t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9286u ? (byte) 1 : (byte) 0);
    }
}
