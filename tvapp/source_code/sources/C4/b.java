package C4;

import C.d;
import H2.A;
import H2.AbstractC0010k;
import H2.C0016q;
import H2.C0020v;
import H2.H;
import H2.n0;
import V.l;
import W5.AbstractC0117y;
import W5.C0114v;
import W5.InterfaceC0093a0;
import W5.InterfaceC0116x;
import W5.j0;
import X.i;
import Y5.g;
import Y5.h;
import Z3.c;
import Z3.k;
import Z3.t;
import Z3.u;
import Z3.v;
import Z4.T;
import a4.C0212d;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.protobuf.w0;
import androidx.emoji2.text.m;
import androidx.emoji2.text.q;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.D;
import androidx.fragment.app.V;
import androidx.fragment.app.Z;
import androidx.leanback.widget.R0;
import c4.C0392a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.C0419f;
import com.google.android.gms.internal.measurement.C0429h;
import com.google.android.gms.internal.measurement.C0434i;
import com.google.android.gms.internal.measurement.C0469p;
import com.google.android.gms.internal.measurement.C0488t;
import com.google.android.gms.internal.measurement.C0520z1;
import com.google.android.gms.internal.measurement.C1;
import com.google.android.gms.internal.measurement.G;
import com.google.android.gms.internal.measurement.InterfaceC0464o;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.v4;
import e5.C0657b;
import f5.C0700a;
import j2.n;
import j2.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k.C0852F;
import l5.C0982f;
import l6.f;
import o.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.AbstractC1203v;
import s3.C1175g0;
import s4.InterfaceC1213a;
import t3.C1251o;
import u4.C1288l;
import w0.k0;
import w4.C1406a0;
import w4.U;
import w4.X;
import w4.y0;
/* loaded from: classes.dex */
public final class b implements H, o, s4.b, InterfaceC1213a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f420q;

    /* renamed from: r  reason: collision with root package name */
    public Object f421r;

    /* renamed from: s  reason: collision with root package name */
    public Object f422s;

    /* renamed from: t  reason: collision with root package name */
    public Object f423t;

    /* renamed from: u  reason: collision with root package name */
    public Object f424u;

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, com.google.android.gms.internal.measurement.y2] */
    public b(int i7) {
        this.f420q = i7;
        switch (i7) {
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f421r = new HashMap();
                this.f422s = new HashMap();
                this.f423t = new HashMap();
                this.f424u = new HashMap();
                return;
            case 12:
                this.f421r = new ArrayList();
                this.f422s = new HashMap();
                this.f423t = new HashMap();
                return;
            case 13:
                R0 r02 = new R0();
                this.f421r = r02;
                R0 r03 = new R0();
                this.f422s = r03;
                this.f423t = r03;
                this.f424u = r02;
                return;
            case 14:
                D d = new D(5, false);
                d.f5883r = new HashMap();
                d.f5884s = new C0488t(6);
                C0488t c0488t = new C0488t(0);
                ArrayList arrayList = c0488t.f8674a;
                arrayList.add(G.f8322v);
                arrayList.add(G.f8324w);
                arrayList.add(G.f8326x);
                arrayList.add(G.f8328y);
                arrayList.add(G.f8329z);
                arrayList.add(G.f8270A);
                arrayList.add(G.f8272B);
                d.V(c0488t);
                C0488t c0488t2 = new C0488t(1);
                ArrayList arrayList2 = c0488t2.f8674a;
                arrayList2.add(G.f8284M);
                arrayList2.add(G.f8296Z);
                arrayList2.add(G.f8297a0);
                arrayList2.add(G.f8298b0);
                arrayList2.add(G.f8299c0);
                arrayList2.add(G.f8301e0);
                arrayList2.add(G.f8302f0);
                arrayList2.add(G.f8307k0);
                d.V(c0488t2);
                C0488t c0488t3 = new C0488t(2);
                ArrayList arrayList3 = c0488t3.f8674a;
                arrayList3.add(G.f8318t);
                arrayList3.add(G.f8274C);
                arrayList3.add(G.f8276D);
                arrayList3.add(G.f8277E);
                arrayList3.add(G.f8281J);
                arrayList3.add(G.f8278G);
                arrayList3.add(G.f8282K);
                arrayList3.add(G.f8286O);
                arrayList3.add(G.f8300d0);
                arrayList3.add(G.f8312p0);
                arrayList3.add(G.f8317s0);
                arrayList3.add(G.f8323v0);
                arrayList3.add(G.f8325w0);
                d.V(c0488t3);
                C0488t c0488t4 = new C0488t(3);
                ArrayList arrayList4 = c0488t4.f8674a;
                arrayList4.add(G.f8316s);
                arrayList4.add(G.f8306j0);
                arrayList4.add(G.f8309m0);
                d.V(c0488t4);
                C0488t c0488t5 = new C0488t(4);
                ArrayList arrayList5 = c0488t5.f8674a;
                arrayList5.add(G.f8287P);
                arrayList5.add(G.f8288Q);
                arrayList5.add(G.f8289R);
                arrayList5.add(G.f8290S);
                arrayList5.add(G.f8291T);
                arrayList5.add(G.f8292U);
                arrayList5.add(G.f8293V);
                arrayList5.add(G.f8271A0);
                d.V(c0488t5);
                C0488t c0488t6 = new C0488t(5);
                ArrayList arrayList6 = c0488t6.f8674a;
                arrayList6.add(G.f8314r);
                arrayList6.add(G.f8283L);
                arrayList6.add(G.f8303g0);
                arrayList6.add(G.f8304h0);
                arrayList6.add(G.f8305i0);
                arrayList6.add(G.f8310n0);
                arrayList6.add(G.f8311o0);
                arrayList6.add(G.f8313q0);
                arrayList6.add(G.f8315r0);
                arrayList6.add(G.f8321u0);
                d.V(c0488t6);
                C0488t c0488t7 = new C0488t(7);
                ArrayList arrayList7 = c0488t7.f8674a;
                arrayList7.add(G.f8320u);
                arrayList7.add(G.F);
                arrayList7.add(G.f8279H);
                arrayList7.add(G.f8280I);
                arrayList7.add(G.f8285N);
                arrayList7.add(G.W);
                arrayList7.add(G.f8294X);
                arrayList7.add(G.f8295Y);
                arrayList7.add(G.f8308l0);
                arrayList7.add(G.f8319t0);
                arrayList7.add(G.f8327x0);
                arrayList7.add(G.y0);
                arrayList7.add(G.f8330z0);
                d.V(c0488t7);
                this.f421r = d;
                b bVar = new b((b) null, d);
                this.f423t = bVar;
                this.f422s = bVar.Z();
                ?? obj = new Object();
                obj.f8717a = new HashMap();
                this.f424u = obj;
                bVar.i0("require", new v4(obj));
                ((HashMap) obj.f8717a).put("internal.platform", new Object());
                bVar.i0("runtime.counter", new C0429h(Double.valueOf(0.0d)));
                return;
            case 16:
                this.f422s = new ArrayDeque();
                this.f423t = new ArrayDeque();
                this.f424u = new ArrayDeque();
                return;
            case 26:
                this.f421r = new J.b(10);
                this.f422s = new j();
                this.f423t = new ArrayList();
                this.f424u = new HashSet();
                return;
            default:
                this.f422s = null;
                this.f423t = new ArrayList();
                this.f424u = null;
                this.f421r = "";
                return;
        }
    }

    public static final Message b(b bVar, List list, int i7) {
        Object obj;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i7) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    public List A() {
        ArrayList arrayList;
        if (((ArrayList) this.f421r).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f421r)) {
            arrayList = new ArrayList((ArrayList) this.f421r);
        }
        return arrayList;
    }

    public synchronized void B() {
    }

    @Override // H2.H
    public void C(int i7, A a7, C0016q c0016q, C0020v c0020v) {
        if (L(i7, a7)) {
            ((d) this.f422s).t(c0016q, M(c0020v));
        }
    }

    public synchronized void D() {
    }

    public synchronized void E() {
    }

    @Override // j2.o
    public void F(int i7, A a7, int i8) {
        if (L(i7, a7)) {
            ((n) this.f423t).d(i8);
        }
    }

    public boolean G() {
        C0657b c0657b = (C0657b) this.f421r;
        if (!c0657b.f10158o || c0657b.f10160q == Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    @Override // j2.o
    public void H(int i7, A a7) {
        if (L(i7, a7)) {
            ((n) this.f423t).c();
        }
    }

    public void I(Z z7) {
        ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
        String str = componentCallbacksC0269x.f6138u;
        HashMap hashMap = (HashMap) this.f422s;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(componentCallbacksC0269x.f6138u, z7);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC0269x);
        }
    }

    @Override // j2.o
    public void J(int i7, A a7) {
        if (L(i7, a7)) {
            ((n) this.f423t).a();
        }
    }

    public void K(Z z7) {
        ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
        if (componentCallbacksC0269x.f6115S) {
            ((V) this.f424u).g(componentCallbacksC0269x);
        }
        HashMap hashMap = (HashMap) this.f422s;
        if (hashMap.get(componentCallbacksC0269x.f6138u) == z7 && ((Z) hashMap.put(componentCallbacksC0269x.f6138u, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC0269x);
        }
    }

    public boolean L(int i7, A a7) {
        A a8;
        Object obj = this.f421r;
        AbstractC0010k abstractC0010k = (AbstractC0010k) this.f424u;
        if (a7 != null) {
            a8 = abstractC0010k.r(obj, a7);
            if (a8 == null) {
                return false;
            }
        } else {
            a8 = null;
        }
        int t5 = abstractC0010k.t(i7, obj);
        d dVar = (d) this.f422s;
        if (dVar.f324r != t5 || !Z2.H.a((A) dVar.f325s, a8)) {
            this.f422s = new d((CopyOnWriteArrayList) abstractC0010k.f1011c.f326t, t5, a8);
        }
        n nVar = (n) this.f423t;
        if (nVar.f11833a != t5 || !Z2.H.a(nVar.f11834b, a8)) {
            this.f423t = new n(abstractC0010k.d.f11835c, t5, a8);
            return true;
        }
        return true;
    }

    public C0020v M(C0020v c0020v) {
        long j7 = c0020v.f;
        AbstractC0010k abstractC0010k = (AbstractC0010k) this.f424u;
        Object obj = this.f421r;
        long s6 = abstractC0010k.s(j7, obj);
        long j8 = c0020v.f1179g;
        long s7 = abstractC0010k.s(j8, obj);
        if (s6 == c0020v.f && s7 == j8) {
            return c0020v;
        }
        return new C0020v(c0020v.f1175a, c0020v.f1176b, c0020v.f1177c, c0020v.d, c0020v.f1178e, s6, s7);
    }

    public void N(V.o oVar) {
        g gVar;
        Object e3 = ((Y5.b) this.f423t).e(oVar);
        Throwable th = null;
        if (e3 instanceof g) {
            if (e3 instanceof g) {
                gVar = (g) e3;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                th = gVar.f4533a;
            }
            if (th == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
        } else if (!(e3 instanceof h)) {
            if (((AtomicInteger) this.f424u).getAndIncrement() == 0) {
                AbstractC0117y.p((InterfaceC0116x) this.f421r, null, 0, new l(this, null), 3);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public void O() {
        byte[] bArr = i6.b.f11390a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f422s).iterator();
                M5.g.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    int size = ((ArrayDeque) this.f423t).size();
                    D();
                    if (size >= 64) {
                        break;
                    }
                    int i7 = fVar.f12322r.get();
                    E();
                    if (i7 < 5) {
                        it.remove();
                        fVar.f12322r.incrementAndGet();
                        arrayList.add(fVar);
                        ((ArrayDeque) this.f423t).add(fVar);
                    }
                }
                U();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            int i9 = i8 + 1;
            f fVar2 = (f) arrayList.get(i8);
            ExecutorService o7 = o();
            fVar2.getClass();
            l6.i iVar = fVar2.f12323s;
            b bVar = iVar.f12333q.f11264q;
            byte[] bArr2 = i6.b.f11390a;
            try {
                try {
                    ((ThreadPoolExecutor) o7).execute(fVar2);
                } catch (RejectedExecutionException e3) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e3);
                    iVar.l(interruptedIOException);
                    fVar2.f12321q.i(iVar, interruptedIOException);
                    iVar.f12333q.f11264q.x(fVar2);
                }
                i8 = i9;
            } catch (Throwable th2) {
                iVar.f12333q.f11264q.x(fVar2);
                throw th2;
            }
        }
    }

    public void P(Message message) {
        LinkedBlockingDeque linkedBlockingDeque;
        String str;
        if (((LinkedBlockingDeque) this.f423t).offer(message)) {
            str = "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size();
        } else {
            str = "Failed to enqueue message " + message.what + ". Dropping.";
        }
        Log.d("SessionLifecycleClient", str);
    }

    public void Q(Z3.a aVar) {
        t tVar = new t(aVar.f4698b, aVar.f4697a);
        HashMap hashMap = (HashMap) this.f422s;
        if (hashMap.containsKey(tVar)) {
            Z3.a aVar2 = (Z3.a) hashMap.get(tVar);
            if (!aVar2.equals(aVar) || !aVar.equals(aVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + tVar);
            }
            return;
        }
        hashMap.put(tVar, aVar);
    }

    public void R(c cVar) {
        u uVar = new u(cVar.f4700a, cVar.f4701b);
        HashMap hashMap = (HashMap) this.f421r;
        if (hashMap.containsKey(uVar)) {
            c cVar2 = (c) hashMap.get(uVar);
            if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + uVar);
            }
            return;
        }
        hashMap.put(uVar, cVar);
    }

    public void S(k kVar) {
        t tVar = new t(kVar.f4715b, kVar.f4714a);
        HashMap hashMap = (HashMap) this.f424u;
        if (hashMap.containsKey(tVar)) {
            k kVar2 = (k) hashMap.get(tVar);
            if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + tVar);
            }
            return;
        }
        hashMap.put(tVar, kVar);
    }

    public void T(Z3.l lVar) {
        u uVar = new u(lVar.f4716a, lVar.f4717b);
        HashMap hashMap = (HashMap) this.f423t;
        if (hashMap.containsKey(uVar)) {
            Z3.l lVar2 = (Z3.l) hashMap.get(uVar);
            if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + uVar);
            }
            return;
        }
        hashMap.put(uVar, lVar);
    }

    public synchronized int U() {
        return ((ArrayDeque) this.f423t).size() + ((ArrayDeque) this.f424u).size();
    }

    public void V(int i7) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f423t).drainTo(arrayList);
        Message obtain = Message.obtain(null, i7, 0, 0);
        M5.g.e(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        AbstractC0117y.p(AbstractC0117y.a((D5.i) this.f421r), null, 0, new T(this, arrayList, null), 3);
    }

    public Bundle W(String str, Bundle bundle) {
        Object remove;
        HashMap hashMap = (HashMap) this.f423t;
        if (bundle != null) {
            remove = hashMap.put(str, bundle);
        } else {
            remove = hashMap.remove(str);
        }
        return (Bundle) remove;
    }

    public C1251o X(Callable callable) {
        C1251o d;
        synchronized (this.f423t) {
            d = ((C1251o) this.f422s).d((Executor) this.f421r, new C0852F(22, callable));
            this.f422s = d.d((Executor) this.f421r, new C1288l(0));
        }
        return d;
    }

    public C1251o Y(Callable callable) {
        C1251o e3;
        synchronized (this.f423t) {
            e3 = ((C1251o) this.f422s).e((Executor) this.f421r, new C0852F(22, callable));
            this.f422s = e3.d((Executor) this.f421r, new C1288l(0));
        }
        return e3;
    }

    public b Z() {
        return new b(this, (D) this.f422s);
    }

    @Override // H2.H
    public void a(int i7, A a7, C0016q c0016q, C0020v c0020v) {
        if (L(i7, a7)) {
            ((d) this.f422s).o(c0016q, M(c0020v));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118 A[Catch: NumberFormatException | JSONException -> 0x0120, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0120, blocks: (B:9:0x002b, B:43:0x009b, B:44:0x00a8, B:46:0x00b5, B:48:0x00c7, B:49:0x00d0, B:50:0x00d4, B:52:0x00e1, B:54:0x00f3, B:55:0x00fc, B:56:0x0100, B:57:0x010c, B:58:0x0118, B:20:0x0058, B:23:0x0062, B:26:0x006c, B:29:0x0076, B:32:0x0080), top: B:72:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle a0() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C4.b.a0():android.os.Bundle");
    }

    public InterfaceC0464o b0(b bVar, C0520z1... c0520z1Arr) {
        InterfaceC0464o interfaceC0464o = InterfaceC0464o.f8621e;
        for (C0520z1 c0520z1 : c0520z1Arr) {
            interfaceC0464o = C1.f(c0520z1);
            Q.g((b) this.f423t);
            if ((interfaceC0464o instanceof r) || (interfaceC0464o instanceof C0469p)) {
                interfaceC0464o = ((D) this.f421r).S(bVar, interfaceC0464o);
            }
        }
        return interfaceC0464o;
    }

    public void c(ComponentCallbacksC0269x componentCallbacksC0269x) {
        if (!((ArrayList) this.f421r).contains(componentCallbacksC0269x)) {
            synchronized (((ArrayList) this.f421r)) {
                ((ArrayList) this.f421r).add(componentCallbacksC0269x);
            }
            componentCallbacksC0269x.f6098A = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + componentCallbacksC0269x);
    }

    public InterfaceC0464o c0(C0419f c0419f) {
        InterfaceC0464o interfaceC0464o = InterfaceC0464o.f8621e;
        Iterator z7 = c0419f.z();
        while (z7.hasNext()) {
            interfaceC0464o = ((D) this.f422s).S(this, c0419f.s(((Integer) z7.next()).intValue()));
            if (interfaceC0464o instanceof C0434i) {
                break;
            }
        }
        return interfaceC0464o;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r14, java.lang.Object r15, e4.f0 r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C4.b.d(java.lang.Object, java.lang.Object, e4.f0, boolean):void");
    }

    public InterfaceC0464o d0(InterfaceC0464o interfaceC0464o) {
        return ((D) this.f422s).S(this, interfaceC0464o);
    }

    @Override // j2.o
    public void e(int i7, A a7) {
        if (L(i7, a7)) {
            ((n) this.f423t).b();
        }
    }

    public InterfaceC0464o e0(String str) {
        b bVar = this;
        while (!((HashMap) bVar.f423t).containsKey(str)) {
            bVar = (b) bVar.f421r;
            if (bVar == null) {
                throw new IllegalArgumentException(AbstractC0515y1.m(str, " is not defined"));
            }
        }
        return (InterfaceC0464o) ((HashMap) bVar.f423t).get(str);
    }

    @Override // j2.o
    public void f(int i7, A a7) {
        if (L(i7, a7)) {
            ((n) this.f423t).f();
        }
    }

    public void f0(Bundle bundle) {
        l6.b bVar;
        Class<?> cls;
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        s3.T t5 = (s3.T) this.f424u;
        SharedPreferences.Editor edit = t5.N().edit();
        int size = bundle.size();
        String str2 = (String) this.f421r;
        if (size == 0) {
            edit.remove(str2);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        Y3.a();
                        if (((C1175g0) t5.f2765q).f14062w.O(null, AbstractC1203v.f14265C0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", String.valueOf(obj));
                                jSONObject.put("t", "l");
                            } else {
                                if (obj instanceof int[]) {
                                    jSONObject.put("v", Arrays.toString((int[]) obj));
                                    str = "ia";
                                } else if (obj instanceof long[]) {
                                    jSONObject.put("v", Arrays.toString((long[]) obj));
                                    str = "la";
                                } else if (obj instanceof Double) {
                                    jSONObject.put("v", String.valueOf(obj));
                                    jSONObject.put("t", "d");
                                } else {
                                    bVar = t5.b().f13807v;
                                    cls = obj.getClass();
                                    bVar.c(cls, "Cannot serialize bundle value to SharedPreferences. Type");
                                }
                                jSONObject.put("t", str);
                            }
                        } else {
                            jSONObject.put("v", String.valueOf(obj));
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                bVar = t5.b().f13807v;
                                cls = obj.getClass();
                                bVar.c(cls, "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e3) {
                        t5.b().f13807v.c(e3, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f423t = bundle;
    }

    public a4.l g() {
        Integer num = (Integer) this.f421r;
        if (num != null) {
            if (((Integer) this.f422s) != null) {
                if (((C0212d) this.f423t) != null) {
                    if (((C0212d) this.f424u) != null) {
                        if (num.intValue() >= 16) {
                            Integer num2 = (Integer) this.f422s;
                            int intValue = num2.intValue();
                            C0212d c0212d = (C0212d) this.f423t;
                            if (intValue >= 10) {
                                if (c0212d == C0212d.f5147g) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                    }
                                } else if (c0212d == C0212d.f5148h) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                    }
                                } else if (c0212d == C0212d.f5149i) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                    }
                                } else if (c0212d == C0212d.f5150j) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                    }
                                } else if (c0212d == C0212d.f5151k) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new a4.l(((Integer) this.f421r).intValue(), ((Integer) this.f422s).intValue(), (C0212d) this.f424u, (C0212d) this.f423t);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f421r));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public void g0(String str, InterfaceC0464o interfaceC0464o) {
        if (!((HashMap) this.f424u).containsKey(str)) {
            HashMap hashMap = (HashMap) this.f423t;
            if (interfaceC0464o == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, interfaceC0464o);
            }
        }
    }

    public U h() {
        String str;
        if (((String) this.f421r) == null) {
            str = " processName";
        } else {
            str = "";
        }
        if (((Integer) this.f422s) == null) {
            str = str.concat(" pid");
        }
        if (((Integer) this.f423t) == null) {
            str = AbstractC0515y1.m(str, " importance");
        }
        if (((Boolean) this.f424u) == null) {
            str = AbstractC0515y1.m(str, " defaultProcess");
        }
        if (str.isEmpty()) {
            return new U(((Integer) this.f422s).intValue(), ((Integer) this.f423t).intValue(), (String) this.f421r, ((Boolean) this.f424u).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean h0(String str) {
        b bVar = this;
        while (!((HashMap) bVar.f423t).containsKey(str)) {
            bVar = (b) bVar.f421r;
            if (bVar == null) {
                return false;
            }
        }
        return true;
    }

    public X i() {
        String str;
        if (((y0) this.f423t) == null) {
            str = " rolloutVariant";
        } else {
            str = "";
        }
        if (((String) this.f421r) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.f422s) == null) {
            str = AbstractC0515y1.m(str, " parameterValue");
        }
        if (((Long) this.f424u) == null) {
            str = AbstractC0515y1.m(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new X((y0) this.f423t, (String) this.f421r, (String) this.f422s, ((Long) this.f424u).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void i0(String str, InterfaceC0464o interfaceC0464o) {
        b bVar;
        b bVar2 = this;
        while (!((HashMap) bVar2.f423t).containsKey(str) && (bVar = (b) bVar2.f421r) != null && bVar.h0(str)) {
            bVar2 = bVar;
        }
        if (!((HashMap) bVar2.f424u).containsKey(str)) {
            HashMap hashMap = (HashMap) bVar2.f423t;
            if (interfaceC0464o == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, interfaceC0464o);
            }
        }
    }

    public C1406a0 j() {
        String str;
        if (((Integer) this.f423t) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f421r) == null) {
            str = str.concat(" version");
        }
        if (((String) this.f422s) == null) {
            str = AbstractC0515y1.m(str, " buildVersion");
        }
        if (((Boolean) this.f424u) == null) {
            str = AbstractC0515y1.m(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new C1406a0(((Integer) this.f423t).intValue(), (String) this.f421r, (String) this.f422s, ((Boolean) this.f424u).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // H2.H
    public void k(int i7, A a7, C0020v c0020v) {
        if (L(i7, a7)) {
            ((d) this.f422s).f(M(c0020v));
        }
    }

    public void l(int i7) {
        k0 g7;
        LinkedList linkedList = (LinkedList) this.f424u;
        C0982f c0982f = (C0982f) linkedList.peekLast();
        if (c0982f != null) {
            if (c0982f.f12292c != p6.d.o(i7)) {
                linkedList.removeLast();
            }
        }
        Iterator it = linkedList.iterator();
        M5.g.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            M5.g.e(next, "next(...)");
            C0982f c0982f2 = (C0982f) next;
            View view = c0982f2.f12290a;
            int c5 = ((C0700a) this.f422s).c(view, c0982f2.f12291b);
            if (c5 != 0 && p6.d.o(c5) == c0982f2.f12292c && (g7 = ((h5.d) this.f423t).g(view)) != null) {
                ViewGroup.LayoutParams layoutParams = g7.f15576a.getLayoutParams();
                M5.g.d(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                if (((w0.V) layoutParams).f15490a.m()) {
                }
            }
            it.remove();
        }
    }

    public void m(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((j) this.f422s).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    m(arrayList2.get(i7), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @Override // s4.InterfaceC1213a
    public void n(Bundle bundle) {
        synchronized (this.f423t) {
            try {
                r4.c cVar = r4.c.f13480a;
                cVar.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f424u = new CountDownLatch(1);
                ((C0852F) this.f421r).n(bundle);
                cVar.e("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f424u).await(500, (TimeUnit) this.f422s)) {
                        cVar.e("App exception callback received from Analytics listener.");
                    } else {
                        cVar.f("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f424u = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized ExecutorService o() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f421r) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String k5 = M5.g.k(" Dispatcher", i6.b.f11394g);
                M5.g.f(k5, "name");
                this.f421r = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new i6.a(k5, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f421r;
            M5.g.c(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    @Override // H2.H
    public void p(int i7, A a7, C0016q c0016q, C0020v c0020v, IOException iOException, boolean z7) {
        if (L(i7, a7)) {
            ((d) this.f422s).q(c0016q, M(c0020v), iOException, z7);
        }
    }

    @Override // H2.H
    public void q(int i7, A a7, C0020v c0020v) {
        if (L(i7, a7)) {
            ((d) this.f422s).B(M(c0020v));
        }
    }

    @Override // j2.o
    public void r(int i7, A a7, Exception exc) {
        if (L(i7, a7)) {
            ((n) this.f423t).e(exc);
        }
    }

    @Override // s4.b
    public void s(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f424u;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // H2.H
    public void t(int i7, A a7, C0016q c0016q, C0020v c0020v) {
        if (L(i7, a7)) {
            ((d) this.f422s).m(c0016q, M(c0020v));
        }
    }

    public String toString() {
        switch (this.f420q) {
            case 13:
                return "horizontal=" + ((R0) this.f422s) + "; vertical=" + ((R0) this.f421r);
            default:
                return super.toString();
        }
    }

    public ComponentCallbacksC0269x u(String str) {
        Z z7 = (Z) ((HashMap) this.f422s).get(str);
        if (z7 != null) {
            return z7.f5978c;
        }
        return null;
    }

    public ComponentCallbacksC0269x v(String str) {
        for (Z z7 : ((HashMap) this.f422s).values()) {
            if (z7 != null) {
                ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
                if (!str.equals(componentCallbacksC0269x.f6138u)) {
                    componentCallbacksC0269x = componentCallbacksC0269x.f6108L.f5925c.v(str);
                }
                if (componentCallbacksC0269x != null) {
                    return componentCallbacksC0269x;
                }
            }
        }
        return null;
    }

    public void w(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (arrayDeque.remove(obj)) {
                B();
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        O();
    }

    public void x(f fVar) {
        M5.g.f(fVar, "call");
        fVar.f12322r.decrementAndGet();
        w((ArrayDeque) this.f423t, fVar);
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList();
        for (Z z7 : ((HashMap) this.f422s).values()) {
            if (z7 != null) {
                arrayList.add(z7);
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        ArrayList arrayList = new ArrayList();
        for (Z z7 : ((HashMap) this.f422s).values()) {
            if (z7 != null) {
                componentCallbacksC0269x = z7.f5978c;
            } else {
                componentCallbacksC0269x = null;
            }
            arrayList.add(componentCallbacksC0269x);
        }
        return arrayList;
    }

    public /* synthetic */ b(int i7, boolean z7) {
        this.f420q = i7;
    }

    public b(b bVar, D d) {
        this.f420q = 15;
        this.f423t = new HashMap();
        this.f424u = new HashMap();
        this.f421r = bVar;
        this.f422s = d;
    }

    public b(D5.i iVar) {
        this.f420q = 8;
        M5.g.f(iVar, "backgroundDispatcher");
        this.f421r = iVar;
        this.f423t = new LinkedBlockingDeque(20);
        this.f424u = new Z4.U(this);
    }

    public b(AbstractC0010k abstractC0010k, Object obj) {
        this.f420q = 1;
        this.f424u = abstractC0010k;
        this.f422s = new d((CopyOnWriteArrayList) abstractC0010k.f1011c.f326t, 0, (A) null);
        this.f423t = new n(abstractC0010k.d.f11835c, 0, null);
        this.f421r = obj;
    }

    public b(n0 n0Var, boolean[] zArr) {
        this.f420q = 2;
        this.f421r = n0Var;
        this.f422s = zArr;
        int i7 = n0Var.f1146q;
        this.f423t = new boolean[i7];
        this.f424u = new boolean[i7];
    }

    public b(InterfaceC0116x interfaceC0116x, A5.a aVar, V.r rVar) {
        this.f420q = 4;
        this.f421r = interfaceC0116x;
        this.f422s = rVar;
        this.f423t = Y5.i.a(Integer.MAX_VALUE, 0, 6);
        this.f424u = new AtomicInteger(0);
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) interfaceC0116x.n().f(C0114v.f4028r);
        if (interfaceC0093a0 == null) {
            return;
        }
        ((j0) interfaceC0093a0).P(false, true, new T0.h(aVar, this));
    }

    public b(v vVar) {
        this.f420q = 7;
        this.f421r = new HashMap(vVar.f4734a);
        this.f422s = new HashMap(vVar.f4735b);
        this.f423t = new HashMap(vVar.f4736c);
        this.f424u = new HashMap(vVar.d);
    }

    public b(Typeface typeface, Z.b bVar) {
        int i7;
        int i8;
        this.f420q = 11;
        this.f424u = typeface;
        this.f421r = bVar;
        this.f423t = new q(1024);
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i9 = a7 + bVar.f292q;
            i7 = ((ByteBuffer) bVar.f295t).getInt(((ByteBuffer) bVar.f295t).getInt(i9) + i9);
        } else {
            i7 = 0;
        }
        this.f422s = new char[i7 * 2];
        int a8 = bVar.a(6);
        if (a8 != 0) {
            int i10 = a8 + bVar.f292q;
            i8 = ((ByteBuffer) bVar.f295t).getInt(((ByteBuffer) bVar.f295t).getInt(i10) + i10);
        } else {
            i8 = 0;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            m mVar = new m(this, i11);
            Z.a c5 = mVar.c();
            int a9 = c5.a(4);
            Character.toChars(a9 != 0 ? ((ByteBuffer) c5.f295t).getInt(a9 + c5.f292q) : 0, (char[]) this.f422s, i11 * 2);
            android.support.v4.media.session.b.f("invalid metadata codepoint length", mVar.b() > 0);
            ((q) this.f423t).a(mVar, 0, mVar.b() - 1);
        }
    }

    public b(w0 w0Var, androidx.datastore.preferences.protobuf.y0 y0Var, i iVar) {
        this.f420q = 10;
        this.f421r = w0Var;
        this.f422s = "";
        this.f423t = y0Var;
        this.f424u = iVar;
    }

    public b(C0657b c0657b, C0700a c0700a, h5.d dVar) {
        this.f420q = 18;
        this.f421r = c0657b;
        this.f422s = c0700a;
        this.f423t = dVar;
        this.f424u = new LinkedList();
    }

    public b(Class cls) {
        this.f420q = 3;
        this.f422s = new ConcurrentHashMap();
        this.f421r = cls;
        this.f424u = C0392a.f7269b;
    }

    public b(String str, String str2, StackTraceElement[] stackTraceElementArr, b bVar) {
        this.f420q = 0;
        this.f421r = str;
        this.f422s = str2;
        this.f423t = stackTraceElementArr;
        this.f424u = bVar;
    }

    public b(Executor executor) {
        this.f420q = 22;
        this.f422s = m3.g.m(null);
        this.f423t = new Object();
        this.f424u = new ThreadLocal();
        this.f421r = executor;
        executor.execute(new P.b(20, this));
    }

    public b(C0852F c0852f, TimeUnit timeUnit) {
        this.f420q = 21;
        this.f423t = new Object();
        this.f421r = c0852f;
        this.f422s = timeUnit;
    }

    public b(s3.T t5, String str) {
        this.f420q = 20;
        this.f424u = t5;
        g3.n.c(str);
        this.f421r = str;
        this.f422s = new Bundle();
    }

    public b(w0.U u7) {
        this.f420q = 17;
        M5.g.f(u7, "layoutManager");
        this.f421r = u7;
        this.f422s = new SparseIntArray();
        this.f423t = new SparseIntArray();
        this.f424u = new SparseIntArray();
    }
}
