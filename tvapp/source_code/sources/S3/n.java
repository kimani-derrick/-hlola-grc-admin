package S3;

import Z3.p;
import com.google.crypto.tink.shaded.protobuf.AbstractC0523a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0530h;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C0529g;
import e4.Y;
import e4.a0;
import e4.b0;
import e4.r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f3156a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f3157b;

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f3158c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(n.class.getName());
        f3156a = new AtomicReference(new e());
        f3157b = new ConcurrentHashMap();
        f3158c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (((S3.e) S3.n.f3156a.get()).f3141a.containsKey(r4) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        r5 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r5.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        r6 = (java.util.Map.Entry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (S3.n.d.containsKey(r6.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r6.getKey()) + " from an existing key manager of type " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        r4 = r5.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r4.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (S3.n.d.containsKey(r5.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r5.getKey()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void a(java.lang.String r4, java.util.Map r5, boolean r6) {
        /*
            java.lang.String r0 = "New keys are already disallowed for key type "
            java.lang.Class<S3.n> r1 = S3.n.class
            monitor-enter(r1)
            if (r6 == 0) goto L31
            java.util.concurrent.ConcurrentHashMap r2 = S3.n.f3158c     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L31
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L1c
            goto L31
        L1c:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r6.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L2e:
            r4 = move-exception
            goto Lc7
        L31:
            if (r6 == 0) goto Lc9
            java.util.concurrent.atomic.AtomicReference r6 = S3.n.f3156a     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L2e
            S3.e r6 = (S3.e) r6     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r6 = r6.f3141a     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r4)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L89
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2e
        L4b:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto Lc9
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r0 = S3.n.d     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L64
            goto L4b
        L64:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Attempted to register a new key template "
            r0.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = " from an existing key manager of type "
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L89:
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2e
        L91:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto Lc9
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2e
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r6 = S3.n.d     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            boolean r6 = r6.containsKey(r0)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto Laa
            goto L91
        Laa:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "Attempted overwrite of a registered key template "
            r6.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L2e
            r6.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        Lc7:
            monitor-exit(r1)
            throw r4
        Lc9:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.n.a(java.lang.String, java.util.Map, boolean):void");
    }

    public static Object b(b bVar, Class cls) {
        p pVar = (p) Z3.i.f4710b.f4711a.get();
        pVar.getClass();
        Z3.o oVar = new Z3.o(bVar.getClass(), cls);
        HashMap hashMap = pVar.f4723a;
        if (hashMap.containsKey(oVar)) {
            return ((Z3.m) hashMap.get(oVar)).f4720c.g(bVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + oVar + " available");
    }

    public static Object c(String str, AbstractC0530h abstractC0530h, Class cls) {
        e eVar = (e) f3156a.get();
        eVar.getClass();
        d a7 = eVar.a(str);
        boolean contains = ((Map) a7.f3139a.f4706c).keySet().contains(cls);
        Z3.e eVar2 = a7.f3139a;
        if (contains) {
            try {
                if (!((Map) eVar2.f4706c).keySet().contains(cls) && !Void.class.equals(cls)) {
                    String obj = eVar2.toString();
                    String name = cls.getName();
                    throw new IllegalArgumentException("Given internalKeyMananger " + obj + " does not support primitive class " + name);
                }
                try {
                    AbstractC0523a i7 = eVar2.i(abstractC0530h);
                    if (!Void.class.equals(cls)) {
                        eVar2.k(i7);
                        return eVar2.f(i7, cls);
                    }
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                } catch (B e3) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) eVar2.f4704a).getName()), e3);
                }
            } catch (IllegalArgumentException e7) {
                throw new GeneralSecurityException("Primitive type not supported", e7);
            }
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(eVar2.getClass());
        sb.append(", supported primitives: ");
        Set<Class> keySet = ((Map) eVar2.f4706c).keySet();
        StringBuilder sb2 = new StringBuilder();
        boolean z7 = true;
        for (Class cls2 : keySet) {
            if (!z7) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z7 = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    public static Object d(String str, byte[] bArr) {
        C0529g c0529g = AbstractC0530h.f9118r;
        return c(str, AbstractC0530h.f(bArr, 0, bArr.length), a.class);
    }

    public static synchronized Y e(b0 b0Var) {
        Y f;
        synchronized (n.class) {
            Z3.e eVar = ((e) f3156a.get()).a(b0Var.E()).f3139a;
            f fVar = new f(eVar, (Class) eVar.f4705b);
            if (((Boolean) f3158c.get(b0Var.E())).booleanValue()) {
                f = fVar.f(b0Var.F());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.E());
            }
        }
        return f;
    }

    public static synchronized void f(Z3.e eVar, boolean z7) {
        Map emptyMap;
        synchronized (n.class) {
            try {
                AtomicReference atomicReference = f3156a;
                e eVar2 = new e((e) atomicReference.get());
                eVar2.b(eVar);
                String e3 = eVar.e();
                if (z7) {
                    emptyMap = eVar.g().t();
                } else {
                    emptyMap = Collections.emptyMap();
                }
                a(e3, emptyMap, z7);
                if (!((e) atomicReference.get()).f3141a.containsKey(e3)) {
                    f3157b.put(e3, new J3.e(9));
                    if (z7) {
                        g(e3, eVar.g().t());
                    }
                }
                f3158c.put(e3, Boolean.valueOf(z7));
                atomicReference.set(eVar2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(String str, Map map) {
        r0 r0Var;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap concurrentHashMap = d;
            String str2 = (String) entry.getKey();
            byte[] e3 = ((AbstractC0523a) ((Z3.d) entry.getValue()).f4702a).e();
            int i7 = ((Z3.d) entry.getValue()).f4703b;
            a0 G6 = b0.G();
            G6.i();
            b0.z((b0) G6.f9164r, str);
            C0529g f = AbstractC0530h.f(e3, 0, e3.length);
            G6.i();
            b0.A((b0) G6.f9164r, f);
            int b7 = s.h.b(i7);
            if (b7 != 0) {
                if (b7 != 1) {
                    if (b7 != 2) {
                        if (b7 == 3) {
                            r0Var = r0.f10140v;
                        } else {
                            throw new IllegalArgumentException("Unknown output prefix type");
                        }
                    } else {
                        r0Var = r0.f10139u;
                    }
                } else {
                    r0Var = r0.f10138t;
                }
            } else {
                r0Var = r0.f10137s;
            }
            G6.i();
            b0.B((b0) G6.f9164r, r0Var);
            concurrentHashMap.put(str2, new g((b0) G6.c()));
        }
    }

    public static synchronized void h(m mVar) {
        synchronized (n.class) {
            Z3.i.f4710b.c(mVar);
        }
    }
}
