package C2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new A2.a(5);

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f381r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = Z2.H.f4603a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f381r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.b.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f405q.equals(bVar.f405q) && Arrays.equals(this.f381r, bVar.f381r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f381r) + AbstractC0515y1.i(527, 31, this.f405q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f405q);
        parcel.writeByteArray(this.f381r);
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f381r = bArr;
    }
}
