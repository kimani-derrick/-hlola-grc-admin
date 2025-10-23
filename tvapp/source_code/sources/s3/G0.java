package s3;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class G0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ String f13782q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ String f13783r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ long f13784s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Bundle f13785t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ boolean f13786u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f13787v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f13788w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f13789x = null;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ C1212z0 f13790y;

    public G0(C1212z0 c1212z0, String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9) {
        this.f13782q = str;
        this.f13783r = str2;
        this.f13784s = j7;
        this.f13785t = bundle;
        this.f13786u = z7;
        this.f13787v = z8;
        this.f13788w = z9;
        this.f13790y = c1212z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13790y.O(this.f13782q, this.f13783r, this.f13784s, this.f13785t, this.f13786u, this.f13787v, this.f13788w, this.f13789x);
    }
}
