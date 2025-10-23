package x6;

import java.util.Objects;
/* loaded from: classes.dex */
public final class B extends V {

    /* renamed from: b  reason: collision with root package name */
    public final String f16227b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1480m f16228c;

    public B(String str) {
        C1468a c1468a = C1468a.f16299r;
        Objects.requireNonNull(str, "name == null");
        this.f16227b = str;
        this.f16228c = c1468a;
    }

    @Override // x6.V
    public final void a(K k5, Object obj) {
        String str;
        if (obj == null || (str = (String) this.f16228c.o(obj)) == null) {
            return;
        }
        k5.b(this.f16227b, str);
    }
}
