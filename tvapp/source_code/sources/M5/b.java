package M5;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class b implements S5.a, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public transient S5.a f2297q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f2298r;

    /* renamed from: s  reason: collision with root package name */
    public final Class f2299s;

    /* renamed from: t  reason: collision with root package name */
    public final String f2300t;

    /* renamed from: u  reason: collision with root package name */
    public final String f2301u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f2302v;

    public b(Object obj, Class cls, String str, String str2, boolean z7) {
        this.f2298r = obj;
        this.f2299s = cls;
        this.f2300t = str;
        this.f2301u = str2;
        this.f2302v = z7;
    }

    public abstract S5.a a();

    public final c d() {
        Class cls = this.f2299s;
        if (cls == null) {
            return null;
        }
        if (this.f2302v) {
            p.f2316a.getClass();
            return new i(cls);
        }
        return p.a(cls);
    }
}
