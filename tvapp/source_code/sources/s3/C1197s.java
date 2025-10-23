package s3;
/* renamed from: s3.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197s {

    /* renamed from: a  reason: collision with root package name */
    public final String f14224a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14225b;

    /* renamed from: c  reason: collision with root package name */
    public final long f14226c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14227e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f14228g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f14229h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f14230i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f14231j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f14232k;

    public C1197s(long j7, String str, String str2) {
        this(str, str2, 0L, 0L, 0L, j7, 0L, null, null, null, null);
    }

    public final C1197s a(Long l7, Long l8, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new C1197s(this.f14224a, this.f14225b, this.f14226c, this.d, this.f14227e, this.f, this.f14228g, this.f14229h, l7, l8, bool2);
    }

    public C1197s(String str, String str2, long j7, long j8, long j9, long j10, long j11, Long l7, Long l8, Long l9, Boolean bool) {
        g3.n.c(str);
        g3.n.c(str2);
        g3.n.a(j7 >= 0);
        g3.n.a(j8 >= 0);
        g3.n.a(j9 >= 0);
        g3.n.a(j11 >= 0);
        this.f14224a = str;
        this.f14225b = str2;
        this.f14226c = j7;
        this.d = j8;
        this.f14227e = j9;
        this.f = j10;
        this.f14228g = j11;
        this.f14229h = l7;
        this.f14230i = l8;
        this.f14231j = l9;
        this.f14232k = bool;
    }
}
