package q;
/* renamed from: q.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091a {

    /* renamed from: c  reason: collision with root package name */
    public static final C1091a f13190c;
    public static final C1091a d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13191a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f13192b;

    static {
        if (h.f13206t) {
            d = null;
            f13190c = null;
            return;
        }
        d = new C1091a(null, false);
        f13190c = new C1091a(null, true);
    }

    public C1091a(Throwable th, boolean z7) {
        this.f13191a = z7;
        this.f13192b = th;
    }
}
