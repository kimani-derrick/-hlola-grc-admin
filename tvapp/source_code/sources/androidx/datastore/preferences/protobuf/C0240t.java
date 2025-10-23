package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240t implements P {

    /* renamed from: b  reason: collision with root package name */
    public static final C0240t f5820b = new C0240t(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5821a;

    public /* synthetic */ C0240t(int i7) {
        this.f5821a = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final boolean a(Class cls) {
        switch (this.f5821a) {
            case 0:
                return AbstractC0243w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final C0221a0 b(Class cls) {
        switch (this.f5821a) {
            case 0:
                if (AbstractC0243w.class.isAssignableFrom(cls)) {
                    try {
                        return (C0221a0) AbstractC0243w.e(cls.asSubclass(AbstractC0243w.class)).d(3);
                    } catch (Exception e3) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
