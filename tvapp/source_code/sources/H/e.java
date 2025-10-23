package H;

import A5.u;
import H2.C0002c;
import W5.AbstractC0117y;
import Z2.H;
import a1.C0197a;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import com.boxhdo.android.data.model.response.LoginResponse;
import com.boxhdo.android.data.model.response.TokenDataResponse;
import com.boxhdo.android.data.model.response.TokenResponse;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e1.C0573g;
import e5.C0657b;
import e5.C0658c;
import g6.o;
import h6.B;
import h6.C0753c;
import h6.E;
import h6.G;
import h6.InterfaceC0752b;
import h6.InterfaceC0754d;
import h6.q;
import h6.r;
import h6.s;
import h6.t;
import h6.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import l0.AbstractC0966b;
import l5.C0980d;
import o4.C1069a;
import o4.InterfaceC1070b;
import r0.AbstractC1111a;
import u4.v;
import w0.U;
import w0.g0;
import w4.T;
import w4.l0;
import x6.C1478k;
import x6.C1482o;
import x6.J;
import x6.w;
import z5.C1524f;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class e implements M2.h, InterfaceC1522d, InterfaceC0752b, InterfaceC1070b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f776q;

    /* renamed from: r  reason: collision with root package name */
    public Object f777r;

    /* renamed from: s  reason: collision with root package name */
    public Object f778s;

    /* renamed from: t  reason: collision with root package name */
    public Object f779t;

    /* renamed from: u  reason: collision with root package name */
    public Object f780u;

    /* renamed from: v  reason: collision with root package name */
    public Object f781v;

    public e(int i7) {
        this.f776q = i7;
        switch (i7) {
            case 8:
                return;
            case 9:
                J j7 = J.f16240c;
                this.f780u = new ArrayList();
                this.f781v = new ArrayList();
                this.f777r = j7;
                return;
            default:
                this.f781v = new LinkedHashMap();
                this.f777r = "GET";
                this.f779t = new q(0);
                return;
        }
    }

    public static final void j(e eVar, String str, String str2) {
        TokenResponse tokenResponse;
        TokenDataResponse tokenDataResponse;
        TokenDataResponse tokenDataResponse2;
        C0197a c0197a = (C0197a) eVar.f777r;
        LoginResponse w7 = l0.w(c0197a);
        TokenResponse tokenResponse2 = null;
        if (w7 != null && (tokenDataResponse2 = w7.f7574b) != null) {
            tokenResponse = tokenDataResponse2.f7680a;
        } else {
            tokenResponse = null;
        }
        if (tokenResponse != null) {
            M5.g.f(str, "<set-?>");
            tokenResponse.f7684a = str;
        }
        if (w7 != null && (tokenDataResponse = w7.f7574b) != null) {
            tokenResponse2 = tokenDataResponse.f7681b;
        }
        if (tokenResponse2 != null) {
            M5.g.f(str2, "<set-?>");
            tokenResponse2.f7684a = str2;
        }
        String C3 = o.f10858a.C();
        SharedPreferences.Editor edit = c0197a.f4980a.edit();
        if (w7 instanceof String) {
            ((B0.a) edit).putString(C3, (String) w7);
        } else if (w7 instanceof Float) {
            ((B0.a) edit).putFloat(C3, ((Number) w7).floatValue());
        } else if (w7 instanceof Integer) {
            ((B0.a) edit).putInt(C3, ((Number) w7).intValue());
        } else if (w7 instanceof Long) {
            ((B0.a) edit).putLong(C3, ((Number) w7).longValue());
        } else if (w7 instanceof Boolean) {
            ((B0.a) edit).putBoolean(C3, ((Boolean) w7).booleanValue());
        } else {
            ((B0.a) edit).putString(C3, c0197a.f4981b.a(LoginResponse.class).e(w7));
        }
        ((B0.a) edit).apply();
    }

    public void A(String str, E e3) {
        boolean z7;
        M5.g.f(str, "method");
        if (str.length() > 0) {
            if (e3 == null) {
                if (!M5.g.a(str, "POST") && !M5.g.a(str, "PUT") && !M5.g.a(str, "PATCH") && !M5.g.a(str, "PROPPATCH") && !M5.g.a(str, "REPORT")) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (!(!z7)) {
                    throw new IllegalArgumentException(AbstractC1111a.r("method ", str, " must have a request body.").toString());
                }
            } else if (!p6.l.E(str)) {
                throw new IllegalArgumentException(AbstractC1111a.r("method ", str, " must not have a request body.").toString());
            }
            this.f777r = str;
            this.f780u = e3;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public void B(String str) {
        M5.g.f(str, "name");
        ((q) this.f779t).d(str);
    }

    public Set C(Class cls) {
        return b(o4.o.a(cls));
    }

    public void D(Class cls, Object obj) {
        M5.g.f(cls, "type");
        if (obj == null) {
            ((Map) this.f781v).remove(cls);
            return;
        }
        if (((Map) this.f781v).isEmpty()) {
            this.f781v = new LinkedHashMap();
        }
        Object cast = cls.cast(obj);
        M5.g.c(cast);
        ((Map) this.f781v).put(cls, cast);
    }

    @Override // M2.h
    public int a(long j7) {
        long[] jArr = (long[]) this.f778s;
        int b7 = H.b(jArr, j7, false);
        if (b7 >= jArr.length) {
            return -1;
        }
        return b7;
    }

    @Override // o4.InterfaceC1070b
    public Set b(o4.o oVar) {
        if (((Set) this.f780u).contains(oVar)) {
            return ((InterfaceC1070b) this.f781v).b(oVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + oVar + ">.");
    }

    @Override // o4.InterfaceC1070b
    public Object c(Class cls) {
        if (((Set) this.f777r).contains(o4.o.a(cls))) {
            Object c5 = ((InterfaceC1070b) this.f781v).c(cls);
            if (!cls.equals(K4.a.class)) {
                return c5;
            }
            K4.a aVar = (K4.a) c5;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // o4.InterfaceC1070b
    public M4.b d(Class cls) {
        return f(o4.o.a(cls));
    }

    @Override // o4.InterfaceC1070b
    public o4.m e(o4.o oVar) {
        if (((Set) this.f779t).contains(oVar)) {
            return ((InterfaceC1070b) this.f781v).e(oVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + oVar + ">.");
    }

    @Override // o4.InterfaceC1070b
    public M4.b f(o4.o oVar) {
        if (((Set) this.f778s).contains(oVar)) {
            return ((InterfaceC1070b) this.f781v).f(oVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + oVar + ">.");
    }

    @Override // o4.InterfaceC1070b
    public Object g(o4.o oVar) {
        if (((Set) this.f777r).contains(oVar)) {
            return ((InterfaceC1070b) this.f781v).g(oVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + oVar + ".");
    }

    @Override // M2.h
    public List h(long j7) {
        T2.a[] aVarArr;
        T2.e eVar = (T2.e) this.f777r;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        eVar.g(j7, eVar.f3297h, arrayList);
        TreeMap treeMap = new TreeMap();
        eVar.i(j7, false, eVar.f3297h, treeMap);
        Map map = (Map) this.f779t;
        Map map2 = (Map) this.f780u;
        eVar.h(j7, map, map2, eVar.f3297h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.f781v).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                T2.f fVar = (T2.f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new M2.b(null, null, null, decodeByteArray, fVar.f3305c, 0, fVar.f3306e, fVar.f3304b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f, fVar.f3307g, false, -16777216, fVar.f3310j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            T2.f fVar2 = (T2.f) map2.get(entry.getKey());
            fVar2.getClass();
            M2.a aVar = (M2.a) entry.getValue();
            CharSequence charSequence = aVar.f2205a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (T2.a aVar2 : (T2.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), T2.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i7, i10 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == '\n') {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f2208e = fVar2.f3305c;
            aVar.f = fVar2.d;
            aVar.f2209g = fVar2.f3306e;
            aVar.f2210h = fVar2.f3304b;
            aVar.f2214l = fVar2.f;
            aVar.f2213k = fVar2.f3309i;
            aVar.f2212j = fVar2.f3308h;
            aVar.f2217p = fVar2.f3310j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // h6.InterfaceC0752b
    public B i(h6.J j7, G g7) {
        M5.g.f(g7, "response");
        return (B) AbstractC0117y.t(new C0573g((e6.d) this.f779t, null, g7, this));
    }

    @Override // M2.h
    public long k(int i7) {
        return ((long[]) this.f778s)[i7];
    }

    public void l(M0.f fVar, Class cls) {
        ((ArrayList) this.f780u).add(new C1524f(fVar, cls));
    }

    public void m(P0.a aVar, Class cls) {
        ((ArrayList) this.f778s).add(new C1524f(aVar, cls));
    }

    public void n(y6.a aVar) {
        ((ArrayList) this.f780u).add(aVar);
    }

    public void o(String str, String str2) {
        M5.g.f(str, "name");
        M5.g.f(str2, "value");
        ((q) this.f779t).a(str, str2);
    }

    public void p(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        s sVar = new s();
        sVar.e(null, str);
        t a7 = sVar.a();
        List list = a7.f;
        if ("".equals(list.get(list.size() - 1))) {
            this.f779t = a7;
            return;
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + a7);
    }

    public B q() {
        Map unmodifiableMap;
        t tVar = (t) this.f778s;
        if (tVar != null) {
            String str = (String) this.f777r;
            r c5 = ((q) this.f779t).c();
            E e3 = (E) this.f780u;
            Map map = (Map) this.f781v;
            byte[] bArr = i6.b.f11390a;
            M5.g.f(map, "<this>");
            if (map.isEmpty()) {
                unmodifiableMap = u.f136q;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                M5.g.e(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new B(tVar, str, c5, e3, unmodifiableMap);
        }
        throw new IllegalStateException("url == null".toString());
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [x6.b, java.lang.Object] */
    public v r() {
        List singletonList;
        List emptyList;
        if (((t) this.f779t) != null) {
            InterfaceC0754d interfaceC0754d = (InterfaceC0754d) this.f778s;
            if (interfaceC0754d == null) {
                interfaceC0754d = new z();
            }
            J j7 = (J) this.f777r;
            Executor a7 = j7.a();
            ArrayList arrayList = new ArrayList((ArrayList) this.f781v);
            C1482o c1482o = new C1482o(a7);
            boolean z7 = j7.f16241a;
            if (z7) {
                singletonList = Arrays.asList(C1478k.f16312a, c1482o);
            } else {
                singletonList = Collections.singletonList(c1482o);
            }
            arrayList.addAll(singletonList);
            ArrayList arrayList2 = (ArrayList) this.f780u;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z7 ? 1 : 0));
            ?? obj = new Object();
            obj.f16306a = true;
            arrayList3.add(obj);
            arrayList3.addAll(arrayList2);
            if (z7) {
                emptyList = Collections.singletonList(w.f16338a);
            } else {
                emptyList = Collections.emptyList();
            }
            arrayList3.addAll(emptyList);
            return new v(interfaceC0754d, (t) this.f779t, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList));
        }
        throw new IllegalStateException("Base URL required.");
    }

    public T s() {
        String str;
        if (((Long) this.f779t) == null) {
            str = " pc";
        } else {
            str = "";
        }
        if (((String) this.f777r) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.f780u) == null) {
            str = AbstractC0515y1.m(str, " offset");
        }
        if (((Integer) this.f781v) == null) {
            str = AbstractC0515y1.m(str, " importance");
        }
        if (str.isEmpty()) {
            return new T(((Long) this.f779t).longValue(), (String) this.f777r, (String) this.f778s, ((Long) this.f780u).longValue(), ((Integer) this.f781v).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void t(C0753c c0753c) {
        M5.g.f(c0753c, "cacheControl");
        String c0753c2 = c0753c.toString();
        if (c0753c2.length() == 0) {
            B("Cache-Control");
        } else {
            z("Cache-Control", c0753c2);
        }
    }

    public String toString() {
        switch (this.f776q) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f777r) + ", mProviderPackage: " + ((String) this.f778s) + ", mQuery: " + ((String) this.f779t) + ", mCertificates:");
                int i7 = 0;
                while (true) {
                    List list = (List) this.f781v;
                    if (i7 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(i7);
                        for (int i8 = 0; i8 < list2.size(); i8++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        i7++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    @Override // M2.h
    public int u() {
        return ((long[]) this.f778s).length;
    }

    public int v(g0 g0Var) {
        M5.g.f(g0Var, "state");
        C0657b c0657b = (C0657b) this.f778s;
        if (c0657b.c()) {
            return c0657b.f10148b;
        }
        if (g0Var.b() < 1) {
            return 0;
        }
        return ((h5.d) this.f779t).l(g0Var.b() - 1) + 1;
    }

    public o4.m w(Class cls) {
        return e(o4.o.a(cls));
    }

    public int x(g0 g0Var) {
        M5.g.f(g0Var, "state");
        C0657b c0657b = (C0657b) this.f778s;
        if (c0657b.b()) {
            return c0657b.f10148b;
        }
        if (g0Var.b() < 1) {
            return 0;
        }
        return ((h5.d) this.f779t).l(g0Var.b() - 1) + 1;
    }

    @Override // z5.InterfaceC1522d
    /* renamed from: y */
    public V getValue() {
        V v5 = (V) this.f781v;
        if (v5 == null) {
            C0002c c0002c = new C0002c((b0) ((L5.a) this.f778s).b(), (Y) ((L5.a) this.f779t).b(), (AbstractC0966b) ((L5.a) this.f780u).b());
            S5.b bVar = (S5.b) this.f777r;
            M5.g.f(bVar, "<this>");
            Class a7 = ((M5.c) bVar).a();
            M5.g.d(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            V x7 = c0002c.x(a7);
            this.f781v = x7;
            return x7;
        }
        return v5;
    }

    public void z(String str, String str2) {
        M5.g.f(str2, "value");
        q qVar = (q) this.f779t;
        qVar.getClass();
        p6.d.c(str);
        p6.d.d(str2, str);
        qVar.d(str);
        qVar.b(str, str2);
    }

    public e(J0.b bVar) {
        this.f776q = 1;
        this.f777r = A5.k.m0(bVar.f1272a);
        this.f778s = A5.k.m0(bVar.f1273b);
        this.f779t = A5.k.m0(bVar.f1274c);
        this.f780u = A5.k.m0(bVar.d);
        this.f781v = A5.k.m0(bVar.f1275e);
    }

    public e(M5.d dVar, L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f776q = 3;
        this.f777r = dVar;
        this.f778s = aVar;
        this.f779t = aVar2;
        this.f780u = aVar3;
    }

    public e(T2.e eVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f776q = 2;
        this.f777r = eVar;
        this.f780u = hashMap2;
        this.f781v = hashMap3;
        this.f779t = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        eVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f778s = jArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if ((r7 instanceof z5.C1525g) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(a1.C0197a r7, h6.z r8) {
        /*
            r6 = this;
            r0 = 4
            r6.f776q = r0
            java.lang.String r0 = "encryptedPreference"
            M5.g.f(r7, r0)
            r6.<init>()
            r6.f777r = r7
            r6.f778s = r8
            e6.d r8 = e6.e.a()
            r6.f779t = r8
            g6.o r8 = g6.o.f10858a
            java.lang.String r8 = r8.C()
            java.lang.Class<com.boxhdo.android.data.model.response.LoginResponse> r0 = com.boxhdo.android.data.model.response.LoginResponse.class
            M5.d r1 = M5.p.a(r0)
            java.lang.Class r2 = java.lang.Float.TYPE
            M5.d r2 = M5.p.a(r2)
            boolean r2 = M5.g.a(r1, r2)
            B0.b r3 = r7.f4980a
            if (r2 == 0) goto L3c
            r7 = 0
            float r7 = r3.getFloat(r8, r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
        L38:
            com.boxhdo.android.data.model.response.LoginResponse r7 = (com.boxhdo.android.data.model.response.LoginResponse) r7
            goto Lbe
        L3c:
            java.lang.Class r2 = java.lang.Integer.TYPE
            M5.d r2 = M5.p.a(r2)
            boolean r2 = M5.g.a(r1, r2)
            r4 = 0
            if (r2 == 0) goto L52
            int r7 = r3.getInt(r8, r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L38
        L52:
            java.lang.Class r2 = java.lang.Long.TYPE
            M5.d r2 = M5.p.a(r2)
            boolean r2 = M5.g.a(r1, r2)
            if (r2 == 0) goto L69
            r0 = 0
            long r7 = r3.getLong(r8, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L38
        L69:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            M5.d r2 = M5.p.a(r2)
            boolean r2 = M5.g.a(r1, r2)
            java.lang.String r5 = ""
            if (r2 == 0) goto L86
            java.lang.String r7 = r3.getString(r8, r5)
            if (r7 == 0) goto L7e
            goto L38
        L7e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.boxhdo.android.data.model.response.LoginResponse"
            r7.<init>(r8)
            throw r7
        L86:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            M5.d r2 = M5.p.a(r2)
            boolean r1 = M5.g.a(r1, r2)
            if (r1 == 0) goto L9b
            boolean r7 = r3.getBoolean(r8, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L38
        L9b:
            java.lang.String r8 = r3.getString(r8, r5)
            r1 = 0
            if (r8 == 0) goto Lbd
            int r2 = r8.length()
            if (r2 != 0) goto La9
            goto Lbd
        La9:
            n5.y r7 = r7.f4981b     // Catch: java.lang.Throwable -> Lb4
            n5.k r7 = r7.a(r0)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r7 = r7.a(r8)     // Catch: java.lang.Throwable -> Lb4
            goto Lb9
        Lb4:
            r7 = move-exception
            z5.g r7 = k3.AbstractC0958a.m(r7)
        Lb9:
            boolean r8 = r7 instanceof z5.C1525g
            if (r8 == 0) goto Lbe
        Lbd:
            r7 = r1
        Lbe:
            com.boxhdo.android.data.model.response.LoginResponse r7 = (com.boxhdo.android.data.model.response.LoginResponse) r7
            r6.f780u = r7
            D0.h r7 = new D0.h
            r8 = 7
            r7.<init>(r8, r6)
            z5.i r8 = new z5.i
            r8.<init>(r7)
            r6.f781v = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H.e.<init>(a1.a, h6.z):void");
    }

    public e(String str, String str2, String str3, List list) {
        this.f776q = 0;
        str.getClass();
        this.f777r = str;
        str2.getClass();
        this.f778s = str2;
        this.f779t = str3;
        list.getClass();
        this.f781v = list;
        this.f780u = str + "-" + str2 + "-" + str3;
    }

    public e(C1069a c1069a, o4.d dVar) {
        this.f776q = 7;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (o4.g gVar : c1069a.f12919c) {
            int i7 = gVar.f12937c;
            boolean z7 = i7 == 0;
            int i8 = gVar.f12936b;
            o4.o oVar = gVar.f12935a;
            if (z7) {
                if (i8 == 2) {
                    hashSet4.add(oVar);
                } else {
                    hashSet.add(oVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(oVar);
            } else if (i8 == 2) {
                hashSet5.add(oVar);
            } else {
                hashSet2.add(oVar);
            }
        }
        if (!c1069a.f12921g.isEmpty()) {
            hashSet.add(o4.o.a(K4.a.class));
        }
        this.f777r = Collections.unmodifiableSet(hashSet);
        this.f778s = Collections.unmodifiableSet(hashSet2);
        this.f779t = Collections.unmodifiableSet(hashSet3);
        this.f780u = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.f781v = dVar;
    }

    public e(U u7, C0657b c0657b, h5.d dVar, C0658c c0658c, C0980d c0980d) {
        this.f776q = 5;
        M5.g.f(u7, "layoutManager");
        this.f777r = u7;
        this.f778s = c0657b;
        this.f779t = dVar;
        this.f780u = c0658c;
        this.f781v = c0980d;
    }

    public /* synthetic */ e(boolean z7) {
        this.f776q = 6;
    }
}
