package X5;

import L5.l;
import M5.g;
import M5.h;
import T5.j;
import W5.B;
import W5.InterfaceC0093a0;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import l5.C0982f;
import m3.i;
import n0.C0999A;
import n0.C1001C;
import n0.C1002D;
import n0.C1003E;
import n0.C1012c;
import n0.C1019j;
import n0.C1021l;
import n0.N;
import n0.v;
import n0.y;
import q.k;
import z5.C1530l;
/* loaded from: classes.dex */
public final class d extends h implements l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f4289r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f4290s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f4291t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        super(1);
        this.f4289r = i7;
        this.f4290s = obj;
        this.f4291t = obj2;
    }

    @Override // L5.l
    public final Object c(Object obj) {
        Object next;
        y yVar;
        N n;
        Bundle bundle;
        v c5;
        boolean z7 = false;
        C1530l c1530l = C1530l.f16479a;
        Object obj2 = this.f4291t;
        Object obj3 = this.f4290s;
        switch (this.f4289r) {
            case 0:
                Throwable th = (Throwable) obj;
                ((e) obj3).f4292s.removeCallbacks((Runnable) obj2);
                return c1530l;
            case 1:
                C0982f c0982f = (C0982f) obj;
                g.f(c0982f, "entry");
                if (c0982f.f12290a == ((View) obj3)) {
                    if (g.a(c0982f.f12291b, (View) obj2)) {
                        z7 = true;
                    }
                }
                return Boolean.valueOf(z7);
            case 2:
                C1003E c1003e = (C1003E) obj;
                g.f(c1003e, "$this$navOptions");
                C1001C c1001c = c1003e.f12493a;
                c1001c.f12483a = 0;
                c1001c.f12484b = 0;
                c1001c.f12485c = -1;
                c1001c.d = -1;
                v vVar = (v) obj3;
                if (vVar instanceof y) {
                    int i7 = v.f12599z;
                    g.f(vVar, "<this>");
                    Iterator it = j.K(vVar, C1012c.f12526w).iterator();
                    while (true) {
                        C0999A c0999a = (C0999A) obj2;
                        if (it.hasNext()) {
                            v vVar2 = (v) it.next();
                            v e3 = c0999a.e();
                            if (e3 != null) {
                                yVar = e3.f12601r;
                            } else {
                                yVar = null;
                            }
                            if (g.a(vVar2, yVar)) {
                            }
                        } else {
                            int i8 = y.f12612E;
                            y yVar2 = c0999a.f12459c;
                            if (yVar2 != null) {
                                Iterator it2 = j.K(yVar2.n(yVar2.f12614B, true), C1012c.f12527x).iterator();
                                if (it2.hasNext()) {
                                    do {
                                        next = it2.next();
                                    } while (it2.hasNext());
                                    c1003e.f12495c = ((v) next).f12607x;
                                    c1003e.d = true;
                                } else {
                                    throw new NoSuchElementException("Sequence is empty.");
                                }
                            } else {
                                throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
                            }
                        }
                    }
                }
                return c1530l;
            case 3:
                C1019j c1019j = (C1019j) obj;
                g.f(c1019j, "backStackEntry");
                v vVar3 = c1019j.f12543r;
                if (!(vVar3 instanceof v)) {
                    vVar3 = null;
                }
                if (vVar3 == null || (c5 = (n = (N) obj3).c(vVar3, (bundle = c1019j.f12544s), (C1002D) obj2)) == null) {
                    return null;
                }
                if (g.a(c5, vVar3)) {
                    return c1019j;
                }
                C1021l b7 = n.b();
                Bundle c6 = c5.c(bundle);
                C0999A c0999a2 = b7.f12561h;
                return i.d(c0999a2.f12457a, c5, c6, c0999a2.f(), c0999a2.f12468o);
            case 4:
                Throwable th2 = (Throwable) obj;
                q.i iVar = (q.i) obj3;
                if (th2 != null) {
                    if (th2 instanceof CancellationException) {
                        iVar.d = true;
                        k kVar = iVar.f13214b;
                        if (kVar != null && kVar.f13218r.cancel(true)) {
                            iVar.f13213a = null;
                            iVar.f13214b = null;
                            iVar.f13215c = null;
                        }
                    } else {
                        iVar.d = true;
                        k kVar2 = iVar.f13214b;
                        if (kVar2 != null && kVar2.f13218r.j(th2)) {
                            iVar.f13213a = null;
                            iVar.f13214b = null;
                            iVar.f13215c = null;
                        }
                    }
                } else {
                    Object j7 = ((B) obj2).j();
                    iVar.d = true;
                    k kVar3 = iVar.f13214b;
                    if (kVar3 != null && kVar3.f13218r.i(j7)) {
                        iVar.f13213a = null;
                        iVar.f13214b = null;
                        iVar.f13215c = null;
                    }
                }
                return c1530l;
            default:
                Throwable th3 = (Throwable) obj;
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((InterfaceC0093a0) obj2).b(null);
                return c1530l;
        }
    }
}
