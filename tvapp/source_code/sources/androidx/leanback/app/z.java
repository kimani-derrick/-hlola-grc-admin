package androidx.leanback.app;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6304a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6305b;

    public /* synthetic */ z(int i7, Object obj) {
        this.f6304a = i7;
        this.f6305b = obj;
    }

    public final void a() {
        switch (this.f6304a) {
            case 0:
                A a7 = (A) this.f6305b;
                a7.e();
                a7.b();
                return;
            case 1:
                ((A) this.f6305b).e();
                b(16, -1, -1);
                return;
            default:
                ((androidx.leanback.widget.H) this.f6305b).f15466a.b();
                return;
        }
    }

    public void b(int i7, int i8, int i9) {
        A a7 = (A) this.f6305b;
        if (i7 != 2) {
            if (i7 != 4) {
                if (i7 != 8) {
                    if (i7 == 16) {
                        a7.b();
                        return;
                    } else {
                        a7.getClass();
                        throw new IllegalArgumentException(AbstractC0515y1.l("Invalid event type ", i7));
                    }
                }
                a7.f6437a.g(i8, i9);
                return;
            }
            a7.f6437a.f(i8, i9);
            return;
        }
        a7.f6437a.d(i8, i9);
    }

    public void c(int i7, int i8) {
        switch (this.f6304a) {
            case 1:
                int i9 = ((A) this.f6305b).d;
                if (i7 <= i9) {
                    b(2, i7, Math.min(i8, (i9 - i7) + 1));
                    return;
                }
                return;
            case 2:
                ((androidx.leanback.widget.H) this.f6305b).f15466a.e(i7, i8, null);
                return;
            default:
                d(i7, i8);
                return;
        }
    }

    public final void d(int i7, int i8) {
        a();
    }

    public void e(int i7, int i8) {
        switch (this.f6304a) {
            case 1:
                A a7 = (A) this.f6305b;
                int i9 = a7.d;
                if (i7 <= i9) {
                    a7.d = i9 + i8;
                    b(4, i7, i8);
                    return;
                }
                a7.e();
                int i10 = a7.d;
                if (i10 > i9) {
                    b(4, i9 + 1, i10 - i9);
                    return;
                }
                return;
            case 2:
                ((androidx.leanback.widget.H) this.f6305b).f15466a.f(i7, i8);
                return;
            default:
                f(i7, i8);
                return;
        }
    }

    public final void f(int i7, int i8) {
        a();
    }

    public void g(int i7, int i8) {
        switch (this.f6304a) {
            case 1:
                int i9 = (i7 + i8) - 1;
                A a7 = (A) this.f6305b;
                int i10 = a7.d;
                if (i9 < i10) {
                    a7.d = i10 - i8;
                    b(8, i7, i8);
                    return;
                }
                a7.e();
                int i11 = a7.d;
                int i12 = i10 - i11;
                if (i12 > 0) {
                    b(8, Math.min(i11 + 1, i7), i12);
                    return;
                }
                return;
            case 2:
                ((androidx.leanback.widget.H) this.f6305b).f15466a.g(i7, i8);
                return;
            default:
                h(i7, i8);
                return;
        }
    }

    public final void h(int i7, int i8) {
        a();
    }
}
