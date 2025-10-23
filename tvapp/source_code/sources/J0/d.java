package J0;

import H2.C0002c;
import W5.G;
import X0.k;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.K1;
import java.io.File;
import v6.w;
/* loaded from: classes.dex */
public final class d extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f1277r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0002c f1278s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(C0002c c0002c, int i7) {
        super(0);
        this.f1277r = i7;
        this.f1278s = c0002c;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [L0.a, java.lang.Object] */
    @Override // L5.a
    public final Object b() {
        Q0.i fVar;
        T4.c cVar;
        Q0.h hVar;
        int i7;
        int i8;
        L0.j jVar;
        switch (this.f1277r) {
            case 0:
                Context context = (Context) this.f1278s.f1017r;
                Q0.a aVar = new Q0.a(context);
                if (aVar.f2831c) {
                    fVar = new H.j(2);
                } else {
                    fVar = new L4.f(7);
                }
                if (aVar.f2830b) {
                    double d = aVar.f2829a;
                    if (d > 0.0d) {
                        Bitmap.Config[] configArr = X0.e.f4059a;
                        try {
                            Object b7 = A.b.b(context, ActivityManager.class);
                            M5.g.c(b7);
                            ActivityManager activityManager = (ActivityManager) b7;
                            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                                i8 = activityManager.getLargeMemoryClass();
                            } else {
                                i8 = activityManager.getMemoryClass();
                            }
                        } catch (Exception unused) {
                            i8 = 256;
                        }
                        double d7 = d * i8;
                        double d8 = 1024;
                        i7 = (int) (d7 * d8 * d8);
                    } else {
                        i7 = 0;
                    }
                    if (i7 > 0) {
                        hVar = new K1(i7, fVar);
                        return new Q0.d(hVar, fVar);
                    }
                    cVar = new T4.c(22, fVar);
                } else {
                    cVar = new T4.c(22, fVar);
                }
                hVar = cVar;
                return new Q0.d(hVar, fVar);
            default:
                k kVar = k.f4073a;
                Context context2 = (Context) this.f1278s.f1017r;
                synchronized (kVar) {
                    jVar = k.f4074b;
                    if (jVar == null) {
                        ?? obj = new Object();
                        obj.f1859b = v6.k.f15396a;
                        obj.f1860c = 0.02d;
                        obj.d = 10485760L;
                        obj.f1861e = 262144000L;
                        obj.f = G.f3946b;
                        File d02 = J5.a.d0(X0.e.d(context2));
                        String str = w.f15416r;
                        obj.f1858a = u0.j.k(d02);
                        jVar = obj.a();
                        k.f4074b = jVar;
                    }
                }
                return jVar;
        }
    }
}
