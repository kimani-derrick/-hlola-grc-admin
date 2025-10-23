package u4;

import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import w4.O;
import w4.P;
/* loaded from: classes.dex */
public final class t {
    public static final HashMap f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f15051g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f15052a;

    /* renamed from: b  reason: collision with root package name */
    public final C1273A f15053b;

    /* renamed from: c  reason: collision with root package name */
    public final C1277a f15054c;
    public final C4.a d;

    /* renamed from: e  reason: collision with root package name */
    public final B4.d f15055e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        AbstractC0515y1.r(5, hashMap, "armeabi", 6, "armeabi-v7a");
        AbstractC0515y1.r(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f15051g = "Crashlytics Android SDK/19.0.1";
    }

    public t(Context context, C1273A c1273a, C1277a c1277a, K1 k12, B4.d dVar) {
        this.f15052a = context;
        this.f15053b = c1273a;
        this.f15054c = c1277a;
        this.d = k12;
        this.f15055e = dVar;
    }

    public static P c(C4.b bVar, int i7) {
        P p3;
        int i8 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) bVar.f423t;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C4.b bVar2 = (C4.b) bVar.f424u;
        if (i7 >= 8) {
            for (C4.b bVar3 = bVar2; bVar3 != null; bVar3 = (C4.b) bVar3.f424u) {
                i8++;
            }
        }
        String str = (String) bVar.f422s;
        if (str != null) {
            List d = d(stackTraceElementArr, 4);
            if (d != null) {
                Integer valueOf = Integer.valueOf(i8);
                if (bVar2 != null && i8 == 0) {
                    p3 = c(bVar2, i7 + 1);
                } else {
                    p3 = null;
                }
                return new P(str, (String) bVar.f421r, d, p3, valueOf.intValue());
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null type");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i7) {
        long j7;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            H.e eVar = new H.e(8);
            eVar.f781v = Integer.valueOf(i7);
            long j8 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j7 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j7 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j8 = stackTraceElement.getLineNumber();
            }
            eVar.f779t = Long.valueOf(j7);
            if (str != null) {
                eVar.f777r = str;
                eVar.f778s = fileName;
                eVar.f780u = Long.valueOf(j8);
                arrayList.add(eVar.s());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        Long l7 = 0L;
        Long l8 = 0L;
        C1277a c1277a = this.f15054c;
        String str = c1277a.f14982e;
        if (str != null) {
            return Collections.singletonList(new O(l7.longValue(), l8.longValue(), str, c1277a.f14980b));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Type inference failed for: r0v9, types: [z4.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w4.V b(int r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.t.b(int):w4.V");
    }
}
