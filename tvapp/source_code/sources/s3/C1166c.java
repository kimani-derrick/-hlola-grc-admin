package s3;

import com.google.android.gms.internal.measurement.AbstractC0457m2;
import com.google.android.gms.internal.measurement.C0514y0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* renamed from: s3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166c {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f13973a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f13974b;

    /* renamed from: c  reason: collision with root package name */
    public Long f13975c;
    public Long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13976e;
    public final AbstractC0457m2 f;

    public /* synthetic */ C1166c(y1 y1Var, String str, int i7, AbstractC0457m2 abstractC0457m2, int i8) {
        this.f13976e = i8;
        this.f = abstractC0457m2;
    }

    public static Boolean b(long j7, com.google.android.gms.internal.measurement.C0 c02) {
        try {
            return e(new BigDecimal(j7), c02, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(Boolean bool, boolean z7) {
        boolean z8;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z7) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }

    public static Boolean d(String str, com.google.android.gms.internal.measurement.F0 f02, C1154I c1154i) {
        String u7;
        List<String> v5;
        String str2;
        int i7;
        boolean startsWith;
        g3.n.g(f02);
        if (str == null || !f02.z() || f02.s() == 1) {
            return null;
        }
        if (f02.s() == 7) {
            if (f02.r() == 0) {
                return null;
            }
        } else if (!f02.y()) {
            return null;
        }
        int s6 = f02.s();
        boolean w7 = f02.w();
        if (!w7 && s6 != 2 && s6 != 7) {
            u7 = f02.u().toUpperCase(Locale.ENGLISH);
        } else {
            u7 = f02.u();
        }
        if (f02.r() == 0) {
            v5 = null;
        } else {
            v5 = f02.v();
            if (!w7) {
                ArrayList arrayList = new ArrayList(v5.size());
                for (String str3 : v5) {
                    arrayList.add(str3.toUpperCase(Locale.ENGLISH));
                }
                v5 = Collections.unmodifiableList(arrayList);
            }
        }
        if (s6 == 2) {
            str2 = u7;
        } else {
            str2 = null;
        }
        if (s6 == 7) {
            if (v5 == 0 || v5.isEmpty()) {
                return null;
            }
        } else if (u7 == null) {
            return null;
        }
        if (!w7 && s6 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (A1.f13749a[s.h.b(s6)]) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                if (w7) {
                    i7 = 0;
                } else {
                    i7 = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, i7).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    c1154i.f13810y.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                    return null;
                }
            case 2:
                startsWith = str.startsWith(u7);
                break;
            case 3:
                startsWith = str.endsWith(u7);
                break;
            case 4:
                startsWith = str.contains(u7);
                break;
            case 5:
                startsWith = str.equals(u7);
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                if (v5 == null) {
                    return null;
                }
                startsWith = v5.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r4 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.C0 r9, double r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1166c.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.C0, double):java.lang.Boolean");
    }

    public final int a() {
        switch (this.f13976e) {
            case 0:
                return ((com.google.android.gms.internal.measurement.E0) this.f).r();
            default:
                return ((C0514y0) this.f).v();
        }
    }

    public final boolean f() {
        switch (this.f13976e) {
            case 0:
                return false;
            default:
                return ((C0514y0) this.f).D();
        }
    }

    public final boolean g() {
        switch (this.f13976e) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
