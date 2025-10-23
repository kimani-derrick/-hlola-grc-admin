package R0;

import U5.m;
import U5.n;
import android.graphics.Bitmap;
import h6.B;
import h6.r;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final B f2868a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2869b;

    /* renamed from: c  reason: collision with root package name */
    public final Date f2870c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Date f2871e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final Date f2872g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2873h;

    /* renamed from: i  reason: collision with root package name */
    public final long f2874i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2875j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2876k;

    public c(B b7, b bVar) {
        int i7;
        this.f2868a = b7;
        this.f2869b = bVar;
        this.f2876k = -1;
        if (bVar != null) {
            this.f2873h = bVar.f2866c;
            this.f2874i = bVar.d;
            r rVar = bVar.f;
            int size = rVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                String f = rVar.f(i8);
                if (n.W(f, "Date")) {
                    String b8 = rVar.b("Date");
                    Date date = null;
                    if (b8 != null) {
                        P5.b bVar2 = m6.b.f12444a;
                        if (b8.length() != 0) {
                            ParsePosition parsePosition = new ParsePosition(0);
                            Date parse = ((DateFormat) m6.b.f12444a.get()).parse(b8, parsePosition);
                            if (parsePosition.getIndex() == b8.length()) {
                                date = parse;
                            } else {
                                String[] strArr = m6.b.f12445b;
                                synchronized (strArr) {
                                    try {
                                        int length = strArr.length;
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= length) {
                                                break;
                                            }
                                            int i10 = i9 + 1;
                                            DateFormat[] dateFormatArr = m6.b.f12446c;
                                            DateFormat dateFormat = dateFormatArr[i9];
                                            if (dateFormat == null) {
                                                dateFormat = new SimpleDateFormat(m6.b.f12445b[i9], Locale.US);
                                                dateFormat.setTimeZone(i6.b.f11393e);
                                                dateFormatArr[i9] = dateFormat;
                                            }
                                            parsePosition.setIndex(0);
                                            Date parse2 = dateFormat.parse(b8, parsePosition);
                                            if (parsePosition.getIndex() != 0) {
                                                date = parse2;
                                                break;
                                            }
                                            i9 = i10;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                    this.f2870c = date;
                    this.d = rVar.h(i8);
                } else if (n.W(f, "Expires")) {
                    this.f2872g = rVar.c("Expires");
                } else if (n.W(f, "Last-Modified")) {
                    this.f2871e = rVar.c("Last-Modified");
                    this.f = rVar.h(i8);
                } else if (n.W(f, "ETag")) {
                    this.f2875j = rVar.h(i8);
                } else if (n.W(f, "Age")) {
                    String h7 = rVar.h(i8);
                    Bitmap.Config[] configArr = X0.e.f4059a;
                    Long U6 = m.U(h7);
                    if (U6 != null) {
                        long longValue = U6.longValue();
                        if (longValue > 2147483647L) {
                            i7 = Integer.MAX_VALUE;
                        } else if (longValue < 0) {
                            i7 = 0;
                        } else {
                            i7 = (int) longValue;
                        }
                    } else {
                        i7 = -1;
                    }
                    this.f2876k = i7;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        if (r8 > 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R0.d a() {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.c.a():R0.d");
    }
}
