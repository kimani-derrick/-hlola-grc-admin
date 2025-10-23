package O3;
/* loaded from: classes.dex */
public final class a0 extends H {

    /* renamed from: y  reason: collision with root package name */
    public static final Object[] f2646y;

    /* renamed from: z  reason: collision with root package name */
    public static final a0 f2647z;

    /* renamed from: t  reason: collision with root package name */
    public final transient Object[] f2648t;

    /* renamed from: u  reason: collision with root package name */
    public final transient int f2649u;

    /* renamed from: v  reason: collision with root package name */
    public final transient Object[] f2650v;

    /* renamed from: w  reason: collision with root package name */
    public final transient int f2651w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f2652x;

    static {
        Object[] objArr = new Object[0];
        f2646y = objArr;
        f2647z = new a0(0, 0, 0, objArr, objArr);
    }

    public a0(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        this.f2648t = objArr;
        this.f2649u = i7;
        this.f2650v = objArr2;
        this.f2651w = i8;
        this.f2652x = i9;
    }

    @Override // O3.AbstractC0081z
    public final int c(int i7, Object[] objArr) {
        Object[] objArr2 = this.f2648t;
        int i8 = this.f2652x;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // O3.AbstractC0081z, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f2650v;
            if (objArr.length != 0) {
                int q5 = AbstractC0072p.q(obj);
                while (true) {
                    int i7 = q5 & this.f2651w;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    q5 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // O3.AbstractC0081z
    public final Object[] f() {
        return this.f2648t;
    }

    @Override // O3.AbstractC0081z
    public final int g() {
        return this.f2652x;
    }

    @Override // O3.AbstractC0081z
    public final int h() {
        return 0;
    }

    @Override // O3.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2649u;
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return false;
    }

    @Override // O3.AbstractC0081z
    public final i0 n() {
        return b().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2652x;
    }

    @Override // O3.H
    public final E t() {
        return E.o(this.f2652x, this.f2648t);
    }
}
