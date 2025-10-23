package R1;

import I4.d;
import T4.c;
import U1.h;
import android.content.Context;
import android.net.ConnectivityManager;
import c2.C0391b;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final c f2884a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f2885b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2886c;
    public final URL d;

    /* renamed from: e  reason: collision with root package name */
    public final C0391b f2887e;
    public final C0391b f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2888g;

    public b(Context context, C0391b c0391b, C0391b c0391b2) {
        d dVar = new d();
        S1.h.f3100a.a(dVar);
        dVar.d = true;
        this.f2884a = new c(8, dVar);
        this.f2886c = context;
        this.f2885b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(a.f2880c);
        this.f2887e = c0391b2;
        this.f = c0391b;
        this.f2888g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e3) {
            throw new IllegalArgumentException(AbstractC0515y1.x("Invalid url: ", str), e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (((S1.u) S1.u.f3129q.get(r0)) != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T1.h a(T1.h r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.b.a(T1.h):T1.h");
    }
}
