package E2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new A2.a(20);

    /* renamed from: q  reason: collision with root package name */
    public final long f573q;

    /* renamed from: r  reason: collision with root package name */
    public final long f574r;

    /* renamed from: s  reason: collision with root package name */
    public final byte[] f575s;

    public a(long j7, byte[] bArr, long j8) {
        this.f573q = j8;
        this.f574r = j7;
        this.f575s = bArr;
    }

    @Override // E2.b
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f573q);
        sb.append(", identifier= ");
        return AbstractC1111a.s(sb, this.f574r, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f573q);
        parcel.writeLong(this.f574r);
        parcel.writeByteArray(this.f575s);
    }

    public a(Parcel parcel) {
        this.f573q = parcel.readLong();
        this.f574r = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i7 = H.f4603a;
        this.f575s = createByteArray;
    }
}
