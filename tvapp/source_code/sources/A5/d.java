package A5;

import java.util.RandomAccess;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {

    /* renamed from: q  reason: collision with root package name */
    public final e f123q;

    /* renamed from: r  reason: collision with root package name */
    public final int f124r;

    /* renamed from: s  reason: collision with root package name */
    public final int f125s;

    public d(e eVar, int i7, int i8) {
        M5.g.f(eVar, "list");
        this.f123q = eVar;
        this.f124r = i7;
        h4.b.f(i7, i8, eVar.b());
        this.f125s = i8 - i7;
    }

    @Override // A5.e
    public final int b() {
        return this.f125s;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f125s;
        if (i7 >= 0 && i7 < i8) {
            return this.f123q.get(this.f124r + i7);
        }
        throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "index: ", ", size: "));
    }
}
