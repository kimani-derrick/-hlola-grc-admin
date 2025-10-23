package X0;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final k f4073a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static L0.j f4074b;

    @Override // X0.h
    public boolean a(T0.f fVar) {
        h4.b bVar = fVar.f3207a;
        if (!(bVar instanceof T0.a) || ((T0.a) bVar).f3200a > 100) {
            h4.b bVar2 = fVar.f3208b;
            if (!(bVar2 instanceof T0.a) || ((T0.a) bVar2).f3200a > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // X0.h
    public boolean b() {
        boolean z7;
        synchronized (g.f4064a) {
            try {
                int i7 = g.f4066c;
                g.f4066c = i7 + 1;
                if (i7 >= 30 || SystemClock.uptimeMillis() > g.d + 30000) {
                    boolean z8 = false;
                    g.f4066c = 0;
                    g.d = SystemClock.uptimeMillis();
                    String[] list = g.f4065b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z8 = true;
                    }
                    g.f4067e = z8;
                }
                z7 = g.f4067e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
