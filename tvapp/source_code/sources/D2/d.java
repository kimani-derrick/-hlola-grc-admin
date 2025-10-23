package D2;

import Z2.AbstractC0156a;
import android.os.Parcel;
import android.os.Parcelable;
import e2.C0595a0;
import e2.K;
import java.util.ArrayList;
import java.util.List;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class d implements InterfaceC1460b {
    public static final Parcelable.Creator<d> CREATOR = new A2.a(17);

    /* renamed from: q  reason: collision with root package name */
    public final List f516q;

    public d(ArrayList arrayList) {
        this.f516q = arrayList;
        boolean z7 = false;
        if (!arrayList.isEmpty()) {
            long j7 = ((c) arrayList.get(0)).f514r;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((c) arrayList.get(i7)).f513q < j7) {
                    z7 = true;
                    break;
                } else {
                    j7 = ((c) arrayList.get(i7)).f514r;
                    i7++;
                }
            }
        }
        AbstractC0156a.f(!z7);
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
        if (obj != null && d.class == obj.getClass()) {
            return this.f516q.equals(((d) obj).f516q);
        }
        return false;
    }

    @Override // x2.InterfaceC1460b
    public final /* synthetic */ K f() {
        return null;
    }

    public final int hashCode() {
        return this.f516q.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f516q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeList(this.f516q);
    }
}
