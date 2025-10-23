package O3;

import java.util.AbstractMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class V extends E {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ W f2624s;

    public V(W w7) {
        this.f2624s = w7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        W w7 = this.f2624s;
        android.support.v4.media.session.b.h(i7, w7.f2628w);
        int i8 = i7 * 2;
        int i9 = w7.f2627v;
        Object[] objArr = w7.f2626u;
        Object obj = objArr[i8 + i9];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i8 + (i9 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // O3.AbstractC0081z
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2624s.f2628w;
    }
}
