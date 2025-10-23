package E2;

import Z2.y;
import android.os.Parcel;
import android.os.Parcelable;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new A2.a(24);

    /* renamed from: q  reason: collision with root package name */
    public final long f607q;

    /* renamed from: r  reason: collision with root package name */
    public final long f608r;

    public j(long j7, long j8) {
        this.f607q = j7;
        this.f608r = j8;
    }

    public static long a(long j7, y yVar) {
        long u7 = yVar.u();
        if ((128 & u7) != 0) {
            return 8589934591L & ((((u7 & 1) << 32) | yVar.v()) + j7);
        }
        return -9223372036854775807L;
    }

    @Override // E2.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.f607q);
        sb.append(", playbackPositionUs= ");
        return AbstractC1111a.s(sb, this.f608r, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f607q);
        parcel.writeLong(this.f608r);
    }
}
