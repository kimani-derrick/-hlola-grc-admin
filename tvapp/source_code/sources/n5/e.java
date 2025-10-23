package n5;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class e extends AbstractC1043D {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Method f12691k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Class f12692l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f12693m;

    public e(Method method, Class cls, int i7) {
        this.f12691k = method;
        this.f12692l = cls;
        this.f12693m = i7;
    }

    @Override // n5.AbstractC1043D
    public final Object e() {
        return this.f12691k.invoke(null, this.f12692l, Integer.valueOf(this.f12693m));
    }

    public final String toString() {
        return this.f12692l.getName();
    }
}
