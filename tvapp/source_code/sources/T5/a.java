package T5;

import A5.r;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f3386a;

    public a(r rVar) {
        this.f3386a = new AtomicReference(rVar);
    }

    @Override // T5.h
    public final Iterator iterator() {
        h hVar = (h) this.f3386a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
