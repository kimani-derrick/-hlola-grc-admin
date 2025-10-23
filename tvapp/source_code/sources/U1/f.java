package U1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.internal.measurement.K1;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final K1 f3419a;

    /* renamed from: b  reason: collision with root package name */
    public final d f3420b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f3421c;

    public f(Context context, d dVar) {
        K1 k12 = new K1(19, context);
        this.f3421c = new HashMap();
        this.f3419a = k12;
        this.f3420b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f3421c.containsKey(str)) {
            return (h) this.f3421c.get(str);
        }
        CctBackendFactory w7 = this.f3419a.w(str);
        if (w7 == null) {
            return null;
        }
        d dVar = this.f3420b;
        h create = w7.create(new b(dVar.f3413a, dVar.f3414b, dVar.f3415c, str));
        this.f3421c.put(str, create);
        return create;
    }
}
