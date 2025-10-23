package T4;

import H.e;
import H2.A;
import H2.C0020v;
import U4.i;
import V4.k;
import V4.p;
import W2.l;
import Z2.m;
import Z2.n;
import a2.C0198a;
import a2.C0199b;
import a2.h;
import a2.j;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import android.util.Log;
import b2.InterfaceC0363b;
import e2.K;
import f2.C0695a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m3.g;
import o4.C1069a;
import o4.InterfaceC1071c;
import t3.C1251o;
import t3.InterfaceC1237a;
import z4.C1518b;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1071c, InterfaceC1237a, l, InterfaceC0363b, h, n, m, M4.a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3383q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3384r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3385s;

    public /* synthetic */ d(W2.h hVar, String str) {
        this.f3383q = 5;
        this.f3385s = hVar;
        this.f3384r = str;
    }

    private final Object g(C1251o c1251o) {
        k kVar = (k) this.f3384r;
        Date date = (Date) this.f3385s;
        kVar.getClass();
        if (c1251o.i()) {
            V4.n nVar = kVar.f3700g;
            synchronized (nVar.f3709b) {
                nVar.f3708a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception f = c1251o.f();
            if (f != null) {
                boolean z7 = f instanceof i;
                V4.n nVar2 = kVar.f3700g;
                if (z7) {
                    nVar2.g();
                } else {
                    nVar2.f();
                }
            }
        }
        return c1251o;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    @Override // W2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public O3.U a(int r22, H2.m0 r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.d.a(int, H2.m0, int[]):O3.U");
    }

    @Override // a2.h
    public Object apply(Object obj) {
        Q1.c[] values;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        j jVar = (j) this.f3384r;
        C0198a c0198a = jVar.f5001t;
        int i7 = c0198a.f4983b;
        T1.i iVar = (T1.i) this.f3385s;
        ArrayList h7 = jVar.h(sQLiteDatabase, iVar, i7);
        for (Q1.c cVar : Q1.c.values()) {
            if (cVar != iVar.f3242c) {
                int size = c0198a.f4983b - h7.size();
                if (size <= 0) {
                    break;
                }
                h7.addAll(jVar.h(sQLiteDatabase, iVar.b(cVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < h7.size(); i8++) {
            sb.append(((C0199b) h7.get(i8)).f4986a);
            if (i8 < h7.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j7 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j7));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j7), set);
                }
                set.add(new a2.i(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = h7.listIterator();
        while (listIterator.hasNext()) {
            C0199b c0199b = (C0199b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(c0199b.f4986a))) {
                C1518b c5 = c0199b.f4988c.c();
                long j8 = c0199b.f4986a;
                for (a2.i iVar2 : (Set) hashMap.get(Long.valueOf(j8))) {
                    c5.b(iVar2.f4995a, iVar2.f4996b);
                }
                listIterator.set(new C0199b(j8, c0199b.f4987b, c5.f()));
            }
        }
        return h7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v34, types: [e2.K, int] */
    /* JADX WARN: Type inference failed for: r14v18, types: [e2.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    @Override // Z2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.Object r30, Z2.C0162g r31) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.d.b(java.lang.Object, Z2.g):void");
    }

    @Override // Z2.m
    public void c(Object obj) {
        f2.k kVar = (f2.k) obj;
        kVar.getClass();
        C0695a c0695a = (C0695a) this.f3384r;
        if (c0695a.d != null) {
            C0020v c0020v = (C0020v) this.f3385s;
            K k5 = c0020v.f1177c;
            k5.getClass();
            A a7 = c0695a.d;
            a7.getClass();
            C.d dVar = new C.d(k5, c0020v.d, kVar.f10371b.d(c0695a.f10335b, a7), 6);
            int i7 = c0020v.f1176b;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            kVar.f10383q = dVar;
                            return;
                        }
                        return;
                    }
                } else {
                    kVar.f10382p = dVar;
                    return;
                }
            }
            kVar.f10381o = dVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.InterfaceC1237a
    public Object d(C1251o c1251o) {
        Integer num;
        Throwable th;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        Integer num2;
        boolean z7;
        boolean z8;
        U4.j jVar;
        int responseCode;
        boolean d;
        switch (this.f3383q) {
            case 1:
                return ((k) this.f3384r).b(c1251o, 0L, (Map) this.f3385s);
            case 2:
                g(c1251o);
                return c1251o;
            default:
                p pVar = (p) this.f3384r;
                C1251o c1251o2 = (C1251o) this.f3385s;
                pVar.getClass();
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = c1251o2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    httpURLConnection2 = null;
                    num2 = null;
                } catch (Throwable th3) {
                    num = null;
                    th = th3;
                    httpURLConnection = null;
                }
                if (c1251o2.i()) {
                    pVar.i(true);
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) c1251o2.g();
                    try {
                        responseCode = httpURLConnection3.getResponseCode();
                        num2 = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                synchronized (pVar) {
                                    pVar.f3716c = 8;
                                }
                                pVar.f3725o.e(0, V4.n.f);
                                pVar.k(httpURLConnection3).e();
                            } catch (IOException e7) {
                                e = e7;
                                httpURLConnection2 = httpURLConnection3;
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                p.b(httpURLConnection2);
                                pVar.i(false);
                                if (num2 != null && !p.d(num2.intValue())) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (z8) {
                                    pVar.n.getClass();
                                    pVar.l(new Date(System.currentTimeMillis()));
                                }
                                if (!z8 && num2.intValue() != 200) {
                                    String format = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                                    if (num2.intValue() == 403) {
                                        format = p.f(httpURLConnection2.getErrorStream());
                                    }
                                    jVar = new U4.j(num2.intValue(), 0, format);
                                    pVar.g(jVar);
                                    return g.m(null);
                                }
                                pVar.h();
                                return g.m(null);
                            }
                        }
                        p.b(httpURLConnection3);
                        pVar.i(false);
                        d = p.d(responseCode);
                        if (d) {
                            pVar.n.getClass();
                            pVar.l(new Date(System.currentTimeMillis()));
                        }
                    } catch (IOException e8) {
                        e = e8;
                        num2 = null;
                        httpURLConnection2 = httpURLConnection3;
                    } catch (Throwable th4) {
                        num = null;
                        th = th4;
                        httpURLConnection = httpURLConnection3;
                        p.b(httpURLConnection);
                        pVar.i(false);
                        if (num != null && !p.d(num.intValue())) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (z7) {
                            pVar.n.getClass();
                            pVar.l(new Date(System.currentTimeMillis()));
                        }
                        if (!z7 && num.intValue() != 200) {
                            String format2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                format2 = p.f(httpURLConnection.getErrorStream());
                            }
                            pVar.g(new U4.j(num.intValue(), 0, format2));
                        } else {
                            pVar.h();
                        }
                        throw th;
                    }
                    if (!d && responseCode != 200) {
                        String format3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num2);
                        if (responseCode == 403) {
                            format3 = p.f(httpURLConnection3.getErrorStream());
                        }
                        jVar = new U4.j(responseCode, 0, format3);
                        pVar.g(jVar);
                        return g.m(null);
                    }
                    pVar.h();
                    return g.m(null);
                }
                throw new IOException(c1251o2.f());
        }
    }

    @Override // b2.InterfaceC0363b
    public Object e() {
        switch (this.f3383q) {
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                j jVar = (j) ((Z1.j) this.f3384r).f4574c;
                jVar.getClass();
                Iterable iterable = (Iterable) this.f3385s;
                if (iterable.iterator().hasNext()) {
                    jVar.a().compileStatement("DELETE FROM events WHERE _id in " + j.r(iterable)).execute();
                    return null;
                }
                return null;
            default:
                Z1.j jVar2 = (Z1.j) this.f3384r;
                jVar2.getClass();
                for (Map.Entry entry : ((Map) this.f3385s).entrySet()) {
                    ((j) jVar2.f4578i).j(((Integer) entry.getValue()).intValue(), W1.c.f3753w, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override // M4.a
    public void f(M4.b bVar) {
        ((M4.a) this.f3384r).f(bVar);
        ((M4.a) this.f3385s).f(bVar);
    }

    @Override // o4.InterfaceC1071c
    public Object h(e eVar) {
        switch (this.f3383q) {
            case 0:
                return new a((String) this.f3384r, ((f2.d) this.f3385s).e((Context) eVar.c(Context.class)));
            default:
                String str = (String) this.f3384r;
                C1069a c1069a = (C1069a) this.f3385s;
                try {
                    Trace.beginSection(str);
                    return c1069a.f.h(eVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        this.f3383q = i7;
        this.f3384r = obj;
        this.f3385s = obj2;
    }
}
