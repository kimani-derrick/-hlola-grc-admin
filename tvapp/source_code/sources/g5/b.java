package g5;

import C.o;
import L4.f;
import M5.g;
import O3.i0;
import X.i;
import Y2.C0152v;
import Z2.AbstractC0156a;
import Z2.E;
import Z2.H;
import Z2.y;
import a3.C0208h;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.Surface;
import android.view.View;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import e2.AbstractC0606g;
import e2.C0593J;
import e2.K;
import e2.Q;
import e2.Z;
import e5.C0657b;
import g2.O;
import h6.x;
import i0.C0767a;
import i0.C0768b;
import j2.C0830B;
import j2.q;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import k.C0922x;
import k2.InterfaceC0948m;
import k2.w;
import n0.AbstractC1017h;
import n0.InterfaceC1016g;
import o.C1052e;
import t.C1218d;
import t.C1219e;
import u2.F;
import u2.z;
import u4.C1288l;
import v6.C1344i;
import w2.C1379a;
import w2.InterfaceC1389k;
import z5.InterfaceC1522d;
/* loaded from: classes.dex */
public final class b implements e, InterfaceC1522d, z, InterfaceC1389k {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10840q;

    /* renamed from: r  reason: collision with root package name */
    public Object f10841r;

    /* renamed from: s  reason: collision with root package name */
    public Object f10842s;

    /* renamed from: t  reason: collision with root package name */
    public Object f10843t;

    public b(int i7) {
        this.f10840q = i7;
        switch (i7) {
            case 2:
                this.f10841r = new ArrayList();
                this.f10842s = new ArrayList();
                this.f10843t = new ArrayList();
                return;
            case 3:
                this.f10841r = new Object();
                return;
            default:
                String uuid = UUID.randomUUID().toString();
                g.e(uuid, "randomUUID().toString()");
                C1344i c1344i = C1344i.f15389t;
                this.f10841r = C1288l.e(uuid);
                this.f10842s = x.f11218e;
                this.f10843t = new ArrayList();
                return;
        }
    }

    public static b C(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new b(context, 4, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    public static void s(C0767a c0767a, C0767a c0767a2, B0.d dVar) {
        C0768b c0768b = new C0768b(c0767a, c0767a2, dVar);
        c0767a2.a(c0768b);
        c0767a.b(c0768b);
    }

    public static j2.g t(Q q5) {
        String uri;
        boolean z7;
        C0152v c0152v = new C0152v(0);
        byte[] bArr = null;
        c0152v.f4466t = null;
        Uri uri2 = q5.f9731r;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        L0.b bVar = new L0.b(uri, q5.f9735v, c0152v);
        i0 it = q5.f9732s.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) bVar.d)) {
                ((HashMap) bVar.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = AbstractC0606g.f9959a;
        f fVar = new f(false);
        UUID uuid2 = q5.f9730q;
        A4.a aVar = C0830B.f11759t;
        uuid2.getClass();
        boolean z8 = q5.f9733t;
        boolean z9 = q5.f9734u;
        int[] B02 = android.support.v4.media.session.b.B0(q5.f9736w);
        for (int i7 : B02) {
            if (i7 != 2 && i7 != 1) {
                z7 = false;
            } else {
                z7 = true;
            }
            AbstractC0156a.f(z7);
        }
        j2.g gVar = new j2.g(uuid2, aVar, bVar, hashMap, z8, (int[]) B02.clone(), z9, fVar, 300000L);
        byte[] bArr2 = q5.f9737x;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        AbstractC0156a.k(gVar.f11796B.isEmpty());
        gVar.f11804K = 0;
        gVar.f11805L = bArr;
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
        r7 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r7.isEmpty() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r6.contains("?") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r6.endsWith("&") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
        r7 = "&".concat(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        return com.google.android.gms.internal.measurement.AbstractC0515y1.m(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
        return r6 + "?" + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r1.getValue() != null) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
        r1 = java.net.URLEncoder.encode((java.lang.String) r1.getValue(), "UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
        if (r7.hasNext() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
        r1 = (java.util.Map.Entry) r7.next();
        r0.append("&");
        r0.append((java.lang.String) r1.getKey());
        r0.append("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005b, code lost:
        if (r1.getValue() == null) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0036 -> B:6:0x0037). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u(java.lang.String r6, java.util.Map r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = ""
            java.lang.String r5 = "UTF-8"
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)
            goto L37
        L36:
            r1 = r4
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            java.lang.String r3 = "&"
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L69
            return r6
        L69:
            java.lang.String r0 = "?"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L80
            boolean r0 = r6.endsWith(r3)
            if (r0 != 0) goto L7b
            java.lang.String r7 = r3.concat(r7)
        L7b:
            java.lang.String r6 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r6, r7)
            return r6
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.b.u(java.lang.String, java.util.Map):java.lang.String");
    }

    public Typeface A(int i7, int i8, C0922x c0922x) {
        int resourceId = ((TypedArray) this.f10842s).getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f10843t) == null) {
            this.f10843t = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f10843t;
        ThreadLocal threadLocal = o.f343a;
        Context context = (Context) this.f10841r;
        if (context.isRestricted()) {
            return null;
        }
        return o.b(context, resourceId, typedValue, i8, c0922x, true, false);
    }

    public boolean B(O o7, C1218d c1218d, boolean z7) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int[] iArr = c1218d.f14475c0;
        int i7 = iArr[0];
        u.b bVar = (u.b) this.f10842s;
        bVar.f14602a = i7;
        boolean z12 = true;
        bVar.f14603b = iArr[1];
        bVar.f14604c = c1218d.j();
        bVar.d = c1218d.g();
        bVar.f14608i = false;
        bVar.f14609j = z7;
        if (bVar.f14602a == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (bVar.f14603b == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z8 && c1218d.f14456L > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && c1218d.f14456L > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        int[] iArr2 = c1218d.f14482l;
        if (z10 && iArr2[0] == 4) {
            bVar.f14602a = 1;
        }
        if (z11 && iArr2[1] == 4) {
            bVar.f14603b = 1;
        }
        o7.a(c1218d, bVar);
        c1218d.v(bVar.f14605e);
        c1218d.s(bVar.f);
        c1218d.f14492w = bVar.f14607h;
        int i8 = bVar.f14606g;
        c1218d.f14460P = i8;
        if (i8 <= 0) {
            z12 = false;
        }
        c1218d.f14492w = z12;
        bVar.f14609j = false;
        return bVar.f14608i;
    }

    public void D() {
        ((TypedArray) this.f10842s).recycle();
    }

    public void E() {
        boolean z7;
        do {
            ArrayList arrayList = (ArrayList) this.f10843t;
            z7 = false;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0767a c0767a = (C0767a) arrayList.get(size);
                if (c0767a.d != 1) {
                    ArrayList arrayList2 = c0767a.f;
                    if (arrayList2 != null) {
                        boolean z8 = c0767a.f11313c;
                        Iterator it = arrayList2.iterator();
                        if (z8) {
                            while (it.hasNext()) {
                                if (((C0768b) it.next()).f11319e != 1) {
                                    break;
                                }
                            }
                        } else {
                            while (it.hasNext()) {
                                if (((C0768b) it.next()).f11319e == 1) {
                                }
                            }
                        }
                    }
                    c0767a.d = 1;
                    c0767a.c();
                    ArrayList arrayList3 = c0767a.f11315g;
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C0768b c0768b = (C0768b) it2.next();
                            if (c0768b.f11318c == null && c0768b.d == null) {
                                c0767a.f11314e++;
                                c0768b.f11319e = 1;
                                if (!c0767a.f11312b) {
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.remove(size);
                    ((ArrayList) this.f10842s).add(c0767a);
                    z7 = true;
                }
            }
        } while (z7);
    }

    public void F(C1219e c1219e, int i7, int i8) {
        int i9 = c1219e.f14461Q;
        int i10 = c1219e.f14462R;
        c1219e.f14461Q = 0;
        c1219e.f14462R = 0;
        c1219e.v(i7);
        c1219e.s(i8);
        if (i9 < 0) {
            c1219e.f14461Q = 0;
        } else {
            c1219e.f14461Q = i9;
        }
        if (i10 < 0) {
            c1219e.f14462R = 0;
        } else {
            c1219e.f14462R = i10;
        }
        ((C1219e) this.f10843t).B();
    }

    @Override // w2.InterfaceC1389k
    public void a() {
        this.f10842s = null;
        this.f10843t = null;
        ((MediaCodec) this.f10841r).release();
    }

    @Override // u2.z
    public void b(E e3, InterfaceC0948m interfaceC0948m, F f) {
        this.f10842s = e3;
        f.a();
        f.b();
        w q5 = interfaceC0948m.q(f.d, 5);
        this.f10843t = q5;
        q5.e((K) this.f10841r);
    }

    @Override // u2.z
    public void c(y yVar) {
        long c5;
        long j7;
        AbstractC0156a.l((E) this.f10842s);
        int i7 = H.f4603a;
        E e3 = (E) this.f10842s;
        synchronized (e3) {
            try {
                long j8 = e3.f4600c;
                if (j8 != -9223372036854775807L) {
                    c5 = j8 + e3.f4599b;
                } else {
                    c5 = e3.c();
                }
                j7 = c5;
            } catch (Throwable th) {
                throw th;
            }
        }
        long d = ((E) this.f10842s).d();
        if (j7 != -9223372036854775807L && d != -9223372036854775807L) {
            K k5 = (K) this.f10841r;
            if (d != k5.F) {
                C0593J a7 = k5.a();
                a7.f9608o = d;
                K k7 = new K(a7);
                this.f10841r = k7;
                ((w) this.f10843t).e(k7);
            }
            int a8 = yVar.a();
            ((w) this.f10843t).d(a8, yVar);
            ((w) this.f10843t).c(j7, 1, a8, 0, null);
        }
    }

    @Override // w2.InterfaceC1389k
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f10841r;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && H.f4603a < 21) {
                this.f10843t = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // g5.e
    public View e(DpadRecyclerView dpadRecyclerView, View view, int i7, int i8) {
        g.f(view, "focusedView");
        boolean c5 = ((C0657b) this.f10842s).c();
        boolean r3 = ((h5.d) this.f10841r).r();
        c.f10844q.getClass();
        return ((FocusFinder) this.f10843t).findNextFocus(dpadRecyclerView, view, f.I(i8, c5, r3));
    }

    @Override // w2.InterfaceC1389k
    public void f(long j7, int i7) {
        ((MediaCodec) this.f10841r).releaseOutputBuffer(i7, j7);
    }

    @Override // w2.InterfaceC1389k
    public void flush() {
        ((MediaCodec) this.f10841r).flush();
    }

    @Override // w2.InterfaceC1389k
    public ByteBuffer g(int i7) {
        if (H.f4603a >= 21) {
            return ((MediaCodec) this.f10841r).getInputBuffer(i7);
        }
        return ((ByteBuffer[]) this.f10842s)[i7];
    }

    @Override // z5.InterfaceC1522d
    public Object getValue() {
        InterfaceC1016g interfaceC1016g = (InterfaceC1016g) this.f10843t;
        if (interfaceC1016g == null) {
            Bundle bundle = (Bundle) ((L5.a) this.f10842s).b();
            C1052e c1052e = AbstractC1017h.f12536b;
            S5.b bVar = (S5.b) this.f10841r;
            Method method = (Method) c1052e.get(bVar);
            if (method == null) {
                g.f(bVar, "<this>");
                Class a7 = ((M5.c) bVar).a();
                g.d(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                method = a7.getMethod("fromBundle", (Class[]) Arrays.copyOf(AbstractC1017h.f12535a, 1));
                c1052e.put(bVar, method);
                g.e(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = method.invoke(null, bundle);
            if (invoke != null) {
                InterfaceC1016g interfaceC1016g2 = (InterfaceC1016g) invoke;
                this.f10843t = interfaceC1016g2;
                return interfaceC1016g2;
            }
            throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        }
        return interfaceC1016g;
    }

    @Override // w2.InterfaceC1389k
    public void h(Surface surface) {
        ((MediaCodec) this.f10841r).setOutputSurface(surface);
    }

    @Override // w2.InterfaceC1389k
    public void i(Bundle bundle) {
        ((MediaCodec) this.f10841r).setParameters(bundle);
    }

    @Override // w2.InterfaceC1389k
    public void j(int i7, boolean z7) {
        ((MediaCodec) this.f10841r).releaseOutputBuffer(i7, z7);
    }

    @Override // w2.InterfaceC1389k
    public ByteBuffer k(int i7) {
        if (H.f4603a >= 21) {
            return ((MediaCodec) this.f10841r).getOutputBuffer(i7);
        }
        return ((ByteBuffer[]) this.f10843t)[i7];
    }

    @Override // w2.InterfaceC1389k
    public void l(C0208h c0208h, Handler handler) {
        ((MediaCodec) this.f10841r).setOnFrameRenderedListener(new C1379a(this, c0208h, 1), handler);
    }

    @Override // w2.InterfaceC1389k
    public int m() {
        return ((MediaCodec) this.f10841r).dequeueInputBuffer(0L);
    }

    @Override // w2.InterfaceC1389k
    public void n(int i7) {
        ((MediaCodec) this.f10841r).setVideoScalingMode(i7);
    }

    @Override // w2.InterfaceC1389k
    public MediaFormat o() {
        return ((MediaCodec) this.f10841r).getOutputFormat();
    }

    @Override // w2.InterfaceC1389k
    public void p(int i7, int i8, long j7, int i9) {
        ((MediaCodec) this.f10841r).queueInputBuffer(i7, 0, i8, j7, i9);
    }

    @Override // w2.InterfaceC1389k
    public void q(int i7, i2.c cVar, long j7) {
        ((MediaCodec) this.f10841r).queueSecureInputBuffer(i7, 0, cVar.f11338i, j7, 0);
    }

    public void r(C0767a c0767a) {
        ArrayList arrayList = (ArrayList) this.f10841r;
        if (!arrayList.contains(c0767a)) {
            arrayList.add(c0767a);
        }
    }

    public String toString() {
        switch (this.f10840q) {
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f10841r;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f10842s;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f10843t;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                g.e(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H.j v() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            r2 = 0
            java.lang.Object r3 = r8.f10841r     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r4 = r8.f10842s     // Catch: java.lang.Throwable -> Lb6
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r3 = u(r3, r4)     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb1
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L28
            if (r4 == 0) goto L2b
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r0 = move-exception
            goto Lb4
        L2b:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb1
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb1
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb1
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6b
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r8.f10843t     // Catch: java.lang.Throwable -> L6b
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6b
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6b
        L4f:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6b
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6b
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6b
            goto L4f
        L6b:
            r1 = move-exception
            goto Lb8
        L6d:
            r0.connect()     // Catch: java.lang.Throwable -> L6b
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6b
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto La3
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La0
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La0
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La0
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r5.<init>()     // Catch: java.lang.Throwable -> La0
        L8f:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La0
            r7 = -1
            if (r6 == r7) goto L9b
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La0
            goto L8f
        L9b:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La0
            goto La3
        La0:
            r1 = move-exception
            r2 = r3
            goto Lb8
        La3:
            if (r3 == 0) goto La8
            r3.close()
        La8:
            r0.disconnect()
            H.j r0 = new H.j
            r0.<init>(r1, r2)
            return r0
        Lb1:
            r1 = move-exception
        Lb2:
            r0 = r2
            goto Lb8
        Lb4:
            r1 = r0
            goto Lb2
        Lb6:
            r0 = move-exception
            goto Lb4
        Lb8:
            if (r2 == 0) goto Lbd
            r2.close()
        Lbd:
            if (r0 == 0) goto Lc2
            r0.disconnect()
        Lc2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.b.v():H.j");
    }

    public void w(B0.d dVar) {
        boolean z7;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f10842s;
            if (i7 < arrayList.size()) {
                C0767a c0767a = (C0767a) arrayList.get(i7);
                ArrayList arrayList2 = c0767a.f11315g;
                if (arrayList2 != null && ((z7 = c0767a.f11312b) || c0767a.f11314e <= 0)) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C0768b c0768b = (C0768b) it.next();
                        if (c0768b.f11319e != 1 && c0768b.f11318c == dVar) {
                            c0768b.f11319e = 1;
                            c0767a.f11314e++;
                            if (!z7) {
                                break;
                            }
                        }
                    }
                }
                i7++;
            } else {
                E();
                return;
            }
        }
    }

    public q x(Z z7) {
        j2.g gVar;
        z7.f9805r.getClass();
        Q q5 = z7.f9805r.f9763s;
        if (q5 != null && H.f4603a >= 18) {
            synchronized (this.f10841r) {
                try {
                    if (!H.a(q5, (Q) this.f10842s)) {
                        this.f10842s = q5;
                        this.f10843t = t(q5);
                    }
                    gVar = (j2.g) this.f10843t;
                    gVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar;
        }
        return q.f11836o;
    }

    public ColorStateList y(int i7) {
        int resourceId;
        ColorStateList h02;
        TypedArray typedArray = (TypedArray) this.f10842s;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (h02 = android.support.v4.media.session.b.h0((Context) this.f10841r, resourceId)) != null) {
            return h02;
        }
        return typedArray.getColorStateList(i7);
    }

    public Drawable z(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f10842s;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0) {
            return android.support.v4.media.session.b.i0((Context) this.f10841r, resourceId);
        }
        return typedArray.getDrawable(i7);
    }

    public b(int i7, String str, ArrayList arrayList, byte[] bArr) {
        this.f10840q = 10;
        this.f10841r = str;
        this.f10842s = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.f10843t = bArr;
    }

    public b(Intent intent) {
        this.f10840q = 6;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f10841r = data;
        this.f10842s = action;
        this.f10843t = type;
    }

    public b(MediaCodec mediaCodec) {
        this.f10840q = 11;
        this.f10841r = mediaCodec;
        if (H.f4603a < 21) {
            this.f10842s = mediaCodec.getInputBuffers();
            this.f10843t = mediaCodec.getOutputBuffers();
        }
    }

    public b(h5.d dVar, C0657b c0657b) {
        this.f10840q = 0;
        FocusFinder focusFinder = FocusFinder.getInstance();
        g.e(focusFinder, "getInstance(...)");
        this.f10841r = dVar;
        this.f10842s = c0657b;
        this.f10843t = focusFinder;
    }

    public /* synthetic */ b(Object obj, int i7, Object obj2) {
        this.f10840q = i7;
        this.f10841r = obj;
        this.f10842s = obj2;
    }

    public b(String str) {
        this.f10840q = 9;
        C0593J c0593j = new C0593J();
        c0593j.f9605k = str;
        this.f10841r = new K(c0593j);
    }

    public b(String str, String str2, byte[] bArr) {
        this.f10840q = 7;
        this.f10841r = bArr;
        this.f10842s = str;
        this.f10843t = str2;
    }

    public b(String str, HashMap hashMap) {
        this.f10840q = 12;
        this.f10841r = str;
        this.f10842s = hashMap;
        this.f10843t = new HashMap();
    }

    public b(C1219e c1219e) {
        this.f10840q = 8;
        this.f10841r = new ArrayList();
        this.f10842s = new Object();
        this.f10843t = c1219e;
    }
}
