package a5;

import M5.g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: a5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0217c f5189a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Map f5190b = Collections.synchronizedMap(new LinkedHashMap());

    public static C0215a a(EnumC0218d enumC0218d) {
        Map map = f5190b;
        g.e(map, "dependencies");
        Object obj = map.get(enumC0218d);
        if (obj != null) {
            return (C0215a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + enumC0218d + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #0 {all -> 0x00cc, blocks: (B:22:0x009c, B:25:0x00b3, B:26:0x00cb), top: B:31:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:21:0x009b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(D5.d r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof a5.C0216b
            if (r0 == 0) goto L13
            r0 = r11
            a5.b r0 = (a5.C0216b) r0
            int r1 = r0.f5181B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5181B = r1
            goto L18
        L13:
            a5.b r0 = new a5.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f5188z
            E5.a r1 = E5.a.f612q
            int r2 = r0.f5181B
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f5187y
            java.util.Map r4 = r0.f5186x
            java.util.Map r4 = (java.util.Map) r4
            e6.a r5 = r0.f5185w
            a5.d r6 = r0.f5184v
            java.util.Iterator r7 = r0.f5183u
            java.util.Map r8 = r0.f5182t
            java.util.Map r8 = (java.util.Map) r8
            k3.AbstractC0958a.H(r11)
            goto L9b
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            k3.AbstractC0958a.H(r11)
            java.util.Map r11 = a5.C0217c.f5190b
            java.lang.String r2 = "dependencies"
            M5.g.e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = A5.w.J(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L60:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld3
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            a5.d r6 = (a5.EnumC0218d) r6
            java.lang.Object r11 = r11.getValue()
            a5.a r11 = (a5.C0215a) r11
            e6.a r11 = r11.f5178a
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            r0.f5182t = r5
            r0.f5183u = r7
            r0.f5184v = r6
            r0.f5185w = r11
            r0.f5186x = r5
            r0.f5187y = r2
            r0.f5181B = r3
            r5 = r11
            e6.d r5 = (e6.d) r5
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L9a
            return r1
        L9a:
            r8 = r4
        L9b:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            M5.g.f(r6, r9)     // Catch: java.lang.Throwable -> Lcc
            a5.a r9 = a(r6)     // Catch: java.lang.Throwable -> Lcc
            u4.k r9 = r9.f5179b     // Catch: java.lang.Throwable -> Lcc
            if (r9 == 0) goto Lb3
            e6.d r5 = (e6.d) r5
            r5.e(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L60
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcc
            r1.append(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lcc
            throw r0     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r0 = move-exception
            e6.d r5 = (e6.d) r5
            r5.e(r11)
            throw r0
        Ld3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C0217c.b(D5.d):java.lang.Object");
    }
}
