package O3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* renamed from: O3.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0080y {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f2713a;

    /* renamed from: b  reason: collision with root package name */
    public int f2714b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2715c;

    public AbstractC0080y() {
        AbstractC0072p.c("initialCapacity", 4);
        this.f2713a = new Object[4];
        this.f2714b = 0;
    }

    public static int f(int i7, int i8) {
        if (i8 >= 0) {
            int i9 = i7 + (i7 >> 1) + 1;
            if (i9 < i8) {
                i9 = Integer.highestOneBit(i8 - 1) << 1;
            }
            if (i9 < 0) {
                return Integer.MAX_VALUE;
            }
            return i9;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        g(this.f2714b + 1);
        Object[] objArr = this.f2713a;
        int i7 = this.f2714b;
        this.f2714b = i7 + 1;
        objArr[i7] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        AbstractC0072p.b(length, objArr);
        g(this.f2714b + length);
        System.arraycopy(objArr, 0, this.f2713a, this.f2714b, length);
        this.f2714b += length;
    }

    public abstract AbstractC0080y c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    public final void e(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            g(list2.size() + this.f2714b);
            if (list2 instanceof AbstractC0081z) {
                this.f2714b = ((AbstractC0081z) list2).c(this.f2714b, this.f2713a);
                return;
            }
        }
        for (Object obj : list) {
            c(obj);
        }
    }

    public final void g(int i7) {
        Object[] objArr = this.f2713a;
        if (objArr.length < i7) {
            this.f2713a = Arrays.copyOf(objArr, f(objArr.length, i7));
        } else if (this.f2715c) {
            this.f2713a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f2715c = false;
    }
}
