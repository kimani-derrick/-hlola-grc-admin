package L0;

import O3.Z;
import Y2.C0146o;
import Y2.C0147p;
import Y2.C0148q;
import Y2.C0152v;
import Y2.F;
import Y2.InterfaceC0143l;
import Y2.V;
import Z2.AbstractC0156a;
import Z2.H;
import a3.t;
import a3.z;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.text.TextUtils;
import e2.AbstractC0606g;
import e2.K;
import g2.C0713d;
import g3.n;
import j2.D;
import j2.v;
import j2.w;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k.V0;
import s3.T;
import v4.C1326d;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1862a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1863b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1864c;
    public Object d;

    public b() {
        this.f1863b = new float[16];
        this.f1864c = new float[16];
        this.d = new C0152v(1);
    }

    public static void c(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f7 = fArr2[8];
        float sqrt = (float) Math.sqrt((f7 * f7) + (f * f));
        float f8 = fArr2[10];
        fArr[0] = f8 / sqrt;
        float f9 = fArr2[8];
        fArr[2] = f9 / sqrt;
        fArr[8] = (-f9) / sqrt;
        fArr[10] = f8 / sqrt;
    }

    public static byte[] e(InterfaceC0143l interfaceC0143l, String str, byte[] bArr, Map map) {
        C0146o c0146o;
        Map map2;
        List list;
        V v5 = new V(interfaceC0143l.f());
        Collections.emptyMap();
        Uri parse = Uri.parse(str);
        AbstractC0156a.m(parse, "The uri must be set.");
        String str2 = "The uri must be set.";
        C0148q c0148q = new C0148q(parse, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i7 = 0;
        int i8 = 0;
        C0148q c0148q2 = c0148q;
        while (true) {
            try {
                C0146o c0146o2 = new C0146o(v5, c0148q2);
                try {
                    try {
                        int i9 = H.f4603a;
                        byte[] bArr2 = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = c0146o2.read(bArr2);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr2, i7, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                H.h(c0146o2);
                                return byteArray;
                            }
                        }
                    } catch (F e3) {
                        int i10 = e3.f4325t;
                        String str3 = null;
                        if ((i10 == 307 || i10 == 308) && i8 < 5 && (map2 = e3.f4326u) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str3 = (String) list.get(i7);
                        }
                        if (str3 != null) {
                            int i11 = i8 + 1;
                            C0147p a7 = c0148q2.a();
                            Uri parse2 = Uri.parse(str3);
                            a7.f4413a = parse2;
                            String str4 = str2;
                            AbstractC0156a.m(parse2, str4);
                            c0146o = c0146o2;
                            try {
                                c0148q2 = new C0148q(a7.f4413a, a7.f4414b, a7.f4415c, a7.d, a7.f4416e, a7.f, a7.f4417g, a7.f4418h, a7.f4419i, a7.f4420j);
                                H.h(c0146o);
                                i8 = i11;
                                str2 = str4;
                                i7 = 0;
                            } catch (Throwable th) {
                                th = th;
                                H.h(c0146o);
                                throw th;
                            }
                        } else {
                            c0146o = c0146o2;
                            throw e3;
                        }
                        th = th;
                        H.h(c0146o);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0146o = c0146o2;
                    H.h(c0146o);
                    throw th;
                }
            } catch (Exception e7) {
                Uri uri = v5.f4367s;
                uri.getClass();
                throw new D(c0148q, uri, v5.f4365q.n(), v5.f4366r, e7);
            }
        }
    }

    public boolean a(K k5, C0713d c0713d) {
        boolean canBeSpatialized;
        boolean equals = "audio/eac3-joc".equals(k5.f9655B);
        int i7 = k5.f9667O;
        if (equals && i7 == 16) {
            i7 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(H.p(i7));
        int i8 = k5.f9668P;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        canBeSpatialized = ((Spatializer) this.f1863b).canBeSpatialized((AudioAttributes) c0713d.a().f4918q, channelMask.build());
        return canBeSpatialized;
    }

    public void b(boolean z7) {
        g gVar = (g) this.d;
        synchronized (gVar) {
            try {
                if (!this.f1862a) {
                    if (M5.g.a(((c) this.f1863b).f1869g, this)) {
                        g.a(gVar, this, z7);
                    }
                    this.f1862a = true;
                } else {
                    throw new IllegalStateException("editor is closed".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] d(UUID uuid, v vVar) {
        String str;
        String str2 = vVar.f11839b;
        if (this.f1862a || TextUtils.isEmpty(str2)) {
            str2 = (String) this.f1864c;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = AbstractC0606g.f9962e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (AbstractC0606g.f9961c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.d)) {
                hashMap.putAll((HashMap) this.d);
            }
            return e((InterfaceC0143l) this.f1863b, str2, vVar.f11838a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        AbstractC0156a.m(uri, "The uri must be set.");
        throw new D(new C0148q(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), uri, Z.f2634w, 0L, new IllegalStateException("No license URL"));
    }

    public byte[] f(w wVar) {
        return e((InterfaceC0143l) this.f1863b, wVar.f11841b + "&signedRequest=" + H.o(wVar.f11840a), null, Collections.emptyMap());
    }

    public v6.w g(int i7) {
        v6.w wVar;
        g gVar = (g) this.d;
        synchronized (gVar) {
            if (!this.f1862a) {
                ((boolean[]) this.f1864c)[i7] = true;
                Object obj = ((c) this.f1863b).d.get(i7);
                e eVar = gVar.F;
                v6.w wVar2 = (v6.w) obj;
                if (!eVar.f(wVar2)) {
                    X0.e.a(eVar.k(wVar2));
                }
                wVar = (v6.w) obj;
            } else {
                throw new IllegalStateException("editor is closed".toString());
            }
        }
        return wVar;
    }

    public int[] h() {
        boolean z7;
        synchronized (this) {
            try {
                if (!this.f1862a) {
                    return null;
                }
                long[] jArr = (long[]) this.f1863b;
                int length = jArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i8 + 1;
                    int i10 = 1;
                    if (jArr[i7] > 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean[] zArr = (boolean[]) this.f1864c;
                    if (z7 != zArr[i8]) {
                        int[] iArr = (int[]) this.d;
                        if (!z7) {
                            i10 = 2;
                        }
                        iArr[i8] = i10;
                    } else {
                        ((int[]) this.d)[i8] = 0;
                    }
                    zArr[i8] = z7;
                    i7++;
                    i8 = i9;
                }
                this.f1862a = false;
                return (int[]) ((int[]) this.d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        if (!this.f1862a) {
            this.f1862a = true;
            this.f1864c = ((T) this.d).N().getString((String) this.f1863b, null);
        }
        return (String) this.f1864c;
    }

    public void j(String str) {
        SharedPreferences.Editor edit = ((T) this.d).N().edit();
        edit.putString((String) this.f1863b, str);
        edit.apply();
        this.f1864c = str;
    }

    public b(int i7) {
        this.f1863b = new long[i7];
        this.f1864c = new boolean[i7];
        this.d = new int[i7];
    }

    public b(g gVar, c cVar) {
        this.d = gVar;
        this.f1863b = cVar;
        gVar.getClass();
        this.f1864c = new boolean[2];
    }

    public b(t tVar, a3.i iVar) {
        this.f1863b = iVar;
        new ArrayDeque();
        new ArrayDeque();
        this.f1862a = true;
        z zVar = z.f5137u;
    }

    public b(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f1863b = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f1862a = immersiveAudioLevel != 0;
    }

    public b(String str, boolean z7, C0152v c0152v) {
        AbstractC0156a.f((z7 && TextUtils.isEmpty(str)) ? false : true);
        this.f1863b = c0152v;
        this.f1864c = str;
        this.f1862a = z7;
        this.d = new HashMap();
    }

    public b(V0 v02, boolean z7) {
        this.d = v02;
        this.f1864c = new AtomicReference(null);
        this.f1862a = z7;
        this.f1863b = new AtomicMarkableReference(new C1326d(z7 ? 8192 : 1024), false);
    }

    public b(T t5, String str) {
        this.d = t5;
        n.c(str);
        this.f1863b = str;
    }
}
