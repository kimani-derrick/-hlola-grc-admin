package U4;

import android.util.Log;
import b2.InterfaceC0363b;
import com.google.android.gms.internal.measurement.K1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import t3.C1251o;
import t3.InterfaceC1237a;
import t3.InterfaceC1241e;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1237a, InterfaceC1241e, InterfaceC0363b, a2.h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3447q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3448r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3449s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f3450t;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i7) {
        this.f3447q = i7;
        this.f3450t = obj;
        this.f3448r = obj2;
        this.f3449s = obj3;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Type inference failed for: r6v12, types: [z4.b, java.lang.Object] */
    @Override // a2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.e.apply(java.lang.Object):java.lang.Object");
    }

    @Override // t3.InterfaceC1237a
    public Object d(C1251o c1251o) {
        V4.g gVar;
        URL url;
        h4.h hVar;
        switch (this.f3447q) {
            case 0:
                f fVar = (f) this.f3450t;
                fVar.getClass();
                C1251o c1251o2 = (C1251o) this.f3448r;
                if (c1251o2.i() && c1251o2.g() != null) {
                    V4.g gVar2 = (V4.g) c1251o2.g();
                    C1251o c1251o3 = (C1251o) this.f3449s;
                    if (!c1251o3.i() || (gVar = (V4.g) c1251o3.g()) == null || !gVar2.f3680c.equals(gVar.f3680c)) {
                        V4.e eVar = fVar.d;
                        eVar.getClass();
                        c cVar = new c(eVar, 1, gVar2);
                        Executor executor = eVar.f3670a;
                        return m3.g.e(executor, cVar).j(executor, new V4.c(eVar, gVar2)).d(fVar.f3452b, new d(fVar));
                    }
                }
                return m3.g.m(Boolean.FALSE);
            default:
                V4.p pVar = (V4.p) this.f3450t;
                pVar.getClass();
                C1251o c1251o4 = (C1251o) this.f3448r;
                if (!c1251o4.i()) {
                    hVar = new h4.h("Firebase Installations failed to get installation auth token for config update listener connection.", c1251o4.f());
                } else {
                    C1251o c1251o5 = (C1251o) this.f3449s;
                    if (!c1251o5.i()) {
                        hVar = new h4.h("Firebase Installations failed to get installation ID for config update listener connection.", c1251o5.f());
                    } else {
                        try {
                            try {
                                url = new URL(pVar.c(pVar.f3723l));
                            } catch (MalformedURLException unused) {
                                Log.e("FirebaseRemoteConfig", "URL is malformed");
                                url = null;
                            }
                            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                            pVar.j(httpURLConnection, (String) c1251o5.g(), ((N4.a) c1251o4.g()).f2516a);
                            return m3.g.m(httpURLConnection);
                        } catch (IOException e3) {
                            return m3.g.l(new h4.h("Failed to open HTTP stream connection", e3));
                        }
                    }
                }
                return m3.g.l(hVar);
        }
    }

    @Override // b2.InterfaceC0363b
    public Object e() {
        Y1.a aVar = (Y1.a) this.f3450t;
        a2.j jVar = (a2.j) aVar.d;
        jVar.getClass();
        T1.i iVar = (T1.i) this.f3448r;
        Q1.c cVar = iVar.f3242c;
        T1.h hVar = (T1.h) this.f3449s;
        String str = hVar.f3236a;
        String w7 = h4.b.w("SQLiteEventStore");
        if (Log.isLoggable(w7, 3)) {
            Log.d(w7, "Storing event with priority=" + cVar + ", name=" + str + " for destination " + iVar.f3240a);
        }
        ((Long) jVar.f(new e(jVar, hVar, iVar, 4))).getClass();
        aVar.f4310a.a(iVar, 1, false);
        return null;
    }

    @Override // t3.InterfaceC1241e
    public void f(Object obj) {
        C1251o c1251o = (C1251o) this.f3448r;
        r4.b bVar = (r4.b) this.f3449s;
        V4.g gVar = (V4.g) obj;
        C4.b bVar2 = (C4.b) this.f3450t;
        bVar2.getClass();
        try {
            V4.g gVar2 = (V4.g) c1251o.g();
            if (gVar2 != null) {
                ((Executor) bVar2.f423t).execute(new W4.a(bVar, ((K1) bVar2.f422s).x(gVar2), 0));
            }
        } catch (h e3) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e3);
        }
    }
}
