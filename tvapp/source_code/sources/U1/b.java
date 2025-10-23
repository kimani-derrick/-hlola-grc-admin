package U1;

import android.content.Context;
import c2.C0391b;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3410a;

    /* renamed from: b  reason: collision with root package name */
    public final C0391b f3411b;

    /* renamed from: c  reason: collision with root package name */
    public final C0391b f3412c;
    public final String d;

    public b(Context context, C0391b c0391b, C0391b c0391b2, String str) {
        if (context != null) {
            this.f3410a = context;
            if (c0391b != null) {
                this.f3411b = c0391b;
                if (c0391b2 != null) {
                    this.f3412c = c0391b2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f3410a.equals(((b) cVar).f3410a)) {
            b bVar = (b) cVar;
            if (this.f3411b.equals(bVar.f3411b) && this.f3412c.equals(bVar.f3412c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3410a.hashCode() ^ 1000003) * 1000003) ^ this.f3411b.hashCode()) * 1000003) ^ this.f3412c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f3410a);
        sb.append(", wallClock=");
        sb.append(this.f3411b);
        sb.append(", monotonicClock=");
        sb.append(this.f3412c);
        sb.append(", backendName=");
        return AbstractC1111a.t(sb, this.d, "}");
    }
}
