package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new A2.a(4);

    /* renamed from: r  reason: collision with root package name */
    public final String f377r;

    /* renamed from: s  reason: collision with root package name */
    public final String f378s;

    /* renamed from: t  reason: collision with root package name */
    public final int f379t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f380u;

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f377r = readString;
        this.f378s = parcel.readString();
        this.f379t = parcel.readInt();
        this.f380u = parcel.createByteArray();
    }

    @Override // C2.j, x2.InterfaceC1460b
    public final void c(C0595a0 c0595a0) {
        c0595a0.a(this.f379t, this.f380u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f379t == aVar.f379t && H.a(this.f377r, aVar.f377r) && H.a(this.f378s, aVar.f378s) && Arrays.equals(this.f380u, aVar.f380u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (527 + this.f379t) * 31;
        int i9 = 0;
        String str = this.f377r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (i8 + i7) * 31;
        String str2 = this.f378s;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return Arrays.hashCode(this.f380u) + ((i10 + i9) * 31);
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": mimeType=" + this.f377r + ", description=" + this.f378s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f377r);
        parcel.writeString(this.f378s);
        parcel.writeInt(this.f379t);
        parcel.writeByteArray(this.f380u);
    }

    public a(String str, String str2, int i7, byte[] bArr) {
        super("APIC");
        this.f377r = str;
        this.f378s = str2;
        this.f379t = i7;
        this.f380u = bArr;
    }
}
