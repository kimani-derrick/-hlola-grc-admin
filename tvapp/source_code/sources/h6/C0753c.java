package h6;

import java.util.concurrent.TimeUnit;
/* renamed from: h6.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753c {
    public static final C0753c n = new C0753c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o  reason: collision with root package name */
    public static final C0753c f11128o;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11129a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11130b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11131c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11132e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11133g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11134h;

    /* renamed from: i  reason: collision with root package name */
    public final int f11135i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11136j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11137k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f11138l;

    /* renamed from: m  reason: collision with root package name */
    public String f11139m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        M5.g.f(timeUnit, "timeUnit");
        int i7 = Integer.MAX_VALUE;
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i7 = (int) seconds;
        }
        f11128o = new C0753c(false, false, -1, -1, false, false, false, i7, -1, true, false, false, null);
    }

    public C0753c(boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str) {
        this.f11129a = z7;
        this.f11130b = z8;
        this.f11131c = i7;
        this.d = i8;
        this.f11132e = z9;
        this.f = z10;
        this.f11133g = z11;
        this.f11134h = i9;
        this.f11135i = i10;
        this.f11136j = z12;
        this.f11137k = z13;
        this.f11138l = z14;
        this.f11139m = str;
    }

    public final String toString() {
        String str = this.f11139m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f11129a) {
                sb.append("no-cache, ");
            }
            if (this.f11130b) {
                sb.append("no-store, ");
            }
            int i7 = this.f11131c;
            if (i7 != -1) {
                sb.append("max-age=");
                sb.append(i7);
                sb.append(", ");
            }
            int i8 = this.d;
            if (i8 != -1) {
                sb.append("s-maxage=");
                sb.append(i8);
                sb.append(", ");
            }
            if (this.f11132e) {
                sb.append("private, ");
            }
            if (this.f) {
                sb.append("public, ");
            }
            if (this.f11133g) {
                sb.append("must-revalidate, ");
            }
            int i9 = this.f11134h;
            if (i9 != -1) {
                sb.append("max-stale=");
                sb.append(i9);
                sb.append(", ");
            }
            int i10 = this.f11135i;
            if (i10 != -1) {
                sb.append("min-fresh=");
                sb.append(i10);
                sb.append(", ");
            }
            if (this.f11136j) {
                sb.append("only-if-cached, ");
            }
            if (this.f11137k) {
                sb.append("no-transform, ");
            }
            if (this.f11138l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            M5.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            this.f11139m = sb2;
            return sb2;
        }
        return str;
    }
}
