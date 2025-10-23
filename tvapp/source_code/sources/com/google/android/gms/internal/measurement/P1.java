package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import o.C1052e;
/* loaded from: classes.dex */
public final /* synthetic */ class P1 implements N3.l {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Context f8394q;

    @Override // N3.l
    public final Object get() {
        N3.g e3;
        boolean isDeviceProtectedStorage;
        Context context = this.f8394q;
        N3.g gVar = M1.f8374a;
        if (gVar == null) {
            synchronized (M1.class) {
                try {
                    gVar = M1.f8374a;
                    if (gVar == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        C1052e c1052e = O1.f8387a;
                        if ((!str.equals("eng") && !str.equals("userdebug")) || (!str2.contains("dev-keys") && !str2.contains("test-keys"))) {
                            e3 = N3.a.f2491q;
                            M1.f8374a = e3;
                            gVar = e3;
                        }
                        if (E1.a()) {
                            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                            if (!isDeviceProtectedStorage) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                        }
                        e3 = C1.e(context);
                        M1.f8374a = e3;
                        gVar = e3;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }
}
