package a6;

import java.util.Arrays;
import z5.C1530l;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: q  reason: collision with root package name */
    public d[] f5196q;

    /* renamed from: r  reason: collision with root package name */
    public int f5197r;

    /* renamed from: s  reason: collision with root package name */
    public int f5198s;

    public final d b() {
        d dVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f5196q;
                if (dVarArr == null) {
                    dVarArr = d();
                    this.f5196q = dVarArr;
                } else if (this.f5197r >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    M5.g.e(copyOf, "copyOf(this, newSize)");
                    this.f5196q = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i7 = this.f5198s;
                do {
                    dVar = dVarArr[i7];
                    if (dVar == null) {
                        dVar = c();
                        dVarArr[i7] = dVar;
                    }
                    i7++;
                    if (i7 >= dVarArr.length) {
                        i7 = 0;
                    }
                } while (!dVar.a(this));
                this.f5198s = i7;
                this.f5197r++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public abstract d c();

    public abstract d[] d();

    public final void e(d dVar) {
        int i7;
        D5.d[] b7;
        synchronized (this) {
            try {
                int i8 = this.f5197r - 1;
                this.f5197r = i8;
                if (i8 == 0) {
                    this.f5198s = 0;
                }
                M5.g.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b7 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (D5.d dVar2 : b7) {
            if (dVar2 != null) {
                dVar2.m(C1530l.f16479a);
            }
        }
    }
}
