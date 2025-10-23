package U4;

import V4.q;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.measurement.K1;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import f3.ComponentCallbacks2C0697b;
import i4.C0774c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class p implements X4.a {

    /* renamed from: j  reason: collision with root package name */
    public static final Random f3465j = new Random();

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f3466k = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f3468b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f3469c;
    public final h4.f d;

    /* renamed from: e  reason: collision with root package name */
    public final N4.e f3470e;
    public final C0774c f;

    /* renamed from: g  reason: collision with root package name */
    public final M4.b f3471g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3472h;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3467a = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f3473i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, f3.a] */
    public p(Context context, ScheduledExecutorService scheduledExecutorService, h4.f fVar, N4.e eVar, C0774c c0774c, M4.b bVar) {
        this.f3468b = context;
        this.f3469c = scheduledExecutorService;
        this.d = fVar;
        this.f3470e = eVar;
        this.f = c0774c;
        this.f3471g = bVar;
        fVar.a();
        this.f3472h = fVar.f10989c.f11001b;
        AtomicReference atomicReference = o.f3464a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = o.f3464a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    ComponentCallbacks2C0697b.b(application);
                    ComponentCallbacks2C0697b.f10396u.a(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        m3.g.e(scheduledExecutorService, new l(0, this));
    }

    public final synchronized f a() {
        V4.e c5;
        V4.e c6;
        V4.e c7;
        V4.n nVar;
        V4.l lVar;
        K1 k12;
        C4.b bVar;
        ScheduledExecutorService scheduledExecutorService;
        try {
            c5 = c("fetch");
            c6 = c("activate");
            c7 = c("defaults");
            Context context = this.f3468b;
            String str = this.f3472h;
            nVar = new V4.n(context.getSharedPreferences("frc_" + str + "_firebase_settings", 0));
            lVar = new V4.l(this.f3469c, c6, c7);
            h4.f fVar = this.d;
            M4.b bVar2 = this.f3471g;
            fVar.a();
            if (fVar.f10988b.equals("[DEFAULT]")) {
                k12 = new K1(bVar2);
            } else {
                k12 = null;
            }
            if (k12 != null) {
                lVar.a(new m(k12));
            }
            K1 k13 = new K1(22, false);
            k13.f8367r = c6;
            k13.f8368s = c7;
            bVar = new C4.b(6, false);
            bVar.f424u = Collections.newSetFromMap(new ConcurrentHashMap());
            bVar.f421r = c6;
            bVar.f422s = k13;
            scheduledExecutorService = this.f3469c;
            bVar.f423t = scheduledExecutorService;
        } catch (Throwable th) {
            throw th;
        }
        return b(this.d, this.f3470e, this.f, scheduledExecutorService, c5, c6, c7, d(c5, nVar), lVar, nVar, bVar);
    }

    public final synchronized f b(h4.f fVar, N4.e eVar, C0774c c0774c, ScheduledExecutorService scheduledExecutorService, V4.e eVar2, V4.e eVar3, V4.e eVar4, V4.k kVar, V4.l lVar, V4.n nVar, C4.b bVar) {
        C0774c c0774c2;
        try {
            if (!this.f3467a.containsKey("firebase")) {
                fVar.a();
                if (fVar.f10988b.equals("[DEFAULT]")) {
                    c0774c2 = c0774c;
                } else {
                    c0774c2 = null;
                }
                f fVar2 = new f(c0774c2, scheduledExecutorService, eVar2, eVar3, eVar4, kVar, lVar, nVar, e(fVar, eVar, kVar, eVar3, this.f3468b, nVar), bVar);
                eVar3.b();
                eVar4.b();
                eVar2.b();
                this.f3467a.put("firebase", fVar2);
                f3466k.put("firebase", fVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (f) this.f3467a.get("firebase");
    }

    public final V4.e c(String str) {
        q qVar;
        String str2 = "frc_" + this.f3472h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f3469c;
        Context context = this.f3468b;
        HashMap hashMap = q.f3726c;
        synchronized (q.class) {
            try {
                HashMap hashMap2 = q.f3726c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new q(context, str2));
                }
                qVar = (q) hashMap2.get(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return V4.e.d(scheduledExecutorService, qVar);
    }

    public final synchronized V4.k d(V4.e eVar, V4.n nVar) {
        N4.e eVar2;
        M4.b nVar2;
        M4.b bVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        h4.f fVar;
        try {
            eVar2 = this.f3470e;
            h4.f fVar2 = this.d;
            fVar2.a();
            if (fVar2.f10988b.equals("[DEFAULT]")) {
                nVar2 = this.f3471g;
            } else {
                nVar2 = new n(0);
            }
            bVar = nVar2;
            scheduledExecutorService = this.f3469c;
            random = f3465j;
            h4.f fVar3 = this.d;
            fVar3.a();
            str = fVar3.f10989c.f11000a;
            fVar = this.d;
            fVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new V4.k(eVar2, bVar, scheduledExecutorService, random, eVar, new ConfigFetchHttpClient(this.f3468b, fVar.f10989c.f11001b, str, nVar.f3708a.getLong("fetch_timeout_in_seconds", 60L), nVar.f3708a.getLong("fetch_timeout_in_seconds", 60L)), nVar, this.f3473i);
    }

    public final synchronized K1 e(h4.f fVar, N4.e eVar, V4.k kVar, V4.e eVar2, Context context, V4.n nVar) {
        return new K1(fVar, eVar, kVar, eVar2, context, nVar, this.f3469c);
    }
}
