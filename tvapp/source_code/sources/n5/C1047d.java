package n5;

import java.lang.reflect.Method;
/* renamed from: n5.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047d extends AbstractC1043D {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Method f12688k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f12689l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Class f12690m;

    public C1047d(Method method, Object obj, Class cls) {
        this.f12688k = method;
        this.f12689l = obj;
        this.f12690m = cls;
    }

    @Override // n5.AbstractC1043D
    public final Object e() {
        return this.f12688k.invoke(this.f12689l, this.f12690m);
    }

    public final String toString() {
        return this.f12690m.getName();
    }
}
