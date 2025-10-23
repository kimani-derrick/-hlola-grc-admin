package x6;
/* loaded from: classes.dex */
public final class F extends V {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16237b;

    public F(boolean z7) {
        this.f16237b = z7;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        if (obj == null) {
            return;
        }
        k5.d(obj.toString(), null, this.f16237b);
    }
}
