package K;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: K.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044u implements Iterator, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1506q;

    /* renamed from: r  reason: collision with root package name */
    public Iterator f1507r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f1508s;

    public C0044u(A5.b bVar) {
        this.f1506q = 0;
        this.f1508s = new ArrayList();
        this.f1507r = bVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1506q) {
            case 0:
                return this.f1507r.hasNext();
            default:
                return this.f1507r.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.f1506q) {
            case 0:
                Object next = this.f1507r.next();
                View view = (View) next;
                A5.b bVar = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    bVar = new A5.b(1, viewGroup);
                }
                ArrayList arrayList = (ArrayList) this.f1508s;
                if (bVar != null && bVar.hasNext()) {
                    arrayList.add(this.f1507r);
                    this.f1507r = bVar;
                } else {
                    while (!this.f1507r.hasNext() && (!arrayList.isEmpty())) {
                        this.f1507r = (Iterator) A5.k.b0(arrayList);
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(A5.l.K(arrayList));
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    }
                }
                return next;
            default:
                return ((T5.f) this.f1508s).f3397c.c(this.f1507r.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1506q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0044u(T5.f fVar) {
        this.f1506q = 1;
        this.f1508s = fVar;
        this.f1507r = ((T5.h) fVar.f3396b).iterator();
    }
}
