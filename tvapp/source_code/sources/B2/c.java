package B2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import java.util.Arrays;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class c implements InterfaceC1460b {
    public static final Parcelable.Creator<c> CREATOR = new A2.a(3);

    /* renamed from: q  reason: collision with root package name */
    public final byte[] f187q;

    /* renamed from: r  reason: collision with root package name */
    public final String f188r;

    /* renamed from: s  reason: collision with root package name */
    public final String f189s;

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f187q = createByteArray;
        this.f188r = parcel.readString();
        this.f189s = parcel.readString();
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final void c(C0595a0 c0595a0) {
        String str = this.f188r;
        if (str != null) {
            c0595a0.f9819a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f187q, ((c) obj).f187q);
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f187q);
    }

    public final String toString() {
        int length = this.f187q.length;
        return "ICY: title=\"" + this.f188r + "\", url=\"" + this.f189s + "\", rawMetadata.length=\"" + length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeByteArray(this.f187q);
        parcel.writeString(this.f188r);
        parcel.writeString(this.f189s);
    }

    public c(String str, String str2, byte[] bArr) {
        this.f187q = bArr;
        this.f188r = str;
        this.f189s = str2;
    }
}
