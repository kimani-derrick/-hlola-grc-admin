package h4;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.fragment.app.D;
import f3.ComponentCallbacks2C0697b;
import g3.n;
import j3.AbstractC0838b;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C1052e;
import o.j;
import o4.k;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f10985k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final C1052e f10986l = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final Context f10987a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10988b;

    /* renamed from: c  reason: collision with root package name */
    public final i f10989c;
    public final o4.d d;

    /* renamed from: g  reason: collision with root package name */
    public final k f10991g;

    /* renamed from: h  reason: collision with root package name */
    public final M4.b f10992h;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f10990e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f10993i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList f10994j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[LOOP:0: B:24:0x00b8->B:26:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0174  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r10, java.lang.String r11, h4.i r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.f.<init>(android.content.Context, java.lang.String, h4.i):void");
    }

    public static f c() {
        f fVar;
        synchronized (f10985k) {
            try {
                fVar = (f) f10986l.get("[DEFAULT]");
                if (fVar != null) {
                    ((L4.e) fVar.f10992h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0838b.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f f(Context context) {
        synchronized (f10985k) {
            try {
                if (f10986l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a7 = i.a(context);
                if (a7 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, f3.a] */
    public static f g(Context context, i iVar) {
        f fVar;
        AtomicReference atomicReference = d.f10982a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f10982a;
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
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f10985k) {
            C1052e c1052e = f10986l;
            n.i("FirebaseApp name [DEFAULT] already exists!", !c1052e.containsKey("[DEFAULT]"));
            n.h(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", iVar);
            c1052e.put("[DEFAULT]", fVar);
        }
        fVar.e();
        return fVar;
    }

    public final void a() {
        n.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.c(cls);
    }

    public final String d() {
        String encodeToString;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f10988b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb.append(encodeToString);
        sb.append("+");
        a();
        byte[] bytes2 = this.f10989c.f11001b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void e() {
        boolean z7;
        HashMap hashMap;
        Context context = this.f10987a;
        if (Build.VERSION.SDK_INT >= 24) {
            z7 = G.f.a(context);
        } else {
            z7 = true;
        }
        if (!z7) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f10988b);
            Log.i("FirebaseApp", sb.toString());
            Context context2 = this.f10987a;
            AtomicReference atomicReference = e.f10983b;
            if (atomicReference.get() == null) {
                e eVar = new e(context2);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context2.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f10988b);
        Log.i("FirebaseApp", sb2.toString());
        o4.d dVar = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f10988b);
        AtomicReference atomicReference2 = dVar.f12928v;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (dVar) {
                    hashMap = new HashMap(dVar.f12923q);
                }
                dVar.a(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((L4.e) this.f10992h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f10988b.equals(fVar.f10988b);
    }

    public final boolean h() {
        boolean z7;
        a();
        R4.a aVar = (R4.a) this.f10991g.get();
        synchronized (aVar) {
            z7 = aVar.f2921a;
        }
        return z7;
    }

    public final int hashCode() {
        return this.f10988b.hashCode();
    }

    public final String toString() {
        D d = new D(this);
        d.c(this.f10988b, "name");
        d.c(this.f10989c, "options");
        return d.toString();
    }
}
