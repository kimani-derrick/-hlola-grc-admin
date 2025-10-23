package Q0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
/* loaded from: classes.dex */
public final class b implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<b> CREATOR = new A2.a(29);

    /* renamed from: q  reason: collision with root package name */
    public final String f2832q;

    /* renamed from: r  reason: collision with root package name */
    public final Map f2833r;

    public b(String str, Map map) {
        this.f2832q = str;
        this.f2833r = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (M5.g.a(this.f2832q, bVar.f2832q) && M5.g.a(this.f2833r, bVar.f2833r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2833r.hashCode() + (this.f2832q.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f2832q + ", extras=" + this.f2833r + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f2832q);
        Map map = this.f2833r;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
