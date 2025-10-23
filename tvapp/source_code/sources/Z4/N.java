package Z4;

import java.util.Locale;
import java.util.UUID;
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final Z f4779a;

    /* renamed from: b  reason: collision with root package name */
    public final L5.a f4780b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4781c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public F f4782e;

    public N() {
        Z z7 = Z.f4803a;
        M m7 = M.f4778y;
        this.f4779a = z7;
        this.f4780b = m7;
        this.f4781c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.f4780b.b()).toString();
        M5.g.e(uuid, "uuidGenerator().toString()");
        String lowerCase = U5.n.Z(uuid, "-", "").toLowerCase(Locale.ROOT);
        M5.g.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final F b() {
        F f = this.f4782e;
        if (f != null) {
            return f;
        }
        M5.g.l("currentSession");
        throw null;
    }
}
