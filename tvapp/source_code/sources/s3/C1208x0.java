package s3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0405c0;
/* renamed from: s3.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208x0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14373a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14374b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14375c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f14376e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final C0405c0 f14377g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14378h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f14379i;

    /* renamed from: j  reason: collision with root package name */
    public final String f14380j;

    public C1208x0(Context context, C0405c0 c0405c0, Long l7) {
        this.f14378h = true;
        g3.n.g(context);
        Context applicationContext = context.getApplicationContext();
        g3.n.g(applicationContext);
        this.f14373a = applicationContext;
        this.f14379i = l7;
        if (c0405c0 != null) {
            this.f14377g = c0405c0;
            this.f14374b = c0405c0.f8523v;
            this.f14375c = c0405c0.f8522u;
            this.d = c0405c0.f8521t;
            this.f14378h = c0405c0.f8520s;
            this.f = c0405c0.f8519r;
            this.f14380j = c0405c0.f8525x;
            Bundle bundle = c0405c0.f8524w;
            if (bundle != null) {
                this.f14376e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
