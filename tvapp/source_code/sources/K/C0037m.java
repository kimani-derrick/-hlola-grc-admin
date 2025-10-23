package K;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* renamed from: K.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037m {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f1497a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f1498b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1499c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1500e;

    public C0037m(View view) {
        this.f1499c = view;
    }

    public final boolean a(float f, float f7, boolean z7) {
        ViewParent f8;
        if (!this.d || (f8 = f(0)) == null) {
            return false;
        }
        try {
            return V.a(f8, this.f1499c, f, f7, z7);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + f8 + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    public final boolean b(float f, float f7) {
        ViewParent f8;
        if (!this.d || (f8 = f(0)) == null) {
            return false;
        }
        try {
            return V.b(f8, this.f1499c, f, f7);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + f8 + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    public final boolean c(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        ViewParent f;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.d || (f = f(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f1499c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f1500e == null) {
                this.f1500e = new int[2];
            }
            iArr3 = this.f1500e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z7 = f instanceof InterfaceC0038n;
        View view2 = this.f1499c;
        if (z7) {
            ((InterfaceC0038n) f).c(view2, i7, i8, iArr3, i9);
        } else if (i9 == 0) {
            try {
                V.c(f, view2, i7, i8, iArr3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i7, int i8, int i9, int[] iArr) {
        e(0, i7, 0, i8, null, i9, iArr);
    }

    public final boolean e(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent f;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.d || (f = f(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f1499c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr2 == null) {
            if (this.f1500e == null) {
                this.f1500e = new int[2];
            }
            int[] iArr4 = this.f1500e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z7 = f instanceof InterfaceC0039o;
        View view2 = this.f1499c;
        if (z7) {
            ((InterfaceC0039o) f).d(view2, i7, i8, i9, i10, i11, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i9;
            iArr3[1] = iArr3[1] + i10;
            if (f instanceof InterfaceC0038n) {
                ((InterfaceC0038n) f).e(view2, i7, i8, i9, i10, i11);
            } else if (i11 == 0) {
                try {
                    V.d(f, view2, i7, i8, i9, i10);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e3);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i12;
            iArr[1] = iArr[1] - i13;
        }
        return true;
    }

    public final ViewParent f(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return null;
            }
            return this.f1498b;
        }
        return this.f1497a;
    }

    public final boolean g(int i7) {
        if (f(i7) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.f1499c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof K.InterfaceC0038n
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            K.n r7 = (K.InterfaceC0038n) r7
            boolean r7 = r7.f(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = K.V.f(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.f1498b = r2
            goto L37
        L35:
            r8.f1497a = r2
        L37:
            if (r4 == 0) goto L3f
            K.n r2 = (K.InterfaceC0038n) r2
            r2.a(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            K.V.e(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K.C0037m.h(int, int):boolean");
    }

    public final void i(int i7) {
        ViewParent f = f(i7);
        if (f != null) {
            boolean z7 = f instanceof InterfaceC0038n;
            View view = this.f1499c;
            if (z7) {
                ((InterfaceC0038n) f).b(view, i7);
            } else if (i7 == 0) {
                try {
                    V.g(f, view);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i7 != 0) {
                if (i7 == 1) {
                    this.f1498b = null;
                    return;
                }
                return;
            }
            this.f1497a = null;
        }
    }
}
