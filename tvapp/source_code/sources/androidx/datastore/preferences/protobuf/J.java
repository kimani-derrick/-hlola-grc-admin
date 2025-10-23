package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class J implements P {

    /* renamed from: a  reason: collision with root package name */
    public P[] f5703a;

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean a(Class cls) {
        for (P p3 : this.f5703a) {
            if (p3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final C0221a0 b(Class cls) {
        P[] pArr;
        for (P p3 : this.f5703a) {
            if (p3.a(cls)) {
                return p3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
