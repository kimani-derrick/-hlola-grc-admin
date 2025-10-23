package k6;

import M5.g;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f12212a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12213b;

    /* renamed from: c  reason: collision with root package name */
    public c f12214c;
    public long d;

    public a(String str, boolean z7) {
        g.f(str, "name");
        this.f12212a = str;
        this.f12213b = z7;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f12212a;
    }
}
