package B5;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class c extends e implements Iterator, N5.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f289u;

    public c(f fVar, int i7) {
        this.f289u = i7;
        M5.g.f(fVar, "map");
        this.f295t = fVar;
        this.f293r = -1;
        this.f294s = fVar.f307x;
        j();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f289u) {
            case 0:
                b();
                int i7 = this.f292q;
                f fVar = (f) this.f295t;
                if (i7 < fVar.f305v) {
                    this.f292q = i7 + 1;
                    this.f293r = i7;
                    d dVar = new d(fVar, i7);
                    j();
                    return dVar;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i8 = this.f292q;
                f fVar2 = (f) this.f295t;
                if (i8 < fVar2.f305v) {
                    this.f292q = i8 + 1;
                    this.f293r = i8;
                    Object obj = fVar2.f300q[i8];
                    j();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                b();
                int i9 = this.f292q;
                f fVar3 = (f) this.f295t;
                if (i9 < fVar3.f305v) {
                    this.f292q = i9 + 1;
                    this.f293r = i9;
                    Object[] objArr = fVar3.f301r;
                    M5.g.c(objArr);
                    Object obj2 = objArr[this.f293r];
                    j();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
