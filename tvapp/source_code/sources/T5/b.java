package T5;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class b implements h, c {

    /* renamed from: a  reason: collision with root package name */
    public final h f3387a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3388b;

    public b(h hVar, int i7) {
        M5.g.f(hVar, "sequence");
        this.f3387a = hVar;
        this.f3388b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // T5.c
    public final h a(int i7) {
        int i8 = this.f3388b + i7;
        if (i8 < 0) {
            return new b(this, i7);
        }
        return new b(this.f3387a, i8);
    }

    @Override // T5.h
    public final Iterator iterator() {
        return new A5.b(this);
    }
}
