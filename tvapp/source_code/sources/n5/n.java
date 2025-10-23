package n5;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class n implements Closeable {

    /* renamed from: q  reason: collision with root package name */
    public int f12703q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f12704r;

    /* renamed from: s  reason: collision with root package name */
    public String[] f12705s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f12706t;

    public abstract String O();

    public abstract int V();

    public final void W(int i7) {
        int i8 = this.f12703q;
        int[] iArr = this.f12704r;
        if (i8 == iArr.length) {
            if (i8 != 256) {
                this.f12704r = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f12705s;
                this.f12705s = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f12706t;
                this.f12706t = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new RuntimeException("Nesting too deep at " + j());
            }
        }
        int[] iArr3 = this.f12704r;
        int i9 = this.f12703q;
        this.f12703q = i9 + 1;
        iArr3[i9] = i7;
    }

    public abstract int X(androidx.fragment.app.D d);

    public abstract void Y();

    public abstract void Z();

    public abstract void a();

    public final void a0(String str) {
        throw new IOException(str + " at path " + j());
    }

    public abstract void b();

    public abstract void f();

    public abstract void h();

    public final String j() {
        return AbstractC1043D.c(this.f12703q, this.f12704r, this.f12705s, this.f12706t);
    }

    public abstract boolean n();

    public abstract double r();

    public abstract int x();

    public abstract void y();
}
