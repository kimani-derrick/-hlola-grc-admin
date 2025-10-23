package m;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public c f12373q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12374r = true;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ f f12375s;

    public d(f fVar) {
        this.f12375s = fVar;
    }

    @Override // m.e
    public final void a(c cVar) {
        boolean z7;
        c cVar2 = this.f12373q;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f12372t;
            this.f12373q = cVar3;
            if (cVar3 == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f12374r = z7;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12374r) {
            if (this.f12375s.f12376q == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f12373q;
        if (cVar == null || cVar.f12371s == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f12374r) {
            this.f12374r = false;
            cVar = this.f12375s.f12376q;
        } else {
            c cVar2 = this.f12373q;
            if (cVar2 != null) {
                cVar = cVar2.f12371s;
            } else {
                cVar = null;
            }
        }
        this.f12373q = cVar;
        return this.f12373q;
    }
}
