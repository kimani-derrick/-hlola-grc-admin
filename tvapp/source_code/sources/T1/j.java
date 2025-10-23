package T1;

import H2.E;
import Z2.F;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k3.AbstractC0958a;
import s3.C1154I;
import s3.C1175g0;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class j implements androidx.emoji2.text.i {

    /* renamed from: a  reason: collision with root package name */
    public Context f3243a;

    public /* synthetic */ j(Context context, char c5) {
        this.f3243a = context;
    }

    @Override // androidx.emoji2.text.i
    public void a(AbstractC0958a abstractC0958a) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new F("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new E(this, abstractC0958a, threadPoolExecutor, 3));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, T1.k] */
    public k b() {
        Context context = this.f3243a;
        if (context != null) {
            ?? obj = new Object();
            obj.f3244q = V1.a.a(n.f3252a);
            Y1.c cVar = new Y1.c(2, context);
            obj.f3245r = cVar;
            obj.f3246s = V1.a.a(new U1.g(cVar, new U1.e(cVar)));
            Y1.c cVar2 = obj.f3245r;
            obj.f3247t = new U1.e((InterfaceC1496a) cVar2);
            InterfaceC1496a a7 = V1.a.a(new v(obj.f3247t, V1.a.a(new Y1.c(1, cVar2))));
            obj.f3248u = a7;
            Y1.c cVar3 = new Y1.c();
            Y1.c cVar4 = obj.f3245r;
            Y1.d dVar = new Y1.d(cVar4, a7, cVar3);
            InterfaceC1496a interfaceC1496a = obj.f3244q;
            InterfaceC1496a interfaceC1496a2 = obj.f3246s;
            obj.f3249v = V1.a.a(new v(new v(interfaceC1496a, interfaceC1496a2, dVar, a7, a7), new Z1.k(cVar4, interfaceC1496a2, a7, dVar, interfaceC1496a, a7, a7), new Y1.d(interfaceC1496a, a7, dVar, a7)));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    public PackageInfo c(String str, int i7) {
        return this.f3243a.getPackageManager().getPackageInfo(str, i7);
    }

    public boolean d() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f3243a;
        if (callingUid == myUid) {
            return AbstractC0958a.w(context);
        }
        if (Build.VERSION.SDK_INT >= 26 && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    public C1154I e() {
        C1154I c1154i = C1175g0.e(this.f3243a, null, null).f14064y;
        C1175g0.i(c1154i);
        return c1154i;
    }

    public j(Context context, int i7) {
        switch (i7) {
            case 3:
                g3.n.g(context);
                this.f3243a = context;
                return;
            case 4:
                g3.n.g(context);
                Context applicationContext = context.getApplicationContext();
                g3.n.g(applicationContext);
                this.f3243a = applicationContext;
                return;
            default:
                this.f3243a = context.getApplicationContext();
                return;
        }
    }
}
