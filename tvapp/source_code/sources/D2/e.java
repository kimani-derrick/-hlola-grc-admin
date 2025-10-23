package D2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class e implements InterfaceC1460b {
    public static final Parcelable.Creator<e> CREATOR = new A2.a(19);

    /* renamed from: q  reason: collision with root package name */
    public final float f517q;

    /* renamed from: r  reason: collision with root package name */
    public final int f518r;

    public e(int i7, float f) {
        this.f517q = f;
        this.f518r = i7;
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f517q == eVar.f517q && this.f518r == eVar.f518r) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f517q).hashCode() + 527) * 31) + this.f518r;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f517q + ", svcTemporalLayerCount=" + this.f518r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f517q);
        parcel.writeInt(this.f518r);
    }

    public e(Parcel parcel) {
        this.f517q = parcel.readFloat();
        this.f518r = parcel.readInt();
    }
}
