package Z4;

import W5.AbstractC0117y;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class V extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4796a;

    /* renamed from: b  reason: collision with root package name */
    public long f4797b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4798c;

    public V(Looper looper) {
        super(looper);
        this.f4798c = new ArrayList();
    }

    public final void a(Messenger messenger) {
        String str;
        if (this.f4796a) {
            Object b7 = h4.f.c().b(N.class);
            M5.g.e(b7, "Firebase.app[SessionGenerator::class.java]");
            str = ((N) b7).b().f4753a;
        } else {
            Object b8 = h4.f.c().b(InterfaceC0183u.class);
            M5.g.e(b8, "Firebase.app[SessionDatastore::class.java]");
            C0177n c0177n = (C0177n) ((E) ((InterfaceC0183u) b8)).f4752c.get();
            if (c0177n != null) {
                str = c0177n.f4854a;
            } else {
                str = null;
            }
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + str);
            if (str == null) {
                return;
            }
        }
        c(messenger, str);
    }

    public final void b() {
        String a7;
        Object b7 = h4.f.c().b(N.class);
        M5.g.e(b7, "Firebase.app[SessionGenerator::class.java]");
        N n = (N) b7;
        int i7 = n.d + 1;
        n.d = i7;
        if (i7 == 0) {
            a7 = n.f4781c;
        } else {
            a7 = n.a();
        }
        String str = a7;
        int i8 = n.d;
        n.f4779a.getClass();
        n.f4782e = new F(str, n.f4781c, i8, 1000 * System.currentTimeMillis());
        n.b();
        StringBuilder sb = new StringBuilder("Generated new session ");
        Object b8 = h4.f.c().b(N.class);
        M5.g.e(b8, "Firebase.app[SessionGenerator::class.java]");
        sb.append(((N) b8).b().f4753a);
        Log.d("SessionLifecycleService", sb.toString());
        StringBuilder sb2 = new StringBuilder("Broadcasting new session: ");
        Object b9 = h4.f.c().b(N.class);
        M5.g.e(b9, "Firebase.app[SessionGenerator::class.java]");
        sb2.append(((N) b9).b());
        Log.d("SessionLifecycleService", sb2.toString());
        Object b10 = h4.f.c().b(I.class);
        M5.g.e(b10, "Firebase.app[SessionFirelogPublisher::class.java]");
        Object b11 = h4.f.c().b(N.class);
        M5.g.e(b11, "Firebase.app[SessionGenerator::class.java]");
        L l7 = (L) ((I) b10);
        AbstractC0117y.p(AbstractC0117y.a(l7.f4777e), null, 0, new J(l7, ((N) b11).b(), null), 3);
        Iterator it = new ArrayList(this.f4798c).iterator();
        while (it.hasNext()) {
            Messenger messenger = (Messenger) it.next();
            M5.g.e(messenger, "it");
            a(messenger);
        }
        Object b12 = h4.f.c().b(InterfaceC0183u.class);
        M5.g.e(b12, "Firebase.app[SessionDatastore::class.java]");
        Object b13 = h4.f.c().b(N.class);
        M5.g.e(b13, "Firebase.app[SessionGenerator::class.java]");
        E e3 = (E) ((InterfaceC0183u) b12);
        String str2 = ((N) b13).b().f4753a;
        M5.g.f(str2, "sessionId");
        AbstractC0117y.p(AbstractC0117y.a(e3.f4751b), null, 0, new D(e3, str2, null), 3);
    }

    public final void c(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f4798c.remove(messenger);
        } catch (Exception e3) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x010e, code lost:
        if ((!V5.a.c(r8)) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0126, code lost:
        if ((!V5.a.c(r8)) != false) goto L29;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.V.handleMessage(android.os.Message):void");
    }
}
