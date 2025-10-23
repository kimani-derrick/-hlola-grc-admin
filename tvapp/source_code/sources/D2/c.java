package D2;

import Z2.AbstractC0156a;
import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new A2.a(18);

    /* renamed from: q  reason: collision with root package name */
    public final long f513q;

    /* renamed from: r  reason: collision with root package name */
    public final long f514r;

    /* renamed from: s  reason: collision with root package name */
    public final int f515s;

    public c(int i7, long j7, long j8) {
        boolean z7;
        if (j7 < j8) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        this.f513q = j7;
        this.f514r = j8;
        this.f515s = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f513q == cVar.f513q && this.f514r == cVar.f514r && this.f515s == cVar.f515s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f513q), Long.valueOf(this.f514r), Integer.valueOf(this.f515s)});
    }

    public final String toString() {
        int i7 = H.f4603a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f513q + ", endTimeMs=" + this.f514r + ", speedDivisor=" + this.f515s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f513q);
        parcel.writeLong(this.f514r);
        parcel.writeInt(this.f515s);
    }
}
