package k;

import H2.C0002c;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.transition.TransitionInflater;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import r0.AbstractC1111a;
import v4.C1326d;
import v4.C1329g;
import z4.C1518b;
/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f11960a;

    /* renamed from: b  reason: collision with root package name */
    public Object f11961b;

    /* renamed from: c  reason: collision with root package name */
    public Object f11962c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f11963e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f11964g;

    public V0() {
        this.f11960a = null;
        this.f11961b = null;
        this.f11962c = null;
        this.d = null;
        this.f11963e = null;
        this.f = null;
    }

    public static byte[] h(String str, String str2, Context context) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
            }
            try {
                String string = sharedPreferences.getString(str, null);
                if (string == null) {
                    return null;
                }
                return m3.g.j(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(AbstractC1111a.r("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public static S3.f i(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            e4.g0 G6 = e4.g0.G(byteArrayInputStream, C0536n.a());
            byteArrayInputStream.close();
            return new S3.f(3, (e4.d0) ((e4.g0) C0002c.w(G6).f1017r).y());
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public void a(long j7, int i7) {
        if (i7 == 0) {
            g(new U4.j("Unable to fetch the latest version of the template."));
            return;
        }
        int nextInt = ((Random) this.f11964g).nextInt(4);
        ((ScheduledExecutorService) this.f).schedule(new V4.b(this, i7, j7), nextInt, TimeUnit.SECONDS);
    }

    public synchronized Y3.a b() {
        S3.f i7;
        Y3.a aVar;
        try {
            if (((String) this.f11961b) != null) {
                synchronized (Y3.a.f4482b) {
                    byte[] h7 = h((String) this.f11961b, (String) this.f11962c, (Context) this.f11960a);
                    if (h7 == null) {
                        if (((String) this.d) != null) {
                            this.f11963e = k();
                        }
                        i7 = c();
                    } else if (((String) this.d) != null) {
                        i7 = j(h7);
                    } else {
                        i7 = i(h7);
                    }
                    this.f11964g = i7;
                    aVar = new Y3.a(this);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    public S3.f c() {
        SharedPreferences sharedPreferences;
        if (((S3.g) this.f) != null) {
            S3.f fVar = new S3.f(3, e4.g0.F());
            S3.g gVar = (S3.g) this.f;
            synchronized (fVar) {
                fVar.a(gVar.f3146a);
            }
            fVar.h(S3.o.a((e4.g0) fVar.c().f1017r).B().D());
            Context context = (Context) this.f11960a;
            String str = (String) this.f11961b;
            String str2 = (String) this.f11962c;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (((Y3.b) this.f11963e) != null) {
                    C0002c c5 = fVar.c();
                    Y3.b bVar = (Y3.b) this.f11963e;
                    byte[] bArr = new byte[0];
                    e4.g0 g0Var = (e4.g0) c5.f1017r;
                    byte[] a7 = bVar.a(g0Var.e(), bArr);
                    try {
                        if (e4.g0.H(bVar.b(a7, bArr), C0536n.a()).equals(g0Var)) {
                            e4.M C3 = e4.N.C();
                            C0529g f = AbstractC0530h.f(a7, 0, a7.length);
                            C3.i();
                            e4.N.z((e4.N) C3.f9164r, f);
                            e4.k0 a8 = S3.o.a(g0Var);
                            C3.i();
                            e4.N.A((e4.N) C3.f9164r, a8);
                            if (!edit.putString(str, m3.g.k(((e4.N) C3.c()).e())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        } else {
                            throw new GeneralSecurityException("cannot encrypt keyset");
                        }
                    } catch (com.google.crypto.tink.shaded.protobuf.B unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } else if (!edit.putString(str, m3.g.k(((e4.g0) fVar.c().f1017r).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return fVar;
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        throw new GeneralSecurityException("cannot read or generate keyset");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [h4.h, U4.h] */
    public void d(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = AbstractC0515y1.m(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                String str2 = "";
                if (indexOf >= 0 && lastIndexOf >= 0 && indexOf < lastIndexOf) {
                    str2 = str.substring(indexOf, lastIndexOf + 1);
                }
                str = str2;
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e3) {
                        g(new h4.h("Unable to parse config update message.", e3.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e3);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((U4.b) this.f11963e).b(new U4.j("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((Set) this.f11960a).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j7 = ((V4.k) this.f11962c).f3700g.f3708a.getLong("last_template_version", 0L);
                        long j8 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j8 > j7) {
                            a(j8, 3);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public void e() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f11961b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                d(inputStream);
                inputStream.close();
            } catch (IOException e3) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e3);
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N3.l f(int r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 3
            r2 = 2
            r3 = 1
            java.lang.Object r4 = r8.f11961b
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            boolean r5 = r4.containsKey(r5)
            if (r5 == 0) goto L1d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r4.get(r9)
            N3.l r9 = (N3.l) r9
            return r9
        L1d:
            java.lang.Object r5 = r8.f11963e
            Y2.l r5 = (Y2.InterfaceC0143l) r5
            r5.getClass()
            java.lang.Class<H2.z> r6 = H2.InterfaceC0024z.class
            r7 = 0
            if (r9 == 0) goto L68
            if (r9 == r3) goto L58
            if (r9 == r2) goto L4b
            if (r9 == r1) goto L3a
            r0 = 4
            if (r9 == r0) goto L33
            goto L78
        L33:
            H2.l r0 = new H2.l     // Catch: java.lang.ClassNotFoundException -> L78
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L78
            r7 = r0
            goto L78
        L3a:
            java.lang.String r1 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L78
            java.lang.Class r1 = r1.asSubclass(r6)     // Catch: java.lang.ClassNotFoundException -> L78
            H2.m r2 = new H2.m     // Catch: java.lang.ClassNotFoundException -> L78
            r2.<init>(r0, r1)     // Catch: java.lang.ClassNotFoundException -> L78
        L49:
            r7 = r2
            goto L78
        L4b:
            java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r0 = com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory.class
            java.lang.Class r0 = r0.asSubclass(r6)     // Catch: java.lang.ClassNotFoundException -> L78
            H2.l r1 = new H2.l     // Catch: java.lang.ClassNotFoundException -> L78
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L78
        L56:
            r7 = r1
            goto L78
        L58:
            java.lang.String r0 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L78
            java.lang.Class r0 = r0.asSubclass(r6)     // Catch: java.lang.ClassNotFoundException -> L78
            H2.l r1 = new H2.l     // Catch: java.lang.ClassNotFoundException -> L78
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L78
            goto L56
        L68:
            java.lang.String r1 = "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L78
            java.lang.Class r1 = r1.asSubclass(r6)     // Catch: java.lang.ClassNotFoundException -> L78
            H2.l r2 = new H2.l     // Catch: java.lang.ClassNotFoundException -> L78
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L78
            goto L49
        L78:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4.put(r0, r7)
            if (r7 == 0) goto L8c
            java.lang.Object r0 = r8.f11962c
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.add(r9)
        L8c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k.V0.f(int):N3.l");
    }

    public synchronized void g(U4.h hVar) {
        for (U4.b bVar : (Set) this.f11960a) {
            bVar.b(hVar);
        }
    }

    public S3.f j(byte[] bArr) {
        try {
            this.f11963e = new Y3.c().c((String) this.d);
            try {
                return new S3.f(3, (e4.d0) ((e4.g0) C0002c.J(new S3.f(1, new ByteArrayInputStream(bArr)), (Y3.b) this.f11963e).f1017r).y());
            } catch (IOException | GeneralSecurityException e3) {
                try {
                    return i(bArr);
                } catch (IOException unused) {
                    throw e3;
                }
            }
        } catch (GeneralSecurityException | ProviderException e7) {
            try {
                S3.f i7 = i(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e7);
                return i7;
            } catch (IOException unused2) {
                throw e7;
            }
        }
    }

    public Y3.b k() {
        Y3.c cVar = new Y3.c();
        try {
            boolean a7 = Y3.c.a((String) this.d);
            try {
                return cVar.c((String) this.d);
            } catch (GeneralSecurityException | ProviderException e3) {
                if (a7) {
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
                throw new KeyStoreException(AbstractC1111a.r("the master key ", (String) this.d, " exists but is unusable"), e3);
            }
        } catch (GeneralSecurityException | ProviderException e7) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e7);
            return null;
        }
    }

    public void l(String str) {
        L0.b bVar = (L0.b) this.f11963e;
        synchronized (bVar) {
            try {
                if (((C1326d) ((AtomicMarkableReference) bVar.f1863b).getReference()).c(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f1863b;
                    atomicMarkableReference.set((C1326d) atomicMarkableReference.getReference(), true);
                    U4.l lVar = new U4.l(2, bVar);
                    AtomicReference atomicReference = (AtomicReference) bVar.f1864c;
                    while (!atomicReference.compareAndSet(null, lVar)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((C4.b) ((V0) bVar.d).f11961b).X(lVar);
                }
            } finally {
            }
        }
    }

    public V0(ViewGroup viewGroup, View view) {
        this.f11964g = new Z5.n(this);
        if (viewGroup != null && view != null) {
            this.f11960a = viewGroup;
            this.f11961b = view;
            this.f11962c = TransitionInflater.from(viewGroup.getContext()).inflateTransition(R.transition.lb_title_out);
            this.d = TransitionInflater.from(viewGroup.getContext()).inflateTransition(R.transition.lb_title_in);
            this.f11963e = m3.g.i(viewGroup, new androidx.leanback.widget.L0(this, 0));
            this.f = m3.g.i(viewGroup, new androidx.leanback.widget.L0(this, 1));
            return;
        }
        throw new IllegalArgumentException("Views may not be null");
    }

    public V0(String str, C1518b c1518b, C4.b bVar) {
        this.d = new L0.b(this, false);
        this.f11963e = new L0.b(this, true);
        this.f = new H.j(8);
        this.f11964g = new AtomicMarkableReference(null, false);
        this.f11962c = str;
        this.f11960a = new C1329g(c1518b);
        this.f11961b = bVar;
    }
}
