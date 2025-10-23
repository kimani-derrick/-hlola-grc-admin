package w0;

import K.C0040p;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a  reason: collision with root package name */
    public K f15469a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f15470b;

    /* renamed from: c  reason: collision with root package name */
    public long f15471c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f15472e;
    public long f;

    public static void b(k0 k0Var) {
        int i7 = k0Var.f15583j;
        if (!k0Var.k() && (i7 & 4) == 0) {
            k0Var.d();
        }
    }

    public abstract boolean a(k0 k0Var, k0 k0Var2, C0040p c0040p, C0040p c0040p2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(w0.k0 r10) {
        /*
            r9 = this;
            w0.K r0 = r9.f15469a
            if (r0 == 0) goto Lb5
            r1 = 1
            r10.s(r1)
            w0.k0 r2 = r10.f15581h
            r3 = 0
            if (r2 == 0) goto L13
            w0.k0 r2 = r10.f15582i
            if (r2 != 0) goto L13
            r10.f15581h = r3
        L13:
            r10.f15582i = r3
            int r2 = r10.f15583j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto Lb5
        L1d:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f15465q
            r0.p0()
            Z2.h r2 = r0.f6954v
            java.lang.Object r3 = r2.f4637t
            M2.e r3 = (M2.e) r3
            java.lang.Object r4 = r2.f4636s
            w0.K r4 = (w0.K) r4
            int r5 = r2.f4635r
            r6 = 0
            android.view.View r7 = r10.f15576a
            if (r5 != r1) goto L43
            java.lang.Object r1 = r2.f4639v
            android.view.View r1 = (android.view.View) r1
            if (r1 != r7) goto L3b
        L39:
            r1 = r6
            goto L6c
        L3b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L43:
            r8 = 2
            if (r5 == r8) goto Lad
            r2.f4635r = r8     // Catch: java.lang.Throwable -> L57
            androidx.recyclerview.widget.RecyclerView r5 = r4.f15465q     // Catch: java.lang.Throwable -> L57
            int r5 = r5.indexOfChild(r7)     // Catch: java.lang.Throwable -> L57
            r8 = -1
            if (r5 != r8) goto L59
            r2.q(r7)     // Catch: java.lang.Throwable -> L57
        L54:
            r2.f4635r = r6
            goto L6c
        L57:
            r10 = move-exception
            goto Laa
        L59:
            boolean r8 = r3.y(r5)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L69
            r3.B(r5)     // Catch: java.lang.Throwable -> L57
            r2.q(r7)     // Catch: java.lang.Throwable -> L57
            r4.i(r5)     // Catch: java.lang.Throwable -> L57
            goto L54
        L69:
            r2.f4635r = r6
            goto L39
        L6c:
            if (r1 == 0) goto L99
            w0.k0 r2 = androidx.recyclerview.widget.RecyclerView.N(r7)
            w0.a0 r3 = r0.f6948s
            r3.m(r2)
            r3.j(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.U0
            if (r2 == 0) goto L99
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L99:
            r2 = r1 ^ 1
            r0.s0(r2)
            if (r1 != 0) goto Lb5
            boolean r10 = r10.o()
            if (r10 == 0) goto Lb5
            r0.removeDetachedView(r7, r6)
            goto Lb5
        Laa:
            r2.f4635r = r6
            throw r10
        Lad:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.P.c(w0.k0):void");
    }

    public abstract void d(k0 k0Var);

    public abstract void e();

    public abstract boolean f();
}
