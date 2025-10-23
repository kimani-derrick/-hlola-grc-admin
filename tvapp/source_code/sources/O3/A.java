package O3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class A extends AbstractC0069m implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Object f2589q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f2590r;

    public A(Object obj, Object obj2) {
        this.f2589q = obj;
        this.f2590r = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2589q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2590r;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
