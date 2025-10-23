package B2;

import Z2.AbstractC0156a;
import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class b implements InterfaceC1460b {
    public static final Parcelable.Creator<b> CREATOR = new A2.a(2);

    /* renamed from: q  reason: collision with root package name */
    public final int f181q;

    /* renamed from: r  reason: collision with root package name */
    public final String f182r;

    /* renamed from: s  reason: collision with root package name */
    public final String f183s;

    /* renamed from: t  reason: collision with root package name */
    public final String f184t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f185u;

    /* renamed from: v  reason: collision with root package name */
    public final int f186v;

    public b(int i7, int i8, String str, String str2, String str3, boolean z7) {
        AbstractC0156a.f(i8 == -1 || i8 > 0);
        this.f181q = i7;
        this.f182r = str;
        this.f183s = str2;
        this.f184t = str3;
        this.f185u = z7;
        this.f186v = i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static B2.b a(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.b.a(java.util.Map):B2.b");
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final void c(C0595a0 c0595a0) {
        String str = this.f183s;
        if (str != null) {
            c0595a0.f9817E = str;
        }
        String str2 = this.f182r;
        if (str2 != null) {
            c0595a0.f9815C = str2;
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f181q == bVar.f181q && H.a(this.f182r, bVar.f182r) && H.a(this.f183s, bVar.f183s) && H.a(this.f184t, bVar.f184t) && this.f185u == bVar.f185u && this.f186v == bVar.f186v) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = (527 + this.f181q) * 31;
        int i10 = 0;
        String str = this.f182r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i11 = (i9 + i7) * 31;
        String str2 = this.f183s;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        String str3 = this.f184t;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((i12 + i10) * 31) + (this.f185u ? 1 : 0)) * 31) + this.f186v;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f183s + "\", genre=\"" + this.f182r + "\", bitrate=" + this.f181q + ", metadataInterval=" + this.f186v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f181q);
        parcel.writeString(this.f182r);
        parcel.writeString(this.f183s);
        parcel.writeString(this.f184t);
        int i8 = H.f4603a;
        parcel.writeInt(this.f185u ? 1 : 0);
        parcel.writeInt(this.f186v);
    }

    public b(Parcel parcel) {
        this.f181q = parcel.readInt();
        this.f182r = parcel.readString();
        this.f183s = parcel.readString();
        this.f184t = parcel.readString();
        int i7 = H.f4603a;
        this.f185u = parcel.readInt() != 0;
        this.f186v = parcel.readInt();
    }
}
