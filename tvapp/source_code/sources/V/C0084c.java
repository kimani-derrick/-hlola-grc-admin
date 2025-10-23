package V;
/* renamed from: V.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084c extends I {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3537a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3538b;

    public C0084c(int i7, Object obj) {
        this.f3537a = obj;
        this.f3538b = i7;
    }

    public final void a() {
        int i7;
        boolean z7 = false;
        Object obj = this.f3537a;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        if (i7 == this.f3538b) {
            z7 = true;
        }
        if (z7) {
            return;
        }
        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
    }
}
