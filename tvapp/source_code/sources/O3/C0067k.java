package O3;

import java.util.List;
import java.util.ListIterator;
/* renamed from: O3.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067k extends C0059c implements ListIterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0068l f2676u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067k(C0068l c0068l) {
        super(c0068l);
        this.f2676u = c0068l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0068l c0068l = this.f2676u;
        boolean isEmpty = c0068l.isEmpty();
        b().add(obj);
        c0068l.f2682v.f2618u++;
        if (isEmpty) {
            c0068l.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f2656r;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067k(C0068l c0068l, int i7) {
        super(c0068l, ((List) c0068l.f2678r).listIterator(i7));
        this.f2676u = c0068l;
    }
}
