package S2;

import M2.b;
import M2.g;
import M2.h;
import N3.e;
import Z2.AbstractC0156a;
import Z2.y;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.K1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f3135o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f3136p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m  reason: collision with root package name */
    public final StringBuilder f3137m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long i(Matcher matcher, int i7) {
        long j7;
        String group = matcher.group(i7 + 1);
        if (group != null) {
            j7 = Long.parseLong(group) * 3600000;
        } else {
            j7 = 0;
        }
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j7;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // M2.g
    public final h f(int i7, boolean z7, byte[] bArr) {
        String str;
        String str2;
        long[] jArr;
        y yVar;
        Charset charset;
        char c5;
        int i8;
        char c6;
        int i9;
        float f;
        float f7;
        b bVar;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        y yVar2 = new y(i7, bArr);
        Charset B6 = yVar2.B();
        if (B6 == null) {
            B6 = e.f2497c;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String h7 = yVar2.h(B6);
            if (h7 != null) {
                if (h7.length() != 0) {
                    try {
                        Integer.parseInt(h7);
                        h7 = yVar2.h(B6);
                    } catch (NumberFormatException unused) {
                        str = "Skipping invalid index: ";
                    }
                    if (h7 == null) {
                        AbstractC0156a.K("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f3135o.matcher(h7);
                        if (matcher.matches()) {
                            long i12 = i(matcher, 1);
                            if (i11 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i11 * 2);
                            }
                            int i13 = i11 + 1;
                            jArr2[i11] = i12;
                            long i14 = i(matcher, 6);
                            if (i13 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i13 * 2);
                            }
                            i11 += 2;
                            jArr2[i13] = i14;
                            StringBuilder sb = aVar.f3137m;
                            sb.setLength(i10);
                            ArrayList arrayList2 = aVar.n;
                            arrayList2.clear();
                            String h8 = yVar2.h(B6);
                            while (!TextUtils.isEmpty(h8)) {
                                if (sb.length() > 0) {
                                    sb.append("<br>");
                                }
                                String trim = h8.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = f3136p.matcher(trim);
                                int i15 = i10;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i15;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i15 += length;
                                }
                                sb.append(sb2.toString());
                                h8 = yVar2.h(B6);
                                i10 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(sb.toString());
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList2.size()) {
                                    str2 = (String) arrayList2.get(i16);
                                    if (!str2.matches("\\{\\\\an[1-9]\\}")) {
                                        i16++;
                                    }
                                } else {
                                    str2 = null;
                                }
                            }
                            if (str2 == null) {
                                bVar = new b(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                jArr = jArr2;
                                yVar = yVar2;
                                charset = B6;
                            } else {
                                jArr = jArr2;
                                yVar = yVar2;
                                charset = B6;
                                switch (str2.hashCode()) {
                                    case -685620710:
                                        if (str2.equals("{\\an1}")) {
                                            c5 = 0;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620679:
                                        if (str2.equals("{\\an2}")) {
                                            c5 = 6;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620648:
                                        if (str2.equals("{\\an3}")) {
                                            c5 = 3;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620617:
                                        if (str2.equals("{\\an4}")) {
                                            c5 = 1;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620586:
                                        if (str2.equals("{\\an5}")) {
                                            c5 = 7;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620555:
                                        if (str2.equals("{\\an6}")) {
                                            c5 = 4;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620524:
                                        if (str2.equals("{\\an7}")) {
                                            c5 = 2;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620493:
                                        if (str2.equals("{\\an8}")) {
                                            c5 = '\b';
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    case -685620462:
                                        if (str2.equals("{\\an9}")) {
                                            c5 = 5;
                                            break;
                                        }
                                        c5 = 65535;
                                        break;
                                    default:
                                        c5 = 65535;
                                        break;
                                }
                                if (c5 != 0 && c5 != 1 && c5 != 2) {
                                    if (c5 != 3 && c5 != 4 && c5 != 5) {
                                        i8 = 1;
                                    } else {
                                        i8 = 2;
                                    }
                                } else {
                                    i8 = 0;
                                }
                                switch (str2.hashCode()) {
                                    case -685620710:
                                        if (str2.equals("{\\an1}")) {
                                            c6 = 0;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620679:
                                        if (str2.equals("{\\an2}")) {
                                            c6 = 1;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620648:
                                        if (str2.equals("{\\an3}")) {
                                            c6 = 2;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620617:
                                        if (str2.equals("{\\an4}")) {
                                            c6 = 6;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620586:
                                        if (str2.equals("{\\an5}")) {
                                            c6 = 7;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620555:
                                        if (str2.equals("{\\an6}")) {
                                            c6 = '\b';
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620524:
                                        if (str2.equals("{\\an7}")) {
                                            c6 = 3;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620493:
                                        if (str2.equals("{\\an8}")) {
                                            c6 = 4;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    case -685620462:
                                        if (str2.equals("{\\an9}")) {
                                            c6 = 5;
                                            break;
                                        }
                                        c6 = 65535;
                                        break;
                                    default:
                                        c6 = 65535;
                                        break;
                                }
                                if (c6 != 0 && c6 != 1 && c6 != 2) {
                                    if (c6 != 3 && c6 != 4 && c6 != 5) {
                                        i9 = 1;
                                    } else {
                                        i9 = 0;
                                    }
                                } else {
                                    i9 = 2;
                                }
                                if (i8 != 0) {
                                    if (i8 != 1) {
                                        if (i8 == 2) {
                                            f = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        f = 0.5f;
                                    }
                                } else {
                                    f = 0.08f;
                                }
                                if (i9 != 0) {
                                    if (i9 != 1) {
                                        if (i9 == 2) {
                                            f7 = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        f7 = 0.5f;
                                    }
                                } else {
                                    f7 = 0.08f;
                                }
                                bVar = new b(fromHtml, null, null, null, f7, 0, i9, f, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            }
                            arrayList.add(bVar);
                            arrayList.add(b.f2219H);
                            aVar = this;
                            jArr2 = jArr;
                            yVar2 = yVar;
                            B6 = charset;
                            i10 = 0;
                        } else {
                            str = "Skipping invalid timing: ";
                            AbstractC0156a.K("SubripDecoder", str.concat(h7));
                            aVar = this;
                            i10 = 0;
                        }
                    }
                }
            }
        }
        return new K1((b[]) arrayList.toArray(new b[i10]), 18, Arrays.copyOf(jArr2, i11));
    }
}
