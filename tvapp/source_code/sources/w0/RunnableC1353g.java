package w0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: w0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1353g implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15536q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ArrayList f15537r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C1359m f15538s;

    public /* synthetic */ RunnableC1353g(C1359m c1359m, ArrayList arrayList, int i7) {
        this.f15536q = i7;
        this.f15538s = c1359m;
        this.f15537r = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        Iterator it;
        switch (this.f15536q) {
            case 0:
                ArrayList arrayList = this.f15537r;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C1359m c1359m = this.f15538s;
                    if (hasNext) {
                        C1358l c1358l = (C1358l) it2.next();
                        k0 k0Var = c1358l.f15592a;
                        c1359m.getClass();
                        View view3 = k0Var.f15576a;
                        int i7 = c1358l.d - c1358l.f15593b;
                        int i8 = c1358l.f15595e - c1358l.f15594c;
                        if (i7 != 0) {
                            view3.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view3.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view3.animate();
                        c1359m.f15606p.add(k0Var);
                        animate.setDuration(c1359m.f15472e).setListener(new C1355i(c1359m, k0Var, i7, view3, i8, animate)).start();
                    } else {
                        arrayList.clear();
                        c1359m.f15604m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f15537r;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C1359m c1359m2 = this.f15538s;
                    if (hasNext2) {
                        C1357k c1357k = (C1357k) it3.next();
                        c1359m2.getClass();
                        k0 k0Var2 = c1357k.f15571a;
                        if (k0Var2 == null) {
                            view = null;
                        } else {
                            view = k0Var2.f15576a;
                        }
                        k0 k0Var3 = c1357k.f15572b;
                        if (k0Var3 != null) {
                            view2 = k0Var3.f15576a;
                        } else {
                            view2 = null;
                        }
                        ArrayList arrayList3 = c1359m2.f15608r;
                        long j7 = c1359m2.f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j7);
                            arrayList3.add(c1357k.f15571a);
                            duration.translationX(c1357k.f15574e - c1357k.f15573c);
                            duration.translationY(c1357k.f - c1357k.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C1356j(c1359m2, c1357k, duration, view, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator animate2 = view2.animate();
                            arrayList3.add(c1357k.f15572b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j7).alpha(1.0f).setListener(new C1356j(c1359m2, c1357k, animate2, view2, 1)).start();
                        }
                        it3 = it;
                    } else {
                        arrayList2.clear();
                        c1359m2.n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f15537r;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C1359m c1359m3 = this.f15538s;
                    if (hasNext3) {
                        k0 k0Var4 = (k0) it4.next();
                        c1359m3.getClass();
                        View view4 = k0Var4.f15576a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c1359m3.f15605o.add(k0Var4);
                        animate3.alpha(1.0f).setDuration(c1359m3.f15471c).setListener(new C1354h(c1359m3, k0Var4, view4, animate3)).start();
                    } else {
                        arrayList4.clear();
                        c1359m3.f15603l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
