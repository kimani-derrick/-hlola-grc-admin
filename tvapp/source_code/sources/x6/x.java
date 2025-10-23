package x6;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class x extends V {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16339b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ V f16340c;

    public /* synthetic */ x(V v5, int i7) {
        this.f16339b = i7;
        this.f16340c = v5;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        switch (this.f16339b) {
            case 0:
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object obj2 : iterable) {
                        this.f16340c.a(k5, obj2);
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i7 = 0; i7 < length; i7++) {
                        this.f16340c.a(k5, Array.get(obj, i7));
                    }
                    return;
                }
                return;
        }
    }
}
