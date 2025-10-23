package H2;

import K.C0029e;
import K.InterfaceC0028d;
import Z2.AbstractC0156a;
import a2.InterfaceC0200c;
import android.content.ClipData;
import android.content.ClipDescription;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import b2.InterfaceC0363b;
import e2.C0597b0;
import e2.SurfaceHolder$CallbackC0629y;
import e2.t0;
import f2.C0695a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import k2.C0951p;
import k2.InterfaceC0938c;
import o4.InterfaceC1071c;
import r4.C1119a;
import t3.C1251o;
import t3.InterfaceC1237a;
import t3.InterfaceC1243g;
import u4.C1278b;
import w2.C1392n;
import w2.InterfaceC1402x;
import x2.C1461c;
import z4.C1518b;
/* loaded from: classes.dex */
public final /* synthetic */ class U implements InterfaceC1243g, InterfaceC0363b, Q1.d, a2.h, Z2.m, InterfaceC0938c, InterfaceC1071c, M4.a, N3.f, InterfaceC1237a, InterfaceC1402x {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f980q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f981r;

    public /* synthetic */ U() {
        this.f980q = 21;
        this.f981r = h6.n.f11187s;
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        V4.g gVar = (V4.g) obj;
        return m3.g.m((V4.j) this.f981r);
    }

    @Override // w2.InterfaceC1402x
    public int a(Object obj) {
        boolean z7;
        C1392n c1392n = (C1392n) obj;
        c1392n.getClass();
        e2.K k5 = (e2.K) this.f981r;
        String str = k5.f9655B;
        String str2 = c1392n.f15782b;
        if (!str2.equals(str) && !str2.equals(w2.y.b(k5))) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z7 && c1392n.c(k5, false)) {
            return 1;
        }
        return 0;
    }

    @Override // Q1.d, a2.h
    public Object apply(Object obj) {
        switch (this.f980q) {
            case 8:
                ((T4.c) this.f981r).getClass();
                String L6 = Z4.H.f4759b.L((Z4.G) obj);
                M5.g.e(L6, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
                Log.d("EventGDTLogger", "Session Event: ".concat(L6));
                byte[] bytes = L6.getBytes(U5.a.f3474a);
                M5.g.e(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
            case 9:
                Cursor cursor = (Cursor) obj;
                a2.j jVar = (a2.j) this.f981r;
                jVar.getClass();
                while (cursor.moveToNext()) {
                    int i7 = cursor.getInt(0);
                    jVar.j(i7, W1.c.f3749s, cursor.getString(1));
                }
                return null;
            default:
                s2.q qVar = (s2.q) obj;
                ((s2.j) this.f981r).getClass();
                return qVar;
        }
    }

    @Override // k2.InterfaceC0938c
    public long b(long j7) {
        C0951p c0951p = (C0951p) this.f981r;
        return Z2.H.k((j7 * c0951p.f12181e) / 1000000, 0L, c0951p.f12185j - 1);
    }

    @Override // Z2.m
    public void c(Object obj) {
        switch (this.f980q) {
            case 11:
                ((t0) obj).h((C0597b0) this.f981r);
                return;
            case 12:
                ((t0) obj).A((W2.w) this.f981r);
                return;
            case 13:
                ((t0) obj).B((List) this.f981r);
                return;
            case 14:
                ((t0) obj).x((M2.c) this.f981r);
                return;
            case 15:
                ((t0) obj).h(((SurfaceHolder$CallbackC0629y) this.f981r).f10095q.f9447d0);
                return;
            case 16:
                ((t0) obj).K((C1461c) this.f981r);
                return;
            case 17:
                ((f2.k) obj).n = (e2.o0) this.f981r;
                return;
            case 18:
                f2.k kVar = (f2.k) obj;
                int i7 = kVar.f10390x;
                i2.e eVar = (i2.e) this.f981r;
                kVar.f10390x = i7 + eVar.f11344g;
                kVar.f10391y += eVar.f11343e;
                return;
            default:
                f2.k kVar2 = (f2.k) obj;
                kVar2.getClass();
                kVar2.f10388v = ((C0020v) this.f981r).f1175a;
                return;
        }
    }

    @Override // t3.InterfaceC1237a
    public Object d(C1251o c1251o) {
        boolean z7;
        switch (this.f980q) {
            case 27:
                ((C1518b) this.f981r).getClass();
                if (c1251o.i()) {
                    C1278b c1278b = (C1278b) c1251o.g();
                    r4.c cVar = r4.c.f13480a;
                    cVar.c("Crashlytics report successfully enqueued to DataTransport: " + c1278b.f14986b);
                    File file = c1278b.f14987c;
                    if (file.delete()) {
                        cVar.c("Deleted report file: " + file.getPath());
                    } else {
                        cVar.f("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z7 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", c1251o.f());
                    z7 = false;
                }
                return Boolean.valueOf(z7);
            default:
                ((CountDownLatch) this.f981r).countDown();
                return null;
        }
    }

    @Override // b2.InterfaceC0363b
    public Object e() {
        SQLiteDatabase a7;
        Object obj = this.f981r;
        switch (this.f980q) {
            case 4:
                a2.j jVar = (a2.j) ((InterfaceC0200c) obj);
                jVar.getClass();
                int i7 = W1.a.f3743e;
                C4.b bVar = new C4.b(5);
                HashMap hashMap = new HashMap();
                a7 = jVar.a();
                a7.beginTransaction();
                try {
                    W1.a aVar = (W1.a) a2.j.x(a7.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new U4.e(jVar, hashMap, bVar, 6));
                    a7.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 5:
                a2.j jVar2 = (a2.j) ((a2.d) obj);
                long a8 = jVar2.f4999r.a() - jVar2.f5001t.d;
                a7 = jVar2.a();
                a7.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(a8)};
                    a2.j.x(a7.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new U(9, jVar2));
                    int delete = a7.delete("events", "timestamp_ms < ?", strArr);
                    a7.setTransactionSuccessful();
                    a7.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                a2.j jVar3 = (a2.j) ((Z1.j) obj).f4578i;
                a7 = jVar3.a();
                a7.beginTransaction();
                try {
                    a7.compileStatement("DELETE FROM log_event_dropped").execute();
                    a7.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + jVar3.f4999r.a()).execute();
                    a7.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                Z1.l lVar = (Z1.l) obj;
                for (T1.i iVar : (Iterable) ((a2.j) lVar.f4587b).f(new A4.a(26))) {
                    lVar.f4588c.a(iVar, 1, false);
                }
                return null;
        }
    }

    @Override // M4.a
    public void f(M4.b bVar) {
        switch (this.f980q) {
            case 24:
                C1119a c1119a = (C1119a) this.f981r;
                c1119a.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                c1119a.f13478b.set((C1119a) bVar.get());
                return;
            default:
                C4.b bVar2 = ((U4.p) ((X4.a) bVar.get())).a().f3457i;
                r4.b bVar3 = (r4.b) this.f981r;
                ((Set) bVar2.f424u).add(bVar3);
                C1251o b7 = ((V4.e) bVar2.f421r).b();
                b7.c((Executor) bVar2.f423t, new U4.e(bVar2, b7, bVar3, 2));
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    public boolean g(T4.c cVar, int i7, Bundle bundle) {
        InterfaceC0028d interfaceC0028d;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 25 && (i7 & 1) != 0) {
            try {
                ((O.g) cVar.f3382r).b();
                Parcelable parcelable = (Parcelable) ((O.g) cVar.f3382r).f();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
                return false;
            }
        }
        ClipDescription e7 = ((O.g) cVar.f3382r).e();
        O.g gVar = (O.g) cVar.f3382r;
        ClipData clipData = new ClipData(e7, new ClipData.Item(gVar.g()));
        if (i8 >= 31) {
            interfaceC0028d = new T4.c(clipData, 2);
        } else {
            C0029e c0029e = new C0029e();
            c0029e.f1476r = clipData;
            c0029e.f1477s = 2;
            interfaceC0028d = c0029e;
        }
        interfaceC0028d.q(gVar.c());
        interfaceC0028d.o(bundle);
        if (K.O.e((View) this.f981r, interfaceC0028d.i()) != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:41|42|(1:44)(1:183)|45|46|(1:48)|49|50|(1:52)|53|(1:55)|(1:57)(1:181)|58|(2:59|(3:61|(2:63|64)(1:66)|65)(1:67))|68|(2:71|69)|72|73|(1:75)(1:180)|(1:77)(1:179)|78|(5:166|(1:168)|169|43e|174)(1:82)|83|(3:87|(1:89)(2:159|(1:161))|(29:91|(1:93)|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|(11:115|(2:117|(2:119|(1:121)))|123|124|125|126|(1:128)|129|130|131|132)|137|138|(1:140)|141|131|132))|162|(2:164|165)|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|(0)|137|138|(0)|141|131|132) */
    /* JADX WARN: Can't wrap try/catch for region: R(68:1|(1:3)(1:196)|4|(1:6)(1:195)|7|(1:9)|(1:11)(1:194)|12|(2:190|(1:192)(1:193))(3:16|(2:187|(1:189))(3:20|(2:23|21)|24)|25)|26|(1:28)|29|(4:32|(3:34|35|36)(1:38)|37|30)|39|40|41|42|(1:44)(1:183)|45|46|(1:48)|49|50|(1:52)|53|(1:55)|(1:57)(1:181)|58|(2:59|(3:61|(2:63|64)(1:66)|65)(1:67))|68|(2:71|69)|72|73|(1:75)(1:180)|(1:77)(1:179)|78|(5:166|(1:168)|169|43e|174)(1:82)|83|(3:87|(1:89)(2:159|(1:161))|(29:91|(1:93)|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|(11:115|(2:117|(2:119|(1:121)))|123|124|125|126|(1:128)|129|130|131|132)|137|138|(1:140)|141|131|132))|162|(2:164|165)|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|(0)|137|138|(0)|141|131|132|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x05ff, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0600, code lost:
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0611, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0612, code lost:
        r2 = r16;
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0617, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0618, code lost:
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x061a, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x061b, code lost:
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x061c, code lost:
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x061e, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x061f, code lost:
        r8 = r2;
        r17 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05c6 A[Catch: Exception -> 0x05ff, TryCatch #0 {Exception -> 0x05ff, blocks: (B:126:0x05bc, B:128:0x05c6, B:130:0x05d0, B:132:0x05de), top: B:171:0x05bc }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0609  */
    /* JADX WARN: Type inference failed for: r1v2, types: [z4.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [B4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [u0.j, java.lang.Object] */
    @Override // o4.InterfaceC1071c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(H.e r48) {
        /*
            Method dump skipped, instructions count: 1697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.U.h(H.e):java.lang.Object");
    }

    public void i(Display display) {
        long j7;
        a3.t tVar = (a3.t) this.f981r;
        tVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            tVar.f5115k = refreshRate;
            j7 = (refreshRate * 80) / 100;
        } else {
            AbstractC0156a.K("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j7 = -9223372036854775807L;
            tVar.f5115k = -9223372036854775807L;
        }
        tVar.f5116l = j7;
    }

    public /* synthetic */ U(int i7, Object obj) {
        this.f980q = i7;
        this.f981r = obj;
    }

    public /* synthetic */ U(C0695a c0695a, C0016q c0016q, C0020v c0020v, IOException iOException, boolean z7) {
        this.f980q = 19;
        this.f981r = c0020v;
    }

    public /* synthetic */ U(C0695a c0695a, Object obj, int i7) {
        this.f980q = i7;
        this.f981r = obj;
    }
}
