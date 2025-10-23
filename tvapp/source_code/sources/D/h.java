package D;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h4.b f435a;

    /* renamed from: b  reason: collision with root package name */
    public static final o.i f436b;

    static {
        h4.b bVar;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            bVar = new h4.b();
        } else if (i7 >= 28) {
            bVar = new k();
        } else if (i7 >= 26) {
            bVar = new k();
        } else {
            if (i7 >= 24) {
                Method method = j.f443c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    bVar = new h4.b();
                }
            }
            bVar = new h4.b();
        }
        f435a = bVar;
        f436b = new o.i(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r3.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r15, C.f r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, C.b r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.h.a(android.content.Context, C.f, android.content.res.Resources, int, java.lang.String, int, int, C.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }
}
