package j2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0606g;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;
/* loaded from: classes.dex */
public final class i implements Comparator, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new android.support.v4.media.a(25);

    /* renamed from: q  reason: collision with root package name */
    public final h[] f11823q;

    /* renamed from: r  reason: collision with root package name */
    public int f11824r;

    /* renamed from: s  reason: collision with root package name */
    public final String f11825s;

    /* renamed from: t  reason: collision with root package name */
    public final int f11826t;

    public i(Parcel parcel) {
        this.f11825s = parcel.readString();
        h[] hVarArr = (h[]) parcel.createTypedArray(h.CREATOR);
        int i7 = H.f4603a;
        this.f11823q = hVarArr;
        this.f11826t = hVarArr.length;
    }

    public final i a(String str) {
        if (H.a(this.f11825s, str)) {
            return this;
        }
        return new i(str, false, this.f11823q);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        UUID uuid = AbstractC0606g.f9959a;
        if (uuid.equals(hVar.f11819r)) {
            if (uuid.equals(hVar2.f11819r)) {
                return 0;
            }
            return 1;
        }
        return hVar.f11819r.compareTo(hVar2.f11819r);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (H.a(this.f11825s, iVar.f11825s) && Arrays.equals(this.f11823q, iVar.f11823q)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f11824r == 0) {
            String str = this.f11825s;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f11824r = (hashCode * 31) + Arrays.hashCode(this.f11823q);
        }
        return this.f11824r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11825s);
        parcel.writeTypedArray(this.f11823q, 0);
    }

    public i(String str, boolean z7, h... hVarArr) {
        this.f11825s = str;
        hVarArr = z7 ? (h[]) hVarArr.clone() : hVarArr;
        this.f11823q = hVarArr;
        this.f11826t = hVarArr.length;
        Arrays.sort(hVarArr, this);
    }
}
