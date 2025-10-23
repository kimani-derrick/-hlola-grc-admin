package T4;

import B4.f;
import H2.C0002c;
import H2.U;
import H2.e0;
import H2.f0;
import H2.m0;
import H2.n0;
import I4.e;
import K.AbstractC0027c;
import K.C0031g;
import K.InterfaceC0028d;
import K.InterfaceC0030f;
import K.InterfaceC0033i;
import K2.l;
import L0.i;
import L5.p;
import Q0.h;
import T1.s;
import V.C0082a;
import V.InterfaceC0083b;
import V.InterfaceC0090i;
import X2.I;
import Z2.H;
import Z2.r;
import Z4.G;
import Z5.o;
import Z5.u;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import androidx.core.widget.NestedScrollView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.K1;
import e2.K;
import f1.C0660A;
import f1.C0669J;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import m3.g;
import org.json.JSONObject;
import t3.C1244h;
import t3.C1251o;
import t3.InterfaceC1243g;
import u0.j;
import u4.AbstractC1284h;
import u4.C1288l;
import z4.C1518b;
/* loaded from: classes.dex */
public final class c implements A3.a, InterfaceC1243g, f0, InterfaceC0028d, InterfaceC0030f, e0, InterfaceC0033i, h, InterfaceC0083b, I, InterfaceC0090i, o, Z5.b, u {

    /* renamed from: s  reason: collision with root package name */
    public static volatile c f3380s;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3381q;

    /* renamed from: r  reason: collision with root package name */
    public Object f3382r;

    public c(int i7) {
        this.f3381q = i7;
        switch (i7) {
            case 5:
                return;
            case 13:
                this.f3382r = new K2.d(5);
                return;
            case 15:
                this.f3382r = new SparseArray();
                return;
            case 26:
                this.f3382r = new CopyOnWriteArrayList();
                return;
            default:
                this.f3382r = new HashSet();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [long] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r14 = (Void) obj;
        B4.d dVar = (B4.d) this.f3382r;
        K1 k12 = (K1) dVar.f;
        f fVar = (f) dVar.f265b;
        String str = (String) k12.f8367r;
        Closeable closeable = null;
        try {
            HashMap A6 = K1.A(fVar);
            ((j) k12.f8368s).getClass();
            g5.b bVar = new g5.b(str, A6);
            HashMap hashMap = (HashMap) bVar.f10843t;
            hashMap.put("User-Agent", "Crashlytics Android SDK/19.0.1");
            hashMap.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            K1.o(bVar, fVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + A6;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = k12.C(bVar.v());
        } catch (IOException e3) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e3);
            jSONObject = null;
        }
        if (jSONObject != null) {
            B4.c T6 = ((c) dVar.f266c).T(jSONObject);
            ?? r42 = T6.f262c;
            c cVar = (c) dVar.f267e;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        jSONObject.put("expires_at", (long) r42);
                        try {
                            fileWriter = new FileWriter((File) cVar.f3382r);
                        } catch (Exception e7) {
                            e = e7;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r42 = fileWriter;
                            AbstractC1284h.c(r42, "Failed to close settings writer.");
                            B4.d.e(jSONObject, "Loaded settings: ");
                            String str4 = fVar.f;
                            SharedPreferences.Editor edit = ((Context) dVar.f264a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str4);
                            edit.apply();
                            ((AtomicReference) dVar.f269h).set(T6);
                            ((C1244h) ((AtomicReference) dVar.f270i).get()).b(T6);
                            return g.m(null);
                        }
                    } catch (Exception e8) {
                        e = e8;
                    }
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                        r42 = fileWriter;
                    } catch (Exception e9) {
                        e = e9;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        r42 = fileWriter;
                        AbstractC1284h.c(r42, "Failed to close settings writer.");
                        B4.d.e(jSONObject, "Loaded settings: ");
                        String str42 = fVar.f;
                        SharedPreferences.Editor edit2 = ((Context) dVar.f264a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit2.putString("existing_instance_identifier", str42);
                        edit2.apply();
                        ((AtomicReference) dVar.f269h).set(T6);
                        ((C1244h) ((AtomicReference) dVar.f270i).get()).b(T6);
                        return g.m(null);
                    }
                    AbstractC1284h.c(r42, "Failed to close settings writer.");
                    B4.d.e(jSONObject, "Loaded settings: ");
                    String str422 = fVar.f;
                    SharedPreferences.Editor edit22 = ((Context) dVar.f264a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit22.putString("existing_instance_identifier", str422);
                    edit22.apply();
                    ((AtomicReference) dVar.f269h).set(T6);
                    ((C1244h) ((AtomicReference) dVar.f270i).get()).b(T6);
                } catch (Throwable th) {
                    th = th;
                    closeable = r42;
                    AbstractC1284h.c(closeable, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                AbstractC1284h.c(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return g.m(null);
    }

    @Override // H2.f0
    public boolean C(long j7) {
        f0[] f0VarArr;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        do {
            long z10 = z();
            if (z10 == Long.MIN_VALUE) {
                break;
            }
            z7 = false;
            for (f0 f0Var : (f0[]) this.f3382r) {
                long z11 = f0Var.z();
                if (z11 != Long.MIN_VALUE && z11 <= j7) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z11 == z10 || z8) {
                    z7 |= f0Var.C(j7);
                }
            }
            z9 |= z7;
        } while (z7);
        return z9;
    }

    @Override // V.InterfaceC0090i
    public Z5.b D() {
        return ((InterfaceC0090i) this.f3382r).D();
    }

    @Override // K.InterfaceC0033i
    public void E() {
        ((NestedScrollView) this.f3382r).f5645t.abortAnimation();
    }

    @Override // V.InterfaceC0090i
    public Object F(p pVar, D5.d dVar) {
        return ((InterfaceC0090i) this.f3382r).F(new Y.c(pVar, null), dVar);
    }

    @Override // H2.f0
    public void G(long j7) {
        for (f0 f0Var : (f0[]) this.f3382r) {
            f0Var.G(j7);
        }
    }

    @Override // K.InterfaceC0028d
    public void H(int i7) {
        ((ContentInfo.Builder) this.f3382r).setFlags(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String I(e2.K r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f9678s
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L3f
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L3f
        L13:
            int r1 = Z2.H.f4603a
            r3 = 21
            if (r1 < r3) goto L1e
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            goto L24
        L1e:
            java.util.Locale r3 = new java.util.Locale
            r3.<init>(r0)
            r0 = r3
        L24:
            r3 = 24
            if (r1 < r3) goto L31
            java.util.Locale$Category r1 = B3.a.o()
            java.util.Locale r1 = B3.a.p(r1)
            goto L35
        L31:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L35:
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L41
        L3f:
            r0 = r2
            goto L62
        L41:
            r3 = 1
            r4 = 0
            int r3 = r0.offsetByCodePoints(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L62
            r5.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r4 = r0.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r1 = r4.toUpperCase(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r1 = r0.substring(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L62
            java.lang.String r0 = r5.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L62
        L62:
            java.lang.String r1 = r6.J(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.Q(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7f
            java.lang.String r7 = r7.f9677r
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7d
            goto L7e
        L7d:
            r2 = r7
        L7e:
            r0 = r2
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.c.I(e2.K):java.lang.String");
    }

    public String J(K k5) {
        String str;
        int i7 = k5.f9680u & 2;
        Resources resources = (Resources) this.f3382r;
        if (i7 != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        int i8 = k5.f9680u;
        if ((i8 & 4) != 0) {
            str = Q(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i8 & 8) != 0) {
            str = Q(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i8 & 1088) != 0) {
            return Q(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public i K() {
        L0.d h7;
        L0.b bVar = (L0.b) this.f3382r;
        L0.g gVar = (L0.g) bVar.d;
        synchronized (gVar) {
            bVar.b(true);
            h7 = gVar.h(((L0.c) bVar.f1863b).f1865a);
        }
        if (h7 != null) {
            return new i(h7);
        }
        return null;
    }

    public String L(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            I4.d dVar = (I4.d) this.f3382r;
            e eVar = new e(stringWriter, dVar.f1259a, dVar.f1260b, dVar.f1261c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f1263b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public Set M() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f3382r)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) this.f3382r);
        }
        return unmodifiableSet;
    }

    public String N(K k5) {
        String I6;
        String str;
        int i7;
        String str2;
        String d;
        int h7 = r.h(k5.f9655B);
        int i8 = k5.f9667O;
        int i9 = k5.f9660H;
        int i10 = k5.f9659G;
        if (h7 == -1) {
            String str3 = null;
            String str4 = k5.f9684y;
            if (str4 != null) {
                for (String str5 : H.R(str4)) {
                    d = r.d(str5);
                    if (d != null && r.k(d)) {
                        break;
                    }
                }
            }
            d = null;
            if (d == null) {
                if (str4 != null) {
                    String[] R6 = H.R(str4);
                    int length = R6.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        String d7 = r.d(R6[i11]);
                        if (d7 != null && r.i(d7)) {
                            str3 = d7;
                            break;
                        }
                        i11++;
                    }
                }
                if (str3 == null) {
                    if (i10 == -1 && i9 == -1) {
                        if (i8 == -1 && k5.f9668P == -1) {
                            h7 = -1;
                        }
                    }
                }
                h7 = 1;
            }
            h7 = 2;
        }
        Resources resources = (Resources) this.f3382r;
        String str6 = "";
        int i12 = k5.f9683x;
        if (h7 == 2) {
            String J6 = J(k5);
            if (i10 == -1 || i9 == -1) {
                str2 = "";
            } else {
                str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i10), Integer.valueOf(i9));
            }
            if (i12 != -1) {
                str6 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i12 / 1000000.0f));
            }
            I6 = Q(J6, str2, str6);
        } else {
            I6 = I(k5);
            if (h7 == 1) {
                if (i8 == -1 || i8 < 1) {
                    str = "";
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 6 && i8 != 7) {
                                if (i8 != 8) {
                                    i7 = R.string.exo_track_surround;
                                } else {
                                    i7 = R.string.exo_track_surround_7_point_1;
                                }
                            } else {
                                i7 = R.string.exo_track_surround_5_point_1;
                            }
                        } else {
                            i7 = R.string.exo_track_stereo;
                        }
                    } else {
                        i7 = R.string.exo_track_mono;
                    }
                    str = resources.getString(i7);
                }
                if (i12 != -1) {
                    str6 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i12 / 1000000.0f));
                }
                I6 = Q(I6, str, str6);
            }
        }
        if (I6.length() == 0) {
            return resources.getString(R.string.exo_track_unknown);
        }
        return I6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
        if ((r13 instanceof z5.C1525g) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(D5.d r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.c.O(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable P(D5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof M1.i
            if (r0 == 0) goto L13
            r0 = r5
            M1.i r0 = (M1.i) r0
            int r1 = r0.f2200v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2200v = r1
            goto L18
        L13:
            M1.i r0 = new M1.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2198t
            E5.a r1 = E5.a.f612q
            int r2 = r0.f2200v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            k3.AbstractC0958a.H(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            k3.AbstractC0958a.H(r5)
            r0.f2200v = r3
            java.lang.Object r5 = r4.f3382r
            f1.J r5 = (f1.C0669J) r5
            r5.getClass()
            n5.y r2 = g1.b.f10508a
            f1.G r2 = new f1.G
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = g1.b.a(r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            Y0.c r5 = (Y0.c) r5
            java.io.Serializable r5 = a.AbstractC0189a.v(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.c.P(D5.d):java.io.Serializable");
    }

    public String Q(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = ((Resources) this.f3382r).getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    public void R(G g7) {
        ((s) ((Q1.e) ((M4.b) this.f3382r).get())).a("FIREBASE_APPQUALITY_SESSION", new Q1.b("json"), new U(8, this)).a(new Q1.a(g7, Q1.c.f2849q), new A4.a(11));
    }

    public void S() {
        K2.r[] rVarArr;
        K2.r[] rVarArr2;
        l lVar = (l) this.f3382r;
        int i7 = lVar.f1719J - 1;
        lVar.f1719J = i7;
        if (i7 > 0) {
            return;
        }
        int i8 = 0;
        for (K2.r rVar : lVar.f1721L) {
            rVar.i();
            i8 += rVar.f1785Y.f1146q;
        }
        m0[] m0VarArr = new m0[i8];
        int i9 = 0;
        for (K2.r rVar2 : lVar.f1721L) {
            rVar2.i();
            int i10 = rVar2.f1785Y.f1146q;
            int i11 = 0;
            while (i11 < i10) {
                rVar2.i();
                m0VarArr[i9] = rVar2.f1785Y.a(i11);
                i11++;
                i9++;
            }
        }
        lVar.f1720K = new n0(m0VarArr);
        lVar.f1718I.s(lVar);
    }

    public B4.c T(JSONObject jSONObject) {
        B4.e fVar;
        int i7 = jSONObject.getInt("settings_version");
        if (i7 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i7 + ". Using default settings values.", null);
            fVar = new J3.e(1);
        } else {
            fVar = new L4.f(1);
        }
        return fVar.r((C1288l) this.f3382r, jSONObject);
    }

    public JSONObject U() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f3382r;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(AbstractC1284h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e3) {
                        e = e3;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        AbstractC1284h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC1284h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            AbstractC1284h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            AbstractC1284h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // H2.f0
    public boolean a() {
        for (f0 f0Var : (f0[]) this.f3382r) {
            if (f0Var.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // K.InterfaceC0033i
    public boolean b(float f) {
        if (f == 0.0f) {
            return false;
        }
        E();
        ((NestedScrollView) this.f3382r).i((int) f);
        return true;
    }

    @Override // Q0.h
    public Q0.c d(Q0.b bVar) {
        return null;
    }

    @Override // K.InterfaceC0030f
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.f3382r).getClip();
        return clip;
    }

    @Override // Z5.u
    public Object getValue() {
        return ((u) this.f3382r).getValue();
    }

    @Override // H2.e0
    public void h(f0 f0Var) {
        K2.r rVar = (K2.r) f0Var;
        l lVar = (l) this.f3382r;
        lVar.f1718I.h(lVar);
    }

    @Override // K.InterfaceC0028d
    public C0031g i() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f3382r).build();
        return new C0031g(new c(build));
    }

    @Override // K.InterfaceC0030f
    public int j() {
        int flags;
        flags = ((ContentInfo) this.f3382r).getFlags();
        return flags;
    }

    @Override // K.InterfaceC0030f
    public ContentInfo k() {
        return (ContentInfo) this.f3382r;
    }

    @Override // Q0.h
    public void l(Q0.b bVar, Bitmap bitmap, Map map) {
        ((Q0.i) this.f3382r).A(bVar, bitmap, map, p6.d.k(bitmap));
    }

    @Override // H2.f0
    public long m() {
        long j7 = Long.MAX_VALUE;
        for (f0 f0Var : (f0[]) this.f3382r) {
            long m7 = f0Var.m();
            if (m7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, m7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // K.InterfaceC0028d
    public void o(Bundle bundle) {
        ((ContentInfo.Builder) this.f3382r).setExtras(bundle);
    }

    @Override // V.InterfaceC0083b
    public Object p(C0082a c0082a) {
        return ((L5.l) this.f3382r).c(c0082a);
    }

    @Override // K.InterfaceC0028d
    public void q(Uri uri) {
        ((ContentInfo.Builder) this.f3382r).setLinkUri(uri);
    }

    @Override // K.InterfaceC0030f
    public int r() {
        int source;
        source = ((ContentInfo) this.f3382r).getSource();
        return source;
    }

    @Override // Z5.b
    public Object t(Z5.c cVar, D5.d dVar) {
        switch (this.f3381q) {
            case 28:
                return ((o) this.f3382r).t(cVar, dVar);
            default:
                return ((u) this.f3382r).t(cVar, dVar);
        }
    }

    public String toString() {
        switch (this.f3381q) {
            case 11:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3382r) + "}";
            default:
                return super.toString();
        }
    }

    @Override // K.InterfaceC0033i
    public float x() {
        return -((NestedScrollView) this.f3382r).getVerticalScrollFactorCompat();
    }

    @Override // H2.f0
    public long z() {
        long j7 = Long.MAX_VALUE;
        for (f0 f0Var : (f0[]) this.f3382r) {
            long z7 = f0Var.z();
            if (z7 != Long.MIN_VALUE) {
                j7 = Math.min(j7, z7);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    public /* synthetic */ c(int i7, Object obj) {
        this.f3381q = i7;
        this.f3382r = obj;
    }

    public c(ClipData clipData, int i7) {
        this.f3381q = 10;
        this.f3382r = AbstractC0027c.l(clipData, i7);
    }

    public c(Resources resources) {
        this.f3381q = 24;
        resources.getClass();
        this.f3382r = resources;
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3381q = 20;
        this.f3382r = Build.VERSION.SDK_INT >= 25 ? new O.f(uri, clipDescription, uri2) : new C0002c(uri, clipDescription, uri2, 6);
    }

    public c(ContentInfo contentInfo) {
        this.f3381q = 11;
        contentInfo.getClass();
        this.f3382r = AbstractC0027c.n(contentInfo);
    }

    public c(C0660A c0660a) {
        this.f3381q = 17;
        M5.g.f(c0660a, "settingRepository");
        this.f3382r = c0660a;
    }

    public c(C0669J c0669j) {
        this.f3381q = 18;
        M5.g.f(c0669j, "traktRepository");
        this.f3382r = c0669j;
    }

    public c(C1518b c1518b) {
        this.f3381q = 2;
        this.f3382r = new File((File) c1518b.f16462b, "com.crashlytics.settings.json");
    }

    @Override // Q0.h
    public void c(int i7) {
    }
}
