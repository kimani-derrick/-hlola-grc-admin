package O3;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class O implements N3.l, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final int f2616q;

    public O(int i7) {
        AbstractC0072p.c("expectedValuesPerKey", i7);
        this.f2616q = i7;
    }

    @Override // N3.l
    public final Object get() {
        return new ArrayList(this.f2616q);
    }
}
