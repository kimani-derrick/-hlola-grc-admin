package E2;

import e2.C0595a0;
import e2.K;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public abstract class b implements InterfaceC1460b {
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

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
