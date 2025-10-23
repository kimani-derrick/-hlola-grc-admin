package h6;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f11174j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f11175k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f11176l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f11177m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f11178a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11179b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11180c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11181e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11182g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11183h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11184i;

    public m(String str, String str2, long j7, String str3, String str4, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f11178a = str;
        this.f11179b = str2;
        this.f11180c = j7;
        this.d = str3;
        this.f11181e = str4;
        this.f = z7;
        this.f11182g = z8;
        this.f11183h = z9;
        this.f11184i = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (M5.g.a(mVar.f11178a, this.f11178a) && M5.g.a(mVar.f11179b, this.f11179b) && mVar.f11180c == this.f11180c && M5.g.a(mVar.d, this.d) && M5.g.a(mVar.f11181e, this.f11181e) && mVar.f == this.f && mVar.f11182g == this.f11182g && mVar.f11183h == this.f11183h && mVar.f11184i == this.f11184i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10 = AbstractC0515y1.i(AbstractC0515y1.i(527, 31, this.f11178a), 31, this.f11179b);
        long j7 = this.f11180c;
        int i11 = AbstractC0515y1.i(AbstractC0515y1.i((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31, 31, this.d), 31, this.f11181e);
        int i12 = 1237;
        if (this.f) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i13 = (i11 + i7) * 31;
        if (this.f11182g) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i14 = (i13 + i8) * 31;
        if (this.f11183h) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i15 = (i14 + i9) * 31;
        if (this.f11184i) {
            i12 = 1231;
        }
        return i15 + i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11178a);
        sb.append('=');
        sb.append(this.f11179b);
        if (this.f11183h) {
            long j7 = this.f11180c;
            if (j7 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) m6.b.f12444a.get()).format(new Date(j7));
                M5.g.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f11184i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f11181e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.f11182g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        M5.g.e(sb2, "toString()");
        return sb2;
    }
}
