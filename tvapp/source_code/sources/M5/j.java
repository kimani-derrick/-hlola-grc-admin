package M5;
/* loaded from: classes.dex */
public final class j extends k implements S5.c, L5.p {
    public j(Class cls) {
        super(a.f2296q, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override // M5.b
    public final S5.a a() {
        p.f2316a.getClass();
        return this;
    }

    public final void h() {
        if (!this.f2311w) {
            S5.a g7 = g();
            if (g7 != this) {
                ((j) ((S5.c) g7)).h();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        h();
        throw null;
    }
}
