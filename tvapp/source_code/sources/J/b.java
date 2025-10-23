package J;

import M5.g;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1268b;

    /* renamed from: c  reason: collision with root package name */
    public int f1269c;

    public b() {
        this.f1267a = 1;
        this.f1268b = new Object[256];
    }

    public Object a() {
        switch (this.f1267a) {
            case 0:
                int i7 = this.f1269c;
                if (i7 <= 0) {
                    return null;
                }
                int i8 = i7 - 1;
                Object[] objArr = this.f1268b;
                Object obj = objArr[i8];
                g.d(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i8] = null;
                this.f1269c--;
                return obj;
            default:
                int i9 = this.f1269c;
                if (i9 <= 0) {
                    return null;
                }
                int i10 = i9 - 1;
                Object[] objArr2 = this.f1268b;
                Object obj2 = objArr2[i10];
                objArr2[i10] = null;
                this.f1269c = i9 - 1;
                return obj2;
        }
    }

    public void b(s.c cVar) {
        int i7 = this.f1269c;
        Object[] objArr = this.f1268b;
        if (i7 < objArr.length) {
            objArr[i7] = cVar;
            this.f1269c = i7 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z7;
        g.f(obj, "instance");
        int i7 = this.f1269c;
        int i8 = 0;
        while (true) {
            objArr = this.f1268b;
            if (i8 < i7) {
                if (objArr[i8] == obj) {
                    z7 = true;
                    break;
                }
                i8++;
            } else {
                z7 = false;
                break;
            }
        }
        if (!z7) {
            int i9 = this.f1269c;
            if (i9 >= objArr.length) {
                return false;
            }
            objArr[i9] = obj;
            this.f1269c = i9 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!".toString());
    }

    public b(int i7) {
        this.f1267a = 0;
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f1268b = new Object[i7];
    }
}
