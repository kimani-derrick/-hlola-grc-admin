package V4;

import H2.U;
import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.C0430h0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l4.C0975c;
import l4.InterfaceC0974b;
import r0.AbstractC1111a;
import t3.C1251o;
import t3.InterfaceC1237a;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: i  reason: collision with root package name */
    public static final long f3694i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f3695j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final N4.e f3696a;

    /* renamed from: b  reason: collision with root package name */
    public final M4.b f3697b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f3698c;
    public final Random d;

    /* renamed from: e  reason: collision with root package name */
    public final e f3699e;
    public final ConfigFetchHttpClient f;

    /* renamed from: g  reason: collision with root package name */
    public final n f3700g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f3701h;

    public k(N4.e eVar, M4.b bVar, ScheduledExecutorService scheduledExecutorService, Random random, e eVar2, ConfigFetchHttpClient configFetchHttpClient, n nVar, HashMap hashMap) {
        this.f3696a = eVar;
        this.f3697b = bVar;
        this.f3698c = scheduledExecutorService;
        this.d = random;
        this.f3699e = eVar2;
        this.f = configFetchHttpClient;
        this.f3700g = nVar;
        this.f3701h = hashMap;
    }

    public final j a(String str, String str2, Date date, Map map) {
        long millis;
        String str3;
        Long l7;
        try {
            HttpURLConnection b7 = this.f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f;
            HashMap d = d();
            String string = this.f3700g.f3708a.getString("last_fetch_etag", null);
            InterfaceC0974b interfaceC0974b = (InterfaceC0974b) this.f3697b.get();
            if (interfaceC0974b == null) {
                l7 = null;
            } else {
                l7 = (Long) ((C0430h0) ((C0975c) interfaceC0974b).f12266a.f11874r).d(null, null, true).get("_fot");
            }
            j fetch = configFetchHttpClient.fetch(b7, str, str2, d, string, map, l7, date);
            g gVar = fetch.f3692b;
            if (gVar != null) {
                n nVar = this.f3700g;
                long j7 = gVar.f;
                synchronized (nVar.f3709b) {
                    nVar.f3708a.edit().putLong("last_template_version", j7).apply();
                }
            }
            String str4 = fetch.f3693c;
            if (str4 != null) {
                this.f3700g.d(str4);
            }
            this.f3700g.c(0, n.f);
            return fetch;
        } catch (U4.j e3) {
            int i7 = e3.f3458q;
            n nVar2 = this.f3700g;
            if (i7 == 429 || i7 == 502 || i7 == 503 || i7 == 504) {
                int i8 = nVar2.a().f3705a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f3695j;
                nVar2.c(i8, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i8, iArr.length) - 1]) / 2) + this.d.nextInt((int) millis)));
            }
            m a7 = nVar2.a();
            int i9 = e3.f3458q;
            if (a7.f3705a <= 1 && i9 != 429) {
                if (i9 != 401) {
                    if (i9 != 403) {
                        if (i9 != 429) {
                            if (i9 != 500) {
                                switch (i9) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new h4.h("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new U4.j(e3.f3458q, "Fetch failed: ".concat(str3), e3);
            }
            a7.f3706b.getTime();
            throw new h4.h("Fetch was throttled.");
        }
    }

    public final C1251o b(C1251o c1251o, long j7, final Map map) {
        C1251o e3;
        final Date date = new Date(System.currentTimeMillis());
        boolean i7 = c1251o.i();
        Date date2 = null;
        n nVar = this.f3700g;
        if (i7) {
            nVar.getClass();
            Date date3 = new Date(nVar.f3708a.getLong("last_fetch_time_in_millis", -1L));
            if (!date3.equals(n.f3707e) && date.before(new Date(TimeUnit.SECONDS.toMillis(j7) + date3.getTime()))) {
                return m3.g.m(new j(2, null, null));
            }
        }
        Date date4 = nVar.a().f3706b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f3698c;
        if (date2 != null) {
            date2.getTime();
            e3 = m3.g.l(new h4.h("Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))));
        } else {
            N4.d dVar = (N4.d) this.f3696a;
            final C1251o d = dVar.d();
            final C1251o f = dVar.f();
            e3 = m3.g.H(d, f).e(executor, new InterfaceC1237a() { // from class: V4.i
                @Override // t3.InterfaceC1237a
                public final Object d(C1251o c1251o2) {
                    C1251o j8;
                    h4.h hVar;
                    Date date5 = date;
                    Map map2 = map;
                    k kVar = k.this;
                    kVar.getClass();
                    C1251o c1251o3 = d;
                    if (!c1251o3.i()) {
                        hVar = new h4.h("Firebase Installations failed to get installation ID for fetch.", c1251o3.f());
                    } else {
                        C1251o c1251o4 = f;
                        if (!c1251o4.i()) {
                            hVar = new h4.h("Firebase Installations failed to get installation auth token for fetch.", c1251o4.f());
                        } else {
                            try {
                                j a7 = kVar.a((String) c1251o3.g(), ((N4.a) c1251o4.g()).f2516a, date5, map2);
                                if (a7.f3691a != 0) {
                                    j8 = m3.g.m(a7);
                                } else {
                                    e eVar = kVar.f3699e;
                                    g gVar = a7.f3692b;
                                    eVar.getClass();
                                    U4.c cVar = new U4.c(eVar, 1, gVar);
                                    Executor executor2 = eVar.f3670a;
                                    j8 = m3.g.e(executor2, cVar).j(executor2, new c(eVar, gVar)).j(kVar.f3698c, new U(3, a7));
                                }
                                return j8;
                            } catch (U4.h e7) {
                                return m3.g.l(e7);
                            }
                        }
                    }
                    return m3.g.l(hVar);
                }
            });
        }
        return e3.e(executor, new T4.d(this, 2, date));
    }

    public final C1251o c(int i7) {
        HashMap hashMap = new HashMap(this.f3701h);
        hashMap.put("X-Firebase-RC-Fetch-Type", AbstractC1111a.j(2) + "/" + i7);
        return this.f3699e.b().e(this.f3698c, new T4.d(this, 1, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        InterfaceC0974b interfaceC0974b = (InterfaceC0974b) this.f3697b.get();
        if (interfaceC0974b == null) {
            return hashMap;
        }
        for (Map.Entry entry : ((C0430h0) ((C0975c) interfaceC0974b).f12266a.f11874r).d(null, null, false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
