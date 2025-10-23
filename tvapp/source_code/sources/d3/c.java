package d3;

import a.AbstractC0189a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.D;
import h3.AbstractC0748a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends AbstractC0748a {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(16);

    /* renamed from: q  reason: collision with root package name */
    public final String f9223q;

    /* renamed from: r  reason: collision with root package name */
    public final int f9224r;

    /* renamed from: s  reason: collision with root package name */
    public final long f9225s;

    public c(int i7, long j7, String str) {
        this.f9223q = str;
        this.f9224r = i7;
        this.f9225s = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f9223q;
            if (((str != null && str.equals(cVar.f9223q)) || (str == null && cVar.f9223q == null)) && g() == cVar.g()) {
                return true;
            }
        }
        return false;
    }

    public final long g() {
        long j7 = this.f9225s;
        if (j7 == -1) {
            return this.f9224r;
        }
        return j7;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9223q, Long.valueOf(g())});
    }

    public final String toString() {
        D d = new D(this);
        d.c(this.f9223q, "name");
        d.c(Long.valueOf(g()), "version");
        return d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int P6 = AbstractC0189a.P(parcel, 20293);
        AbstractC0189a.M(parcel, 1, this.f9223q);
        AbstractC0189a.R(parcel, 2, 4);
        parcel.writeInt(this.f9224r);
        long g7 = g();
        AbstractC0189a.R(parcel, 3, 8);
        parcel.writeLong(g7);
        AbstractC0189a.Q(parcel, P6);
    }
}
