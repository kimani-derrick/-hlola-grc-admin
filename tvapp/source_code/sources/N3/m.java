package N3;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class m implements l, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final l f2509q;

    /* renamed from: r  reason: collision with root package name */
    public volatile transient boolean f2510r;

    /* renamed from: s  reason: collision with root package name */
    public transient Object f2511s;

    public m(l lVar) {
        this.f2509q = lVar;
    }

    @Override // N3.l
    public final Object get() {
        if (!this.f2510r) {
            synchronized (this) {
                try {
                    if (!this.f2510r) {
                        Object obj = this.f2509q.get();
                        this.f2511s = obj;
                        this.f2510r = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f2511s;
    }

    public final String toString() {
        Object obj;
        if (this.f2510r) {
            String valueOf = String.valueOf(this.f2511s);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f2509q;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
