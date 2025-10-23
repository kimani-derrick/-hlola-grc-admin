package L4;

import H2.d0;
import J1.l;
import K.C0040p;
import O3.E;
import O3.U;
import W2.p;
import W2.q;
import Y2.C;
import Y2.C0145n;
import Y2.F;
import Y2.H;
import Y2.InterfaceC0137f;
import Y2.M;
import Z2.B;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDrmException;
import android.os.PowerManager;
import android.text.Spannable;
import androidx.fragment.app.D;
import com.boxhdo.android.data.model.response.trakt.TraktProfileResponse;
import com.boxhdo.domain.model.trakt.TraktProfile;
import e2.m0;
import f2.m;
import f4.j;
import i2.InterfaceC0770b;
import j2.C0835d;
import j2.v;
import j2.w;
import j2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k2.InterfaceC0938c;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import org.json.JSONObject;
import u4.C1288l;
/* loaded from: classes.dex */
public class f implements B4.e, C4.a, d0, l, Q0.i, R0.e, j, x, InterfaceC0938c, InterfaceC0948m, m3.d {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2142q;

    public /* synthetic */ f(int i7) {
        this.f2142q = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(L4.f r5, java.util.List r6, V.z r7, D5.d r8) {
        /*
            r5.getClass()
            boolean r0 = r8 instanceof V.C0086e
            if (r0 == 0) goto L16
            r0 = r8
            V.e r0 = (V.C0086e) r0
            int r1 = r0.f3546x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f3546x = r1
            goto L1b
        L16:
            V.e r0 = new V.e
            r0.<init>(r5, r8)
        L1b:
            java.lang.Object r5 = r0.f3544v
            E5.a r8 = E5.a.f612q
            int r1 = r0.f3546x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L35
            java.util.Iterator r6 = r0.f3543u
            java.io.Serializable r7 = r0.f3542t
            M5.o r7 = (M5.o) r7
            k3.AbstractC0958a.H(r5)     // Catch: java.lang.Throwable -> L33
            goto L6b
        L33:
            r5 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            java.io.Serializable r6 = r0.f3542t
            java.util.List r6 = (java.util.List) r6
            k3.AbstractC0958a.H(r5)
            goto L5f
        L45:
            k3.AbstractC0958a.H(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            V.g r1 = new V.g
            r4 = 0
            r1.<init>(r6, r5, r4)
            r0.f3542t = r5
            r0.f3546x = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r8) goto L5e
            goto L99
        L5e:
            r6 = r5
        L5f:
            M5.o r5 = new M5.o
            r5.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = r5
        L6b:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L91
            java.lang.Object r5 = r6.next()
            L5.l r5 = (L5.l) r5
            r0.f3542t = r7     // Catch: java.lang.Throwable -> L33
            r0.f3543u = r6     // Catch: java.lang.Throwable -> L33
            r0.f3546x = r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Throwable -> L33
            if (r5 != r8) goto L6b
            goto L99
        L84:
            java.lang.Object r1 = r7.f2315q
            if (r1 != 0) goto L8b
            r7.f2315q = r5
            goto L6b
        L8b:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            android.support.v4.media.session.b.a(r1, r5)
            goto L6b
        L91:
            java.lang.Object r5 = r7.f2315q
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 != 0) goto L9a
            z5.l r8 = z5.C1530l.f16479a
        L99:
            return r8
        L9a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.f.F(L4.f, java.util.List, V.z, D5.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r11 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r11 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
        if (r11 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r11 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g5.c H(int r9, boolean r10, boolean r11) {
        /*
            int r9 = I(r9, r10, r10)
            g5.c r0 = g5.c.f10848u
            g5.c r1 = g5.c.f10847t
            g5.c r2 = g5.c.f10846s
            g5.c r3 = g5.c.f10845r
            r4 = 0
            r5 = 130(0x82, float:1.82E-43)
            r6 = 66
            r7 = 33
            r8 = 17
            if (r10 == 0) goto L31
            if (r9 == r8) goto L2e
            if (r9 == r7) goto L2b
            if (r9 == r6) goto L27
            if (r9 == r5) goto L21
        L1f:
            r0 = r4
            goto L46
        L21:
            if (r11 == 0) goto L25
        L23:
            r0 = r3
            goto L46
        L25:
            r0 = r2
            goto L46
        L27:
            if (r11 == 0) goto L46
        L29:
            r0 = r1
            goto L46
        L2b:
            if (r11 == 0) goto L23
            goto L25
        L2e:
            if (r11 == 0) goto L29
            goto L46
        L31:
            if (r9 == r8) goto L43
            if (r9 == r7) goto L40
            if (r9 == r6) goto L3d
            if (r9 == r5) goto L3a
            goto L1f
        L3a:
            if (r11 == 0) goto L46
            goto L29
        L3d:
            if (r11 == 0) goto L25
            goto L23
        L40:
            if (r11 == 0) goto L29
            goto L46
        L43:
            if (r11 == 0) goto L23
            goto L25
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L4.f.H(int, boolean, boolean):g5.c");
    }

    public static int I(int i7, boolean z7, boolean z8) {
        boolean z9 = true;
        if (i7 != 2 && i7 != 1) {
            return i7;
        }
        if (z7) {
            if (i7 == 2) {
                return 130;
            }
            return 33;
        }
        if (i7 != 2) {
            z9 = false;
        }
        if (z9 ^ z8) {
            return 66;
        }
        return 17;
    }

    public static H J(C0040p c0040p, H.j jVar) {
        int i7;
        IOException iOException = (IOException) jVar.f794r;
        if (!(iOException instanceof F) || (((i7 = ((F) iOException).f4325t) != 403 && i7 != 404 && i7 != 410 && i7 != 416 && i7 != 500 && i7 != 503) || c0040p.f1501a - c0040p.f1502b <= 1)) {
            return null;
        }
        return new H(60000L, 2);
    }

    public static long L(H.j jVar) {
        Throwable th = (IOException) jVar.f794r;
        if (!(th instanceof m0) && !(th instanceof FileNotFoundException) && !(th instanceof C) && !(th instanceof M)) {
            int i7 = C0145n.f4406r;
            while (th != null) {
                if (!(th instanceof C0145n) || ((C0145n) th).f4407q != 2008) {
                    th = th.getCause();
                }
            }
            return Math.min((jVar.f793q - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // j2.x
    public boolean B(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // j2.x
    public byte[] C() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // R0.e
    public boolean D() {
        return true;
    }

    @Override // j2.x
    public byte[] E(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public q[] G(p[] pVarArr, InterfaceC0137f interfaceC0137f) {
        W2.c bVar;
        U u7 = W2.b.u(pVarArr);
        q[] qVarArr = new q[pVarArr.length];
        for (int i7 = 0; i7 < pVarArr.length; i7++) {
            p pVar = pVarArr[i7];
            if (pVar != null) {
                int[] iArr = pVar.f3872b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        int i8 = iArr[0];
                        int i9 = pVar.f3873c;
                        bVar = new W2.c(pVar.f3871a, new int[]{i8});
                    } else {
                        long j7 = 25000;
                        B b7 = B.f4594a;
                        bVar = new W2.b(pVar.f3871a, iArr, pVar.f3873c, interfaceC0137f, 10000, j7, j7, 1279, 719, 0.7f, 0.75f, (E) u7.get(i7), b7);
                    }
                    qVarArr[i7] = bVar;
                }
            }
        }
        return qVarArr;
    }

    public int K(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return 3;
    }

    public boolean M(Spannable spannable) {
        return false;
    }

    @Override // Q0.i
    public Q0.c d(Q0.b bVar) {
        return null;
    }

    @Override // j2.x
    public w e() {
        throw new IllegalStateException();
    }

    @Override // j2.x
    public void f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // H2.d0
    public boolean g() {
        return true;
    }

    @Override // j2.x
    public v h(byte[] bArr, List list, int i7, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // f4.j
    public Object j(String str, Provider provider) {
        switch (this.f2142q) {
            case 20:
                if (provider == null) {
                    return Cipher.getInstance(str);
                }
                return Cipher.getInstance(str, provider);
            case 21:
                if (provider == null) {
                    return KeyFactory.getInstance(str);
                }
                return KeyFactory.getInstance(str, provider);
            case 22:
                if (provider == null) {
                    return Mac.getInstance(str);
                }
                return Mac.getInstance(str, provider);
            default:
                if (provider == null) {
                    return Signature.getInstance(str);
                }
                return Signature.getInstance(str, provider);
        }
    }

    @Override // H2.d0
    public int k(D d, i2.g gVar, int i7) {
        gVar.f11331r = 4;
        return -4;
    }

    @Override // k2.InterfaceC0948m
    public void l() {
        throw new UnsupportedOperationException();
    }

    @Override // j2.x
    public void m(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // j2.x
    public Map n(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // j2.x
    public int o() {
        return 1;
    }

    @Override // j2.x
    public /* synthetic */ void p(byte[] bArr, m mVar) {
    }

    @Override // k2.InterfaceC0948m
    public k2.w q(int i7, int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // B4.e
    public B4.c r(C1288l c1288l, JSONObject jSONObject) {
        B4.b bVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            bVar = new B4.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            bVar = new B4.b(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        B4.b bVar2 = bVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        B4.a aVar = new B4.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j7 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            c1288l.getClass();
            currentTimeMillis = (j7 * 1000) + System.currentTimeMillis();
        }
        return new B4.c(currentTimeMillis, bVar2, aVar, optDouble, optDouble2, optInt2);
    }

    @Override // J1.l
    public Object s(Object obj) {
        TraktProfileResponse traktProfileResponse = (TraktProfileResponse) obj;
        M5.g.f(traktProfileResponse, "dto");
        String str = "";
        String str2 = traktProfileResponse.f7741a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = traktProfileResponse.f7743c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = traktProfileResponse.f7744e;
        if (str4 != null) {
            str = str4;
        }
        return new TraktProfile(str2, str3, str, M5.g.a(traktProfileResponse.d, Boolean.TRUE));
    }

    @Override // k2.InterfaceC0948m
    public void t(InterfaceC0955t interfaceC0955t) {
        throw new UnsupportedOperationException();
    }

    @Override // C4.a
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        int i7;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i9 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i9];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i11 = i9 - intValue;
                if (i9 + i11 <= stackTraceElementArr.length) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (stackTraceElementArr[intValue + i12].equals(stackTraceElementArr[i9 + i12])) {
                        }
                    }
                    int intValue2 = i9 - num.intValue();
                    if (i8 < 10) {
                        System.arraycopy(stackTraceElementArr, i9, stackTraceElementArr2, i10, intValue2);
                        i10 += intValue2;
                        i8++;
                    }
                    i7 = (intValue2 - 1) + i9;
                    hashMap.put(stackTraceElement, Integer.valueOf(i9));
                    i9 = i7 + 1;
                }
            }
            stackTraceElementArr2[i10] = stackTraceElementArr[i9];
            i10++;
            i8 = 1;
            i7 = i9;
            hashMap.put(stackTraceElement, Integer.valueOf(i9));
            i9 = i7 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i10];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i10);
        if (i10 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override // H2.d0
    public int x(long j7) {
        return 0;
    }

    @Override // j2.x
    public InterfaceC0770b y(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // m3.d
    public F3.m z(Context context, String str, m3.c cVar) {
        F3.m mVar = new F3.m();
        mVar.f726a = cVar.e(context, str);
        int i7 = 1;
        int n = cVar.n(context, str, true);
        mVar.f727b = n;
        int i8 = mVar.f726a;
        if (i8 == 0) {
            i8 = 0;
            if (n == 0) {
                i7 = 0;
                mVar.f728c = i7;
                return mVar;
            }
        }
        if (i8 >= n) {
            i7 = -1;
        }
        mVar.f728c = i7;
        return mVar;
    }

    public f(Context context) {
        this.f2142q = 19;
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public /* synthetic */ f(boolean z7) {
        this.f2142q = 12;
    }

    @Override // j2.x
    public void a() {
    }

    @Override // R0.e
    public void shutdown() {
    }

    @Override // H2.d0
    public void w() {
    }

    @Override // k2.InterfaceC0938c
    public long b(long j7) {
        return j7;
    }

    @Override // Q0.i
    public void c(int i7) {
    }

    @Override // j2.x
    public void i(C0835d c0835d) {
    }

    @Override // j2.x
    public void u(byte[] bArr) {
    }

    @Override // Q0.i
    public void A(Q0.b bVar, Bitmap bitmap, Map map, int i7) {
    }
}
