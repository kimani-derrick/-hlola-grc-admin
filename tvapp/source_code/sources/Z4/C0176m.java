package Z4;

import W5.AbstractC0117y;
import android.app.Application;
import android.content.Context;
import android.util.Log;
/* renamed from: Z4.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176m {

    /* renamed from: a  reason: collision with root package name */
    public final h4.f f4852a;

    /* renamed from: b  reason: collision with root package name */
    public final b5.j f4853b;

    public C0176m(h4.f fVar, b5.j jVar, D5.i iVar, W w7) {
        this.f4852a = fVar;
        this.f4853b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        fVar.a();
        Context applicationContext = fVar.f10987a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(Y.f4800q);
            AbstractC0117y.p(AbstractC0117y.a(iVar), null, 0, new C0175l(this, iVar, w7, null), 3);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
