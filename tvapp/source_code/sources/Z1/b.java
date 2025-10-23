package Z1;

import c2.C0391b;
import java.util.Map;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0391b f4545a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f4546b;

    public b(C0391b c0391b, Map map) {
        if (c0391b != null) {
            this.f4545a = c0391b;
            if (map != null) {
                this.f4546b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final long a(Q1.c cVar, long j7, int i7) {
        long j8;
        long a7 = j7 - this.f4545a.a();
        c cVar2 = (c) this.f4546b.get(cVar);
        long j9 = cVar2.f4547a;
        int i8 = i7 - 1;
        if (j9 > 1) {
            j8 = j9;
        } else {
            j8 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i8) * j9 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j8 * i8))), a7), cVar2.f4548b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4545a.equals(bVar.f4545a) && this.f4546b.equals(bVar.f4546b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4545a.hashCode() ^ 1000003) * 1000003) ^ this.f4546b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4545a + ", values=" + this.f4546b + "}";
    }
}
