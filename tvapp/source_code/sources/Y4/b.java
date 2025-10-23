package Y4;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f4491a;

    /* renamed from: b  reason: collision with root package name */
    public String f4492b;

    /* renamed from: c  reason: collision with root package name */
    public String f4493c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public long f4494e;
    public byte f;

    public final c a() {
        if (this.f == 1 && this.f4491a != null && this.f4492b != null && this.f4493c != null && this.d != null) {
            return new c(this.f4491a, this.f4492b, this.f4493c, this.d, this.f4494e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4491a == null) {
            sb.append(" rolloutId");
        }
        if (this.f4492b == null) {
            sb.append(" variantId");
        }
        if (this.f4493c == null) {
            sb.append(" parameterKey");
        }
        if (this.d == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }
}
