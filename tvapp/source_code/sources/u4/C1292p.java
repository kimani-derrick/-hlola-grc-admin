package u4;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import b1.CallableC0359f;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k.V0;
import r4.C1119a;
import s4.InterfaceC1213a;
import t3.AbstractC1245i;
import t3.C1244h;
import t3.C1248l;
import t3.C1251o;
import v4.C1326d;
import v4.C1327e;
import v4.C1329g;
import v4.C1334l;
import v4.InterfaceC1325c;
import w4.C1410c0;
import w4.C1412d0;
import w4.C1414e0;
import w4.C1416f0;
import w4.E0;
import w4.F0;
import w4.H;
import w4.I;
import x4.C1466a;
import z4.C1517a;
import z4.C1518b;
/* renamed from: u4.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292p {

    /* renamed from: r  reason: collision with root package name */
    public static final C1285i f15020r = new C1285i(1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f15021a;

    /* renamed from: b  reason: collision with root package name */
    public final v f15022b;

    /* renamed from: c  reason: collision with root package name */
    public final t2.i f15023c;
    public final V0 d;

    /* renamed from: e  reason: collision with root package name */
    public final C4.b f15024e;
    public final C1273A f;

    /* renamed from: g  reason: collision with root package name */
    public final C1518b f15025g;

    /* renamed from: h  reason: collision with root package name */
    public final C1277a f15026h;

    /* renamed from: i  reason: collision with root package name */
    public final C1327e f15027i;

    /* renamed from: j  reason: collision with root package name */
    public final C1119a f15028j;

    /* renamed from: k  reason: collision with root package name */
    public final InterfaceC1213a f15029k;

    /* renamed from: l  reason: collision with root package name */
    public final C1287k f15030l;

    /* renamed from: m  reason: collision with root package name */
    public final C1518b f15031m;
    public u n;

    /* renamed from: o  reason: collision with root package name */
    public final C1244h f15032o = new C1244h();

    /* renamed from: p  reason: collision with root package name */
    public final C1244h f15033p = new C1244h();

    /* renamed from: q  reason: collision with root package name */
    public final C1244h f15034q = new C1244h();

    public C1292p(Context context, C4.b bVar, C1273A c1273a, v vVar, C1518b c1518b, t2.i iVar, C1277a c1277a, V0 v02, C1327e c1327e, C1518b c1518b2, C1119a c1119a, InterfaceC1213a interfaceC1213a, C1287k c1287k) {
        new AtomicBoolean(false);
        this.f15021a = context;
        this.f15024e = bVar;
        this.f = c1273a;
        this.f15022b = vVar;
        this.f15025g = c1518b;
        this.f15023c = iVar;
        this.f15026h = c1277a;
        this.d = v02;
        this.f15027i = c1327e;
        this.f15028j = c1119a;
        this.f15029k = interfaceC1213a;
        this.f15030l = c1287k;
        this.f15031m = c1518b2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [B4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [J3.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [J3.j, java.lang.Object] */
    public static void a(C1292p c1292p, String str, Boolean bool) {
        int i7;
        Integer num;
        c1292p.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String x7 = AbstractC0515y1.x("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", x7, null);
        }
        Locale locale = Locale.US;
        C1273A c1273a = c1292p.f;
        C1277a c1277a = c1292p.f15026h;
        String str2 = c1273a.f14974c;
        String str3 = c1277a.f;
        String str4 = c1273a.c().f14988a;
        if (c1277a.d != null) {
            i7 = 4;
        } else {
            i7 = 1;
        }
        C1412d0 c1412d0 = new C1412d0(str2, str3, c1277a.f14983g, str4, AbstractC0515y1.e(i7), c1277a.f14984h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C1416f0 c1416f0 = new C1416f0(str5, str6, AbstractC1284h.h());
        Context context = c1292p.f15021a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC1283g enumC1283g = EnumC1283g.f14996q;
        String str7 = Build.CPU_ABI;
        boolean isEmpty = TextUtils.isEmpty(str7);
        EnumC1283g enumC1283g2 = EnumC1283g.f14996q;
        if (isEmpty) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            EnumC1283g enumC1283g3 = (EnumC1283g) EnumC1283g.f14997r.get(str7.toLowerCase(locale));
            if (enumC1283g3 != null) {
                enumC1283g2 = enumC1283g3;
            }
        }
        int ordinal = enumC1283g2.ordinal();
        String str8 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b7 = AbstractC1284h.b(context);
        boolean g7 = AbstractC1284h.g();
        int d = AbstractC1284h.d();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        c1292p.f15028j.d(str, "Crashlytics Android SDK/19.0.1", currentTimeMillis, new C1410c0(c1412d0, c1416f0, new C1414e0(ordinal, str8, availableProcessors, b7, blockCount, g7, d, str9, str10)));
        if (bool.booleanValue() && str != null) {
            V0 v02 = c1292p.d;
            synchronized (((String) v02.f11962c)) {
                try {
                    v02.f11962c = str;
                    Map a7 = ((C1326d) ((AtomicMarkableReference) ((L0.b) v02.d).f1863b).getReference()).a();
                    List n = ((H.j) v02.f).n();
                    if (((String) ((AtomicMarkableReference) v02.f11964g).getReference()) != null) {
                        ((C1329g) v02.f11960a).i(str, (String) ((AtomicMarkableReference) v02.f11964g).getReference());
                    }
                    if (!a7.isEmpty()) {
                        ((C1329g) v02.f11960a).g(str, a7, false);
                    }
                    if (!n.isEmpty()) {
                        ((C1329g) v02.f11960a).h(str, n);
                    }
                } finally {
                }
            }
        }
        C1327e c1327e = c1292p.f15027i;
        ((InterfaceC1325c) c1327e.f15333b).b();
        c1327e.f15333b = C1327e.f15331c;
        if (str != null) {
            c1327e.f15333b = new C1334l(((C1518b) c1327e.f15332a).n(str, "userlog"));
        }
        c1292p.f15030l.a(str);
        C1518b c1518b = c1292p.f15031m;
        t tVar = (t) c1518b.f16461a;
        tVar.getClass();
        Charset charset = F0.f15894a;
        ?? obj = new Object();
        obj.f1373a = "19.0.1";
        C1277a c1277a2 = tVar.f15054c;
        String str11 = c1277a2.f14979a;
        if (str11 != null) {
            obj.f1374b = str11;
            C1273A c1273a2 = tVar.f15053b;
            String str12 = c1273a2.c().f14988a;
            if (str12 != null) {
                obj.d = str12;
                obj.f1376e = c1273a2.c().f14989b;
                obj.f = c1273a2.c().f14990c;
                String str13 = c1277a2.f;
                if (str13 != null) {
                    obj.f1378h = str13;
                    String str14 = c1277a2.f14983g;
                    if (str14 != null) {
                        obj.f1379i = str14;
                        obj.f1375c = 4;
                        ?? obj2 = new Object();
                        obj2.f = Boolean.FALSE;
                        obj2.d = Long.valueOf(currentTimeMillis);
                        if (str != null) {
                            obj2.f1374b = str;
                            String str15 = t.f15051g;
                            if (str15 != null) {
                                obj2.f1373a = str15;
                                String str16 = c1273a2.f14974c;
                                if (str16 != null) {
                                    String str17 = c1273a2.c().f14988a;
                                    androidx.fragment.app.D d7 = c1277a2.f14984h;
                                    if (((androidx.fragment.app.D) d7.f5884s) == null) {
                                        d7.f5884s = new androidx.fragment.app.D(d7);
                                    }
                                    androidx.fragment.app.D d8 = (androidx.fragment.app.D) d7.f5884s;
                                    String str18 = (String) d8.f5883r;
                                    if (d8 == null) {
                                        d7.f5884s = new androidx.fragment.app.D(d7);
                                    }
                                    obj2.f1377g = new I(str16, str13, str14, str17, str18, (String) ((androidx.fragment.app.D) d7.f5884s).f5884s);
                                    C4.b bVar = new C4.b(25, false);
                                    bVar.f423t = 3;
                                    bVar.f421r = str5;
                                    bVar.f422s = str6;
                                    bVar.f424u = Boolean.valueOf(AbstractC1284h.h());
                                    obj2.f1379i = bVar.j();
                                    StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                    int i8 = 7;
                                    if (!TextUtils.isEmpty(str7) && (num = (Integer) t.f.get(str7.toLowerCase(locale))) != null) {
                                        i8 = num.intValue();
                                    }
                                    int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                    long b8 = AbstractC1284h.b(tVar.f15052a);
                                    long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                    boolean g8 = AbstractC1284h.g();
                                    int d9 = AbstractC1284h.d();
                                    ?? obj3 = new Object();
                                    obj3.f264a = Integer.valueOf(i8);
                                    obj3.f265b = str8;
                                    obj3.f266c = Integer.valueOf(availableProcessors2);
                                    obj3.d = Long.valueOf(b8);
                                    obj3.f267e = Long.valueOf(blockCount2);
                                    obj3.f = Boolean.valueOf(g8);
                                    obj3.f268g = Integer.valueOf(d9);
                                    obj3.f269h = str9;
                                    obj3.f270i = str10;
                                    obj2.f1380j = obj3.b();
                                    obj2.f1382l = 3;
                                    obj.f1380j = obj2.c();
                                    w4.B b9 = obj.b();
                                    C1518b c1518b2 = ((C1517a) c1518b.f16462b).f16459b;
                                    E0 e02 = b9.f15877k;
                                    if (e02 == null) {
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str19 = ((H) e02).f15898b;
                                    try {
                                        C1517a.f16455g.getClass();
                                        C1517a.f(c1518b2.n(str19, "report"), C1466a.f16220a.L(b9));
                                        File n7 = c1518b2.n(str19, "start-time");
                                        long j7 = ((H) e02).d;
                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(n7), C1517a.f16454e);
                                        outputStreamWriter.write("");
                                        n7.setLastModified(j7 * 1000);
                                        outputStreamWriter.close();
                                        return;
                                    } catch (IOException e3) {
                                        String x8 = AbstractC0515y1.x("Could not persist report for session ", str19);
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", x8, e3);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new NullPointerException("Null identifier");
                            }
                            throw new NullPointerException("Null generator");
                        }
                        throw new NullPointerException("Null identifier");
                    }
                    throw new NullPointerException("Null displayVersion");
                }
                throw new NullPointerException("Null buildVersion");
            }
            throw new NullPointerException("Null installationUuid");
        }
        throw new NullPointerException("Null gmpAppId");
    }

    public static C1251o b(C1292p c1292p) {
        C1251o e3;
        c1292p.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C1518b.u(((File) c1292p.f15025g.f16462b).listFiles(f15020r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    e3 = m3.g.m(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    e3 = m3.g.e(new ScheduledThreadPoolExecutor(1), new CallableC0359f(1, parseLong, c1292p));
                }
                arrayList.add(e3);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return m3.g.G(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f() {
        /*
            java.lang.Class<u4.p> r0 = u4.C1292p.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L12
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r2, r0, r1)
        L10:
            r0 = r1
            goto L20
        L12:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L20
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r2, r0, r1)
            goto L10
        L20:
            if (r0 != 0) goto L23
            return r1
        L23:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r2, r3, r1)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L44
            r1.write(r2, r5, r3)
            goto L38
        L44:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C1292p.f():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x03a9, code lost:
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2) != false) goto L282;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x046f A[LOOP:1: B:143:0x046f->B:148:0x048c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0701 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b9  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v20, types: [z4.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r2v17, types: [B4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v27, types: [B4.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r32, B4.d r33) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C1292p.c(boolean, B4.d):void");
    }

    public final boolean d(B4.d dVar) {
        boolean z7;
        if (Boolean.TRUE.equals(((ThreadLocal) this.f15024e.f424u).get())) {
            u uVar = this.n;
            if (uVar != null && uVar.f15059e.get()) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, dVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e3) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e3);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c5 = ((C1517a) this.f15031m.f16462b).c();
        if (!c5.isEmpty()) {
            return (String) c5.first();
        }
        return null;
    }

    public final void g() {
        try {
            String f = f();
            if (f != null) {
                try {
                    this.d.l(f);
                } catch (IllegalArgumentException e3) {
                    Context context = this.f15021a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e3;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e7);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, t3.g] */
    public final C1251o h(C1251o c1251o) {
        C1251o c1251o2;
        C1251o c1251o3;
        C1518b c1518b = ((C1517a) this.f15031m.f16462b).f16459b;
        boolean isEmpty = C1518b.u(((File) c1518b.d).listFiles()).isEmpty();
        C1244h c1244h = this.f15032o;
        if (isEmpty && C1518b.u(((File) c1518b.f16464e).listFiles()).isEmpty() && C1518b.u(((File) c1518b.f).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            c1244h.b(Boolean.FALSE);
            return m3.g.m(null);
        }
        r4.c cVar = r4.c.f13480a;
        cVar.e("Crash reports are available to be sent.");
        v vVar = this.f15022b;
        if (vVar.c()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            c1244h.b(Boolean.FALSE);
            c1251o3 = m3.g.m(Boolean.TRUE);
        } else {
            cVar.c("Automatic data collection is disabled.");
            cVar.e("Notifying that unsent reports are available.");
            c1244h.b(Boolean.TRUE);
            synchronized (vVar.f15062c) {
                c1251o2 = ((C1244h) vVar.d).f14573a;
            }
            ?? obj = new Object();
            c1251o2.getClass();
            T1.r rVar = AbstractC1245i.f14574a;
            C1251o c1251o4 = new C1251o();
            c1251o2.f14596b.m(new C1248l(rVar, obj, c1251o4));
            c1251o2.o();
            cVar.c("Waiting for send/deleteUnsentReports to be called.");
            C1251o c1251o5 = this.f15033p.f14573a;
            ExecutorService executorService = AbstractC1276D.f14978a;
            C1244h c1244h2 = new C1244h();
            C1275C c1275c = new C1275C(c1244h2, 1);
            c1251o4.d(rVar, c1275c);
            c1251o5.getClass();
            c1251o5.d(rVar, c1275c);
            c1251o3 = c1244h2.f14573a;
        }
        t2.i iVar = new t2.i(this, 4, c1251o);
        c1251o3.getClass();
        T1.r rVar2 = AbstractC1245i.f14574a;
        C1251o c1251o6 = new C1251o();
        c1251o3.f14596b.m(new C1248l(rVar2, iVar, c1251o6));
        c1251o3.o();
        return c1251o6;
    }
}
