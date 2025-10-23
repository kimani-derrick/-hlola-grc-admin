package p2;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.C;
import O3.E;
import O3.U;
import Z2.AbstractC0156a;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f13134a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f13135b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f13136c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r9 == (-1)) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M2.e a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.d.a(java.lang.String):M2.e");
    }

    public static U b(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        long j8;
        C c5 = E.f2597r;
        AbstractC0072p.c("initialCapacity", 4);
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i7 = 0;
        boolean z7 = false;
        do {
            xmlPullParser.next();
            if (AbstractC0156a.B(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String v5 = AbstractC0156a.v(xmlPullParser, concat3);
                String v7 = AbstractC0156a.v(xmlPullParser, concat4);
                String v8 = AbstractC0156a.v(xmlPullParser, concat5);
                String v9 = AbstractC0156a.v(xmlPullParser, concat6);
                if (v5 != null && v7 != null) {
                    if (v8 != null) {
                        j7 = Long.parseLong(v8);
                    } else {
                        j7 = 0;
                    }
                    if (v9 != null) {
                        j8 = Long.parseLong(v9);
                    } else {
                        j8 = 0;
                    }
                    C1086b c1086b = new C1086b(j7, j8, v5);
                    int i8 = i7 + 1;
                    if (objArr.length < i8) {
                        objArr = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, i8));
                    } else {
                        if (z7) {
                            objArr = (Object[]) objArr.clone();
                        }
                        objArr[i7] = c1086b;
                        i7++;
                    }
                    z7 = false;
                    objArr[i7] = c1086b;
                    i7++;
                } else {
                    return U.f2621u;
                }
            }
        } while (!AbstractC0156a.A(xmlPullParser, concat2));
        return E.o(i7, objArr);
    }
}
