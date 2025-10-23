package C;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f343a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f344b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f345c = new Object();

    public static void a(m mVar, int i7, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f345c) {
            try {
                WeakHashMap weakHashMap = f344b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(mVar, sparseArray);
                }
                sparseArray.append(i7, new l(colorStateList, mVar.f338a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, C.b r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.b(android.content.Context, int, android.util.TypedValue, int, C.b, boolean, boolean):android.graphics.Typeface");
    }
}
