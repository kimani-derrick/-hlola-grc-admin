package z3;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
/* renamed from: z3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514a extends android.support.v4.media.session.b {
    public final /* synthetic */ BottomSheetBehavior d;

    public C1514a(BottomSheetBehavior bottomSheetBehavior) {
        this.d = bottomSheetBehavior;
    }

    @Override // android.support.v4.media.session.b
    public final boolean E0(View view, int i7) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.d;
        int i8 = bottomSheetBehavior.F;
        if (i8 == 1 || bottomSheetBehavior.f8764T) {
            return false;
        }
        if (i8 == 3 && bottomSheetBehavior.f8762R == i7) {
            WeakReference weakReference = bottomSheetBehavior.f8759O;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference weakReference2 = bottomSheetBehavior.f8758N;
        if (weakReference2 == null || weakReference2.get() != view) {
            return false;
        }
        return true;
    }

    @Override // android.support.v4.media.session.b
    public final int n0() {
        BottomSheetBehavior bottomSheetBehavior = this.d;
        if (bottomSheetBehavior.f8748C) {
            return bottomSheetBehavior.f8757M;
        }
        return bottomSheetBehavior.f8746A;
    }

    @Override // android.support.v4.media.session.b
    public final int r(View view, int i7) {
        return view.getLeft();
    }

    @Override // android.support.v4.media.session.b
    public final int s(View view, int i7) {
        int i8;
        BottomSheetBehavior bottomSheetBehavior = this.d;
        int w7 = bottomSheetBehavior.w();
        if (bottomSheetBehavior.f8748C) {
            i8 = bottomSheetBehavior.f8757M;
        } else {
            i8 = bottomSheetBehavior.f8746A;
        }
        if (i7 < w7) {
            return w7;
        }
        if (i7 > i8) {
            return i8;
        }
        return i7;
    }

    @Override // android.support.v4.media.session.b
    public final void u0(int i7) {
        if (i7 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior.f8750E) {
                bottomSheetBehavior.z(1);
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final void v0(View view, int i7, int i8) {
        this.d.u(i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (java.lang.Math.abs(r6.getTop() - r4.w()) < java.lang.Math.abs(r6.getTop() - r4.f8788y)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        if (java.lang.Math.abs(r7 - r4.f8788y) < java.lang.Math.abs(r7 - r4.f8746A)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (java.lang.Math.abs(r7 - r4.f8787x) < java.lang.Math.abs(r7 - r4.f8746A)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cc, code lost:
        if (r7 < java.lang.Math.abs(r7 - r4.f8746A)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r4.f8746A)) goto L29;
     */
    @Override // android.support.v4.media.session.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w0(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C1514a.w0(android.view.View, float, float):void");
    }
}
