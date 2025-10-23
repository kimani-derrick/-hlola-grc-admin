package w0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class J implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15463q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15464r;

    public /* synthetic */ J(RecyclerView recyclerView, int i7) {
        this.f15463q = i7;
        this.f15464r = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        long j7;
        RecyclerView recyclerView3 = this.f15464r;
        switch (this.f15463q) {
            case 0:
                if (recyclerView3.f6909L && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.f6905J) {
                        recyclerView3.requestLayout();
                        return;
                    } else if (recyclerView3.f6915O) {
                        recyclerView3.f6913N = true;
                        return;
                    } else {
                        recyclerView3.o();
                        return;
                    }
                }
                return;
            default:
                P p3 = recyclerView3.f6933f0;
                if (p3 != null) {
                    C1359m c1359m = (C1359m) p3;
                    ArrayList arrayList = c1359m.f15599h;
                    boolean z7 = !arrayList.isEmpty();
                    ArrayList arrayList2 = c1359m.f15601j;
                    boolean z8 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c1359m.f15602k;
                    boolean z9 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c1359m.f15600i;
                    boolean z10 = !arrayList4.isEmpty();
                    if (!z7 && !z8 && !z10 && !z9) {
                        recyclerView2 = recyclerView3;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j8 = c1359m.d;
                            if (hasNext) {
                                k0 k0Var = (k0) it.next();
                                View view = k0Var.f15576a;
                                ViewPropertyAnimator animate = view.animate();
                                c1359m.f15607q.add(k0Var);
                                animate.setDuration(j8).alpha(0.0f).setListener(new C1354h(c1359m, k0Var, animate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (z8) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1359m.f15604m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1353g runnableC1353g = new RunnableC1353g(c1359m, arrayList5, 0);
                                    if (z7) {
                                        View view2 = ((C1358l) arrayList5.get(0)).f15592a.f15576a;
                                        Field field = K.O.f1447a;
                                        view2.postOnAnimationDelayed(runnableC1353g, j8);
                                    } else {
                                        runnableC1353g.run();
                                    }
                                }
                                if (z9) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1359m.n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1353g runnableC1353g2 = new RunnableC1353g(c1359m, arrayList6, 1);
                                    if (z7) {
                                        View view3 = ((C1357k) arrayList6.get(0)).f15571a.f15576a;
                                        Field field2 = K.O.f1447a;
                                        view3.postOnAnimationDelayed(runnableC1353g2, j8);
                                    } else {
                                        runnableC1353g2.run();
                                    }
                                }
                                if (z10) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1359m.f15603l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1353g runnableC1353g3 = new RunnableC1353g(c1359m, arrayList7, 2);
                                    if (!z7 && !z8 && !z9) {
                                        runnableC1353g3.run();
                                    } else {
                                        long j9 = 0;
                                        if (!z7) {
                                            j8 = 0;
                                        }
                                        if (z8) {
                                            j7 = c1359m.f15472e;
                                        } else {
                                            j7 = 0;
                                        }
                                        if (z9) {
                                            j9 = c1359m.f;
                                        }
                                        long max = Math.max(j7, j9) + j8;
                                        View view4 = ((k0) arrayList7.get(0)).f15576a;
                                        Field field3 = K.O.f1447a;
                                        view4.postOnAnimationDelayed(runnableC1353g3, max);
                                    }
                                }
                            }
                        }
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.f6896D0 = false;
                return;
        }
    }
}
