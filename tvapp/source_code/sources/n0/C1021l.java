package n0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import r0.AbstractC1111a;
/* renamed from: n0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021l {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f12556a;

    /* renamed from: b  reason: collision with root package name */
    public final Z5.w f12557b;

    /* renamed from: c  reason: collision with root package name */
    public final Z5.w f12558c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final T4.c f12559e;
    public final T4.c f;

    /* renamed from: g  reason: collision with root package name */
    public final N f12560g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0999A f12561h;

    public C1021l(C0999A c0999a, N n) {
        M5.g.f(n, "navigator");
        this.f12561h = c0999a;
        this.f12556a = new ReentrantLock(true);
        Z5.w b7 = Z5.s.b(A5.t.f135q);
        this.f12557b = b7;
        Z5.w b8 = Z5.s.b(A5.v.f137q);
        this.f12558c = b8;
        this.f12559e = new T4.c(29, b7);
        this.f = new T4.c(29, b8);
        this.f12560g = n;
    }

    public final void a(C1019j c1019j) {
        M5.g.f(c1019j, "backStackEntry");
        ReentrantLock reentrantLock = this.f12556a;
        reentrantLock.lock();
        try {
            Z5.w wVar = this.f12557b;
            wVar.f(A5.k.f0((Collection) wVar.getValue(), c1019j));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C1019j c1019j) {
        Z5.w wVar = this.f12557b;
        Iterable iterable = (Iterable) wVar.getValue();
        Object b02 = A5.k.b0((List) wVar.getValue());
        M5.g.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(A5.m.P(iterable));
        boolean z7 = false;
        for (Object obj : iterable) {
            boolean z8 = true;
            if (!z7 && M5.g.a(obj, b02)) {
                z7 = true;
                z8 = false;
            }
            if (z8) {
                arrayList.add(obj);
            }
        }
        wVar.f(A5.k.f0(arrayList, c1019j));
    }

    public final void c(C1019j c1019j, boolean z7) {
        M5.g.f(c1019j, "popUpTo");
        C0999A c0999a = this.f12561h;
        N b7 = c0999a.f12474u.b(c1019j.f12543r.f12600q);
        if (M5.g.a(b7, this.f12560g)) {
            L5.l lVar = c0999a.f12477x;
            if (lVar != null) {
                lVar.c(c1019j);
                d(c1019j);
                return;
            }
            A5.i iVar = c0999a.f12461g;
            int indexOf = iVar.indexOf(c1019j);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + c1019j + " as it was not found on the current back stack");
                return;
            }
            int i7 = indexOf + 1;
            if (i7 != iVar.f131s) {
                c0999a.m(((C1019j) iVar.get(i7)).f12543r.f12607x, true, false);
            }
            C0999A.o(c0999a, c1019j);
            d(c1019j);
            c0999a.u();
            c0999a.b();
            return;
        }
        Object obj = c0999a.f12475v.get(b7);
        M5.g.c(obj);
        ((C1021l) obj).c(c1019j, z7);
    }

    public final void d(C1019j c1019j) {
        M5.g.f(c1019j, "popUpTo");
        ReentrantLock reentrantLock = this.f12556a;
        reentrantLock.lock();
        try {
            Z5.w wVar = this.f12557b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) wVar.getValue()) {
                if (!(!M5.g.a((C1019j) obj, c1019j))) {
                    break;
                }
                arrayList.add(obj);
            }
            wVar.f(arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(C1019j c1019j) {
        M5.g.f(c1019j, "backStackEntry");
        C0999A c0999a = this.f12561h;
        N b7 = c0999a.f12474u.b(c1019j.f12543r.f12600q);
        if (M5.g.a(b7, this.f12560g)) {
            L5.l lVar = c0999a.f12476w;
            if (lVar != null) {
                lVar.c(c1019j);
                a(c1019j);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + c1019j.f12543r + " outside of the call to navigate(). ");
            return;
        }
        Object obj = c0999a.f12475v.get(b7);
        if (obj != null) {
            ((C1021l) obj).e(c1019j);
            return;
        }
        throw new IllegalStateException(AbstractC1111a.t(new StringBuilder("NavigatorBackStack for "), c1019j.f12543r.f12600q, " should already be created").toString());
    }
}
