package h2;

import Z2.AbstractC0156a;
import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* renamed from: h2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747b implements InterfaceC1460b {
    public static final Parcelable.Creator<C0747b> CREATOR = new android.support.v4.media.a(24);

    /* renamed from: q  reason: collision with root package name */
    public final float f10976q;

    /* renamed from: r  reason: collision with root package name */
    public final float f10977r;

    public C0747b(float f, float f7) {
        AbstractC0156a.e("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f7 >= -180.0f && f7 <= 180.0f);
        this.f10976q = f;
        this.f10977r = f7;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ void c(C0595a0 c0595a0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0747b.class != obj.getClass()) {
            return false;
        }
        C0747b c0747b = (C0747b) obj;
        if (this.f10976q == c0747b.f10976q && this.f10977r == c0747b.f10977r) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return Float.valueOf(this.f10977r).hashCode() + ((Float.valueOf(this.f10976q).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f10976q + ", longitude=" + this.f10977r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f10976q);
        parcel.writeFloat(this.f10977r);
    }

    public C0747b(Parcel parcel) {
        this.f10976q = parcel.readFloat();
        this.f10977r = parcel.readFloat();
    }
}
