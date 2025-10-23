package d5;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: d5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556b implements Parcelable {
    public static final C0555a CREATOR = new Object();

    /* renamed from: q  reason: collision with root package name */
    public final int f9253q;

    /* renamed from: r  reason: collision with root package name */
    public final float f9254r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f9255s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f9256t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f9257u;

    public /* synthetic */ C0556b(int i7, float f, boolean z7, int i8) {
        this(i7, (i8 & 2) != 0 ? 0.5f : f, (i8 & 4) != 0 ? true : z7, false, false);
    }

    public final boolean a() {
        return this.f9257u;
    }

    public final float d() {
        return this.f9254r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f9256t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0556b)) {
            return false;
        }
        C0556b c0556b = (C0556b) obj;
        if (this.f9253q == c0556b.f9253q && Float.compare(this.f9254r, c0556b.f9254r) == 0 && this.f9255s == c0556b.f9255s && this.f9256t == c0556b.f9256t && this.f9257u == c0556b.f9257u) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f9253q;
    }

    public final boolean h() {
        return this.f9255s;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int floatToIntBits = (Float.floatToIntBits(this.f9254r) + (this.f9253q * 31)) * 31;
        int i9 = 1237;
        if (this.f9255s) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i10 = (floatToIntBits + i7) * 31;
        if (this.f9256t) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i11 = (i10 + i8) * 31;
        if (this.f9257u) {
            i9 = 1231;
        }
        return i11 + i9;
    }

    public final String toString() {
        return "ChildAlignment(offset=" + this.f9253q + ", fraction=" + this.f9254r + ", isFractionEnabled=" + this.f9255s + ", includePadding=" + this.f9256t + ", alignToBaseline=" + this.f9257u + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        M5.g.f(parcel, "parcel");
        parcel.writeInt(this.f9253q);
        parcel.writeFloat(this.f9254r);
        parcel.writeByte(this.f9255s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9256t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9257u ? (byte) 1 : (byte) 0);
    }

    public C0556b(int i7, float f, boolean z7, boolean z8, boolean z9) {
        this.f9253q = i7;
        this.f9254r = f;
        this.f9255s = z7;
        this.f9256t = z8;
        this.f9257u = z9;
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException("fraction must be a value between 0f and 1f".toString());
        }
    }
}
