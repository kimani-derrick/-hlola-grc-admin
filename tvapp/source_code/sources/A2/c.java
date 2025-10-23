package A2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public class c implements InterfaceC1460b {
    public static final Parcelable.Creator<c> CREATOR = new a(1);

    /* renamed from: q  reason: collision with root package name */
    public final String f65q;

    /* renamed from: r  reason: collision with root package name */
    public final String f66r;

    public c(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f65q = readString;
        this.f66r = parcel.readString();
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // x2.InterfaceC1460b
    public final void c(C0595a0 c0595a0) {
        String str = this.f65q;
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c5 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c5 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c5 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c5 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c5 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f66r;
        if (c5 != 0) {
            if (c5 != 1) {
                if (c5 != 2) {
                    if (c5 != 3) {
                        if (c5 == 4) {
                            c0595a0.f9820b = str2;
                            return;
                        }
                        return;
                    }
                    c0595a0.d = str2;
                    return;
                }
                c0595a0.f9823g = str2;
                return;
            }
            c0595a0.f9819a = str2;
            return;
        }
        c0595a0.f9821c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f65q.equals(cVar.f65q) && this.f66r.equals(cVar.f66r)) {
            return true;
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return this.f66r.hashCode() + AbstractC0515y1.i(527, 31, this.f65q);
    }

    public final String toString() {
        return "VC: " + this.f65q + "=" + this.f66r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f65q);
        parcel.writeString(this.f66r);
    }

    public c(String str, String str2) {
        this.f65q = str;
        this.f66r = str2;
    }
}
