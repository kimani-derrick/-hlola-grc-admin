package D2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class b implements InterfaceC1460b {
    public static final Parcelable.Creator<b> CREATOR = new A2.a(16);

    /* renamed from: q  reason: collision with root package name */
    public final long f508q;

    /* renamed from: r  reason: collision with root package name */
    public final long f509r;

    /* renamed from: s  reason: collision with root package name */
    public final long f510s;

    /* renamed from: t  reason: collision with root package name */
    public final long f511t;

    /* renamed from: u  reason: collision with root package name */
    public final long f512u;

    public b(long j7, long j8, long j9, long j10, long j11) {
        this.f508q = j7;
        this.f509r = j8;
        this.f510s = j9;
        this.f511t = j10;
        this.f512u = j11;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f508q == bVar.f508q && this.f509r == bVar.f509r && this.f510s == bVar.f510s && this.f511t == bVar.f511t && this.f512u == bVar.f512u) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        int x7 = h4.b.x(this.f509r);
        int x8 = h4.b.x(this.f510s);
        int x9 = h4.b.x(this.f511t);
        return h4.b.x(this.f512u) + ((x9 + ((x8 + ((x7 + ((h4.b.x(this.f508q) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f508q + ", photoSize=" + this.f509r + ", photoPresentationTimestampUs=" + this.f510s + ", videoStartPosition=" + this.f511t + ", videoSize=" + this.f512u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f508q);
        parcel.writeLong(this.f509r);
        parcel.writeLong(this.f510s);
        parcel.writeLong(this.f511t);
        parcel.writeLong(this.f512u);
    }

    public b(Parcel parcel) {
        this.f508q = parcel.readLong();
        this.f509r = parcel.readLong();
        this.f510s = parcel.readLong();
        this.f511t = parcel.readLong();
        this.f512u = parcel.readLong();
    }
}
