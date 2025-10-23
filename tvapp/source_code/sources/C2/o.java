package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new A2.a(14);

    /* renamed from: r  reason: collision with root package name */
    public final String f418r;

    /* renamed from: s  reason: collision with root package name */
    public final String f419s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = Z2.H.f4603a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f418r = r0
            java.lang.String r3 = r3.readString()
            r2.f419s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.o.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f405q.equals(oVar.f405q) && H.a(this.f418r, oVar.f418r) && H.a(this.f419s, oVar.f419s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = AbstractC0515y1.i(527, 31, this.f405q);
        int i9 = 0;
        String str = this.f418r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (i8 + i7) * 31;
        String str2 = this.f419s;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": url=" + this.f419s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f405q);
        parcel.writeString(this.f418r);
        parcel.writeString(this.f419s);
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f418r = str2;
        this.f419s = str3;
    }
}
