package f4;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final i f10422b = new i(new L4.f(20));

    /* renamed from: c  reason: collision with root package name */
    public static final i f10423c = new i(new L4.f(22));

    /* renamed from: a  reason: collision with root package name */
    public final h f10424a;

    static {
        new i(new L4.f(23));
        new i(new J3.e(23));
        new i(new J3.e(21));
        new i(new J3.e(22));
        new i(new L4.f(21));
    }

    public i(j jVar) {
        h hVar;
        if (W3.a.f3937b.get()) {
            hVar = new h(jVar, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            hVar = new h(jVar, 0);
        } else {
            hVar = new h(jVar, 1);
        }
        this.f10424a = hVar;
    }
}
