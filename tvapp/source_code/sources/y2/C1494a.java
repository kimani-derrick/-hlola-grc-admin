package y2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import r0.AbstractC1111a;
import s3.C1199t;
import x2.InterfaceC1460b;
/* renamed from: y2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494a implements InterfaceC1460b {
    public static final Parcelable.Creator<C1494a> CREATOR = new C1199t(8);

    /* renamed from: q  reason: collision with root package name */
    public final int f16369q;

    /* renamed from: r  reason: collision with root package name */
    public final String f16370r;

    public C1494a(String str, int i7) {
        this.f16369q = i7;
        this.f16370r = str;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ void c(C0595a0 c0595a0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f16369q);
        sb.append(",url=");
        return AbstractC1111a.t(sb, this.f16370r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f16370r);
        parcel.writeInt(this.f16369q);
    }
}
