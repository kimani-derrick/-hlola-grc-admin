package r4;

import H2.U;
import Z1.i;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.concurrent.atomic.AtomicReference;
import o4.m;
import w4.C1410c0;
/* renamed from: r4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1119a {

    /* renamed from: c  reason: collision with root package name */
    public static final c f13476c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final m f13477a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f13478b = new AtomicReference(null);

    public C1119a(m mVar) {
        this.f13477a = mVar;
        mVar.a(new U(24, this));
    }

    public final c a(String str) {
        C1119a c1119a = (C1119a) this.f13478b.get();
        if (c1119a == null) {
            return f13476c;
        }
        return c1119a.a(str);
    }

    public final boolean b() {
        C1119a c1119a = (C1119a) this.f13478b.get();
        if (c1119a != null && c1119a.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        C1119a c1119a = (C1119a) this.f13478b.get();
        if (c1119a != null && c1119a.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, String str2, long j7, C1410c0 c1410c0) {
        String x7 = AbstractC0515y1.x("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", x7, null);
        }
        this.f13477a.a(new i(str, str2, j7, c1410c0, 3));
    }
}
