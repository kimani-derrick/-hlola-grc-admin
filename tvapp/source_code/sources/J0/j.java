package J0;

import A5.k;
import H2.C0002c;
import S0.r;
import W5.AbstractC0117y;
import W5.G;
import W5.p0;
import W5.q0;
import X0.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import b6.o;
import coil.target.GenericViewTarget;
import h6.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import z5.C1524f;
import z5.C1527i;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final S0.a f1298a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1522d f1299b;

    /* renamed from: c  reason: collision with root package name */
    public final b6.e f1300c;
    public final C0002c d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1301e;
    public final ArrayList f;

    public j(Context context, S0.a aVar, C1527i c1527i, C1527i c1527i2, C1527i c1527i3, b bVar, X0.i iVar) {
        this.f1298a = aVar;
        this.f1299b = c1527i;
        q0 b7 = AbstractC0117y.b();
        d6.d dVar = G.f3945a;
        this.f1300c = AbstractC0117y.a(p6.d.A(b7, o.f7208a.f4295v).r(new i(this)));
        l lVar = new l(this, context, iVar.f4069b);
        C0002c c0002c = new C0002c(this, lVar);
        this.d = c0002c;
        H.e eVar = new H.e(bVar);
        eVar.m(new P0.a(2), t.class);
        eVar.m(new P0.a(5), String.class);
        eVar.m(new P0.a(1), Uri.class);
        eVar.m(new P0.a(4), Uri.class);
        eVar.m(new P0.a(3), Integer.class);
        eVar.m(new P0.a(0), byte[].class);
        Object obj = new Object();
        ArrayList arrayList = (ArrayList) eVar.f779t;
        arrayList.add(new C1524f(obj, Uri.class));
        arrayList.add(new C1524f(new O0.a(iVar.f4068a), File.class));
        eVar.l(new M0.i(c1527i3, c1527i2, iVar.f4070c), Uri.class);
        eVar.l(new M0.a(5), File.class);
        eVar.l(new M0.a(0), Uri.class);
        eVar.l(new M0.a(3), Uri.class);
        eVar.l(new M0.a(6), Uri.class);
        eVar.l(new M0.a(4), Drawable.class);
        eVar.l(new M0.a(1), Bitmap.class);
        eVar.l(new M0.a(2), ByteBuffer.class);
        K0.c cVar = new K0.c(iVar.d, iVar.f4071e);
        ArrayList arrayList2 = (ArrayList) eVar.f781v;
        arrayList2.add(cVar);
        List R6 = p6.l.R((ArrayList) eVar.f777r);
        this.f1301e = new b(R6, p6.l.R((ArrayList) eVar.f778s), p6.l.R(arrayList), p6.l.R((ArrayList) eVar.f780u), p6.l.R(arrayList2));
        this.f = k.f0(R6, new N0.i(this, c0002c));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:63:0x0165, B:65:0x016c, B:68:0x017e, B:70:0x018a, B:69:0x0182, B:71:0x0190, B:73:0x0194, B:60:0x013c, B:37:0x00d9, B:39:0x00e3, B:41:0x00e7, B:43:0x00ef, B:46:0x00f9, B:49:0x00ff, B:53:0x011a, B:55:0x011e, B:56:0x0121, B:52:0x010e, B:32:0x00bc, B:34:0x00c2, B:75:0x01a3, B:76:0x01aa), top: B:88:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:63:0x0165, B:65:0x016c, B:68:0x017e, B:70:0x018a, B:69:0x0182, B:71:0x0190, B:73:0x0194, B:60:0x013c, B:37:0x00d9, B:39:0x00e3, B:41:0x00e7, B:43:0x00ef, B:46:0x00f9, B:49:0x00ff, B:53:0x011a, B:55:0x011e, B:56:0x0121, B:52:0x010e, B:32:0x00bc, B:34:0x00c2, B:75:0x01a3, B:76:0x01aa), top: B:88:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:63:0x0165, B:65:0x016c, B:68:0x017e, B:70:0x018a, B:69:0x0182, B:71:0x0190, B:73:0x0194, B:60:0x013c, B:37:0x00d9, B:39:0x00e3, B:41:0x00e7, B:43:0x00ef, B:46:0x00f9, B:49:0x00ff, B:53:0x011a, B:55:0x011e, B:56:0x0121, B:52:0x010e, B:32:0x00bc, B:34:0x00c2, B:75:0x01a3, B:76:0x01aa), top: B:88:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:63:0x0165, B:65:0x016c, B:68:0x017e, B:70:0x018a, B:69:0x0182, B:71:0x0190, B:73:0x0194, B:60:0x013c, B:37:0x00d9, B:39:0x00e3, B:41:0x00e7, B:43:0x00ef, B:46:0x00f9, B:49:0x00ff, B:53:0x011a, B:55:0x011e, B:56:0x0121, B:52:0x010e, B:32:0x00bc, B:34:0x00c2, B:75:0x01a3, B:76:0x01aa), top: B:88:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:63:0x0165, B:65:0x016c, B:68:0x017e, B:70:0x018a, B:69:0x0182, B:71:0x0190, B:73:0x0194, B:60:0x013c, B:37:0x00d9, B:39:0x00e3, B:41:0x00e7, B:43:0x00ef, B:46:0x00f9, B:49:0x00ff, B:53:0x011a, B:55:0x011e, B:56:0x0121, B:52:0x010e, B:32:0x00bc, B:34:0x00c2, B:75:0x01a3, B:76:0x01aa), top: B:88:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:63:0x0165, B:65:0x016c, B:68:0x017e, B:70:0x018a, B:69:0x0182, B:71:0x0190, B:73:0x0194, B:60:0x013c, B:37:0x00d9, B:39:0x00e3, B:41:0x00e7, B:43:0x00ef, B:46:0x00f9, B:49:0x00ff, B:53:0x011a, B:55:0x011e, B:56:0x0121, B:52:0x010e, B:32:0x00bc, B:34:0x00c2, B:75:0x01a3, B:76:0x01aa), top: B:88:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[Catch: all -> 0x01bf, TryCatch #2 {all -> 0x01bf, blocks: (B:77:0x01ab, B:79:0x01af, B:83:0x01c1, B:84:0x01c9), top: B:89:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[Catch: all -> 0x01bf, TryCatch #2 {all -> 0x01bf, blocks: (B:77:0x01ab, B:79:0x01af, B:83:0x01c1, B:84:0x01c9), top: B:89:0x01ab }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(J0.j r22, S0.g r23, D5.d r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.j.a(J0.j, S0.g, D5.d):java.lang.Object");
    }

    public static void c(S0.c cVar, GenericViewTarget genericViewTarget, c cVar2) {
        S0.g gVar = cVar.f2964b;
        boolean z7 = genericViewTarget instanceof GenericViewTarget;
        Drawable drawable = cVar.f2963a;
        if (!z7) {
            if (genericViewTarget != null) {
                genericViewTarget.n(drawable);
            }
        } else {
            gVar.f3026l.getClass();
            genericViewTarget.n(drawable);
        }
        cVar2.getClass();
        c cVar3 = gVar.d;
    }

    public final S0.i b(S0.g gVar) {
        AbstractC0117y.c(this.f1300c, new f(this, gVar, null));
        GenericViewTarget genericViewTarget = gVar.f3019c;
        if (genericViewTarget instanceof GenericViewTarget) {
            r c5 = X0.e.c(genericViewTarget.k());
            synchronized (c5) {
                S0.i iVar = c5.f3065q;
                if (iVar != null && M5.g.a(Looper.myLooper(), Looper.getMainLooper()) && c5.f3068t) {
                    c5.f3068t = false;
                    return iVar;
                }
                p0 p0Var = c5.f3066r;
                if (p0Var != null) {
                    p0Var.b(null);
                }
                c5.f3066r = null;
                S0.i iVar2 = new S0.i(2);
                c5.f3065q = iVar2;
                return iVar2;
            }
        }
        return new S0.i(1);
    }
}
