package O3;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class L implements Iterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2612q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final Iterator f2613r;

    public L(Iterator it) {
        it.getClass();
        this.f2613r = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2612q) {
            case 0:
                return this.f2613r.hasNext();
            default:
                return this.f2613r.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2612q) {
            case 0:
                return ((Map.Entry) this.f2613r.next()).getValue();
            default:
                return (String) this.f2613r.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2612q) {
            case 0:
                this.f2613r.remove();
                return;
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public L(s3.r rVar) {
        this.f2613r = rVar.f14215q.keySet().iterator();
    }
}
