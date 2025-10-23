package j2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.AbstractC0606g;
import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new android.support.v4.media.a(26);

    /* renamed from: q  reason: collision with root package name */
    public int f11818q;

    /* renamed from: r  reason: collision with root package name */
    public final UUID f11819r;

    /* renamed from: s  reason: collision with root package name */
    public final String f11820s;

    /* renamed from: t  reason: collision with root package name */
    public final String f11821t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f11822u;

    public h(Parcel parcel) {
        this.f11819r = new UUID(parcel.readLong(), parcel.readLong());
        this.f11820s = parcel.readString();
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f11821t = readString;
        this.f11822u = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC0606g.f9959a;
        UUID uuid3 = this.f11819r;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        if (!H.a(this.f11820s, hVar.f11820s) || !H.a(this.f11821t, hVar.f11821t) || !H.a(this.f11819r, hVar.f11819r) || !Arrays.equals(this.f11822u, hVar.f11822u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f11818q == 0) {
            int hashCode2 = this.f11819r.hashCode() * 31;
            String str = this.f11820s;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f11818q = Arrays.hashCode(this.f11822u) + AbstractC0515y1.i((hashCode2 + hashCode) * 31, 31, this.f11821t);
        }
        return this.f11818q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f11819r;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f11820s);
        parcel.writeString(this.f11821t);
        parcel.writeByteArray(this.f11822u);
    }

    public h(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f11819r = uuid;
        this.f11820s = str;
        str2.getClass();
        this.f11821t = str2;
        this.f11822u = bArr;
    }
}
