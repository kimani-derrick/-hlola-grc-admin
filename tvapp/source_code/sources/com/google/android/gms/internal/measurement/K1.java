package com.google.android.gms.internal.measurement;

import K.InterfaceC0041q;
import Y2.C0146o;
import Y2.C0151u;
import Y2.C0152v;
import Y2.InterfaceC0143l;
import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import a0.C0190a;
import a1.C0197a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Handler;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f1.C0669J;
import f1.C0672M;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.KeyGenerator;
import m4.C0997b;
import org.json.JSONException;
import org.json.JSONObject;
import r0.AbstractC1111a;
import u4.C1273A;
import z5.C1524f;
/* loaded from: classes.dex */
public class K1 implements J1, C4.a, InterfaceC0041q, Y2.O, L2.p, Q0.h, M2.h, InterfaceC0143l, Z5.b {

    /* renamed from: t  reason: collision with root package name */
    public static K1 f8365t;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f8366q;

    /* renamed from: r  reason: collision with root package name */
    public Object f8367r;

    /* renamed from: s  reason: collision with root package name */
    public Object f8368s;

    public K1(int i7) {
        this.f8366q = i7;
        switch (i7) {
            case 24:
                this.f8367r = new HashMap();
                return;
            case 25:
                this.f8367r = new HashMap();
                this.f8368s = new HashMap();
                return;
            default:
                this.f8367r = null;
                this.f8368s = null;
                return;
        }
    }

    public static HashMap A(B4.f fVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", fVar.f276h);
        hashMap.put("display_version", fVar.f275g);
        hashMap.put("source", Integer.toString(fVar.f277i));
        String str = fVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static S0.o G(N0.k kVar, S0.g gVar, Q0.b bVar, Q0.c cVar) {
        String str;
        boolean z7;
        boolean z8;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(gVar.f3017a.getResources(), cVar.f2834a);
        Map map = cVar.f2835b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        if (bool != null) {
            z7 = bool.booleanValue();
        } else {
            z7 = false;
        }
        Bitmap.Config[] configArr = X0.e.f4059a;
        if ((kVar instanceof N0.k) && kVar.f2396g) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new S0.o(bitmapDrawable, gVar, 1, bVar, str, z7, z8);
    }

    public static synchronized void O() {
        Context context;
        synchronized (K1.class) {
            try {
                K1 k12 = f8365t;
                if (k12 != null && (context = (Context) k12.f8367r) != null && ((L1) k12.f8368s) != null) {
                    context.getContentResolver().unregisterContentObserver((L1) f8365t.f8368s);
                }
                f8365t = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.K1 m(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            com.google.android.gms.internal.measurement.K1 r2 = new com.google.android.gms.internal.measurement.K1     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 13
            r2.<init>(r5, r3, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.m(android.content.Context):com.google.android.gms.internal.measurement.K1");
    }

    public static void o(g5.b bVar, B4.f fVar) {
        p(bVar, "X-CRASHLYTICS-GOOGLE-APP-ID", fVar.f271a);
        p(bVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        p(bVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.1");
        p(bVar, "Accept", "application/json");
        p(bVar, "X-CRASHLYTICS-DEVICE-MODEL", fVar.f272b);
        p(bVar, "X-CRASHLYTICS-OS-BUILD-VERSION", fVar.f273c);
        p(bVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", fVar.d);
        p(bVar, "X-CRASHLYTICS-INSTALLATION-ID", ((C1273A) fVar.f274e).c().f14988a);
    }

    public static void p(g5.b bVar, String str, String str2) {
        if (str2 != null) {
            ((HashMap) bVar.f10843t).put(str, str2);
        }
    }

    public synchronized Map B() {
        try {
            if (((Map) this.f8368s) == null) {
                this.f8368s = Collections.unmodifiableMap(new HashMap((HashMap) this.f8367r));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f8368s;
    }

    public JSONObject C(H.j jVar) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i7 = jVar.f793q;
        sb.append(i7);
        String sb2 = sb.toString();
        r4.c cVar = r4.c.f13480a;
        cVar.e(sb2);
        String str = (String) this.f8367r;
        if (i7 != 200 && i7 != 201 && i7 != 202 && i7 != 203) {
            String str2 = "Settings request failed; (status: " + i7 + ") from " + str;
            if (!cVar.b(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", str2, null);
            return null;
        }
        String str3 = (String) jVar.f794r;
        try {
            return new JSONObject(str3);
        } catch (Exception e3) {
            cVar.f("Failed to parse settings JSON from " + str, e3);
            cVar.f("Settings response " + str3, null);
            return null;
        }
    }

    public void D(O4.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f2723a);
            jSONObject.put("Status", s.h.b(bVar.f2724b));
            jSONObject.put("AuthToken", bVar.f2725c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.f2726e);
            jSONObject.put("FisError", bVar.f2727g);
            h4.f fVar = (h4.f) this.f8368s;
            fVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", fVar.f10987a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(z())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable E(java.util.List r5, D5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof M1.c
            if (r0 == 0) goto L13
            r0 = r6
            M1.c r0 = (M1.c) r0
            int r1 = r0.f2184w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2184w = r1
            goto L18
        L13:
            M1.c r0 = new M1.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2182u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f2184w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.gms.internal.measurement.K1 r5 = r0.f2181t
            k3.AbstractC0958a.H(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            k3.AbstractC0958a.H(r6)
            r0.f2181t = r4
            r0.f2184w = r3
            java.lang.Object r6 = r4.f8367r
            f1.M r6 = (f1.C0672M) r6
            r6.getClass()
            n5.y r2 = g1.b.f10508a
            f1.L r2 = new f1.L
            r3 = 0
            r2.<init>(r6, r5, r3)
            java.lang.Object r6 = g1.b.a(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            Y0.c r6 = (Y0.c) r6
            boolean r0 = r6 instanceof Y0.b
            if (r0 == 0) goto L67
            java.lang.Object r5 = r5.f8368s
            J1.m r5 = (J1.m) r5
            Y0.b r6 = (Y0.b) r6
            java.lang.Object r6 = r6.f4309a
            java.util.List r6 = (java.util.List) r6
            r5.getClass()
            java.util.List r5 = k3.AbstractC0958a.x(r5, r6)
            goto L73
        L67:
            boolean r5 = r6 instanceof Y0.a
            if (r5 == 0) goto L76
            Y0.a r6 = (Y0.a) r6
            java.lang.Throwable r5 = r6.f4308a
            z5.g r5 = k3.AbstractC0958a.m(r5)
        L73:
            java.io.Serializable r5 = (java.io.Serializable) r5
            return r5
        L76:
            F0.c r5 = new F0.c
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.E(java.util.List, D5.d):java.io.Serializable");
    }

    public Q0.b F(S0.g gVar, Object obj, S0.k kVar, J0.c cVar) {
        String str;
        Map linkedHashMap;
        Q0.b bVar = gVar.f3020e;
        if (bVar != null) {
            return bVar;
        }
        List list = ((J0.j) this.f8367r).f1301e.f1274c;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                C1524f c1524f = (C1524f) list.get(i7);
                O0.b bVar2 = (O0.b) c1524f.f16468q;
                if (((Class) c1524f.f16469r).isAssignableFrom(obj.getClass())) {
                    M5.g.d(bVar2, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                    str = bVar2.a(obj, kVar);
                    if (str != null) {
                        break;
                    }
                }
                i7++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map = gVar.f3038y.f3056q;
        boolean isEmpty = map.isEmpty();
        A5.u uVar = A5.u.f136q;
        if (isEmpty) {
            linkedHashMap = uVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                AbstractC0515y1.v(((Map.Entry) it.next()).getValue());
                throw null;
            }
        }
        List list2 = gVar.f3025k;
        if (list2.isEmpty() && linkedHashMap.isEmpty()) {
            return new Q0.b(str, uVar);
        }
        LinkedHashMap P6 = A5.w.P(linkedHashMap);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                P6.put(AbstractC0515y1.l("coil#transformation_", i8), ((V0.a) list2.get(i8)).f3608e);
            }
            P6.put("coil#transformation_size", kVar.d.toString());
        }
        return new Q0.b(str, P6);
    }

    public void H(H.h hVar) {
        int i7 = hVar.f789b;
        Handler handler = (Handler) this.f8368s;
        T4.c cVar = (T4.c) this.f8367r;
        if (i7 == 0) {
            handler.post(new R3.a(cVar, 1, hVar.f788a));
        } else {
            handler.post(new H.a(i7, 0, cVar));
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, O4.a] */
    public O4.b I() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(z());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i7 = O4.b.f2722h;
        ?? obj = new Object();
        obj.f2721g = 0L;
        obj.k(1);
        obj.f = 0L;
        obj.f2718b = optString;
        obj.k(s.h.c(5)[optInt]);
        obj.f2719c = optString2;
        obj.d = optString3;
        obj.f2721g = Long.valueOf(optLong);
        obj.f = Long.valueOf(optLong2);
        obj.f2720e = optString4;
        return obj.i();
    }

    public void J(Z3.m mVar) {
        Z3.o oVar = new Z3.o(mVar.f4718a, mVar.f4719b);
        HashMap hashMap = (HashMap) this.f8367r;
        if (hashMap.containsKey(oVar)) {
            Z3.m mVar2 = (Z3.m) hashMap.get(oVar);
            if (!mVar2.equals(mVar) || !mVar.equals(mVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + oVar);
            }
            return;
        }
        hashMap.put(oVar, mVar);
    }

    public void K(S3.m mVar) {
        if (mVar != null) {
            Class c5 = mVar.c();
            HashMap hashMap = (HashMap) this.f8368s;
            if (hashMap.containsKey(c5)) {
                S3.m mVar2 = (S3.m) hashMap.get(c5);
                if (!mVar2.equals(mVar) || !mVar.equals(mVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c5);
                }
                return;
            }
            hashMap.put(c5, mVar);
            return;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public void L() {
        try {
            ((FileLock) this.f8368s).release();
            ((FileChannel) this.f8367r).close();
        } catch (IOException e3) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e3);
        }
    }

    public void M(KeyGenParameterSpec keyGenParameterSpec) {
        String a7 = B0.c.a(keyGenParameterSpec);
        String str = (String) this.f8367r;
        if (str.equals(a7)) {
            this.f8368s = keyGenParameterSpec;
            return;
        }
        StringBuilder u7 = AbstractC1111a.u("KeyGenParamSpec's key alias does not match provided alias (", str, " vs ");
        u7.append(B0.c.a(keyGenParameterSpec));
        throw new IllegalArgumentException(u7.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable N(int r5, D5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof M1.g
            if (r0 == 0) goto L13
            r0 = r6
            M1.g r0 = (M1.g) r0
            int r1 = r0.f2196w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2196w = r1
            goto L18
        L13:
            M1.g r0 = new M1.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2194u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f2196w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.gms.internal.measurement.K1 r5 = r0.f2193t
            k3.AbstractC0958a.H(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            k3.AbstractC0958a.H(r6)
            r0.f2193t = r4
            r0.f2196w = r3
            java.lang.Object r6 = r4.f8367r
            f1.J r6 = (f1.C0669J) r6
            r6.getClass()
            n5.y r2 = g1.b.f10508a
            f1.E r2 = new f1.E
            r3 = 0
            r2.<init>(r6, r5, r3)
            java.lang.Object r6 = g1.b.a(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            Y0.c r6 = (Y0.c) r6
            boolean r0 = r6 instanceof Y0.b
            if (r0 == 0) goto L67
            java.lang.Object r5 = r5.f8368s
            J3.e r5 = (J3.e) r5
            Y0.b r6 = (Y0.b) r6
            java.lang.Object r6 = r6.f4309a
            java.util.List r6 = (java.util.List) r6
            r5.getClass()
            java.util.List r5 = k3.AbstractC0958a.x(r5, r6)
            goto L73
        L67:
            boolean r5 = r6 instanceof Y0.a
            if (r5 == 0) goto L76
            Y0.a r6 = (Y0.a) r6
            java.lang.Throwable r5 = r6.f4308a
            z5.g r5 = k3.AbstractC0958a.m(r5)
        L73:
            java.io.Serializable r5 = (java.io.Serializable) r5
            return r5
        L76:
            F0.c r5 = new F0.c
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.N(int, D5.d):java.io.Serializable");
    }

    @Override // M2.h
    public int a(long j7) {
        int i7;
        switch (this.f8366q) {
            case 17:
                Long valueOf = Long.valueOf(j7);
                int i8 = Z2.H.f4603a;
                List list = (List) this.f8368s;
                int binarySearch = Collections.binarySearch(list, valueOf);
                if (binarySearch < 0) {
                    i7 = ~binarySearch;
                } else {
                    int size = list.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i7 = binarySearch;
                    } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) == 0);
                    i7 = binarySearch;
                }
                if (i7 >= list.size()) {
                    return -1;
                }
                return i7;
            default:
                long[] jArr = (long[]) this.f8368s;
                int b7 = Z2.H.b(jArr, j7, false);
                if (b7 >= jArr.length) {
                    return -1;
                }
                return b7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.J1
    public Object b(String str) {
        Object T6;
        Context context = (Context) this.f8367r;
        if (context == null) {
            return null;
        }
        if (E1.a() && !E1.b(context)) {
            return null;
        }
        try {
            try {
                androidx.fragment.app.D d = new androidx.fragment.app.D(6, false);
                d.f5883r = this;
                d.f5884s = str;
                try {
                    T6 = d.T();
                } catch (SecurityException unused) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        T6 = d.T();
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                return (String) T6;
            } catch (SecurityException e3) {
                e = e3;
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
                return null;
            }
        } catch (IllegalStateException e7) {
            e = e7;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        } catch (NullPointerException e8) {
            e = e8;
            Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            return null;
        }
    }

    @Override // Q0.h
    public void c(int i7) {
        int i8;
        Q0.f fVar = (Q0.f) this.f8368s;
        if (i7 >= 40) {
            fVar.r(-1);
        } else if (10 <= i7 && i7 < 20) {
            synchronized (((C0997b) fVar.f12806g)) {
                i8 = fVar.f12804c;
            }
            fVar.r(i8 / 2);
        }
    }

    @Override // Q0.h
    public Q0.c d(Q0.b bVar) {
        Q0.e eVar = (Q0.e) ((Q0.f) this.f8368s).h(bVar);
        if (eVar != null) {
            return new Q0.c(eVar.f2838a, eVar.f2839b);
        }
        return null;
    }

    @Override // K.InterfaceC0041q
    public K.i0 e(View view, K.i0 i0Var) {
        int i7;
        F3.m mVar = (F3.m) this.f8368s;
        int i8 = mVar.f726a;
        I.h hVar = (I.h) this.f8367r;
        hVar.getClass();
        int a7 = i0Var.a();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f1201b;
        bottomSheetBehavior.f8781r = a7;
        Field field = K.O.f1447a;
        boolean z7 = true;
        if (view.getLayoutDirection() != 1) {
            z7 = false;
        }
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z8 = bottomSheetBehavior.f8777m;
        K.h0 h0Var = i0Var.f1495a;
        if (z8) {
            int i9 = h0Var.h().d;
            bottomSheetBehavior.f8780q = i9;
            paddingBottom = i9 + mVar.f728c;
        }
        int i10 = mVar.f727b;
        if (bottomSheetBehavior.n) {
            if (z7) {
                i7 = i10;
            } else {
                i7 = i8;
            }
            paddingLeft = i7 + h0Var.h().f429a;
        }
        if (bottomSheetBehavior.f8778o) {
            if (!z7) {
                i8 = i10;
            }
            paddingRight = h0Var.h().f431c + i8;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z9 = hVar.f1200a;
        if (z9) {
            bottomSheetBehavior.f8775k = h0Var.f().d;
        }
        if (z8 || z9) {
            bottomSheetBehavior.H();
        }
        return i0Var;
    }

    @Override // Y2.InterfaceC0143l
    public InterfaceC0144m f() {
        return new C0151u((Context) this.f8367r, ((InterfaceC0143l) this.f8368s).f());
    }

    @Override // L2.p
    public Y2.O g(L2.l lVar, L2.i iVar) {
        return new K1(((L2.p) this.f8367r).g(lVar, iVar), 6, (List) this.f8368s);
    }

    @Override // M2.h
    public List h(long j7) {
        M2.b bVar;
        switch (this.f8366q) {
            case 17:
                int d = Z2.H.d((List) this.f8368s, Long.valueOf(j7), false);
                if (d == -1) {
                    return Collections.emptyList();
                }
                return (List) ((List) this.f8367r).get(d);
            default:
                int f = Z2.H.f((long[]) this.f8368s, j7, false);
                if (f != -1 && (bVar = ((M2.b[]) this.f8367r)[f]) != M2.b.f2219H) {
                    return Collections.singletonList(bVar);
                }
                return Collections.emptyList();
        }
    }

    @Override // L2.p
    public Y2.O i() {
        return new K1(((L2.p) this.f8367r).i(), 6, (List) this.f8368s);
    }

    @Override // Y2.O
    public L2.m j(Uri uri, C0146o c0146o) {
        L2.m j7 = ((Y2.O) this.f8367r).j(uri, c0146o);
        List list = (List) this.f8368s;
        if (list != null && !list.isEmpty()) {
            return (L2.m) j7.a(list);
        }
        return j7;
    }

    @Override // M2.h
    public long k(int i7) {
        boolean z7;
        boolean z8;
        switch (this.f8366q) {
            case 17:
                boolean z9 = false;
                if (i7 >= 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                AbstractC0156a.f(z7);
                List list = (List) this.f8368s;
                if (i7 < list.size()) {
                    z9 = true;
                }
                AbstractC0156a.f(z9);
                return ((Long) list.get(i7)).longValue();
            default:
                boolean z10 = false;
                if (i7 >= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                AbstractC0156a.f(z8);
                long[] jArr = (long[]) this.f8368s;
                if (i7 < jArr.length) {
                    z10 = true;
                }
                AbstractC0156a.f(z10);
                return jArr[i7];
        }
    }

    @Override // Q0.h
    public void l(Q0.b bVar, Bitmap bitmap, Map map) {
        int i7;
        int k5 = p6.d.k(bitmap);
        Q0.f fVar = (Q0.f) this.f8368s;
        synchronized (((C0997b) fVar.f12806g)) {
            i7 = fVar.f12803b;
        }
        if (k5 <= i7) {
            fVar.m(bVar, new Q0.e(bitmap, map, k5));
            return;
        }
        fVar.n(bVar);
        ((Q0.i) this.f8367r).A(bVar, bitmap, map, k5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable n(D5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof M1.f
            if (r0 == 0) goto L13
            r0 = r5
            M1.f r0 = (M1.f) r0
            int r1 = r0.f2192w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2192w = r1
            goto L18
        L13:
            M1.f r0 = new M1.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2190u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f2192w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.gms.internal.measurement.K1 r0 = r0.f2189t
            k3.AbstractC0958a.H(r5)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            k3.AbstractC0958a.H(r5)
            r0.f2189t = r4
            r0.f2192w = r3
            java.lang.Object r5 = r4.f8367r
            f1.J r5 = (f1.C0669J) r5
            r5.getClass()
            n5.y r2 = g1.b.f10508a
            f1.D r2 = new f1.D
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = g1.b.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            Y0.c r5 = (Y0.c) r5
            boolean r1 = r5 instanceof Y0.b
            if (r1 == 0) goto L67
            java.lang.Object r0 = r0.f8368s
            J3.e r0 = (J3.e) r0
            Y0.b r5 = (Y0.b) r5
            java.lang.Object r5 = r5.f4309a
            java.util.List r5 = (java.util.List) r5
            r0.getClass()
            java.util.List r5 = k3.AbstractC0958a.x(r0, r5)
            goto L73
        L67:
            boolean r0 = r5 instanceof Y0.a
            if (r0 == 0) goto L76
            Y0.a r5 = (Y0.a) r5
            java.lang.Throwable r5 = r5.f4308a
            z5.g r5 = k3.AbstractC0958a.m(r5)
        L73:
            java.io.Serializable r5 = (java.io.Serializable) r5
            return r5
        L76:
            F0.c r5 = new F0.c
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.n(D5.d):java.io.Serializable");
    }

    public synchronized void q() {
        if (!((LinkedHashSet) this.f8367r).isEmpty()) {
            ((V4.p) this.f8368s).e(0L);
        }
    }

    public B0.d r() {
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) this.f8368s;
        if (keyGenParameterSpec != null) {
            Object obj = B0.e.f150a;
            if (keyGenParameterSpec.getKeySize() == 256) {
                if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                    if (keyGenParameterSpec.getPurposes() == 3) {
                        if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                            if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                            }
                            synchronized (B0.e.f150a) {
                                String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                keyStore.load(null);
                                if (!keyStore.containsAlias(keystoreAlias)) {
                                    try {
                                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                        keyGenerator.init(keyGenParameterSpec);
                                        keyGenerator.generateKey();
                                    } catch (ProviderException e3) {
                                        throw new GeneralSecurityException(e3.getMessage(), e3);
                                    }
                                }
                            }
                            return new B0.d(keyGenParameterSpec.getKeystoreAlias(), (KeyGenParameterSpec) this.f8368s);
                        }
                        throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                    }
                    throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
                }
                throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
            }
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
        }
        throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(D5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof M1.j
            if (r0 == 0) goto L13
            r0 = r6
            M1.j r0 = (M1.j) r0
            int r1 = r0.f2204w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2204w = r1
            goto L18
        L13:
            M1.j r0 = new M1.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f2202u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f2204w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.gms.internal.measurement.K1 r0 = r0.f2201t
            k3.AbstractC0958a.H(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            k3.AbstractC0958a.H(r6)
            r0.f2201t = r5
            r0.f2204w = r3
            java.lang.Object r6 = r5.f8367r
            f1.J r6 = (f1.C0669J) r6
            r6.getClass()
            n5.y r2 = g1.b.f10508a
            f1.H r2 = new f1.H
            r3 = 0
            r4 = 0
            r2.<init>(r6, r4, r3)
            java.lang.Object r6 = g1.b.a(r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r0 = r5
        L50:
            Y0.c r6 = (Y0.c) r6
            java.lang.Object r0 = r0.f8368s
            L4.f r0 = (L4.f) r0
            java.lang.Object r6 = a.AbstractC0189a.w(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.s(D5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // Z5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(Z5.c r6, D5.d r7) {
        /*
            r5 = this;
            int r0 = r5.f8366q
            switch(r0) {
                case 26: goto L6d;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof Z5.e
            if (r0 == 0) goto L18
            r0 = r7
            Z5.e r0 = (Z5.e) r0
            int r1 = r0.f4889u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f4889u = r1
            goto L1d
        L18:
            Z5.e r0 = new Z5.e
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f4888t
            E5.a r1 = E5.a.f612q
            int r2 = r0.f4889u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            k3.AbstractC0958a.H(r7)
            goto L6a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Z5.c r6 = r0.f4892x
            com.google.android.gms.internal.measurement.K1 r2 = r0.f4891w
            k3.AbstractC0958a.H(r7)
            goto L54
        L3f:
            k3.AbstractC0958a.H(r7)
            r0.f4891w = r5
            r0.f4892x = r6
            r0.f4889u = r4
            java.lang.Object r7 = r5.f8367r
            Z5.b r7 = (Z5.b) r7
            java.io.Serializable r7 = Z5.s.d(r7, r6, r0)
            if (r7 != r1) goto L53
            goto L6c
        L53:
            r2 = r5
        L54:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L6a
            java.lang.Object r2 = r2.f8368s
            L5.q r2 = (L5.q) r2
            r4 = 0
            r0.f4891w = r4
            r0.f4892x = r4
            r0.f4889u = r3
            java.lang.Object r6 = r2.f(r6, r7, r0)
            if (r6 != r1) goto L6a
            goto L6c
        L6a:
            z5.l r1 = z5.C1530l.f16479a
        L6c:
            return r1
        L6d:
            Z4.B r0 = new Z4.B
            java.lang.Object r1 = r5.f8368s
            Z4.E r1 = (Z4.E) r1
            r2 = 0
            r0.<init>(r6, r1, r2)
            java.lang.Object r6 = r5.f8367r
            Z5.b r6 = (Z5.b) r6
            java.lang.Object r6 = r6.t(r0, r7)
            E5.a r7 = E5.a.f612q
            if (r6 != r7) goto L84
            goto L86
        L84:
            z5.l r6 = z5.C1530l.f16479a
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.t(Z5.c, D5.d):java.lang.Object");
    }

    @Override // M2.h
    public int u() {
        switch (this.f8366q) {
            case 17:
                return ((List) this.f8368s).size();
            default:
                return ((long[]) this.f8368s).length;
        }
    }

    @Override // C4.a
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        C4.a[] aVarArr;
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C4.a aVar : (C4.a[]) this.f8367r) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.v(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((B4.b) this.f8368s).v(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory w(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.w(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: JSONException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0014, B:7:0x002a, B:10:0x0040, B:17:0x005a, B:24:0x0070, B:26:0x0079, B:28:0x0083, B:30:0x0087, B:31:0x009d, B:32:0x00a4, B:33:0x00a5, B:34:0x00ac, B:35:0x00ad, B:36:0x00b4), top: B:45:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: JSONException -> 0x003d, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0014, B:7:0x002a, B:10:0x0040, B:17:0x005a, B:24:0x0070, B:26:0x0079, B:28:0x0083, B:30:0x0087, B:31:0x009d, B:32:0x00a4, B:33:0x00a5, B:34:0x00ac, B:35:0x00ad, B:36:0x00b4), top: B:45:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [Y4.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y4.d x(V4.g r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            org.json.JSONArray r3 = r14.f3682g
            long r4 = r14.f
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r6 = r0
        Le:
            int r7 = r3.length()
            if (r6 >= r7) goto Lbd
            org.json.JSONObject r7 = r3.getJSONObject(r6)     // Catch: org.json.JSONException -> L3d
            java.lang.String r8 = "rolloutId"
            java.lang.String r8 = r7.getString(r8)     // Catch: org.json.JSONException -> L3d
            java.lang.String r9 = "affectedParameterKeys"
            org.json.JSONArray r9 = r7.getJSONArray(r9)     // Catch: org.json.JSONException -> L3d
            int r10 = r9.length()     // Catch: org.json.JSONException -> L3d
            if (r10 <= r1) goto L40
            java.lang.String r10 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: org.json.JSONException -> L3d
            r12[r0] = r8     // Catch: org.json.JSONException -> L3d
            r12[r1] = r9     // Catch: org.json.JSONException -> L3d
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> L3d
            android.util.Log.w(r10, r11)     // Catch: org.json.JSONException -> L3d
            goto L40
        L3d:
            r14 = move-exception
            goto Lb5
        L40:
            java.lang.String r9 = r9.optString(r0, r2)     // Catch: org.json.JSONException -> L3d
            java.lang.Object r10 = r13.f8367r     // Catch: org.json.JSONException -> L3d
            V4.e r10 = (V4.e) r10     // Catch: org.json.JSONException -> L3d
            V4.g r10 = r10.c()     // Catch: org.json.JSONException -> L3d
            r11 = 0
            if (r10 != 0) goto L51
        L4f:
            r10 = r11
            goto L57
        L51:
            org.json.JSONObject r10 = r10.f3679b     // Catch: org.json.JSONException -> L4f
            java.lang.String r10 = r10.getString(r9)     // Catch: org.json.JSONException -> L4f
        L57:
            if (r10 == 0) goto L5a
            goto L70
        L5a:
            java.lang.Object r10 = r13.f8368s     // Catch: org.json.JSONException -> L3d
            V4.e r10 = (V4.e) r10     // Catch: org.json.JSONException -> L3d
            V4.g r10 = r10.c()     // Catch: org.json.JSONException -> L3d
            if (r10 != 0) goto L65
            goto L6b
        L65:
            org.json.JSONObject r10 = r10.f3679b     // Catch: org.json.JSONException -> L6b
            java.lang.String r11 = r10.getString(r9)     // Catch: org.json.JSONException -> L6b
        L6b:
            if (r11 == 0) goto L6f
            r10 = r11
            goto L70
        L6f:
            r10 = r2
        L70:
            int r11 = Y4.e.f4499a     // Catch: org.json.JSONException -> L3d
            Y4.b r11 = new Y4.b     // Catch: org.json.JSONException -> L3d
            r11.<init>()     // Catch: org.json.JSONException -> L3d
            if (r8 == 0) goto Lad
            r11.f4491a = r8     // Catch: org.json.JSONException -> L3d
            java.lang.String r8 = "variantId"
            java.lang.String r7 = r7.getString(r8)     // Catch: org.json.JSONException -> L3d
            if (r7 == 0) goto La5
            r11.f4492b = r7     // Catch: org.json.JSONException -> L3d
            if (r9 == 0) goto L9d
            r11.f4493c = r9     // Catch: org.json.JSONException -> L3d
            r11.d = r10     // Catch: org.json.JSONException -> L3d
            r11.f4494e = r4     // Catch: org.json.JSONException -> L3d
            byte r7 = r11.f     // Catch: org.json.JSONException -> L3d
            r7 = r7 | r1
            byte r7 = (byte) r7     // Catch: org.json.JSONException -> L3d
            r11.f = r7     // Catch: org.json.JSONException -> L3d
            Y4.c r7 = r11.a()     // Catch: org.json.JSONException -> L3d
            r14.add(r7)     // Catch: org.json.JSONException -> L3d
            int r6 = r6 + r1
            goto Le
        L9d:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        La5:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lad:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3d
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3d
            throw r14     // Catch: org.json.JSONException -> L3d
        Lb5:
            U4.g r0 = new U4.g
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lbd:
            Y4.d r0 = new Y4.d
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.x(V4.g):Y4.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r7 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
        if (M5.g.a(r2, r20.toString()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (java.lang.Math.abs(r3 - (r10 * r4)) > 1.0d) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f1, code lost:
        if (java.lang.Math.abs(r9 - r2) > 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fd, code lost:
        if (java.lang.Math.abs(r3 - r4) > 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
        if (r12 != 1.0d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0105, code lost:
        if (r1 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010a, code lost:
        if (r12 <= 1.0d) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010c, code lost:
        if (r7 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q0.c y(S0.g r18, Q0.b r19, T0.f r20, int r21) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.K1.y(S0.g, Q0.b, T0.f, int):Q0.c");
    }

    public File z() {
        if (((File) this.f8367r) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f8367r) == null) {
                        h4.f fVar = (h4.f) this.f8368s;
                        fVar.a();
                        File filesDir = fVar.f10987a.getFilesDir();
                        this.f8367r = new File(filesDir, "PersistedInstallation." + ((h4.f) this.f8368s).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f8367r;
    }

    public K1(int i7, int i8) {
        this.f8366q = 3;
        this.f8367r = new int[]{i7, i8};
        this.f8368s = new float[]{0.0f, 1.0f};
    }

    public K1(int i7, int i8, int i9) {
        this.f8366q = 3;
        this.f8367r = new int[]{i7, i8, i9};
        this.f8368s = new float[]{0.0f, 0.5f, 1.0f};
    }

    public K1(int i7, Q0.i iVar) {
        this.f8366q = 16;
        this.f8367r = iVar;
        this.f8368s = new Q0.f(i7, this);
    }

    public /* synthetic */ K1(int i7, Object obj) {
        this.f8366q = i7;
        this.f8368s = null;
        this.f8367r = obj;
    }

    public /* synthetic */ K1(int i7, boolean z7) {
        this.f8366q = i7;
    }

    public K1(M4.b bVar) {
        this.f8366q = 21;
        this.f8368s = Collections.synchronizedMap(new HashMap());
        this.f8367r = bVar;
    }

    public K1(Z3.p pVar) {
        this.f8366q = 25;
        this.f8367r = new HashMap(pVar.f4723a);
        this.f8368s = new HashMap(pVar.f4724b);
    }

    public K1(C0197a c0197a, C0669J c0669j, L4.f fVar) {
        this.f8366q = 11;
        M5.g.f(c0197a, "encryptedPreference");
        M5.g.f(c0669j, "traktRepository");
        this.f8367r = c0669j;
        this.f8368s = fVar;
    }

    public K1(Animator animator) {
        this.f8366q = 29;
        this.f8367r = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8368s = animatorSet;
        animatorSet.play(animator);
    }

    public K1(Context context, int i7) {
        this.f8366q = i7;
        switch (i7) {
            case 1:
                context.getApplicationContext();
                this.f8367r = "_androidx_security_master_key_";
                return;
            case 23:
                C0152v c0152v = new C0152v(0);
                this.f8367r = context.getApplicationContext();
                this.f8368s = c0152v;
                return;
            default:
                this.f8367r = context;
                ContentObserver contentObserver = new ContentObserver(null);
                this.f8368s = contentObserver;
                context.getContentResolver().registerContentObserver(A1.f8222a, true, contentObserver);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, a0.a] */
    public K1(EditText editText) {
        this.f8366q = 28;
        this.f8367r = editText;
        a0.i iVar = new a0.i(editText);
        this.f8368s = iVar;
        editText.addTextChangedListener(iVar);
        if (C0190a.f4960b == null) {
            synchronized (C0190a.f4959a) {
                try {
                    if (C0190a.f4960b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            C0190a.f4961c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0190a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0190a.f4960b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C0190a.f4960b);
    }

    public K1(C0669J c0669j, J3.e eVar) {
        this.f8366q = 10;
        M5.g.f(c0669j, "traktRepository");
        this.f8367r = c0669j;
        this.f8368s = eVar;
    }

    public K1(C0672M c0672m, J1.m mVar) {
        this.f8366q = 9;
        M5.g.f(c0672m, "userRepository");
        M5.g.f(mVar, "movieMapper");
        this.f8367r = c0672m;
        this.f8368s = mVar;
    }

    public K1(h4.f fVar) {
        this.f8366q = 14;
        this.f8368s = fVar;
    }

    public K1(h4.f fVar, N4.e eVar, V4.k kVar, V4.e eVar2, Context context, V4.n nVar, ScheduledExecutorService scheduledExecutorService) {
        this.f8366q = 20;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f8367r = linkedHashSet;
        this.f8368s = new V4.p(fVar, eVar, kVar, eVar2, context, linkedHashSet, nVar, scheduledExecutorService);
    }

    public /* synthetic */ K1(Object obj, int i7, Object obj2) {
        this.f8366q = i7;
        this.f8367r = obj;
        this.f8368s = obj2;
    }

    public K1(String str, u0.j jVar) {
        this.f8366q = 2;
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f8368s = jVar;
        this.f8367r = str;
    }

    public K1(ArrayList arrayList, ArrayList arrayList2) {
        this.f8366q = 3;
        int size = arrayList.size();
        this.f8367r = new int[size];
        this.f8368s = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f8367r)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f8368s)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public K1(C4.a[] aVarArr) {
        this.f8366q = 4;
        this.f8367r = aVarArr;
        this.f8368s = new B4.b();
    }
}
