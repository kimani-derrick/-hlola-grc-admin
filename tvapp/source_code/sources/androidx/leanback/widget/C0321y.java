package androidx.leanback.widget;

import H2.C0002c;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import m4.C0997b;
/* renamed from: androidx.leanback.widget.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321y extends w0.U {

    /* renamed from: h0  reason: collision with root package name */
    public static final Rect f6669h0 = new Rect();

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f6670i0 = new int[2];
    public AbstractC0316t F;

    /* renamed from: G  reason: collision with root package name */
    public C0318v f6676G;

    /* renamed from: I  reason: collision with root package name */
    public int f6678I;

    /* renamed from: J  reason: collision with root package name */
    public int f6679J;

    /* renamed from: K  reason: collision with root package name */
    public int f6680K;

    /* renamed from: L  reason: collision with root package name */
    public int f6681L;

    /* renamed from: M  reason: collision with root package name */
    public int f6682M;

    /* renamed from: N  reason: collision with root package name */
    public int[] f6683N;

    /* renamed from: O  reason: collision with root package name */
    public int f6684O;

    /* renamed from: P  reason: collision with root package name */
    public int f6685P;

    /* renamed from: Q  reason: collision with root package name */
    public int f6686Q;

    /* renamed from: R  reason: collision with root package name */
    public int f6687R;

    /* renamed from: S  reason: collision with root package name */
    public int f6688S;

    /* renamed from: U  reason: collision with root package name */
    public int f6690U;
    public r W;

    /* renamed from: a0  reason: collision with root package name */
    public int f6695a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f6696b0;

    /* renamed from: d0  reason: collision with root package name */
    public final O2.e f6698d0;

    /* renamed from: e0  reason: collision with root package name */
    public H f6699e0;

    /* renamed from: f0  reason: collision with root package name */
    public final P.b f6700f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Z5.n f6701g0;

    /* renamed from: q  reason: collision with root package name */
    public final AbstractC0292g f6703q;

    /* renamed from: t  reason: collision with root package name */
    public w0.g0 f6706t;

    /* renamed from: u  reason: collision with root package name */
    public int f6707u;

    /* renamed from: v  reason: collision with root package name */
    public int f6708v;

    /* renamed from: x  reason: collision with root package name */
    public int[] f6710x;

    /* renamed from: y  reason: collision with root package name */
    public w0.a0 f6711y;

    /* renamed from: p  reason: collision with root package name */
    public final int f6702p = 10;

    /* renamed from: r  reason: collision with root package name */
    public int f6704r = 0;

    /* renamed from: s  reason: collision with root package name */
    public androidx.emoji2.text.f f6705s = new w0.G(this, 0);

    /* renamed from: w  reason: collision with root package name */
    public final SparseIntArray f6709w = new SparseIntArray();

    /* renamed from: z  reason: collision with root package name */
    public int f6712z = 221696;

    /* renamed from: A  reason: collision with root package name */
    public S f6671A = null;

    /* renamed from: B  reason: collision with root package name */
    public ArrayList f6672B = null;

    /* renamed from: C  reason: collision with root package name */
    public Q f6673C = null;

    /* renamed from: D  reason: collision with root package name */
    public int f6674D = -1;

    /* renamed from: E  reason: collision with root package name */
    public int f6675E = 0;

    /* renamed from: H  reason: collision with root package name */
    public int f6677H = 0;

    /* renamed from: T  reason: collision with root package name */
    public int f6689T = 8388659;

    /* renamed from: V  reason: collision with root package name */
    public int f6691V = 1;

    /* renamed from: X  reason: collision with root package name */
    public int f6692X = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final C4.b f6693Y = new C4.b(13);

    /* renamed from: Z  reason: collision with root package name */
    public final C0002c f6694Z = new C0002c();

    /* renamed from: c0  reason: collision with root package name */
    public final int[] f6697c0 = new int[2];

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, O2.e] */
    public C0321y(AbstractC0292g abstractC0292g) {
        ?? obj = new Object();
        obj.f2559a = 0;
        obj.f2560b = 100;
        this.f6698d0 = obj;
        this.f6700f0 = new P.b(9, this);
        this.f6701g0 = new Z5.n(this);
        this.f6703q = abstractC0292g;
        this.f6679J = -1;
        if (this.f15484i) {
            this.f15484i = false;
            this.f15485j = 0;
            RecyclerView recyclerView = this.f15479b;
            if (recyclerView != null) {
                recyclerView.f6948s.n();
            }
        }
    }

    public static int a1(View view) {
        C0317u c0317u;
        if (view == null || (c0317u = (C0317u) view.getLayoutParams()) == null || c0317u.f15490a.m()) {
            return -1;
        }
        return c0317u.f15490a.e();
    }

    public static int b1(View view) {
        C0317u c0317u = (C0317u) view.getLayoutParams();
        return w0.U.E(view) + ((ViewGroup.MarginLayoutParams) c0317u).topMargin + ((ViewGroup.MarginLayoutParams) c0317u).bottomMargin;
    }

    public static int c1(View view) {
        C0317u c0317u = (C0317u) view.getLayoutParams();
        return w0.U.F(view) + ((ViewGroup.MarginLayoutParams) c0317u).leftMargin + ((ViewGroup.MarginLayoutParams) c0317u).rightMargin;
    }

    @Override // w0.U
    public final int A(w0.a0 a0Var, w0.g0 g0Var) {
        r rVar;
        if (this.f6704r == 1 && (rVar = this.W) != null) {
            return rVar.f6644e;
        }
        return super.A(a0Var, g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r4 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r6 == L.d.n.a()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        r6 = 4096;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0(w0.a0 r4, w0.g0 r5, int r6, android.os.Bundle r7) {
        /*
            r3 = this;
            int r7 = r3.f6712z
            r0 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 & r0
            r0 = 1
            if (r7 == 0) goto L5d
            r3.u1(r4, r5)
            int r4 = r3.f6712z
            r5 = 262144(0x40000, float:3.67342E-40)
            r4 = r4 & r5
            r5 = 0
            if (r4 == 0) goto L15
            r4 = r0
            goto L16
        L15:
            r4 = r5
        L16:
            int r7 = r3.f6704r
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 4096(0x1000, float:5.74E-42)
            if (r7 != 0) goto L34
            L.d r7 = L.d.f1847m
            int r7 = r7.a()
            if (r6 != r7) goto L29
            if (r4 == 0) goto L3c
            goto L46
        L29:
            L.d r7 = L.d.f1848o
            int r7 = r7.a()
            if (r6 != r7) goto L47
            if (r4 == 0) goto L46
            goto L3c
        L34:
            L.d r4 = L.d.f1846l
            int r4 = r4.a()
            if (r6 != r4) goto L3e
        L3c:
            r6 = r1
            goto L47
        L3e:
            L.d r4 = L.d.n
            int r4 = r4.a()
            if (r6 != r4) goto L47
        L46:
            r6 = r2
        L47:
            if (r6 == r2) goto L54
            if (r6 == r1) goto L4c
            goto L5a
        L4c:
            r3.p1(r5)
            r4 = -1
            r3.r1(r4, r5)
            goto L5a
        L54:
            r3.p1(r0)
            r3.r1(r0, r5)
        L5a:
            r3.m1()
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.A0(w0.a0, w0.g0, int, android.os.Bundle):boolean");
    }

    public final void A1(int i7) {
        if (i7 < 0 && i7 != -2) {
            throw new IllegalArgumentException(AbstractC0515y1.l("Invalid row height: ", i7));
        }
        this.f6681L = i7;
    }

    @Override // w0.U
    public final int B(View view) {
        return super.B(view) - ((C0317u) view.getLayoutParams()).f6658h;
    }

    @Override // w0.U
    public final void B0(w0.a0 a0Var) {
        for (int y3 = y() - 1; y3 >= 0; y3--) {
            E0(y3, a0Var);
        }
    }

    public final void B1(int i7, boolean z7) {
        if ((this.f6674D != i7 && i7 != -1) || this.f6675E != 0 || this.f6678I != 0) {
            x1(i7, 0, 0, z7);
        }
    }

    @Override // w0.U
    public final void C(View view, Rect rect) {
        super.C(view, rect);
        C0317u c0317u = (C0317u) view.getLayoutParams();
        rect.left += c0317u.f6656e;
        rect.top += c0317u.f;
        rect.right -= c0317u.f6657g;
        rect.bottom -= c0317u.f6658h;
    }

    public final void C1() {
        int y3 = y();
        for (int i7 = 0; i7 < y3; i7++) {
            D1(x(i7));
        }
    }

    @Override // w0.U
    public final int D(View view) {
        return super.D(view) + ((C0317u) view.getLayoutParams()).f6656e;
    }

    public final void D1(View view) {
        C0317u c0317u = (C0317u) view.getLayoutParams();
        c0317u.getClass();
        C0002c c0002c = this.f6694Z;
        D d = (D) c0002c.f1018s;
        c0317u.f6659i = E.a(view, d, d.f6360e);
        D d7 = (D) c0002c.f1017r;
        c0317u.f6660j = E.a(view, d7, d7.f6360e);
    }

    public final void E1() {
        int i7 = 0;
        if (y() > 0) {
            i7 = this.W.f - ((C0317u) x(0).getLayoutParams()).f15490a.f();
        }
        this.f6707u = i7;
    }

    @Override // w0.U
    public final boolean F0(RecyclerView recyclerView, View view, Rect rect, boolean z7) {
        return false;
    }

    public final void F1() {
        int i7 = this.f6712z & (-1025);
        int i8 = 0;
        if (q1(false)) {
            i8 = 1024;
        }
        int i9 = i7 | i8;
        this.f6712z = i9;
        if ((i9 & 1024) != 0) {
            Field field = K.O.f1447a;
            this.f6703q.postOnAnimation(this.f6700f0);
        }
    }

    @Override // w0.U
    public final int G(View view) {
        return super.G(view) - ((C0317u) view.getLayoutParams()).f6657g;
    }

    public final void G1() {
        int i7;
        int i8;
        int b7;
        int i9;
        boolean z7;
        boolean z8;
        int i10;
        int i11;
        int top;
        int i12;
        int top2;
        int i13;
        if (this.f6706t.b() == 0) {
            return;
        }
        if ((this.f6712z & 262144) == 0) {
            i9 = this.W.f6645g;
            i7 = this.W.f;
            i8 = this.f6706t.b() - 1;
            b7 = 0;
        } else {
            r rVar = this.W;
            int i14 = rVar.f;
            i7 = rVar.f6645g;
            i8 = 0;
            b7 = this.f6706t.b() - 1;
            i9 = i14;
        }
        if (i9 >= 0 && i7 >= 0) {
            if (i9 == i8) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i7 == b7) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i15 = Integer.MIN_VALUE;
            int i16 = Integer.MAX_VALUE;
            C4.b bVar = this.f6693Y;
            if (!z7) {
                R0 r02 = (R0) bVar.f423t;
                if (r02.f6467a == Integer.MAX_VALUE && !z8 && r02.f6468b == Integer.MIN_VALUE) {
                    return;
                }
            }
            int[] iArr = f6670i0;
            if (z7) {
                i16 = this.W.g(true, iArr);
                View t5 = t(iArr[1]);
                if (this.f6704r == 0) {
                    C0317u c0317u = (C0317u) t5.getLayoutParams();
                    c0317u.getClass();
                    top2 = t5.getLeft() + c0317u.f6656e;
                    i13 = c0317u.f6659i;
                } else {
                    C0317u c0317u2 = (C0317u) t5.getLayoutParams();
                    c0317u2.getClass();
                    top2 = t5.getTop() + c0317u2.f;
                    i13 = c0317u2.f6660j;
                }
                i10 = top2 + i13;
                ((C0317u) t5.getLayoutParams()).getClass();
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z8) {
                i15 = this.W.i(false, iArr);
                View t7 = t(iArr[1]);
                if (this.f6704r == 0) {
                    C0317u c0317u3 = (C0317u) t7.getLayoutParams();
                    c0317u3.getClass();
                    top = t7.getLeft() + c0317u3.f6656e;
                    i12 = c0317u3.f6659i;
                } else {
                    C0317u c0317u4 = (C0317u) t7.getLayoutParams();
                    c0317u4.getClass();
                    top = t7.getTop() + c0317u4.f;
                    i12 = c0317u4.f6660j;
                }
                i11 = top + i12;
            } else {
                i11 = Integer.MIN_VALUE;
            }
            ((R0) bVar.f423t).c(i15, i16, i11, i10);
        }
    }

    @Override // w0.U
    public final int H(View view) {
        return super.H(view) + ((C0317u) view.getLayoutParams()).f;
    }

    public final void H1() {
        R0 r02 = (R0) this.f6693Y.f424u;
        int i7 = r02.f6474j - this.f6680K;
        int h12 = h1() + i7;
        r02.c(i7, h12, i7, h12);
    }

    @Override // w0.U
    public final int J0(int i7, w0.a0 a0Var, w0.g0 g0Var) {
        int w12;
        if ((this.f6712z & 512) != 0 && this.W != null) {
            u1(a0Var, g0Var);
            this.f6712z = (this.f6712z & (-4)) | 2;
            if (this.f6704r == 0) {
                w12 = v1(i7);
            } else {
                w12 = w1(i7);
            }
            m1();
            this.f6712z &= -4;
            return w12;
        }
        return 0;
    }

    @Override // w0.U
    public final void K0(int i7) {
        B1(i7, false);
    }

    @Override // w0.U
    public final int L0(int i7, w0.a0 a0Var, w0.g0 g0Var) {
        int w12;
        int i8 = this.f6712z;
        if ((i8 & 512) != 0 && this.W != null) {
            this.f6712z = (i8 & (-4)) | 2;
            u1(a0Var, g0Var);
            if (this.f6704r == 1) {
                w12 = v1(i7);
            } else {
                w12 = w1(i7);
            }
            m1();
            this.f6712z &= -4;
            return w12;
        }
        return 0;
    }

    @Override // w0.U
    public final int Q(w0.a0 a0Var, w0.g0 g0Var) {
        r rVar;
        if (this.f6704r == 0 && (rVar = this.W) != null) {
            return rVar.f6644e;
        }
        return super.Q(a0Var, g0Var);
    }

    @Override // w0.U
    public final void U0(RecyclerView recyclerView, w0.g0 g0Var, int i7) {
        B1(i7, true);
    }

    @Override // w0.U
    public final void V0(w0.C c5) {
        AbstractC0316t abstractC0316t = this.F;
        if (abstractC0316t != null) {
            abstractC0316t.f6651q = true;
        }
        super.V0(c5);
        if (c5.f15448e && (c5 instanceof AbstractC0316t)) {
            AbstractC0316t abstractC0316t2 = (AbstractC0316t) c5;
            this.F = abstractC0316t2;
            if (abstractC0316t2 instanceof C0318v) {
                this.f6676G = (C0318v) abstractC0316t2;
                return;
            }
        } else {
            this.F = null;
        }
        this.f6676G = null;
    }

    @Override // w0.U
    public final boolean W0() {
        return true;
    }

    public final void X0() {
        int i7;
        r rVar = this.W;
        if ((this.f6712z & 262144) != 0) {
            i7 = (-this.f6696b0) - this.f6708v;
        } else {
            i7 = this.f6695a0 + this.f6696b0 + this.f6708v;
        }
        rVar.b(i7, false);
    }

    public final void Y0() {
        View t5;
        ArrayList arrayList;
        if (this.f6671A == null && ((arrayList = this.f6672B) == null || arrayList.size() <= 0)) {
            return;
        }
        int i7 = this.f6674D;
        if (i7 == -1) {
            t5 = null;
        } else {
            t5 = t(i7);
        }
        AbstractC0292g abstractC0292g = this.f6703q;
        if (t5 != null) {
            w0.k0 M6 = abstractC0292g.M(t5);
            S s6 = this.f6671A;
            if (s6 != null) {
                s6.b(t5);
            }
            int i8 = this.f6674D;
            int i9 = this.f6675E;
            ArrayList arrayList2 = this.f6672B;
            if (arrayList2 != null) {
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    ((T) this.f6672B.get(size)).a(abstractC0292g, M6, i8, i9);
                }
            }
        } else {
            S s7 = this.f6671A;
            if (s7 != null) {
                s7.b(null);
            }
            ArrayList arrayList3 = this.f6672B;
            if (arrayList3 != null) {
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    ((T) this.f6672B.get(size2)).a(abstractC0292g, null, -1, 0);
                }
            }
        }
        if ((this.f6712z & 3) != 1 && !abstractC0292g.isLayoutRequested()) {
            int y3 = y();
            for (int i10 = 0; i10 < y3; i10++) {
                if (x(i10).isLayoutRequested()) {
                    Field field = K.O.f1447a;
                    abstractC0292g.postOnAnimation(this.f6700f0);
                    return;
                }
            }
        }
    }

    public final void Z0() {
        View t5;
        ArrayList arrayList = this.f6672B;
        if (arrayList != null && arrayList.size() > 0) {
            int i7 = this.f6674D;
            if (i7 == -1) {
                t5 = null;
            } else {
                t5 = t(i7);
            }
            if (t5 != null) {
                this.f6703q.M(t5);
                ArrayList arrayList2 = this.f6672B;
                if (arrayList2 != null) {
                    for (int size = arrayList2.size() - 1; size >= 0; size--) {
                        ((T) this.f6672B.get(size)).getClass();
                    }
                    return;
                }
                return;
            }
            S s6 = this.f6671A;
            if (s6 != null) {
                s6.b(null);
            }
            ArrayList arrayList3 = this.f6672B;
            if (arrayList3 != null) {
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    ((T) this.f6672B.get(size2)).getClass();
                }
            }
        }
    }

    @Override // w0.U
    public final void b0(w0.L l7, w0.L l8) {
        if (l7 != null) {
            this.W = null;
            this.f6683N = null;
            this.f6712z &= -1025;
            this.f6674D = -1;
            this.f6677H = 0;
            o.i iVar = (o.i) this.f6698d0.f2561c;
            if (iVar != null) {
                iVar.r(-1);
            }
        }
        if (l8 instanceof H) {
            this.f6699e0 = (H) l8;
        } else {
            this.f6699e0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c0(androidx.recyclerview.widget.RecyclerView r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.c0(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if ((r9.f6712z & 262144) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        if ((r9.f6712z & 262144) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
        if ((r9.f6712z & 524288) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
        if ((r9.f6712z & 524288) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d1(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6704r
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 2
            r5 = 0
            r6 = 3
            r7 = 1
            r8 = 17
            if (r0 != 0) goto L2f
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r8) goto L27
            if (r10 == r3) goto L2d
            if (r10 == r2) goto L1e
            if (r10 == r1) goto L1c
            r4 = r8
            goto L2d
        L1c:
            r4 = r6
            goto L2d
        L1e:
            int r10 = r9.f6712z
            r10 = r10 & r0
            if (r10 != 0) goto L25
        L23:
            r4 = r7
            goto L2d
        L25:
            r4 = r5
            goto L2d
        L27:
            int r10 = r9.f6712z
            r10 = r10 & r0
            if (r10 != 0) goto L23
            goto L25
        L2d:
            r5 = r4
            goto L4b
        L2f:
            if (r0 != r7) goto L4a
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r8) goto L44
            if (r10 == r3) goto L4b
            if (r10 == r2) goto L3e
            if (r10 == r1) goto L3c
            goto L4a
        L3c:
            r5 = r7
            goto L4b
        L3e:
            int r10 = r9.f6712z
            r10 = r10 & r0
            if (r10 != 0) goto L2d
            goto L1c
        L44:
            int r10 = r9.f6712z
            r10 = r10 & r0
            if (r10 != 0) goto L1c
            goto L2d
        L4a:
            r5 = r8
        L4b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.d1(int):int");
    }

    public final int e1(int i7) {
        int i8 = this.f6682M;
        if (i8 != 0) {
            return i8;
        }
        int[] iArr = this.f6683N;
        if (iArr == null) {
            return 0;
        }
        return iArr[i7];
    }

    @Override // w0.U
    public final boolean f() {
        return this.f6704r == 0 || this.f6690U > 1;
    }

    public final int f1(int i7) {
        int i8 = 0;
        if ((this.f6712z & 524288) != 0) {
            for (int i9 = this.f6690U - 1; i9 > i7; i9--) {
                i8 += e1(i9) + this.f6688S;
            }
            return i8;
        }
        int i10 = 0;
        while (i8 < i7) {
            i10 += e1(i8) + this.f6688S;
            i8++;
        }
        return i10;
    }

    @Override // w0.U
    public final boolean g() {
        return this.f6704r == 1 || this.f6690U > 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013d, code lost:
        if (r3 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g1(android.view.View r13, android.view.View r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.g1(android.view.View, android.view.View, int[]):boolean");
    }

    @Override // w0.U
    public final void h0(w0.a0 a0Var, w0.g0 g0Var, L.i iVar) {
        boolean z7;
        L.d dVar;
        L.d dVar2;
        u1(a0Var, g0Var);
        int b7 = g0Var.b();
        if ((this.f6712z & 262144) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (b7 > 1 && !k1(0)) {
            if (this.f6704r == 0) {
                if (z7) {
                    dVar2 = L.d.f1848o;
                } else {
                    dVar2 = L.d.f1847m;
                }
            } else {
                dVar2 = L.d.f1846l;
            }
            iVar.b(dVar2);
            iVar.m();
        }
        if (b7 > 1 && !k1(b7 - 1)) {
            if (this.f6704r == 0) {
                if (z7) {
                    dVar = L.d.f1847m;
                } else {
                    dVar = L.d.f1848o;
                }
            } else {
                dVar = L.d.n;
            }
            iVar.b(dVar);
            iVar.m();
        }
        iVar.j(K3.f.c(Q(a0Var, g0Var), A(a0Var, g0Var), 0));
        m1();
    }

    public final int h1() {
        int i7 = (this.f6712z & 524288) != 0 ? 0 : this.f6690U - 1;
        return e1(i7) + f1(i7);
    }

    public final boolean i1() {
        return I() == 0 || this.f6703q.G(0) != null;
    }

    @Override // w0.U
    public final void j(int i7, int i8, w0.g0 g0Var, C0230i c0230i) {
        int i9;
        try {
            u1(null, g0Var);
            if (this.f6704r != 0) {
                i7 = i8;
            }
            if (y() != 0 && i7 != 0) {
                if (i7 < 0) {
                    i9 = -this.f6696b0;
                } else {
                    i9 = this.f6695a0 + this.f6696b0;
                }
                this.W.e(i9, i7, c0230i);
                m1();
            }
        } finally {
            m1();
        }
    }

    @Override // w0.U
    public final void j0(w0.a0 a0Var, w0.g0 g0Var, View view, L.i iVar) {
        L.h a7;
        B4.b k5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.W != null && (layoutParams instanceof C0317u)) {
            int e3 = ((C0317u) layoutParams).f15490a.e();
            int i7 = -1;
            if (e3 >= 0 && (k5 = this.W.k(e3)) != null) {
                i7 = k5.f259q;
            }
            if (i7 < 0) {
                return;
            }
            int i8 = e3 / this.W.f6644e;
            if (this.f6704r == 0) {
                a7 = L.h.a(false, i7, 1, i8, 1);
            } else {
                a7 = L.h.a(false, i8, 1, i7, 1);
            }
            iVar.k(a7);
        }
    }

    public final boolean j1() {
        int I6 = I();
        return I6 == 0 || this.f6703q.G(I6 - 1) != null;
    }

    @Override // w0.U
    public final void k(int i7, C0230i c0230i) {
        int i8 = this.f6703q.f6587j1;
        if (i7 != 0 && i8 != 0) {
            int max = Math.max(0, Math.min(this.f6674D - ((i8 - 1) / 2), i7 - i8));
            for (int i9 = max; i9 < i7 && i9 < max + i8; i9++) {
                c0230i.b(i9, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View k0(android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.k0(android.view.View, int):android.view.View");
    }

    public final boolean k1(int i7) {
        AbstractC0292g abstractC0292g = this.f6703q;
        w0.k0 G6 = abstractC0292g.G(i7);
        if (G6 == null) {
            return false;
        }
        View view = G6.f15576a;
        return view.getLeft() >= 0 && view.getRight() <= abstractC0292g.getWidth() && view.getTop() >= 0 && view.getBottom() <= abstractC0292g.getHeight();
    }

    @Override // w0.U
    public final void l0(RecyclerView recyclerView, int i7, int i8) {
        r rVar;
        int i9;
        int i10 = this.f6674D;
        if (i10 != -1 && (rVar = this.W) != null && rVar.f >= 0 && (i9 = this.f6677H) != Integer.MIN_VALUE && i7 <= i10 + i9) {
            this.f6677H = i9 + i8;
        }
        o.i iVar = (o.i) this.f6698d0.f2561c;
        if (iVar != null) {
            iVar.r(-1);
        }
    }

    public final void l1(View view, int i7, int i8, int i9, int i10) {
        int c12;
        int i11;
        int e12;
        if (this.f6704r == 0) {
            c12 = b1(view);
        } else {
            c12 = c1(view);
        }
        int i12 = this.f6682M;
        if (i12 > 0) {
            c12 = Math.min(c12, i12);
        }
        int i13 = this.f6689T;
        int i14 = i13 & 112;
        if ((this.f6712z & 786432) != 0) {
            i11 = Gravity.getAbsoluteGravity(i13 & 8388615, 1);
        } else {
            i11 = i13 & 7;
        }
        int i15 = this.f6704r;
        if ((i15 != 0 || i14 != 48) && (i15 != 1 || i11 != 3)) {
            if ((i15 == 0 && i14 == 80) || (i15 == 1 && i11 == 5)) {
                e12 = e1(i7) - c12;
            } else if ((i15 == 0 && i14 == 16) || (i15 == 1 && i11 == 1)) {
                e12 = (e1(i7) - c12) / 2;
            }
            i10 += e12;
        }
        int i16 = c12 + i10;
        if (this.f6704r != 0) {
            int i17 = i10;
            i10 = i8;
            i8 = i17;
            i16 = i9;
            i9 = i16;
        }
        C0317u c0317u = (C0317u) view.getLayoutParams();
        w0.U.X(view, i8, i10, i9, i16);
        Rect rect = f6669h0;
        super.C(view, rect);
        int i18 = i8 - rect.left;
        int i19 = i10 - rect.top;
        int i20 = rect.right - i9;
        c0317u.f6656e = i18;
        c0317u.f = i19;
        c0317u.f6657g = i20;
        c0317u.f6658h = rect.bottom - i16;
        D1(view);
    }

    @Override // w0.U
    public final void m0(RecyclerView recyclerView) {
        this.f6677H = 0;
        o.i iVar = (o.i) this.f6698d0.f2561c;
        if (iVar != null) {
            iVar.r(-1);
        }
    }

    public final void m1() {
        this.f6711y = null;
        this.f6706t = null;
        this.f6707u = 0;
        this.f6708v = 0;
    }

    @Override // w0.U
    public final void n0(RecyclerView recyclerView, int i7, int i8) {
        int i9;
        int i10;
        int i11 = this.f6674D;
        if (i11 != -1 && (i9 = this.f6677H) != Integer.MIN_VALUE) {
            int i12 = i11 + i9;
            if (i7 <= i12 && i12 < i7 + 1) {
                this.f6677H = (i8 - i7) + i9;
            } else {
                if (i7 < i12 && i8 > i12 - 1) {
                    i10 = i9 - 1;
                } else if (i7 > i12 && i8 < i12) {
                    i10 = i9 + 1;
                }
                this.f6677H = i10;
            }
        }
        o.i iVar = (o.i) this.f6698d0.f2561c;
        if (iVar != null) {
            iVar.r(-1);
        }
    }

    public final void n1(View view) {
        int childMeasureSpec;
        int i7;
        C0317u c0317u = (C0317u) view.getLayoutParams();
        Rect rect = f6669h0;
        e(view, rect);
        int i8 = ((ViewGroup.MarginLayoutParams) c0317u).leftMargin + ((ViewGroup.MarginLayoutParams) c0317u).rightMargin + rect.left + rect.right;
        int i9 = ((ViewGroup.MarginLayoutParams) c0317u).topMargin + ((ViewGroup.MarginLayoutParams) c0317u).bottomMargin + rect.top + rect.bottom;
        int makeMeasureSpec = this.f6681L == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.f6682M, 1073741824);
        if (this.f6704r == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i8, ((ViewGroup.MarginLayoutParams) c0317u).width);
            i7 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i9, ((ViewGroup.MarginLayoutParams) c0317u).height);
        } else {
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i9, ((ViewGroup.MarginLayoutParams) c0317u).height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i8, ((ViewGroup.MarginLayoutParams) c0317u).width);
            i7 = childMeasureSpec2;
        }
        view.measure(childMeasureSpec, i7);
    }

    @Override // w0.U
    public final void o0(RecyclerView recyclerView, int i7, int i8) {
        r rVar;
        int i9;
        int i10;
        int i11 = this.f6674D;
        if (i11 != -1 && (rVar = this.W) != null && rVar.f >= 0 && (i9 = this.f6677H) != Integer.MIN_VALUE && i7 <= (i10 = i11 + i9)) {
            if (i7 + i8 > i10) {
                this.f6674D = (i7 - i10) + i9 + i11;
                this.f6677H = Integer.MIN_VALUE;
            } else {
                this.f6677H = i9 - i8;
            }
        }
        o.i iVar = (o.i) this.f6698d0.f2561c;
        if (iVar != null) {
            iVar.r(-1);
        }
    }

    public final void o1() {
        int i7;
        r rVar = this.W;
        if ((this.f6712z & 262144) != 0) {
            i7 = this.f6695a0 + this.f6696b0 + this.f6708v;
        } else {
            i7 = (-this.f6696b0) - this.f6708v;
        }
        rVar.m(i7, false);
    }

    @Override // w0.U
    public final void p0(int i7, int i8) {
        int i9;
        int i10 = i8 + i7;
        while (i7 < i10) {
            O2.e eVar = this.f6698d0;
            o.i iVar = (o.i) eVar.f2561c;
            if (iVar != null) {
                synchronized (((C0997b) iVar.f12806g)) {
                    i9 = iVar.f12804c;
                }
                if (i9 != 0) {
                    ((o.i) eVar.f2561c).n(Integer.toString(i7));
                }
            }
            i7++;
        }
    }

    public final void p1(boolean z7) {
        int i7;
        if (z7) {
            if (j1()) {
                return;
            }
        } else if (i1()) {
            return;
        }
        C0318v c0318v = this.f6676G;
        boolean z8 = true;
        if (c0318v == null) {
            this.f6703q.u0();
            if (z7) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            if (this.f6690U <= 1) {
                z8 = false;
            }
            C0318v c0318v2 = new C0318v(this, i7, z8);
            this.f6677H = 0;
            V0(c0318v2);
            return;
        }
        C0321y c0321y = c0318v.f6663u;
        if (z7) {
            int i8 = c0318v.f6662t;
            if (i8 < c0321y.f6702p) {
                c0318v.f6662t = i8 + 1;
                return;
            }
            return;
        }
        int i9 = c0318v.f6662t;
        if (i9 > (-c0321y.f6702p)) {
            c0318v.f6662t = i9 - 1;
        }
    }

    public final boolean q1(boolean z7) {
        O2.e[] j7;
        O2.e eVar;
        int i7;
        int i8;
        int c12;
        if (this.f6682M != 0 || this.f6683N == null) {
            return false;
        }
        r rVar = this.W;
        if (rVar == null) {
            j7 = null;
        } else {
            j7 = rVar.j(rVar.f, rVar.f6645g);
        }
        boolean z8 = false;
        int i9 = -1;
        for (int i10 = 0; i10 < this.f6690U; i10++) {
            if (j7 == null) {
                eVar = null;
            } else {
                eVar = j7[i10];
            }
            if (eVar == null) {
                i7 = 0;
            } else {
                i7 = eVar.f2559a & eVar.f2560b;
            }
            int i11 = -1;
            for (int i12 = 0; i12 < i7; i12 += 2) {
                int g7 = eVar.g(i12 + 1);
                for (int g8 = eVar.g(i12); g8 <= g7; g8++) {
                    View t5 = t(g8 - this.f6707u);
                    if (t5 != null) {
                        if (z7) {
                            n1(t5);
                        }
                        if (this.f6704r == 0) {
                            c12 = b1(t5);
                        } else {
                            c12 = c1(t5);
                        }
                        if (c12 > i11) {
                            i11 = c12;
                        }
                    }
                }
            }
            int b7 = this.f6706t.b();
            AbstractC0292g abstractC0292g = this.f6703q;
            if (!abstractC0292g.f6907K && z7 && i11 < 0 && b7 > 0) {
                if (i9 < 0) {
                    int i13 = this.f6674D;
                    if (i13 < 0) {
                        i13 = 0;
                    } else if (i13 >= b7) {
                        i13 = b7 - 1;
                    }
                    if (y() > 0) {
                        int f = abstractC0292g.M(x(0)).f();
                        int f7 = abstractC0292g.M(x(y() - 1)).f();
                        if (i13 >= f && i13 <= f7) {
                            i13 = i13 - f <= f7 - i13 ? f - 1 : f7 + 1;
                            if (i13 < 0 && f7 < b7 - 1) {
                                i13 = f7 + 1;
                            } else if (i13 >= b7 && f > 0) {
                                i13 = f - 1;
                            }
                        }
                    }
                    if (i13 >= 0 && i13 < b7) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                        View d = this.f6711y.d(i13);
                        int[] iArr = this.f6697c0;
                        if (d != null) {
                            C0317u c0317u = (C0317u) d.getLayoutParams();
                            Rect rect = f6669h0;
                            e(d, rect);
                            d.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, M() + L() + ((ViewGroup.MarginLayoutParams) c0317u).leftMargin + ((ViewGroup.MarginLayoutParams) c0317u).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) c0317u).width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, K() + N() + ((ViewGroup.MarginLayoutParams) c0317u).topMargin + ((ViewGroup.MarginLayoutParams) c0317u).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) c0317u).height));
                            iArr[0] = c1(d);
                            iArr[1] = b1(d);
                            this.f6711y.i(d);
                        }
                        if (this.f6704r == 0) {
                            i8 = iArr[1];
                        } else {
                            i8 = iArr[0];
                        }
                        i9 = i8;
                    }
                }
                if (i9 >= 0) {
                    i11 = i9;
                }
            }
            if (i11 < 0) {
                i11 = 0;
            }
            int[] iArr2 = this.f6683N;
            if (iArr2[i10] != i11) {
                iArr2[i10] = i11;
                z8 = true;
            }
        }
        return z8;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 432
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // w0.U
    public final void r0(w0.a0 r26, w0.g0 r27) {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.r0(w0.a0, w0.g0):void");
    }

    public final int r1(int i7, boolean z7) {
        int i8;
        int i9;
        int i10;
        B4.b k5;
        r rVar = this.W;
        if (rVar == null) {
            return i7;
        }
        int i11 = this.f6674D;
        if (i11 != -1 && (k5 = rVar.k(i11)) != null) {
            i8 = k5.f259q;
        } else {
            i8 = -1;
        }
        int y3 = y();
        View view = null;
        for (int i12 = 0; i12 < y3 && i7 != 0; i12++) {
            if (i7 > 0) {
                i9 = i12;
            } else {
                i9 = (y3 - 1) - i12;
            }
            View x7 = x(i9);
            if (x7.getVisibility() == 0 && (!S() || x7.hasFocusable())) {
                int a12 = a1(x(i9));
                B4.b k7 = this.W.k(a12);
                if (k7 == null) {
                    i10 = -1;
                } else {
                    i10 = k7.f259q;
                }
                if (i8 == -1) {
                    i11 = a12;
                    view = x7;
                    i8 = i10;
                } else if (i10 == i8 && ((i7 > 0 && a12 > i11) || (i7 < 0 && a12 < i11))) {
                    i7 = i7 > 0 ? i7 - 1 : i7 + 1;
                    i11 = a12;
                    view = x7;
                }
            }
        }
        if (view != null) {
            if (z7) {
                if (S()) {
                    this.f6712z |= 32;
                    view.requestFocus();
                    this.f6712z &= -33;
                }
                this.f6674D = i11;
                this.f6675E = 0;
            } else {
                y1(view, view.findFocus(), true, 0, 0);
            }
        }
        return i7;
    }

    public final void s1() {
        int i7;
        int i8 = this.f6712z;
        if ((65600 & i8) == 65536) {
            r rVar = this.W;
            int i9 = this.f6674D;
            if ((i8 & 262144) != 0) {
                i7 = -this.f6696b0;
            } else {
                i7 = this.f6695a0 + this.f6696b0;
            }
            while (true) {
                int i10 = rVar.f6645g;
                if (i10 < rVar.f || i10 <= i9) {
                    break;
                } else if (!rVar.f6643c) {
                    if (rVar.f6642b.s(i10) < i7) {
                        break;
                    }
                    rVar.f6642b.C(rVar.f6645g);
                    rVar.f6645g--;
                } else if (rVar.f6642b.s(i10) > i7) {
                    break;
                } else {
                    rVar.f6642b.C(rVar.f6645g);
                    rVar.f6645g--;
                }
            }
            if (rVar.f6645g < rVar.f) {
                rVar.f6645g = -1;
                rVar.f = -1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(w0.a0 r7, w0.g0 r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.t0(w0.a0, w0.g0, int, int):void");
    }

    public final void t1() {
        int i7;
        int i8 = this.f6712z;
        if ((65600 & i8) == 65536) {
            r rVar = this.W;
            int i9 = this.f6674D;
            if ((i8 & 262144) != 0) {
                i7 = this.f6695a0 + this.f6696b0;
            } else {
                i7 = -this.f6696b0;
            }
            while (true) {
                int i10 = rVar.f6645g;
                int i11 = rVar.f;
                if (i10 < i11 || i11 >= i9) {
                    break;
                }
                int u7 = rVar.f6642b.u(i11);
                if (!rVar.f6643c) {
                    if (rVar.f6642b.s(rVar.f) + u7 > i7) {
                        break;
                    }
                    rVar.f6642b.C(rVar.f);
                    rVar.f++;
                } else if (rVar.f6642b.s(rVar.f) - u7 < i7) {
                    break;
                } else {
                    rVar.f6642b.C(rVar.f);
                    rVar.f++;
                }
            }
            if (rVar.f6645g < rVar.f) {
                rVar.f6645g = -1;
                rVar.f = -1;
            }
        }
    }

    @Override // w0.U
    public final w0.V u() {
        return new w0.V(-2, -2);
    }

    @Override // w0.U
    public final boolean u0(RecyclerView recyclerView, View view, View view2) {
        if ((this.f6712z & 32768) == 0 && a1(view) != -1 && (this.f6712z & 35) == 0) {
            y1(view, view2, true, 0, 0);
        }
        return true;
    }

    public final void u1(w0.a0 a0Var, w0.g0 g0Var) {
        if (this.f6711y != null || this.f6706t != null) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f6711y = a0Var;
        this.f6706t = g0Var;
        this.f6707u = 0;
        this.f6708v = 0;
    }

    @Override // w0.U
    public final w0.V v(Context context, AttributeSet attributeSet) {
        return new w0.V(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r7 <= r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r7 >= r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r7 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v1(int r7) {
        /*
            r6 = this;
            int r0 = r6.f6712z
            r1 = r0 & 64
            r2 = 1
            if (r1 != 0) goto L32
            r0 = r0 & 3
            if (r0 == r2) goto L32
            C4.b r0 = r6.f6693Y
            if (r7 <= 0) goto L20
            java.lang.Object r0 = r0.f423t
            androidx.leanback.widget.R0 r0 = (androidx.leanback.widget.R0) r0
            int r1 = r0.f6467a
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L1b
            goto L32
        L1b:
            int r0 = r0.f6469c
            if (r7 <= r0) goto L32
            goto L31
        L20:
            if (r7 >= 0) goto L32
            java.lang.Object r0 = r0.f423t
            androidx.leanback.widget.R0 r0 = (androidx.leanback.widget.R0) r0
            int r1 = r0.f6468b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r3) goto L2d
            goto L32
        L2d:
            int r0 = r0.d
            if (r7 >= r0) goto L32
        L31:
            r7 = r0
        L32:
            r0 = 0
            if (r7 != 0) goto L36
            return r0
        L36:
            int r1 = -r7
            int r3 = r6.y()
            int r4 = r6.f6704r
            if (r4 != r2) goto L4c
            r4 = r0
        L40:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.x(r4)
            r5.offsetTopAndBottom(r1)
            int r4 = r4 + 1
            goto L40
        L4c:
            r4 = r0
        L4d:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.x(r4)
            r5.offsetLeftAndRight(r1)
            int r4 = r4 + 1
            goto L4d
        L59:
            int r1 = r6.f6712z
            r1 = r1 & 3
            if (r1 != r2) goto L63
            r6.G1()
            return r7
        L63:
            int r1 = r6.y()
            int r3 = r6.f6712z
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L71
            if (r7 <= 0) goto L77
            goto L73
        L71:
            if (r7 >= 0) goto L77
        L73:
            r6.o1()
            goto L7a
        L77:
            r6.X0()
        L7a:
            int r3 = r6.y()
            if (r3 <= r1) goto L82
            r1 = r2
            goto L83
        L82:
            r1 = r0
        L83:
            int r3 = r6.y()
            int r5 = r6.f6712z
            r4 = r4 & r5
            if (r4 == 0) goto L8f
            if (r7 <= 0) goto L95
            goto L91
        L8f:
            if (r7 >= 0) goto L95
        L91:
            r6.s1()
            goto L98
        L95:
            r6.t1()
        L98:
            int r4 = r6.y()
            if (r4 >= r3) goto L9f
            goto La0
        L9f:
            r2 = r0
        La0:
            r0 = r1 | r2
            if (r0 == 0) goto La7
            r6.F1()
        La7:
            androidx.leanback.widget.g r0 = r6.f6703q
            r0.invalidate()
            r6.G1()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.v1(int):int");
    }

    @Override // w0.U
    public final w0.V w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0317u) {
            return new w0.V((w0.V) ((C0317u) layoutParams));
        }
        if (layoutParams instanceof w0.V) {
            return new w0.V((w0.V) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new w0.V((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new w0.V(layoutParams);
    }

    @Override // w0.U
    public final void w0(Parcelable parcelable) {
        if (!(parcelable instanceof C0320x)) {
            return;
        }
        C0320x c0320x = (C0320x) parcelable;
        this.f6674D = c0320x.f6664q;
        this.f6677H = 0;
        Bundle bundle = c0320x.f6665r;
        O2.e eVar = this.f6698d0;
        o.i iVar = (o.i) eVar.f2561c;
        if (iVar != null && bundle != null) {
            iVar.r(-1);
            for (String str : bundle.keySet()) {
                ((o.i) eVar.f2561c).m(str, bundle.getSparseParcelableArray(str));
            }
        }
        this.f6712z |= 256;
        H0();
    }

    public final int w1(int i7) {
        int i8 = 0;
        if (i7 == 0) {
            return 0;
        }
        int i9 = -i7;
        int y3 = y();
        if (this.f6704r == 0) {
            while (i8 < y3) {
                x(i8).offsetTopAndBottom(i9);
                i8++;
            }
        } else {
            while (i8 < y3) {
                x(i8).offsetLeftAndRight(i9);
                i8++;
            }
        }
        this.f6680K += i7;
        H1();
        this.f6703q.invalidate();
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, androidx.leanback.widget.x] */
    @Override // w0.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Parcelable x0() {
        /*
            r8 = this;
            androidx.leanback.widget.x r0 = new androidx.leanback.widget.x
            r0.<init>()
            android.os.Bundle r1 = android.os.Bundle.EMPTY
            r0.f6665r = r1
            int r1 = r8.f6674D
            r0.f6664q = r1
            O2.e r1 = r8.f6698d0
            java.lang.Object r2 = r1.f2561c
            o.i r2 = (o.i) r2
            if (r2 == 0) goto L54
            java.lang.Object r3 = r2.f12806g
            m4.b r3 = (m4.C0997b) r3
            monitor-enter(r3)
            int r2 = r2.f12804c     // Catch: java.lang.Throwable -> L51
            monitor-exit(r3)
            if (r2 != 0) goto L20
            goto L54
        L20:
            java.lang.Object r2 = r1.f2561c
            o.i r2 = (o.i) r2
            java.util.LinkedHashMap r2 = r2.q()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            r3.putSparseParcelableArray(r5, r4)
            goto L35
        L51:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L54:
            r3 = 0
        L55:
            int r2 = r8.y()
            r4 = 0
        L5a:
            if (r4 >= r2) goto L84
            android.view.View r5 = r8.x(r4)
            int r6 = a1(r5)
            r7 = -1
            if (r6 == r7) goto L81
            int r7 = r1.f2559a
            if (r7 == 0) goto L81
            java.lang.String r6 = java.lang.Integer.toString(r6)
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            r5.saveHierarchyState(r7)
            if (r3 != 0) goto L7e
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L7e:
            r3.putSparseParcelableArray(r6, r7)
        L81:
            int r4 = r4 + 1
            goto L5a
        L84:
            r0.f6665r = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0321y.x0():android.os.Parcelable");
    }

    public final void x1(int i7, int i8, int i9, boolean z7) {
        this.f6678I = i9;
        View t5 = t(i7);
        boolean z8 = !W();
        AbstractC0292g abstractC0292g = this.f6703q;
        if (z8 && !abstractC0292g.isLayoutRequested() && t5 != null && a1(t5) == i7) {
            this.f6712z |= 32;
            y1(t5, t5.findFocus(), z7, 0, 0);
        } else {
            int i10 = this.f6712z;
            if ((i10 & 512) != 0 && (i10 & 64) == 0) {
                if (z7 && !abstractC0292g.isLayoutRequested()) {
                    this.f6674D = i7;
                    this.f6675E = i8;
                    this.f6677H = Integer.MIN_VALUE;
                    if (this.W != null) {
                        C0315s c0315s = new C0315s(this);
                        c0315s.f15445a = i7;
                        V0(c0315s);
                        int i11 = c0315s.f15445a;
                        if (i11 != this.f6674D) {
                            this.f6674D = i11;
                            this.f6675E = 0;
                            return;
                        }
                        return;
                    }
                    Log.w("GridLayoutManager:" + abstractC0292g.getId(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                if (!z8) {
                    AbstractC0316t abstractC0316t = this.F;
                    if (abstractC0316t != null) {
                        abstractC0316t.f6651q = true;
                    }
                    abstractC0292g.u0();
                }
                if (!abstractC0292g.isLayoutRequested() && t5 != null && a1(t5) == i7) {
                    this.f6712z |= 32;
                    y1(t5, t5.findFocus(), z7, 0, 0);
                } else {
                    this.f6674D = i7;
                    this.f6675E = i8;
                    this.f6677H = Integer.MIN_VALUE;
                    this.f6712z |= 256;
                    H0();
                    return;
                }
            } else {
                this.f6674D = i7;
                this.f6675E = i8;
                this.f6677H = Integer.MIN_VALUE;
                return;
            }
        }
        this.f6712z &= -33;
    }

    public final void y1(View view, View view2, boolean z7, int i7, int i8) {
        if ((this.f6712z & 64) != 0) {
            return;
        }
        int a12 = a1(view);
        if (view != null && view2 != null) {
            ((C0317u) view.getLayoutParams()).getClass();
        }
        int i9 = this.f6674D;
        AbstractC0292g abstractC0292g = this.f6703q;
        if (a12 != i9 || this.f6675E != 0) {
            this.f6674D = a12;
            this.f6675E = 0;
            this.f6677H = 0;
            if ((this.f6712z & 3) != 1) {
                Y0();
            }
            if (abstractC0292g.Q()) {
                abstractC0292g.invalidate();
            }
        }
        if (view == null) {
            return;
        }
        if (!view.hasFocus() && abstractC0292g.hasFocus()) {
            view.requestFocus();
        }
        if ((this.f6712z & 131072) == 0 && z7) {
            return;
        }
        int[] iArr = f6670i0;
        if (g1(view, view2, iArr) || i7 != 0 || i8 != 0) {
            int i10 = iArr[0] + i7;
            int i11 = iArr[1] + i8;
            if ((this.f6712z & 3) == 1) {
                v1(i10);
                w1(i11);
                return;
            }
            if (this.f6704r != 0) {
                i11 = i10;
                i10 = i11;
            }
            if (z7) {
                abstractC0292g.n0(i10, i11, false);
                return;
            }
            abstractC0292g.scrollBy(i10, i11);
            Z0();
        }
    }

    public final void z1(int i7) {
        Object obj;
        if (i7 != 0 && i7 != 1) {
            return;
        }
        this.f6704r = i7;
        this.f6705s = androidx.emoji2.text.f.a(this, i7);
        C4.b bVar = this.f6693Y;
        bVar.getClass();
        R0 r02 = (R0) bVar.f421r;
        R0 r03 = (R0) bVar.f422s;
        if (i7 == 0) {
            bVar.f423t = r03;
            bVar.f424u = r02;
        } else {
            bVar.f423t = r02;
            bVar.f424u = r03;
        }
        C0002c c0002c = this.f6694Z;
        c0002c.getClass();
        if (i7 == 0) {
            obj = c0002c.f1018s;
        } else {
            obj = c0002c.f1017r;
        }
        c0002c.f1019t = (D) obj;
        this.f6712z |= 256;
    }

    @Override // w0.U
    public final void s0(w0.g0 g0Var) {
    }
}
