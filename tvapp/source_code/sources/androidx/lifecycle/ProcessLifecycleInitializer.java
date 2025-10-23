package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements F0.b {
    @Override // F0.b
    public final List a() {
        return A5.t.f135q;
    }

    @Override // F0.b
    public final Object b(Context context) {
        M5.g.f(context, "context");
        F0.a c5 = F0.a.c(context);
        M5.g.e(c5, "getInstance(context)");
        if (c5.f622b.contains(ProcessLifecycleInitializer.class)) {
            if (!r.f6825a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                M5.g.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0339q());
            }
            F f = F.f6733y;
            f.getClass();
            f.f6738u = new Handler();
            f.f6739v.G(EnumC0336n.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            M5.g.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new E(f));
            return f;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
