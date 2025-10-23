package l5;

import A5.l;
import A5.q;
import H.j;
import M5.r;
import android.media.AudioManager;
import android.util.Log;
import android.view.View;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import e5.C0657b;
import e5.C0658c;
import f5.C0700a;
import java.util.LinkedList;
import java.util.RandomAccess;
import w0.U;
import w0.k0;
/* renamed from: l5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980d {

    /* renamed from: a  reason: collision with root package name */
    public final U f12275a;

    /* renamed from: b  reason: collision with root package name */
    public final h5.d f12276b;

    /* renamed from: c  reason: collision with root package name */
    public final C0700a f12277c;
    public final C0657b d;

    /* renamed from: e  reason: collision with root package name */
    public final C0658c f12278e;
    public final j f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12279g;

    /* renamed from: h  reason: collision with root package name */
    public AudioManager f12280h;

    /* renamed from: i  reason: collision with root package name */
    public DpadRecyclerView f12281i;

    /* renamed from: j  reason: collision with root package name */
    public C0981e f12282j;

    /* renamed from: k  reason: collision with root package name */
    public C0983g f12283k;

    /* renamed from: l  reason: collision with root package name */
    public final C4.b f12284l;

    /* renamed from: m  reason: collision with root package name */
    public final C0978b f12285m;
    public final C0979c n;

    /* renamed from: o  reason: collision with root package name */
    public final C0979c f12286o;

    public C0980d(U u7, h5.d dVar, C0700a c0700a, C0657b c0657b, C0658c c0658c, j jVar) {
        M5.g.f(u7, "layoutManager");
        this.f12275a = u7;
        this.f12276b = dVar;
        this.f12277c = c0700a;
        this.d = c0657b;
        this.f12278e = c0658c;
        this.f = jVar;
        this.f12284l = new C4.b(c0657b, c0700a, dVar);
        this.f12285m = new C0978b(this);
        this.n = new C0979c(this);
        this.f12286o = new C0979c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3 == (-1)) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(l5.C0980d r5, boolean r6) {
        /*
            w0.U r0 = r5.f12275a
            boolean r0 = r0.S()
            w0.U r1 = r5.f12275a
            int r2 = r1.I()
            e5.c r3 = r5.f12278e
            int r3 = r3.f10168b
            r4 = 0
            if (r2 != 0) goto L15
        L13:
            r3 = r4
            goto L1e
        L15:
            if (r3 < r2) goto L1a
            int r3 = r2 + (-1)
            goto L1e
        L1a:
            r2 = -1
            if (r3 != r2) goto L1e
            goto L13
        L1e:
            android.view.View r1 = r1.t(r3)
            if (r1 != 0) goto L25
            goto L35
        L25:
            f5.a r2 = r5.f12277c
            r2.getClass()
            java.lang.Object r2 = r2.d
            h5.d r2 = (h5.d) r2
            r2.g(r1)
            r2 = 0
            r5.f(r1, r2, r6, r0)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C0980d.e(l5.d, boolean):void");
    }

    public final boolean a(View view) {
        int K6;
        k0 g7 = this.f12276b.g(view);
        int i7 = 0;
        if (g7 == null) {
            return false;
        }
        View view2 = g7.f15576a;
        M5.g.e(view2, "itemView");
        if (view == view2) {
            view = null;
        }
        int c5 = this.f12277c.c(view2, view);
        C4.b bVar = this.f12284l;
        bVar.getClass();
        if (bVar.G() && c5 != 0) {
            bVar.l(c5);
            LinkedList linkedList = (LinkedList) bVar.f424u;
            if (linkedList.size() >= ((C0657b) bVar.f421r).f10160q) {
                return false;
            }
            X5.d dVar = new X5.d(view2, 1, view);
            if (!(linkedList instanceof RandomAccess)) {
                if ((linkedList instanceof N5.a) && !(linkedList instanceof N5.b)) {
                    r.c(linkedList, "kotlin.collections.MutableIterable");
                    throw null;
                }
                q.S(linkedList, dVar, true);
            } else {
                R5.b it = new R5.a(0, l.K(linkedList), 1).iterator();
                while (it.f2927s) {
                    int a7 = it.a();
                    Object obj = linkedList.get(a7);
                    if (!((Boolean) dVar.c(obj)).booleanValue()) {
                        if (i7 != a7) {
                            linkedList.set(i7, obj);
                        }
                        i7++;
                    }
                }
                if (i7 < linkedList.size() && i7 <= (K6 = l.K(linkedList))) {
                    while (true) {
                        linkedList.remove(K6);
                        if (K6 == i7) {
                            break;
                        }
                        K6--;
                    }
                }
            }
            linkedList.addLast(new C0982f(view2, view, p6.d.o(c5)));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C0980d.b(boolean, boolean):boolean");
    }

    public final void c() {
        this.f12276b.f11021e = false;
        C0983g c0983g = this.f12283k;
        if (c0983g != null) {
            c0983g.f12270r = true;
        }
        this.f12283k = null;
        C0981e c0981e = this.f12282j;
        if (c0981e != null) {
            c0981e.f12270r = true;
        }
        this.f12282j = null;
    }

    public final void d(int i7, int i8, boolean z7) {
        DpadRecyclerView dpadRecyclerView;
        DpadRecyclerView dpadRecyclerView2;
        DpadRecyclerView dpadRecyclerView3;
        U u7 = this.f12275a;
        View t5 = u7.t(i7);
        boolean W = u7.W();
        h5.d dVar = this.f12276b;
        if (!W && t5 != null && (dpadRecyclerView3 = this.f12281i) != null && !dpadRecyclerView3.isLayoutRequested()) {
            dVar.getClass();
            if (h5.d.d(t5) == i7) {
                g(i7, i8, t5, z7);
                return;
            }
        }
        boolean z8 = this.d.f10162s;
        C0658c c0658c = this.f12278e;
        if (!z8) {
            c0658c.j(i7, i8);
            c0658c.f10170e = Integer.MIN_VALUE;
        } else if (z7 && (dpadRecyclerView2 = this.f12281i) != null && !dpadRecyclerView2.isLayoutRequested()) {
            c0658c.j(i7, i8);
            c0658c.f10170e = Integer.MIN_VALUE;
            if (!dVar.f11022g) {
                Log.w("DpadRecyclerView", "smooth scrolling is not supported when there are no views in the layout");
                return;
            }
            DpadRecyclerView dpadRecyclerView4 = this.f12281i;
            if (dpadRecyclerView4 != null) {
                u7.V0(new C0981e(dpadRecyclerView4, i7, i8, dVar, this.f12277c, this.f12286o));
                dVar.f11021e = true;
            }
        } else {
            if (u7.W()) {
                c();
                DpadRecyclerView dpadRecyclerView5 = this.f12281i;
                if (dpadRecyclerView5 != null) {
                    dpadRecyclerView5.u0();
                }
            }
            if (t5 != null && (dpadRecyclerView = this.f12281i) != null && !dpadRecyclerView.isLayoutRequested()) {
                dVar.getClass();
                if (h5.d.d(t5) == i7) {
                    g(i7, i8, t5, z7);
                    return;
                }
            }
            if (c0658c.j(i7, i8)) {
                c0658c.f10170e = Integer.MIN_VALUE;
                c0658c.f = true;
                u7.H0();
            }
        }
    }

    public final void f(View view, View view2, boolean z7, boolean z8) {
        int d;
        boolean z9;
        int i7;
        int i8;
        DpadRecyclerView dpadRecyclerView;
        h5.d dVar = this.f12276b;
        if (view == null) {
            d = -1;
        } else {
            dVar.getClass();
            d = h5.d.d(view);
        }
        if (d == -1) {
            return;
        }
        C0700a c0700a = this.f12277c;
        c0700a.getClass();
        if (view != null && view2 != null) {
            ((h5.d) c0700a.d).g(view);
        }
        C0658c c0658c = this.f12278e;
        int i9 = 0;
        boolean j7 = c0658c.j(d, 0);
        C0657b c0657b = this.d;
        if (j7) {
            c0658c.f10170e = 0;
            z9 = true;
            if (dVar.f) {
                c0658c.f = true;
                z9 = false;
            }
            if (c0657b.f10161r && (dpadRecyclerView = this.f12281i) != null) {
                dpadRecyclerView.invalidate();
            }
        } else {
            z9 = false;
        }
        if (view == null) {
            return;
        }
        if (view2 != null && z8) {
            c0658c.d(view2);
        } else if (z8) {
            c0658c.d(view);
        }
        if (c0657b.f10155k) {
            int c5 = c0700a.c(view, view2);
            if (c5 != 0 && !dVar.f) {
                if (dVar.f11019b.b()) {
                    i8 = c5;
                    i7 = 0;
                } else {
                    i7 = c5;
                    i8 = 0;
                }
                if (z7) {
                    DpadRecyclerView dpadRecyclerView2 = this.f12281i;
                    if (dpadRecyclerView2 != null) {
                        dpadRecyclerView2.n0(i8, i7, false);
                    }
                } else {
                    DpadRecyclerView dpadRecyclerView3 = this.f12281i;
                    if (dpadRecyclerView3 != null) {
                        dpadRecyclerView3.scrollBy(i8, i7);
                    }
                }
            }
            i9 = c5;
        }
        if (z9) {
            c0658c.a();
            if (i9 == 0) {
                c0658c.b();
            }
        }
    }

    public final void g(int i7, int i8, View view, boolean z7) {
        this.f12279g = true;
        C0700a c0700a = this.f12277c;
        c0700a.getClass();
        ((h5.d) c0700a.d).g(view);
        if (i8 != 0) {
            Log.w("DpadRecyclerView", "Subposition " + i7 + " doesn't exist for position " + i7 + ",scroll instead started for subposition 0");
        }
        f(view, null, z7, this.f12275a.S());
        this.f12279g = false;
    }
}
