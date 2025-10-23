package androidx.room;

import M5.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import x0.BinderC1456l;
import x0.RemoteCallbackListC1457m;
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: q  reason: collision with root package name */
    public int f6984q;

    /* renamed from: r  reason: collision with root package name */
    public final LinkedHashMap f6985r = new LinkedHashMap();

    /* renamed from: s  reason: collision with root package name */
    public final RemoteCallbackListC1457m f6986s = new RemoteCallbackListC1457m(this);

    /* renamed from: t  reason: collision with root package name */
    public final BinderC1456l f6987t = new BinderC1456l(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        g.f(intent, "intent");
        return this.f6987t;
    }
}
