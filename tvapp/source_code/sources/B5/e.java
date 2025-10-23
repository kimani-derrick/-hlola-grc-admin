package B5;

import K.C0025a;
import K.C0026b;
import K.O;
import android.os.Build;
import android.view.View;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0531i;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: q  reason: collision with root package name */
    public int f292q;

    /* renamed from: r  reason: collision with root package name */
    public int f293r;

    /* renamed from: s  reason: collision with root package name */
    public int f294s;

    /* renamed from: t  reason: collision with root package name */
    public Object f295t;

    public e(int i7) {
        switch (i7) {
            case 3:
                this.f293r = 100;
                this.f294s = Integer.MAX_VALUE;
                return;
            default:
                if (J3.e.f1330s == null) {
                    J3.e.f1330s = new J3.e(13);
                    return;
                }
                return;
        }
    }

    public static int d(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long e(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static C0531i l(byte[] bArr, int i7, int i8, boolean z7) {
        C0531i c0531i = new C0531i(bArr, i7, i8, z7);
        try {
            c0531i.n(i8);
            return c0531i;
        } catch (B e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public void G(View view, Object obj) {
        C0026b c0026b;
        if (Build.VERSION.SDK_INT >= this.f293r) {
            g(view, obj);
        } else if (H(h(view), obj)) {
            View.AccessibilityDelegate a7 = O.a(view);
            if (a7 == null) {
                c0026b = null;
            } else if (a7 instanceof C0025a) {
                c0026b = ((C0025a) a7).f1464a;
            } else {
                c0026b = new C0026b(a7);
            }
            if (c0026b == null) {
                c0026b = new C0026b();
            }
            O.i(view, c0026b);
            view.setTag(this.f292q, obj);
            O.d(view, this.f294s);
        }
    }

    public abstract boolean H(Object obj, Object obj2);

    public int a(int i7) {
        if (i7 < this.f294s) {
            return ((ByteBuffer) this.f295t).getShort(this.f293r + i7);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f295t).f307x == this.f294s) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract void c(int i7);

    public abstract Object f(View view);

    public abstract void g(View view, Object obj);

    public Object h(View view) {
        if (Build.VERSION.SDK_INT >= this.f293r) {
            return f(view);
        }
        Object tag = view.getTag(this.f292q);
        if (((Class) this.f295t).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public boolean hasNext() {
        if (this.f292q < ((f) this.f295t).f305v) {
            return true;
        }
        return false;
    }

    public abstract int i();

    public void j() {
        while (true) {
            int i7 = this.f292q;
            f fVar = (f) this.f295t;
            if (i7 < fVar.f305v && fVar.f302s[i7] < 0) {
                this.f292q = i7 + 1;
            } else {
                return;
            }
        }
    }

    public abstract boolean k();

    public abstract void m(int i7);

    public abstract int n(int i7);

    public abstract boolean o();

    public abstract C0529g p();

    public abstract double q();

    public abstract int r();

    public void remove() {
        b();
        if (this.f293r != -1) {
            f fVar = (f) this.f295t;
            fVar.c();
            fVar.k(this.f293r);
            this.f293r = -1;
            this.f294s = fVar.f307x;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}
