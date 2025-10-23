package h1;

import J1.s;
import J1.t;
import J1.u;
import K1.B;
import K1.C0051b;
import K1.C0053d;
import K1.C0055f;
import K1.D;
import K1.F;
import K1.r;
import K1.v;
import K1.x;
import a1.C0197a;
import android.app.ActivityManager;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import b1.C0356c;
import b1.C0358e;
import b1.C0361h;
import com.boxhdo.android.data.local.AppDatabase;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import e1.C0575i;
import e1.C0580n;
import e1.C0583q;
import e1.InterfaceC0568b;
import e1.InterfaceC0581o;
import f1.C0660A;
import f1.C0669J;
import f1.C0672M;
import f1.C0694v;
import h6.q;
import h6.z;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import k1.C0935h;
import k3.AbstractC0958a;
import l.C0962b;
import l.ExecutorC0961a;
import n5.y;
import w4.l0;
import x0.AbstractC1445a;
import x0.C1449e;
import x5.C1467a;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class h implements InterfaceC1496a {

    /* renamed from: a  reason: collision with root package name */
    public final i f10877a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10878b;

    public h(i iVar, int i7) {
        this.f10877a = iVar;
        this.f10878b = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, javax.net.ssl.HostnameVerifier] */
    @Override // y5.InterfaceC1496a
    public final Object get() {
        boolean z7;
        ActivityManager activityManager;
        int i7;
        String str;
        int i8;
        z zVar;
        C1467a c1467a;
        C1467a c1467a2;
        C1467a c1467a3;
        boolean z8 = true;
        switch (this.f10878b) {
            case 0:
                return new L1.b((C0197a) this.f10877a.f10910e.get());
            case 1:
                return new C0197a((B0.b) this.f10877a.f10907c.get(), (y) this.f10877a.d.get());
            case 2:
                Context context = this.f10877a.f10903a.f3243a;
                AbstractC0958a.g(context);
                KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
                M5.g.e(build, "Builder(MasterKey.DEFAUL…IZE)\n            .build()");
                try {
                    try {
                        K1 k12 = new K1(context, 1);
                        k12.M(build);
                        return B0.b.a(context, k12.r());
                    } catch (Exception unused) {
                        K1 k13 = new K1(context, 1);
                        k13.M(build);
                        return B0.b.a(context, k13.r());
                    }
                } catch (Exception unused2) {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    keyStore.deleteEntry(build.getKeystoreAlias());
                    K1 k132 = new K1(context, 1);
                    k132.M(build);
                    return B0.b.a(context, k132.r());
                }
            case 3:
                return new y(new q(1));
            case 4:
                return new L1.h((C0197a) this.f10877a.f10910e.get(), (Z0.a) this.f10877a.f10913g.get());
            case 5:
                Context context2 = this.f10877a.f10903a.f3243a;
                AbstractC0958a.g(context2);
                return new Z0.a((y) this.f10877a.d.get(), context2, (C0197a) this.f10877a.f10910e.get());
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new K1.p((C0694v) this.f10877a.f10925m.get(), (J1.g) this.f10877a.n.get());
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                Z0.a aVar = (Z0.a) this.f10877a.f10913g.get();
                C0197a c0197a = (C0197a) this.f10877a.f10910e.get();
                C0361h c0361h = (C0361h) this.f10877a.f10919j.get();
                C0358e c0358e = (C0358e) this.f10877a.f10921k.get();
                C0356c c0356c = (C0356c) this.f10877a.f10923l.get();
                y yVar = (y) this.f10877a.d.get();
                Context context3 = this.f10877a.f10903a.f3243a;
                AbstractC0958a.g(context3);
                M5.g.f(aVar, "httpClientHolder");
                M5.g.f(c0197a, "encryptedPreference");
                M5.g.f(c0361h, "watchListDao");
                M5.g.f(c0358e, "historyDao");
                M5.g.f(c0356c, "continueWatchDao");
                M5.g.f(yVar, "moshi");
                return new C0694v(aVar, c0197a, c0361h, c0358e, c0356c, context3, yVar);
            case 8:
                AppDatabase appDatabase = (AppDatabase) this.f10877a.f10917i.get();
                M5.g.f(appDatabase, "appDatabase");
                C0361h o7 = appDatabase.o();
                AbstractC0958a.g(o7);
                return o7;
            case 9:
                Context context4 = this.f10877a.f10903a.f3243a;
                AbstractC0958a.g(context4);
                String i9 = g6.o.f10858a.i();
                if (i9 != null && !U5.n.X(i9)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!z7) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    S0.l lVar = new S0.l(2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ExecutorC0961a executorC0961a = C0962b.f12228e;
                    L4.f fVar = new L4.f(3);
                    Object systemService = context4.getSystemService("activity");
                    if (systemService instanceof ActivityManager) {
                        activityManager = (ActivityManager) systemService;
                    } else {
                        activityManager = null;
                    }
                    if (activityManager != null && !activityManager.isLowRamDevice()) {
                        i7 = 3;
                    } else {
                        i7 = 2;
                    }
                    C1449e c1449e = new C1449e(context4, i9, fVar, lVar, arrayList, i7, executorC0961a, executorC0961a, false, true, linkedHashSet, arrayList2, arrayList3);
                    Package r22 = AppDatabase.class.getPackage();
                    M5.g.c(r22);
                    String name = r22.getName();
                    String canonicalName = AppDatabase.class.getCanonicalName();
                    M5.g.c(canonicalName);
                    M5.g.e(name, "fullPackage");
                    if (name.length() != 0) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                        M5.g.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                    }
                    String replace = canonicalName.replace('.', '_');
                    M5.g.e(replace, "replace(...)");
                    String concat = replace.concat("_Impl");
                    try {
                        if (name.length() == 0) {
                            str = concat;
                        } else {
                            str = name + '.' + concat;
                        }
                        Class<?> cls = Class.forName(str, true, AppDatabase.class.getClassLoader());
                        M5.g.d(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                        AppDatabase appDatabase2 = (AppDatabase) cls.getDeclaredConstructor(null).newInstance(null);
                        appDatabase2.getClass();
                        appDatabase2.d = appDatabase2.e(c1449e);
                        Set h7 = appDatabase2.h();
                        BitSet bitSet = new BitSet();
                        Iterator it = h7.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            LinkedHashMap linkedHashMap = appDatabase2.f7289h;
                            List list = c1449e.f16159m;
                            if (hasNext) {
                                Class cls2 = (Class) it.next();
                                int size = list.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i10 = size - 1;
                                        if (cls2.isAssignableFrom(list.get(size).getClass())) {
                                            bitSet.set(size);
                                        } else if (i10 >= 0) {
                                            size = i10;
                                        }
                                    }
                                }
                                size = -1;
                                if (size >= 0) {
                                    linkedHashMap.put(cls2, list.get(size));
                                } else {
                                    throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                                }
                            } else {
                                int size2 = list.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i11 = size2 - 1;
                                        if (bitSet.get(size2)) {
                                            if (i11 >= 0) {
                                                size2 = i11;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                                        }
                                    }
                                }
                                Iterator it2 = appDatabase2.f(linkedHashMap).iterator();
                                if (!it2.hasNext()) {
                                    x0.o oVar = (x0.o) AppDatabase.n(x0.o.class, appDatabase2.g());
                                    AbstractC1445a abstractC1445a = (AbstractC1445a) AppDatabase.n(AbstractC1445a.class, appDatabase2.g());
                                    if (c1449e.f != 3) {
                                        z8 = false;
                                    }
                                    appDatabase2.g().setWriteAheadLoggingEnabled(z8);
                                    appDatabase2.f7288g = c1449e.f16152e;
                                    appDatabase2.f7285b = c1449e.f16153g;
                                    appDatabase2.f7286c = new x0.q(c1449e.f16154h);
                                    appDatabase2.f = false;
                                    Map i12 = appDatabase2.i();
                                    BitSet bitSet2 = new BitSet();
                                    Iterator it3 = i12.entrySet().iterator();
                                    while (true) {
                                        boolean hasNext2 = it3.hasNext();
                                        List list2 = c1449e.f16158l;
                                        if (hasNext2) {
                                            Map.Entry entry = (Map.Entry) it3.next();
                                            Class cls3 = (Class) entry.getKey();
                                            for (Class cls4 : (List) entry.getValue()) {
                                                int size3 = list2.size() - 1;
                                                if (size3 >= 0) {
                                                    i8 = size3;
                                                    while (true) {
                                                        int i13 = i8 - 1;
                                                        if (cls4.isAssignableFrom(list2.get(i8).getClass())) {
                                                            bitSet2.set(i8);
                                                        } else if (i13 >= 0) {
                                                            i8 = i13;
                                                        }
                                                    }
                                                }
                                                i8 = -1;
                                                if (i8 >= 0) {
                                                    appDatabase2.f7293l.put(cls4, list2.get(i8));
                                                } else {
                                                    throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                                                }
                                            }
                                        } else {
                                            int size4 = list2.size() - 1;
                                            if (size4 >= 0) {
                                                while (true) {
                                                    int i14 = size4 - 1;
                                                    if (bitSet2.get(size4)) {
                                                        if (i14 >= 0) {
                                                            size4 = i14;
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                    }
                                                }
                                            }
                                            return appDatabase2;
                                        }
                                    }
                                } else {
                                    AbstractC0515y1.v(it2.next());
                                    throw null;
                                }
                            }
                        }
                    } catch (ClassNotFoundException unused3) {
                        throw new RuntimeException("Cannot find implementation for " + AppDatabase.class.getCanonicalName() + ". " + concat + " does not exist");
                    } catch (IllegalAccessException unused4) {
                        throw new RuntimeException("Cannot access the constructor " + AppDatabase.class.getCanonicalName());
                    } catch (InstantiationException unused5) {
                        throw new RuntimeException("Failed to create an instance of " + AppDatabase.class.getCanonicalName());
                    }
                } else {
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
                }
                break;
            case 10:
                AppDatabase appDatabase3 = (AppDatabase) this.f10877a.f10917i.get();
                M5.g.f(appDatabase3, "appDatabase");
                C0358e j7 = appDatabase3.j();
                AbstractC0958a.g(j7);
                return j7;
            case 11:
                AppDatabase appDatabase4 = (AppDatabase) this.f10877a.f10917i.get();
                M5.g.f(appDatabase4, "appDatabase");
                C0356c c5 = appDatabase4.c();
                AbstractC0958a.g(c5);
                return c5;
            case 12:
                return new Object();
            case 13:
                return new r((C0694v) this.f10877a.f10925m.get(), (J1.p) this.f10877a.f10930p.get());
            case 14:
                return new J1.p((J1.g) this.f10877a.n.get());
            case 15:
                return new K1.n((C0694v) this.f10877a.f10925m.get(), (J1.f) this.f10877a.f10934r.get());
            case 16:
                return new Object();
            case 17:
                return new L1.j((C0660A) this.f10877a.f10937u.get());
            case 18:
                Z0.a aVar2 = (Z0.a) this.f10877a.f10913g.get();
                InterfaceC0568b interfaceC0568b = (InterfaceC0568b) this.f10877a.f10936t.get();
                C0197a c0197a2 = (C0197a) this.f10877a.f10910e.get();
                M5.g.f(aVar2, "httpClientHolder");
                M5.g.f(interfaceC0568b, "appService");
                M5.g.f(c0197a2, "encryptedPreference");
                return new C0660A(aVar2, interfaceC0568b, c0197a2);
            case 19:
                y yVar2 = (y) this.f10877a.d.get();
                C0197a c0197a3 = (C0197a) this.f10877a.f10910e.get();
                M5.g.f(yVar2, "moshi");
                M5.g.f(c0197a3, "encryptedPreference");
                u6.b bVar = new u6.b();
                bVar.f15081b = 1;
                try {
                    TrustManager[] trustManagerArr = {new Object()};
                    SSLContext sSLContext = SSLContext.getInstance("SSL");
                    sSLContext.init(null, trustManagerArr, new SecureRandom());
                    SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                    h6.y yVar3 = new h6.y();
                    yVar3.b(TimeUnit.MINUTES);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    M5.g.f(timeUnit, "unit");
                    yVar3.f11243v = i6.b.b(30L, timeUnit);
                    yVar3.c(30L, timeUnit);
                    yVar3.a(bVar);
                    M5.g.e(socketFactory, "sslSocketFactory");
                    Object[] objArr = trustManagerArr[0];
                    M5.g.d(objArr, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    yVar3.d(socketFactory, (X509TrustManager) objArr);
                    ?? obj = new Object();
                    if (!M5.g.a(obj, yVar3.f11239r)) {
                        yVar3.f11246y = null;
                    }
                    yVar3.f11239r = obj;
                    zVar = new z(yVar3);
                } catch (Exception unused6) {
                    h6.y yVar4 = new h6.y();
                    yVar4.b(TimeUnit.MINUTES);
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    M5.g.f(timeUnit2, "unit");
                    yVar4.f11243v = i6.b.b(30L, timeUnit2);
                    yVar4.c(30L, timeUnit2);
                    yVar4.a(bVar);
                    zVar = new z(yVar4);
                }
                H.e eVar = new H.e(9);
                eVar.f778s = zVar;
                eVar.p(l0.s(c0197a3));
                eVar.n(y6.a.c(yVar2));
                Object b7 = eVar.r().b(InterfaceC0568b.class);
                M5.g.e(b7, "retrofit.create(AppService::class.java)");
                return (InterfaceC0568b) b7;
            case 20:
                return new L1.d((C0660A) this.f10877a.f10937u.get());
            case 21:
                Context context5 = this.f10877a.f10903a.f3243a;
                AbstractC0958a.g(context5);
                return new C0935h(context5);
            case 22:
                return new L1.g((C0660A) this.f10877a.f10937u.get(), (J1.a) this.f10877a.f10942z.get());
            case 23:
                return new J1.a((J1.k) this.f10877a.f10941y.get());
            case 24:
                return new Object();
            case 25:
                return new M1.h((C0669J) this.f10877a.f10883E.get());
            case 26:
                InterfaceC1496a interfaceC1496a = this.f10877a.f10882D;
                if (interfaceC1496a instanceof C1467a) {
                    c1467a = (C1467a) interfaceC1496a;
                } else {
                    interfaceC1496a.getClass();
                    c1467a = new C1467a(interfaceC1496a);
                }
                C0197a c0197a4 = (C0197a) this.f10877a.f10910e.get();
                M5.g.f(c1467a, "traktService");
                M5.g.f(c0197a4, "encryptedPreference");
                return new C0669J(c1467a, c0197a4);
            case 27:
                y yVar5 = (y) this.f10877a.d.get();
                InterfaceC1496a interfaceC1496a2 = this.f10877a.f10881C;
                if (interfaceC1496a2 instanceof C1467a) {
                    c1467a2 = (C1467a) interfaceC1496a2;
                } else {
                    interfaceC1496a2.getClass();
                    c1467a2 = new C1467a(interfaceC1496a2);
                }
                M5.g.f(yVar5, "moshi");
                M5.g.f(c1467a2, "traktAuthManager");
                u6.b bVar2 = new u6.b();
                bVar2.f15081b = 1;
                h6.y yVar6 = new h6.y();
                yVar6.b(TimeUnit.MINUTES);
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                yVar6.c(30L, timeUnit3);
                yVar6.f11245x = i6.b.b(30L, timeUnit3);
                yVar6.a(new C0575i(c1467a2));
                yVar6.f11229g = new C0583q(c1467a2);
                yVar6.a(bVar2);
                H.e eVar2 = new H.e(9);
                eVar2.f778s = new z(yVar6);
                eVar2.p(g6.o.f10858a.Q());
                eVar2.n(y6.a.c(yVar5));
                Object b8 = eVar2.r().b(e1.r.class);
                M5.g.e(b8, "retrofit.create(TraktService::class.java)");
                return (e1.r) b8;
            case 28:
                InterfaceC1496a interfaceC1496a3 = this.f10877a.f10880B;
                if (interfaceC1496a3 instanceof C1467a) {
                    c1467a3 = (C1467a) interfaceC1496a3;
                } else {
                    interfaceC1496a3.getClass();
                    c1467a3 = new C1467a(interfaceC1496a3);
                }
                return new C0580n(c1467a3, (C0197a) this.f10877a.f10910e.get());
            case 29:
                y yVar7 = (y) this.f10877a.d.get();
                M5.g.f(yVar7, "moshi");
                u6.b bVar3 = new u6.b();
                bVar3.f15081b = 1;
                h6.y yVar8 = new h6.y();
                yVar8.b(TimeUnit.MINUTES);
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                yVar8.c(30L, timeUnit4);
                yVar8.f11245x = i6.b.b(30L, timeUnit4);
                yVar8.a(bVar3);
                H.e eVar3 = new H.e(9);
                eVar3.f778s = new z(yVar8);
                eVar3.p(g6.o.f10858a.Q());
                eVar3.n(y6.a.c(yVar7));
                Object b9 = eVar3.r().b(InterfaceC0581o.class);
                M5.g.e(b9, "retrofit.create(TraktAuthService::class.java)");
                return (InterfaceC0581o) b9;
            case 30:
                return new Object();
            case 31:
                return new B((C0694v) this.f10877a.f10925m.get(), (J1.j) this.f10877a.f10895R.get());
            case 32:
                return new J1.j((J1.m) this.f10877a.f10890M.get(), (J1.q) this.f10877a.f10892O.get(), (J1.h) this.f10877a.f10891N.get(), (J1.r) this.f10877a.f10893P.get(), (J1.n) this.f10877a.f10894Q.get());
            case 33:
                return new J1.m((J1.i) this.f10877a.f10885H.get(), (J1.b) this.f10877a.f10886I.get(), (J1.e) this.f10877a.f10887J.get(), (t) this.f10877a.f10888K.get(), (J1.c) this.f10877a.f10889L.get());
            case 34:
                return new Object();
            case 35:
                return new Object();
            case 36:
                return new Object();
            case 37:
                return new Object();
            case 38:
                return new Object();
            case 39:
                return new J1.q((J1.h) this.f10877a.f10891N.get());
            case 40:
                return new Object();
            case 41:
                return new J1.r((J1.m) this.f10877a.f10890M.get());
            case 42:
                return new Object();
            case 43:
                return new K1.l((C0694v) this.f10877a.f10925m.get(), (J1.d) this.f10877a.f10897T.get());
            case 44:
                return new Object();
            case 45:
                return new M1.b((C0669J) this.f10877a.f10883E.get(), (s) this.f10877a.f10899V.get());
            case 46:
                return new Object();
            case 47:
                return new M1.e((C0669J) this.f10877a.f10883E.get());
            case 48:
                return new K1.t((C0694v) this.f10877a.f10925m.get(), (J1.m) this.f10877a.f10890M.get(), (C0672M) this.f10877a.f10901Y.get());
            case 49:
                Z0.a aVar3 = (Z0.a) this.f10877a.f10913g.get();
                C0197a c0197a5 = (C0197a) this.f10877a.f10910e.get();
                C0361h c0361h2 = (C0361h) this.f10877a.f10919j.get();
                M5.g.f(aVar3, "httpClientHolder");
                M5.g.f(c0197a5, "encryptedPreference");
                M5.g.f(c0361h2, "watchListDao");
                return new C0672M(aVar3, c0197a5, c0361h2);
            case 50:
                return new C0053d((C0694v) this.f10877a.f10925m.get(), (C0669J) this.f10877a.f10883E.get());
            case 51:
                return new D((C0694v) this.f10877a.f10925m.get(), (C0669J) this.f10877a.f10883E.get());
            case 52:
                return new K1.z((C0694v) this.f10877a.f10925m.get(), (J1.o) this.f10877a.f10908c0.get());
            case 53:
                return new J1.o((J1.m) this.f10877a.f10890M.get());
            case 54:
                return new N1.b((C0694v) this.f10877a.f10925m.get());
            case 55:
                return new C0055f((C0694v) this.f10877a.f10925m.get());
            case 56:
                return new K1.j((C0694v) this.f10877a.f10925m.get());
            case 57:
                return new x((C0694v) this.f10877a.f10925m.get(), (J1.m) this.f10877a.f10890M.get());
            case 58:
                return new N1.d((C0672M) this.f10877a.f10901Y.get(), (u) this.f10877a.f10918i0.get());
            case 59:
                return new Object();
            case 60:
                return new v((C0694v) this.f10877a.f10925m.get(), (J1.m) this.f10877a.f10890M.get());
            case 61:
                return new L1.e((C0197a) this.f10877a.f10910e.get());
            case 62:
                return new L1.k((C0197a) this.f10877a.f10910e.get());
            case 63:
                return new C0051b((C0694v) this.f10877a.f10925m.get());
            case 64:
                return new K1.h((C0694v) this.f10877a.f10925m.get());
            case 65:
                return new F((C0694v) this.f10877a.f10925m.get(), (J1.m) this.f10877a.f10890M.get());
            case 66:
                M5.g.f((C0694v) this.f10877a.f10925m.get(), "movieRepository");
                M5.g.f((J1.m) this.f10877a.f10890M.get(), "movieMapper");
                return new Object();
            default:
                throw new AssertionError(this.f10878b);
        }
    }
}
