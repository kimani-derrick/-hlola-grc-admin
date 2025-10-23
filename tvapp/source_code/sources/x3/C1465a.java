package x3;

import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* renamed from: x3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465a extends b {
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f16219e = -1;
    public final /* synthetic */ SwipeDismissBehavior f;

    public C1465a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f = swipeDismissBehavior;
    }

    @Override // android.support.v4.media.session.b
    public final boolean E0(View view, int i7) {
        int i8 = this.f16219e;
        if ((i8 == -1 || i8 == i7) && this.f.r(view)) {
            return true;
        }
        return false;
    }

    @Override // android.support.v4.media.session.b
    public final int m0(View view) {
        return view.getWidth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r3.d;
        r4 = r4.getWidth() + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.d - r4.getWidth();
        r4 = r3.d;
     */
    @Override // android.support.v4.media.session.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.lang.reflect.Field r0 = K.O.f1447a
            int r0 = r4.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.f
            int r2 = r2.f8743c
            if (r2 != 0) goto L26
            if (r0 == 0) goto L1e
        L14:
            int r0 = r3.d
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.d
            goto L39
        L1e:
            int r0 = r3.d
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L39
        L26:
            if (r2 != r1) goto L2b
            if (r0 == 0) goto L14
            goto L1e
        L2b:
            int r0 = r3.d
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.d
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L39:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1465a.r(android.view.View, int):int");
    }

    @Override // android.support.v4.media.session.b
    public final int s(View view, int i7) {
        return view.getTop();
    }

    @Override // android.support.v4.media.session.b
    public final void t0(View view, int i7) {
        this.f16219e = i7;
        this.d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.support.v4.media.session.b
    public final void u0(int i7) {
        this.f.getClass();
    }

    @Override // android.support.v4.media.session.b
    public final void v0(View view, int i7, int i8) {
        SwipeDismissBehavior swipeDismissBehavior = this.f;
        float width = (view.getWidth() * swipeDismissBehavior.f8744e) + this.d;
        float width2 = (view.getWidth() * swipeDismissBehavior.f) + this.d;
        float f = i7;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.d) >= java.lang.Math.round(r9.getWidth() * r3.d)) goto L25;
     */
    @Override // android.support.v4.media.session.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f16219e = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.reflect.Field r5 = K.O.f1447a
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f8743c
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L2a:
            if (r1 <= 0) goto L5e
            goto L52
        L2d:
            if (r6 != r2) goto L5e
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L5e
            goto L52
        L34:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L39:
            int r10 = r9.getLeft()
            int r0 = r8.d
            int r10 = r10 - r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            float r1 = r3.d
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.abs(r10)
            if (r10 < r0) goto L5e
        L52:
            int r10 = r9.getLeft()
            int r0 = r8.d
            if (r10 >= r0) goto L5c
            int r0 = r0 - r11
            goto L61
        L5c:
            int r0 = r0 + r11
            goto L61
        L5e:
            int r0 = r8.d
            r2 = r4
        L61:
            T.e r10 = r3.f8741a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L77
            t3.m r10 = new t3.m
            r10.<init>(r3, r9, r2)
            java.lang.reflect.Field r11 = K.O.f1447a
            r9.postOnAnimation(r10)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C1465a.w0(android.view.View, float, float):void");
    }
}
