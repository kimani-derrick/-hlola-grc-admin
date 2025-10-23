package P;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f2731a;

    /* renamed from: b  reason: collision with root package name */
    public int f2732b;

    /* renamed from: c  reason: collision with root package name */
    public float f2733c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public long f2734e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f2735g;

    /* renamed from: h  reason: collision with root package name */
    public float f2736h;

    /* renamed from: i  reason: collision with root package name */
    public int f2737i;

    public final float a(long j7) {
        long j8 = this.f2734e;
        if (j7 < j8) {
            return 0.0f;
        }
        long j9 = this.f2735g;
        if (j9 >= 0 && j7 >= j9) {
            float f = this.f2736h;
            return (h.b(((float) (j7 - j9)) / this.f2737i, 0.0f, 1.0f) * f) + (1.0f - f);
        }
        return h.b(((float) (j7 - j8)) / this.f2731a, 0.0f, 1.0f) * 0.5f;
    }
}
