package N3;

import java.util.Objects;
/* loaded from: classes.dex */
public final class n implements l {

    /* renamed from: q  reason: collision with root package name */
    public volatile l f2512q;

    /* renamed from: r  reason: collision with root package name */
    public volatile boolean f2513r;

    /* renamed from: s  reason: collision with root package name */
    public Object f2514s;

    @Override // N3.l
    public final Object get() {
        if (!this.f2513r) {
            synchronized (this) {
                try {
                    if (!this.f2513r) {
                        l lVar = this.f2512q;
                        Objects.requireNonNull(lVar);
                        Object obj = lVar.get();
                        this.f2514s = obj;
                        this.f2513r = true;
                        this.f2512q = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f2514s;
    }

    public final String toString() {
        Object obj = this.f2512q;
        if (obj == null) {
            String valueOf = String.valueOf(this.f2514s);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
