package h2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* renamed from: h2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746a implements InterfaceC1460b {
    public static final Parcelable.Creator<C0746a> CREATOR = new android.support.v4.media.a(23);

    /* renamed from: q  reason: collision with root package name */
    public final long f10975q;

    public C0746a(long j7) {
        this.f10975q = j7;
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
        if (!(obj instanceof C0746a)) {
            return false;
        }
        if (this.f10975q == ((C0746a) obj).f10975q) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return h4.b.x(this.f10975q);
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j7 = this.f10975q;
        if (j7 == -2082844800000L) {
            valueOf = "unset";
        } else {
            valueOf = Long.valueOf(j7);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f10975q);
    }

    public C0746a(Parcel parcel) {
        this.f10975q = parcel.readLong();
    }
}
