package T0;

import L5.l;
import L5.p;
import V.q;
import W5.AbstractC0117y;
import android.view.ViewTreeObserver;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends M5.h implements l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f3209r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3210s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f3211t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f3212u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(A5.a aVar, C4.b bVar) {
        super(1);
        this.f3209r = 1;
        q qVar = q.f3565r;
        this.f3210s = aVar;
        this.f3211t = bVar;
        this.f3212u = qVar;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        C1530l c1530l;
        C1530l c1530l2;
        switch (this.f3209r) {
            case 0:
                Throwable th = (Throwable) obj;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f3211t;
                boolean isAlive = viewTreeObserver.isAlive();
                i iVar = (i) this.f3212u;
                if (!isAlive) {
                    viewTreeObserver = ((e) this.f3210s).f3204a.getViewTreeObserver();
                }
                viewTreeObserver.removeOnPreDrawListener(iVar);
                return C1530l.f16479a;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((l) this.f3210s).c(th2);
                C4.b bVar = (C4.b) this.f3211t;
                ((Y5.b) bVar.f423t).h(th2, false);
                do {
                    Object A6 = ((Y5.b) bVar.f423t).A();
                    c1530l = null;
                    if (A6 instanceof Y5.h) {
                        A6 = null;
                    }
                    c1530l2 = C1530l.f16479a;
                    if (A6 != null) {
                        ((p) this.f3212u).j(A6, th2);
                        c1530l = c1530l2;
                        continue;
                    }
                } while (c1530l != null);
                return c1530l2;
            default:
                Throwable th3 = (Throwable) obj;
                F0.c a7 = b6.a.a((l) this.f3210s, this.f3211t, null);
                if (a7 != null) {
                    AbstractC0117y.m((D5.i) this.f3212u, a7);
                }
                return C1530l.f16479a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i7) {
        super(1);
        this.f3209r = i7;
        this.f3210s = obj;
        this.f3211t = obj2;
        this.f3212u = obj3;
    }
}
