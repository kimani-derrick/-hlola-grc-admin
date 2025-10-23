package c1;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* renamed from: c1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388b {

    /* renamed from: a  reason: collision with root package name */
    public final long f7236a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7237b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7238c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7239e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7240g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7241h;

    /* renamed from: i  reason: collision with root package name */
    public final String f7242i;

    public C0388b(long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        g.f(str, "title");
        g.f(str2, "mediaType");
        g.f(str3, "posterUrl");
        g.f(str4, "backdropUrl");
        g.f(str5, "releaseDate");
        g.f(str6, "countries");
        g.f(str7, "genres");
        this.f7236a = j7;
        this.f7237b = str;
        this.f7238c = str2;
        this.d = str3;
        this.f7239e = str4;
        this.f = str5;
        this.f7240g = str6;
        this.f7241h = str7;
        this.f7242i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0388b)) {
            return false;
        }
        C0388b c0388b = (C0388b) obj;
        if (this.f7236a == c0388b.f7236a && g.a(this.f7237b, c0388b.f7237b) && g.a(this.f7238c, c0388b.f7238c) && g.a(this.d, c0388b.d) && g.a(this.f7239e, c0388b.f7239e) && g.a(this.f, c0388b.f) && g.a(this.f7240g, c0388b.f7240g) && g.a(this.f7241h, c0388b.f7241h) && g.a(this.f7242i, c0388b.f7242i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7236a;
        return this.f7242i.hashCode() + AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(((int) (j7 ^ (j7 >>> 32))) * 31, 31, this.f7237b), 31, this.f7238c), 31, this.d), 31, this.f7239e), 31, this.f), 31, this.f7240g), 31, this.f7241h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryEntity(movieId=");
        sb.append(this.f7236a);
        sb.append(", title=");
        sb.append(this.f7237b);
        sb.append(", mediaType=");
        sb.append(this.f7238c);
        sb.append(", posterUrl=");
        sb.append(this.d);
        sb.append(", backdropUrl=");
        sb.append(this.f7239e);
        sb.append(", releaseDate=");
        sb.append(this.f);
        sb.append(", countries=");
        sb.append(this.f7240g);
        sb.append(", genres=");
        sb.append(this.f7241h);
        sb.append(", viewDate=");
        return AbstractC1111a.t(sb, this.f7242i, ")");
    }
}
