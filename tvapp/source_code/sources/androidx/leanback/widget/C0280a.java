package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.Collection;
/* renamed from: androidx.leanback.widget.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a extends P {

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f6573c;

    public C0280a(AbstractC0281a0 abstractC0281a0) {
        super(abstractC0281a0);
        this.f6573c = new ArrayList();
        new ArrayList();
    }

    @Override // androidx.leanback.widget.P
    public final Object a(int i7) {
        return this.f6573c.get(i7);
    }

    @Override // androidx.leanback.widget.P
    public final int d() {
        return this.f6573c.size();
    }

    public final void e(int i7, Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return;
        }
        this.f6573c.addAll(i7, collection);
        this.f6437a.f(i7, size);
    }

    public final void f() {
        ArrayList arrayList = this.f6573c;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        arrayList.clear();
        this.f6437a.g(0, size);
    }

    public C0280a(q1.x xVar) {
        super(xVar);
        this.f6573c = new ArrayList();
        new ArrayList();
    }
}
