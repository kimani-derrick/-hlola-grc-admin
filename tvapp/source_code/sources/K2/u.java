package K2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import e2.C0595a0;
import e2.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r0.AbstractC1111a;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class u implements InterfaceC1460b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);

    /* renamed from: q  reason: collision with root package name */
    public final String f1818q;

    /* renamed from: r  reason: collision with root package name */
    public final String f1819r;

    /* renamed from: s  reason: collision with root package name */
    public final List f1820s;

    public u(Parcel parcel) {
        this.f1818q = parcel.readString();
        this.f1819r = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f1820s = Collections.unmodifiableList(arrayList);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (TextUtils.equals(this.f1818q, uVar.f1818q) && TextUtils.equals(this.f1819r, uVar.f1819r) && this.f1820s.equals(uVar.f1820s)) {
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
        int i8 = 0;
        String str = this.f1818q;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        String str2 = this.f1819r;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return this.f1820s.hashCode() + ((i9 + i8) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f1818q;
        if (str2 != null) {
            str = AbstractC1111a.t(AbstractC1111a.u(" [", str2, ", "), this.f1819r, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f1818q);
        parcel.writeString(this.f1819r);
        List list = this.f1820s;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable((Parcelable) list.get(i8), 0);
        }
    }

    public u(String str, String str2, List list) {
        this.f1818q = str;
        this.f1819r = str2;
        this.f1820s = Collections.unmodifiableList(new ArrayList(list));
    }
}
