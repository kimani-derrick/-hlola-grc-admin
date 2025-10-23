package w0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public int f15564q;

    /* renamed from: r  reason: collision with root package name */
    public int f15565r;

    /* renamed from: s  reason: collision with root package name */
    public OverScroller f15566s;

    /* renamed from: t  reason: collision with root package name */
    public Interpolator f15567t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f15568u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15569v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15570w;

    public j0(RecyclerView recyclerView) {
        this.f15570w = recyclerView;
        T.d dVar = RecyclerView.f6887b1;
        this.f15567t = dVar;
        this.f15568u = false;
        this.f15569v = false;
        this.f15566s = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i7, int i8) {
        RecyclerView recyclerView = this.f15570w;
        recyclerView.setScrollState(2);
        this.f15565r = 0;
        this.f15564q = 0;
        Interpolator interpolator = this.f15567t;
        T.d dVar = RecyclerView.f6887b1;
        if (interpolator != dVar) {
            this.f15567t = dVar;
            this.f15566s = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f15566s.fling(0, 0, i7, i8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f15568u) {
            this.f15569v = true;
            return;
        }
        RecyclerView recyclerView = this.f15570w;
        recyclerView.removeCallbacks(this);
        Field field = K.O.f1447a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i7, int i8, int i9, Interpolator interpolator) {
        boolean z7;
        int height;
        RecyclerView recyclerView = this.f15570w;
        if (i9 == Integer.MIN_VALUE) {
            int abs = Math.abs(i7);
            int abs2 = Math.abs(i8);
            if (abs > abs2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z7) {
                abs = abs2;
            }
            i9 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i10 = i9;
        if (interpolator == null) {
            interpolator = RecyclerView.f6887b1;
        }
        if (this.f15567t != interpolator) {
            this.f15567t = interpolator;
            this.f15566s = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f15565r = 0;
        this.f15564q = 0;
        recyclerView.setScrollState(2);
        this.f15566s.startScroll(0, 0, i7, i8, i10);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean awakenScrollBars;
        boolean z7;
        boolean z8;
        boolean z9;
        int i11;
        RecyclerView recyclerView = this.f15570w;
        if (recyclerView.f6895D == null) {
            recyclerView.removeCallbacks(this);
            this.f15566s.abortAnimation();
            return;
        }
        this.f15569v = false;
        this.f15568u = true;
        recyclerView.o();
        OverScroller overScroller = this.f15566s;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i12 = currY - this.f15565r;
            this.f15564q = currX;
            this.f15565r = currY;
            int n = RecyclerView.n(currX - this.f15564q, recyclerView.f6929b0, recyclerView.f6931d0, recyclerView.getWidth());
            int n7 = RecyclerView.n(i12, recyclerView.f6930c0, recyclerView.f6932e0, recyclerView.getHeight());
            int[] iArr = recyclerView.f6908K0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean t5 = recyclerView.t(n, n7, 1, iArr, null);
            int[] iArr2 = recyclerView.f6908K0;
            if (t5) {
                n -= iArr2[0];
                n7 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m(n, n7);
            }
            if (recyclerView.f6893C != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.i0(n, n7, iArr2);
                int i13 = iArr2[0];
                int i14 = iArr2[1];
                int i15 = n - i13;
                int i16 = n7 - i14;
                C c5 = recyclerView.f6895D.f15481e;
                if (c5 != null && !c5.d && c5.f15448e) {
                    int b7 = recyclerView.f6959x0.b();
                    if (b7 == 0) {
                        c5.j();
                    } else {
                        if (c5.f15445a >= b7) {
                            c5.f15445a = b7 - 1;
                        }
                        c5.g(i13, i14);
                    }
                }
                i10 = i13;
                i7 = i15;
                i8 = i16;
                i9 = i14;
            } else {
                i7 = n;
                i8 = n7;
                i9 = 0;
                i10 = 0;
            }
            if (!recyclerView.f6900G.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f6908K0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i17 = i9;
            recyclerView.u(i10, i9, i7, i8, null, 1, iArr3);
            int i18 = i7 - iArr2[0];
            int i19 = i8 - iArr2[1];
            if (i10 != 0 || i17 != 0) {
                recyclerView.v(i10, i17);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!overScroller.isFinished() && ((!z7 && i18 == 0) || (!z8 && i19 == 0))) {
                z9 = false;
            } else {
                z9 = true;
            }
            C c6 = recyclerView.f6895D.f15481e;
            if ((c6 == null || !c6.d) && z9) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i18 < 0) {
                        i11 = -currVelocity;
                    } else if (i18 > 0) {
                        i11 = currVelocity;
                    } else {
                        i11 = 0;
                    }
                    if (i19 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i19 <= 0) {
                        currVelocity = 0;
                    }
                    if (i11 < 0) {
                        recyclerView.x();
                        if (recyclerView.f6929b0.isFinished()) {
                            recyclerView.f6929b0.onAbsorb(-i11);
                        }
                    } else if (i11 > 0) {
                        recyclerView.y();
                        if (recyclerView.f6931d0.isFinished()) {
                            recyclerView.f6931d0.onAbsorb(i11);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.z();
                        if (recyclerView.f6930c0.isFinished()) {
                            recyclerView.f6930c0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.w();
                        if (recyclerView.f6932e0.isFinished()) {
                            recyclerView.f6932e0.onAbsorb(currVelocity);
                        }
                    }
                    if (i11 != 0 || currVelocity != 0) {
                        Field field = K.O.f1447a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f6885Z0) {
                    C0230i c0230i = recyclerView.f6957w0;
                    int[] iArr4 = (int[]) c0230i.f5784e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0230i.d = 0;
                }
            } else {
                b();
                RunnableC1367v runnableC1367v = recyclerView.f6955v0;
                if (runnableC1367v != null) {
                    runnableC1367v.a(recyclerView, i10, i17);
                }
            }
        }
        C c7 = recyclerView.f6895D.f15481e;
        if (c7 != null && c7.d) {
            c7.g(0, 0);
        }
        this.f15568u = false;
        if (this.f15569v) {
            recyclerView.removeCallbacks(this);
            Field field2 = K.O.f1447a;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.t0(1);
    }
}
