package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: o.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1048a implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public int f12779q;

    /* renamed from: r  reason: collision with root package name */
    public int f12780r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12781s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f12782t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f12783u;

    public C1048a(int i7) {
        this.f12779q = i7;
    }

    public final Object a(int i7) {
        switch (this.f12782t) {
            case 0:
                return ((C1052e) this.f12783u).f(i7);
            case 1:
                return ((C1052e) this.f12783u).i(i7);
            default:
                return ((C1053f) this.f12783u).f12794r[i7];
        }
    }

    public final void b(int i7) {
        switch (this.f12782t) {
            case 0:
                ((C1052e) this.f12783u).g(i7);
                return;
            case 1:
                ((C1052e) this.f12783u).g(i7);
                return;
            default:
                ((C1053f) this.f12783u).b(i7);
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12780r < this.f12779q) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a7 = a(this.f12780r);
            this.f12780r++;
            this.f12781s = true;
            return a7;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f12781s) {
            int i7 = this.f12780r - 1;
            this.f12780r = i7;
            b(i7);
            this.f12779q--;
            this.f12781s = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.".toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1048a(C1052e c1052e, int i7) {
        this(c1052e.f12809s);
        this.f12782t = i7;
        this.f12783u = c1052e;
        switch (i7) {
            case 1:
                this(c1052e.f12809s);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1048a(C1053f c1053f) {
        this(c1053f.f12795s);
        this.f12782t = 2;
        this.f12783u = c1053f;
    }
}
