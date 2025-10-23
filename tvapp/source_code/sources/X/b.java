package X;

import A1.j;
import L5.l;
import V.C0085d;
import V.H;
import V.InterfaceC0083b;
import W5.InterfaceC0116x;
import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4047a;

    /* renamed from: b  reason: collision with root package name */
    public final T4.c f4048b;

    /* renamed from: c  reason: collision with root package name */
    public final l f4049c;
    public final InterfaceC0116x d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4050e;
    public volatile T4.c f;

    public b(String str, T4.c cVar, l lVar, InterfaceC0116x interfaceC0116x) {
        M5.g.f(str, "name");
        this.f4047a = str;
        this.f4048b = cVar;
        this.f4049c = lVar;
        this.d = interfaceC0116x;
        this.f4050e = new Object();
    }

    public final T4.c a(Object obj, S5.c cVar) {
        T4.c cVar2;
        Context context = (Context) obj;
        M5.g.f(context, "thisRef");
        M5.g.f(cVar, "property");
        T4.c cVar3 = this.f;
        if (cVar3 == null) {
            synchronized (this.f4050e) {
                try {
                    if (this.f == null) {
                        Context applicationContext = context.getApplicationContext();
                        InterfaceC0083b interfaceC0083b = this.f4048b;
                        l lVar = this.f4049c;
                        M5.g.e(applicationContext, "applicationContext");
                        List list = (List) lVar.c(applicationContext);
                        InterfaceC0116x interfaceC0116x = this.d;
                        A1.l lVar2 = new A1.l(applicationContext, 15, this);
                        M5.g.f(list, "migrations");
                        M5.g.f(interfaceC0116x, "scope");
                        j jVar = new j(lVar2, 6);
                        if (interfaceC0083b == null) {
                            interfaceC0083b = new J3.e(11);
                        }
                        this.f = new T4.c(25, new H(jVar, m3.g.z(new C0085d(list, null)), interfaceC0083b, interfaceC0116x));
                    }
                    cVar2 = this.f;
                    M5.g.c(cVar2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return cVar2;
        }
        return cVar3;
    }
}
