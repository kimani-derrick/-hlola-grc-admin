package w0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class I extends W {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f15460a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f15461b = new n0(this);

    /* renamed from: c  reason: collision with root package name */
    public G f15462c;
    public G d;

    public static int b(View view, androidx.emoji2.text.f fVar) {
        return ((fVar.c(view) / 2) + fVar.e(view)) - ((fVar.l() / 2) + fVar.k());
    }

    public static View c(U u7, androidx.emoji2.text.f fVar) {
        int y3 = u7.y();
        View view = null;
        if (y3 == 0) {
            return null;
        }
        int l7 = (fVar.l() / 2) + fVar.k();
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < y3; i8++) {
            View x7 = u7.x(i8);
            int abs = Math.abs(((fVar.c(x7) / 2) + fVar.e(x7)) - l7);
            if (abs < i7) {
                view = x7;
                i7 = abs;
            }
        }
        return view;
    }

    public final int[] a(U u7, View view) {
        int[] iArr = new int[2];
        if (u7.f()) {
            iArr[0] = b(view, d(u7));
        } else {
            iArr[0] = 0;
        }
        if (u7.g()) {
            iArr[1] = b(view, e(u7));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final androidx.emoji2.text.f d(U u7) {
        G g7 = this.d;
        if (g7 == null || ((U) g7.f5838b) != u7) {
            this.d = new G(u7, 0);
        }
        return this.d;
    }

    public final androidx.emoji2.text.f e(U u7) {
        G g7 = this.f15462c;
        if (g7 == null || ((U) g7.f5838b) != u7) {
            this.f15462c = new G(u7, 1);
        }
        return this.f15462c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.f15460a
            if (r0 != 0) goto L5
            return
        L5:
            w0.U r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r1 = r0.g()
            if (r1 == 0) goto L1b
            androidx.emoji2.text.f r1 = r4.e(r0)
        L16:
            android.view.View r1 = c(r0, r1)
            goto L27
        L1b:
            boolean r1 = r0.f()
            if (r1 == 0) goto L26
            androidx.emoji2.text.f r1 = r4.d(r0)
            goto L16
        L26:
            r1 = 0
        L27:
            if (r1 != 0) goto L2a
            return
        L2a:
            int[] r0 = r4.a(r0, r1)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != 0) goto L38
            r3 = r0[r2]
            if (r3 == 0) goto L3f
        L38:
            androidx.recyclerview.widget.RecyclerView r3 = r4.f15460a
            r0 = r0[r2]
            r3.l0(r1, r0)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.I.f():void");
    }
}
