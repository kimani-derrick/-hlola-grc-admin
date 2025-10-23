package M0;

import android.net.Uri;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1522d f2155a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1522d f2156b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2157c;

    public i(C1527i c1527i, C1527i c1527i2, boolean z7) {
        this.f2155a = c1527i;
        this.f2156b = c1527i2;
        this.f2157c = z7;
    }

    @Override // M0.f
    public final g a(Object obj, S0.k kVar) {
        Uri uri = (Uri) obj;
        if (!M5.g.a(uri.getScheme(), "http") && !M5.g.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), kVar, this.f2155a, this.f2156b, this.f2157c);
    }
}
