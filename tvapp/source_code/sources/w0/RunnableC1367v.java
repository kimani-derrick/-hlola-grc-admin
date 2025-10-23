package w0;

import android.os.Trace;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* renamed from: w0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1367v implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public static final ThreadLocal f15686u = new ThreadLocal();

    /* renamed from: v  reason: collision with root package name */
    public static final n5.r f15687v = new n5.r(4);

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f15688q;

    /* renamed from: r  reason: collision with root package name */
    public long f15689r;

    /* renamed from: s  reason: collision with root package name */
    public long f15690s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList f15691t;

    public static k0 c(RecyclerView recyclerView, int i7, long j7) {
        int l7 = recyclerView.f6954v.l();
        for (int i8 = 0; i8 < l7; i8++) {
            k0 N6 = RecyclerView.N(recyclerView.f6954v.k(i8));
            if (N6.f15578c == i7 && !N6.k()) {
                return null;
            }
        }
        a0 a0Var = recyclerView.f6948s;
        try {
            recyclerView.V();
            k0 l8 = a0Var.l(j7, i7);
            if (l8 != null) {
                if (l8.j() && !l8.k()) {
                    a0Var.i(l8.f15576a);
                } else {
                    a0Var.a(l8, false);
                }
            }
            recyclerView.W(false);
            return l8;
        } catch (Throwable th) {
            recyclerView.W(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.f6905J) {
            if (RecyclerView.f6880T0 && !this.f15688q.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f15689r == 0) {
                this.f15689r = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0230i c0230i = recyclerView.f6957w0;
        c0230i.f5782b = i7;
        c0230i.f5783c = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j7) {
        C1366u c1366u;
        RecyclerView recyclerView;
        long j8;
        RecyclerView recyclerView2;
        C1366u c1366u2;
        boolean z7;
        ArrayList arrayList = this.f15688q;
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i8);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0230i c0230i = recyclerView3.f6957w0;
                c0230i.d(recyclerView3, false);
                i7 += c0230i.d;
            }
        }
        ArrayList arrayList2 = this.f15691t;
        arrayList2.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i10);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0230i c0230i2 = recyclerView4.f6957w0;
                int abs = Math.abs(c0230i2.f5783c) + Math.abs(c0230i2.f5782b);
                for (int i11 = 0; i11 < c0230i2.d * 2; i11 += 2) {
                    if (i9 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c1366u2 = obj;
                    } else {
                        c1366u2 = (C1366u) arrayList2.get(i9);
                    }
                    int[] iArr = (int[]) c0230i2.f5784e;
                    int i12 = iArr[i11 + 1];
                    if (i12 <= abs) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c1366u2.f15682a = z7;
                    c1366u2.f15683b = abs;
                    c1366u2.f15684c = i12;
                    c1366u2.d = recyclerView4;
                    c1366u2.f15685e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(arrayList2, f15687v);
        for (int i13 = 0; i13 < arrayList2.size() && (recyclerView = (c1366u = (C1366u) arrayList2.get(i13)).d) != null; i13++) {
            if (c1366u.f15682a) {
                j8 = Long.MAX_VALUE;
            } else {
                j8 = j7;
            }
            k0 c5 = c(recyclerView, c1366u.f15685e, j8);
            if (c5 != null && c5.f15577b != null && c5.j() && !c5.k() && (recyclerView2 = (RecyclerView) c5.f15577b.get()) != null) {
                if (recyclerView2.f6925T && recyclerView2.f6954v.l() != 0) {
                    P p3 = recyclerView2.f6933f0;
                    if (p3 != null) {
                        p3.e();
                    }
                    U u7 = recyclerView2.f6895D;
                    a0 a0Var = recyclerView2.f6948s;
                    if (u7 != null) {
                        u7.B0(a0Var);
                        recyclerView2.f6895D.C0(a0Var);
                    }
                    a0Var.f15502a.clear();
                    a0Var.g();
                }
                C0230i c0230i3 = recyclerView2.f6957w0;
                c0230i3.d(recyclerView2, true);
                if (c0230i3.d != 0) {
                    try {
                        int i14 = G.e.f741a;
                        Trace.beginSection("RV Nested Prefetch");
                        g0 g0Var = recyclerView2.f6959x0;
                        L l7 = recyclerView2.f6893C;
                        g0Var.d = 1;
                        g0Var.f15542e = l7.a();
                        g0Var.f15543g = false;
                        g0Var.f15544h = false;
                        g0Var.f15545i = false;
                        for (int i15 = 0; i15 < c0230i3.d * 2; i15 += 2) {
                            c(recyclerView2, ((int[]) c0230i3.f5784e)[i15], j7);
                        }
                        Trace.endSection();
                        c1366u.f15682a = false;
                        c1366u.f15683b = 0;
                        c1366u.f15684c = 0;
                        c1366u.d = null;
                        c1366u.f15685e = 0;
                    } catch (Throwable th) {
                        int i16 = G.e.f741a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c1366u.f15682a = false;
            c1366u.f15683b = 0;
            c1366u.f15684c = 0;
            c1366u.d = null;
            c1366u.f15685e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = G.e.f741a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f15688q;
            if (arrayList.isEmpty()) {
                this.f15689r = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i8);
                if (recyclerView.getWindowVisibility() == 0) {
                    j7 = Math.max(recyclerView.getDrawingTime(), j7);
                }
            }
            if (j7 == 0) {
                this.f15689r = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j7) + this.f15690s);
            this.f15689r = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f15689r = 0L;
            int i9 = G.e.f741a;
            Trace.endSection();
            throw th;
        }
    }
}
