package L2;
/* loaded from: classes.dex */
public abstract class g implements Comparable {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f1955A;

    /* renamed from: q  reason: collision with root package name */
    public final String f1956q;

    /* renamed from: r  reason: collision with root package name */
    public final f f1957r;

    /* renamed from: s  reason: collision with root package name */
    public final long f1958s;

    /* renamed from: t  reason: collision with root package name */
    public final int f1959t;

    /* renamed from: u  reason: collision with root package name */
    public final long f1960u;

    /* renamed from: v  reason: collision with root package name */
    public final j2.i f1961v;

    /* renamed from: w  reason: collision with root package name */
    public final String f1962w;

    /* renamed from: x  reason: collision with root package name */
    public final String f1963x;

    /* renamed from: y  reason: collision with root package name */
    public final long f1964y;

    /* renamed from: z  reason: collision with root package name */
    public final long f1965z;

    public g(String str, f fVar, long j7, int i7, long j8, j2.i iVar, String str2, String str3, long j9, long j10, boolean z7) {
        this.f1956q = str;
        this.f1957r = fVar;
        this.f1958s = j7;
        this.f1959t = i7;
        this.f1960u = j8;
        this.f1961v = iVar;
        this.f1962w = str2;
        this.f1963x = str3;
        this.f1964y = j9;
        this.f1965z = j10;
        this.f1955A = z7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l7 = (Long) obj;
        long longValue = l7.longValue();
        long j7 = this.f1960u;
        if (j7 > longValue) {
            return 1;
        }
        if (j7 < l7.longValue()) {
            return -1;
        }
        return 0;
    }
}
