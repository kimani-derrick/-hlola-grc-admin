package A2;

import N3.e;
import Z2.H;
import Z2.y;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0595a0;
import e2.K;
import java.util.Arrays;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class b implements InterfaceC1460b {
    public static final Parcelable.Creator<b> CREATOR = new a(0);

    /* renamed from: q  reason: collision with root package name */
    public final int f57q;

    /* renamed from: r  reason: collision with root package name */
    public final String f58r;

    /* renamed from: s  reason: collision with root package name */
    public final String f59s;

    /* renamed from: t  reason: collision with root package name */
    public final int f60t;

    /* renamed from: u  reason: collision with root package name */
    public final int f61u;

    /* renamed from: v  reason: collision with root package name */
    public final int f62v;

    /* renamed from: w  reason: collision with root package name */
    public final int f63w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f64x;

    public b(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f57q = i7;
        this.f58r = str;
        this.f59s = str2;
        this.f60t = i8;
        this.f61u = i9;
        this.f62v = i10;
        this.f63w = i11;
        this.f64x = bArr;
    }

    public static b a(y yVar) {
        int g7 = yVar.g();
        String s6 = yVar.s(yVar.g(), e.f2495a);
        String s7 = yVar.s(yVar.g(), e.f2497c);
        int g8 = yVar.g();
        int g9 = yVar.g();
        int g10 = yVar.g();
        int g11 = yVar.g();
        int g12 = yVar.g();
        byte[] bArr = new byte[g12];
        yVar.e(bArr, 0, g12);
        return new b(g7, s6, s7, g8, g9, g10, g11, bArr);
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final void c(C0595a0 c0595a0) {
        c0595a0.a(this.f57q, this.f64x);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f57q == bVar.f57q && this.f58r.equals(bVar.f58r) && this.f59s.equals(bVar.f59s) && this.f60t == bVar.f60t && this.f61u == bVar.f61u && this.f62v == bVar.f62v && this.f63w == bVar.f63w && Arrays.equals(this.f64x, bVar.f64x)) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f64x) + ((((((((AbstractC0515y1.i(AbstractC0515y1.i((527 + this.f57q) * 31, 31, this.f58r), 31, this.f59s) + this.f60t) * 31) + this.f61u) * 31) + this.f62v) * 31) + this.f63w) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f58r + ", description=" + this.f59s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f57q);
        parcel.writeString(this.f58r);
        parcel.writeString(this.f59s);
        parcel.writeInt(this.f60t);
        parcel.writeInt(this.f61u);
        parcel.writeInt(this.f62v);
        parcel.writeInt(this.f63w);
        parcel.writeByteArray(this.f64x);
    }

    public b(Parcel parcel) {
        this.f57q = parcel.readInt();
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f58r = readString;
        this.f59s = parcel.readString();
        this.f60t = parcel.readInt();
        this.f61u = parcel.readInt();
        this.f62v = parcel.readInt();
        this.f63w = parcel.readInt();
        this.f64x = parcel.createByteArray();
    }
}
