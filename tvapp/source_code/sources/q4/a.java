package q4;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.e;
import androidx.fragment.app.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import k.C0852F;
import l4.C0975c;
import l4.InterfaceC0974b;
import s4.InterfaceC1213a;
import t4.C1253b;
import t4.InterfaceC1252a;
import u4.q;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1252a, InterfaceC1213a, M4.a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ e f13391q;

    public /* synthetic */ a(e eVar) {
        this.f13391q = eVar;
    }

    @Override // t4.InterfaceC1252a
    public void a(q qVar) {
        e eVar = this.f13391q;
        synchronized (eVar) {
            if (((InterfaceC1252a) eVar.f5835b) instanceof C1253b) {
                ((ArrayList) eVar.f5836c).add(qVar);
            }
            ((InterfaceC1252a) eVar.f5835b).a(qVar);
        }
    }

    @Override // M4.a
    public void f(M4.b bVar) {
        e eVar = this.f13391q;
        eVar.getClass();
        r4.c cVar = r4.c.f13480a;
        cVar.c("AnalyticsConnector now available.");
        InterfaceC0974b interfaceC0974b = (InterfaceC0974b) bVar.get();
        C0852F c0852f = new C0852F(19, interfaceC0974b);
        D d = new D(23, false);
        C0975c c0975c = (C0975c) interfaceC0974b;
        J3.e b7 = c0975c.b("clx", d);
        if (b7 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            J3.e b8 = c0975c.b("crash", d);
            if (b8 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            b7 = b8;
        }
        if (b7 != null) {
            cVar.c("Registered Firebase Analytics listener.");
            C0852F c0852f2 = new C0852F(18, false);
            C4.b bVar2 = new C4.b(c0852f, TimeUnit.MILLISECONDS);
            synchronized (eVar) {
                try {
                    Iterator it = ((ArrayList) eVar.f5836c).iterator();
                    while (it.hasNext()) {
                        c0852f2.a((q) it.next());
                    }
                    d.f5884s = c0852f2;
                    d.f5883r = bVar2;
                    eVar.f5835b = c0852f2;
                    eVar.f5834a = bVar2;
                } finally {
                }
            }
            return;
        }
        cVar.f("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }

    @Override // s4.InterfaceC1213a
    public void n(Bundle bundle) {
        ((InterfaceC1213a) this.f13391q.f5834a).n(bundle);
    }
}
