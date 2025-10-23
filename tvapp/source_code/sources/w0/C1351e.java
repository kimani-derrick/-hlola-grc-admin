package w0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import k.C0852F;
/* renamed from: w0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351e {

    /* renamed from: h  reason: collision with root package name */
    public static final ExecutorC1350d f15520h = new ExecutorC1350d(0);

    /* renamed from: a  reason: collision with root package name */
    public final F f15521a;

    /* renamed from: b  reason: collision with root package name */
    public final t2.i f15522b;

    /* renamed from: e  reason: collision with root package name */
    public List f15524e;

    /* renamed from: g  reason: collision with root package name */
    public int f15525g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorC1350d f15523c = f15520h;

    public C1351e(C0852F c0852f, t2.i iVar) {
        this.f15521a = c0852f;
        this.f15522b = iVar;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((D) it.next()).f15458a.getClass();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i7 = this.f15525g + 1;
        this.f15525g = i7;
        List list2 = this.f15524e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        F f = this.f15521a;
        if (list == null) {
            int size = list2.size();
            this.f15524e = null;
            this.f = Collections.emptyList();
            f.h(0, size);
            a(runnable);
        } else if (list2 == null) {
            this.f15524e = list;
            this.f = Collections.unmodifiableList(list);
            f.i(0, list.size());
            a(runnable);
        } else {
            ((Executor) this.f15522b.f14556r).execute(new RunnableC1349c(this, list2, list, i7, runnable));
        }
    }
}
