package Q0;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final double f2829a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2830b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2831c;

    public a(Context context) {
        Bitmap.Config[] configArr = X0.e.f4059a;
        double d = 0.2d;
        try {
            Object b7 = A.b.b(context, ActivityManager.class);
            M5.g.c(b7);
            if (((ActivityManager) b7).isLowRamDevice()) {
                d = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f2829a = d;
        this.f2830b = true;
        this.f2831c = true;
    }
}
