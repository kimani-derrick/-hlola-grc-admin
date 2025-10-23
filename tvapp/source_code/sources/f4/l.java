package f4;

import Z2.x;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;
/* loaded from: classes.dex */
public final class l extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f10425a;

    public l(x xVar) {
        this.f10425a = xVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        x xVar = this.f10425a;
        try {
            Mac mac = (Mac) i.f10423c.f10424a.a((String) xVar.f4688s);
            mac.init((Key) xVar.f4689t);
            return mac;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
