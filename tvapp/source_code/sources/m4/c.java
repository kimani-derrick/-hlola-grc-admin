package m4;

import O3.H;
import android.os.Bundle;
import androidx.fragment.app.D;
import java.util.HashSet;
import k.C0852F;
import s3.AbstractC1204v0;
import s3.InterfaceC1206w0;
/* loaded from: classes.dex */
public final class c implements InterfaceC1206w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12439b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f12438a = i7;
        this.f12439b = obj;
    }

    @Override // s3.InterfaceC1206w0
    public final void a(long j7, Bundle bundle, String str, String str2) {
        Object obj = this.f12439b;
        switch (this.f12438a) {
            case 0:
                D d = (D) obj;
                if (((HashSet) d.f5883r).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    H h7 = AbstractC0996a.f12433a;
                    String c5 = AbstractC1204v0.c(str2, AbstractC1204v0.f14361c, AbstractC1204v0.f14359a);
                    if (c5 != null) {
                        str2 = c5;
                    }
                    bundle2.putString("events", str2);
                    ((D) d.f5884s).L(2, bundle2);
                    return;
                }
                return;
            default:
                if (str != null && (!AbstractC0996a.f12433a.contains(str2))) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j7);
                    bundle3.putBundle("params", bundle);
                    ((D) ((C0852F) obj).f11874r).L(3, bundle3);
                    return;
                }
                return;
        }
    }
}
