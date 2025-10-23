package R5;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class b implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final int f2925q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2926r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2927s;

    /* renamed from: t  reason: collision with root package name */
    public int f2928t;

    public b(int i7, int i8, int i9) {
        this.f2925q = i9;
        this.f2926r = i8;
        boolean z7 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z7 = true;
        }
        this.f2927s = z7;
        this.f2928t = z7 ? i7 : i8;
    }

    public final int a() {
        int i7 = this.f2928t;
        if (i7 == this.f2926r) {
            if (this.f2927s) {
                this.f2927s = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f2928t = this.f2925q + i7;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2927s;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
