package m;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public c f12366q;

    /* renamed from: r  reason: collision with root package name */
    public c f12367r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f12368s;

    public b(c cVar, c cVar2, int i7) {
        this.f12368s = i7;
        this.f12366q = cVar2;
        this.f12367r = cVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        c cVar2 = null;
        if (this.f12366q == cVar && cVar == this.f12367r) {
            this.f12367r = null;
            this.f12366q = null;
        }
        c cVar3 = this.f12366q;
        if (cVar3 == cVar) {
            this.f12366q = b(cVar3);
        }
        c cVar4 = this.f12367r;
        if (cVar4 == cVar) {
            c cVar5 = this.f12366q;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVar2 = c(cVar4);
            }
            this.f12367r = cVar2;
        }
    }

    public final c b(c cVar) {
        switch (this.f12368s) {
            case 0:
                return cVar.f12372t;
            default:
                return cVar.f12371s;
        }
    }

    public final c c(c cVar) {
        switch (this.f12368s) {
            case 0:
                return cVar.f12371s;
            default:
                return cVar.f12372t;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12367r != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f12367r;
        c cVar3 = this.f12366q;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = c(cVar2);
        } else {
            cVar = null;
        }
        this.f12367r = cVar;
        return cVar2;
    }
}
